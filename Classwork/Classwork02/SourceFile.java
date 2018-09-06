/** 
 * A class to store the contents of a file as a String.
 * @author Kathryn Cole
 * @date September 5, 2018
 */

package copiersupport;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SourceFile {

    private String fileContent = "";
    
    public SourceFile( String filePath ) {
        try {
            BufferedReader br = new BufferedReader( new FileReader( filePath ) );
            this.fileContent = br.readLine();
            br.close();
        } catch( IOException ioe ) {
            System.out.println("sourcefile threw an exception");
        }
    }

    public String getFileContent() {
        return this.fileContent;
    }
}