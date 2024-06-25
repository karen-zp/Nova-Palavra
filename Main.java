import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entre com a palavra: ");
        String palavra = scanner.nextLine();
        
        if (palavra.length() < 8)
            System.out.println("Erro: A palavra deve ter pelo menos 8 caracteres.");
        else {
            String novaPalavra = novaPalavra(palavra);
            System.out.println("Nova palavra: " + novaPalavra);
        }
        scanner.close();
    }
    
    public static String novaPalavra(String palavra) {
        String primeiraParte = palavra.substring(0, 2);
        String segundaParte = palavra.substring(palavra.length() - 2);
        String novaPalavra = primeiraParte + segundaParte;
        
        return novaPalavra;
    }
}
