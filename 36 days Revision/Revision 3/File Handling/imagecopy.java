import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class imagecopy {
    public static void main(String[] args) throws Exception{
        File f1 = new File("C:\\Users\\ADMIN\\Desktop\\123.png");
        FileInputStream fin = new FileInputStream(f1);

        byte [] arr = new byte[(int) f1.length()];
        fin.read(arr);

        FileOutputStream fout = new  FileOutputStream("C:\\Users\\ADMIN\\Desktop\\456.png");
        fout.write(arr);
        fout.flush();

        System.out.println("File copied");

    }    
}
