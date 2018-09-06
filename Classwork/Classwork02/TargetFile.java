/** 
 * A class to create a copy of a file given the file name.
 * @author Kathryn Cole
 * @date September 5, 2018
 */

package copiersupport;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class TargetFile {

    private String filePath = "";
 
    public void TargetFile (String inputFile) {
        this.filePath = inputFile + ".copy";
    }

    public void writeToFile( String textToFile ) throws IOException {
        PrintWriter printText = new PrintWriter( new FileWriter( new File( this.filePath ) ) );
        printText.print(textToFile);
        printText.close();
    }
}