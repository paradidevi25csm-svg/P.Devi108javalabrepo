import java.io.*;

public class BufferedDemo
 {
    public static void main(String[] args) throws IOException
	{
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("Line 1: Java is powerful");
        bw.newLine();
        bw.write("Line 2: I/O is efficient");
        bw.flush();   
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        String line;
        while ((line = br.readLine()) != null)
		{
            System.out.println(line);
        }
        br.close();
    }
}