import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class bufferedwriter{
    public static void main(String[] args) throws Exception{
        File f1 = new File("C:\\Users\\ADMIN\\Desktop\\123.txt");
        FileWriter fw = new FileWriter(f1);
        
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hey");
        bw.newLine();
        bw.write("hey");
        bw.newLine();

        bw.flush();
        System.out.println("data is written");

        FileReader fr = new FileReader(f1);
        BufferedReader br  = new BufferedReader(fr);
        String s1 = br.readLine();
        
        while (s1 != null) {
            System.out.println(s1);
            s1 = br.readLine();
        }
    }
}
