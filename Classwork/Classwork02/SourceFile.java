/** 
 * A class to store the name of a file and its contents as Strings.
 * @author Kathryn Cole
 * @date September 5, 2018
 */


package copiersupport;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SourceFile {

    private String fileAsString = "";
    private String fileName = "";
    
    public void SourceFile( String inputFile ) throws IOException {
        this.fileName = inputFile;
        BufferedReader lineByLine = new BufferedReader( new FileReader( inputFile ) );
        try {
            String line = lineByLine.readLine();
            while (line != null) {
                this.fileAsString += line + "\n";
                line = lineByLine.readLine();
            }
        } finally {
            lineByLine.close();
        }
    }

    public String getFileAsString() {
        return this.fileAsString;
    }
}