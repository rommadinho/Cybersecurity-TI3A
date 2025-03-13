import java.io.*;

public class pushbacktofile {
    public static void main(String[] args) {
        String fileName = "output.txt";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Masukkan teks (ketik 'exit' untuk selesai):");
            String line;
            
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Data telah disimpan ke output.txt!");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
