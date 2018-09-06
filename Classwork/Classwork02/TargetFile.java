/** 
 * A class to create a copy of a file given the file name and text to include.
 * @author Kathryn Cole
 * @date September 5, 2018
 */

package copiersupport;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TargetFile {

    private String filePath = "";
 
    public TargetFile( String text, String path ) {
        try {
            BufferedWriter bw = new BufferedWriter( new FileWriter( path ) );
            bw.write( text );
            bw.close();
        } catch ( IOException ioe ) {
            System.out.println("targetfile threw an exception");
        }
    }
}