package ExemploCUP;
import java.io.*;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = Paths.get("").toAbsolutePath().toString();
        // "D:\Workspace\Compilador\programa.prg"
        fileName = fileName + "\\programa2.prg";
        System.out.print("PATH: ");
        System.out.println(fileName);

        AnalisadorSintatico p = new AnalisadorSintatico(new Lexer(new FileReader(fileName)));
        try {
            p.parse();
        }
        catch (Exception e) {
            System.out.println("Falha geral.");
        }
    }
}
