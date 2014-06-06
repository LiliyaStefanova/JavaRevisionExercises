package IO;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 06/06/14
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */
import java.io.File;

public class FilePlay {

    public static void currentDirFiles(){

        String filename=System.getProperty("user.dir");

        File file= new File(filename);

       File []files =file.listFiles();
       for(File f: files){
           System.out.println(f.getName());
       }
    }

    public static void main(String [] args){

        currentDirFiles();
    }
}
