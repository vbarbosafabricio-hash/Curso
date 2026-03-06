import java.util.*;

public class Function {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Digite sua idade, para avaliar seu pedido de aposentadoria, depois tecle enter");
        Integer idade = inputScanner.nextInt();
        System.out.println("Voce esta " + validarAposentadoria(idade) + " para iniciar sua aposentadoria.");
        inputScanner.close();
    }
    public static String validarAposentadoria(Integer idade) {
        if (idade >= 65 || idade > 125) {
            return "Apto";
        } else {
            return "Inapto";
        }          
    }
 }
