import java.util.*;
public class MiniCalc {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Escolha qual tipo de operação deseja usar");
        System.out.println("1 - Soma | 2 - Subtração | 3- Multiplicação | 4 - Divisão");

        String respostaUsuario = inputScanner.nextLine().trim();
        int operacaoMat = Integer.valueOf(respostaUsuario);
    
        if (operacaoMat == 1) {
            System.out.println("Digite o primeiro numero a ser somado e precione 'enter'");
            String respostaSoma = inputScanner.nextLine().trim();
            int somaUm = Integer.valueOf(respostaSoma);
        
            System.out.println("Digite o segundo numero a ser somado e precione 'enter'");
            int somaDois = Integer.valueOf(respostaSoma);
            respostaSoma = inputScanner.nextLine().trim();
            System.out.println("O resultado da soma é: "+ (somaUm + somaDois));  
        }
        if (operacaoMat == 2) {
            System.out.println("Digite o primeiro numero a ser subtraido e precione 'enter'");
            String respostaSub = inputScanner.nextLine().trim();
            int subUm = Integer.valueOf(respostaSub);
        
            System.out.println("Digite o segundo numero a ser subtraido e precione 'enter'");
            int subDois = Integer.valueOf(respostaSub);
            respostaSub = inputScanner.nextLine().trim();
            System.out.println("O resultado da subtração é: "+ (subUm - subDois));  
        }
        if (operacaoMat == 3) {
            System.out.println("Digite o primeiro numero a ser multiplicado e precione 'enter'");
            String respostaMult = inputScanner.nextLine().trim();
            int multUm = Integer.valueOf(respostaMult);
        
            System.out.println("Digite o segundo numero a ser multiplicado e precione 'enter'");
            int multDois = Integer.valueOf(respostaMult);
            respostaMult = inputScanner.nextLine().trim();
            System.out.println("O resultado da multiplicação é: "+ (multUm * multDois));
        }
        if (operacaoMat == 4) {
            System.out.println("Digite o primeiro numero a ser dividido e precione 'enter'");
            String respostaDiv = inputScanner.nextLine().trim();
            int divUm = Integer.valueOf(respostaDiv);
        
            System.out.println("Digite o segundo numero a ser dividido e precione 'enter'");
            int divDois = Integer.valueOf(respostaDiv);
            respostaDiv = inputScanner.nextLine().trim();
            System.out.println("O resultado da divisão é: "+ (divUm / divDois));
        }
    }
}
