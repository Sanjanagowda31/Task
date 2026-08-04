
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferFileReader{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        String filePath = "C:\\Users\\sanja\\Downloads\\text file.txt"; 

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        
            String line;
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
    }
}