import java.io.IOException;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EscritorSimples {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("frase.txt");
            escritor.write("A persistência leva ao sucesso!");
            escritor.close();
            System.out.println("Frase escrita com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever o arquivo.");
            e.printStackTrace();
        }
    }
}