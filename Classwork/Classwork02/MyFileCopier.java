/** 
 * A class to make a copy of a given file. 
 * @author Kathryn Cole
 * @date September 5, 2018
 */

import copiersupport.SourceFile;
import copiersupport.TargetFile;
import java.util.Scanner;

public class MyFileCopier {
 
    public static void main( String[] args ) {
        System.out.println("Please enter a file name");
        Scanner myInput = new Scanner( System.in );
        String filePath = myInput.nextLine();
        SourceFile sf = new SourceFile( filePath );
        String fileText = sf.getFileContent();
        TargetFile tf = new TargetFile( fileText, filePath + ".copy");
    }      
}