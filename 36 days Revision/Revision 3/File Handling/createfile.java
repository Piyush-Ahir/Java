import java.io.File;
import java.io.IOException;

class createfile{
    public static void main(String[] args) throws IOException{
        File f1 = new File("C:\\Users\\ADMIN\\Desktop\\hey.txt");
        if(f1.createNewFile()){
            System.out.println("file created");
        }
    }
}