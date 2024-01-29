import java.io.File;
import java.io.FileWriter;
import java.lang.Exception;
class writedata {
    public static void main(String[] args) throws Exception {
        File f1 = new File("C:\\Users\\ADMIN\\Desktop");
        FileWriter fw = new FileWriter(f1);
        
        fw.write("heyyy");
        fw.flush();
        System.out.println("message written");
    }

}
