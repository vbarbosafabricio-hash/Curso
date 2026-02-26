import java.util.*;
public class MiniCalc {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        boolean sair = false;

        while (sair == false) {
            System.out.println("Escolha qual tipo de operação deseja usar");
            System.out.println("1 - Soma | 2 - Subtração | 3- Multiplicação | 4 - Divisão");

            String respostaUsuario = inputScanner.nextLine().trim();
            int operacaoMat = Integer.valueOf(respostaUsuario);
    
            if (operacaoMat == 1) {
                System.out.println("Digite o primeiro numero a ser somado e precione 'enter'");
                String respostaSoma = inputScanner.nextLine().trim();
                double somaUm = Double.valueOf(respostaSoma);
            
                System.out.println("Digite o segundo numero a ser somado e precione 'enter'");
                respostaSoma = inputScanner.nextLine().trim();
                double somaDois = Double.valueOf(respostaSoma);
                double resultadoSoma = (double) somaUm + somaDois;
                System.out.println("O resultado da soma é: "+ resultadoSoma);  
            }
            if (operacaoMat == 2) {
                System.out.println("Digite o primeiro numero a ser subtraido e precione 'enter'");
                String respostaSub = inputScanner.nextLine().trim();
                double subUm = Double.valueOf(respostaSub);
            
                System.out.println("Digite o segundo numero a ser subtraido e precione 'enter'");
                respostaSub = inputScanner.nextLine().trim();
                double subDois = Double.valueOf(respostaSub);
                double resultadoSub = (double) subUm - subDois;
                System.out.println("O resultado da subtração é: "+ resultadoSub);  
            }
            if (operacaoMat == 3) {
                System.out.println("Digite o primeiro numero a ser multiplicado e precione 'enter'");
                String respostaMult = inputScanner.nextLine().trim();
                double multUm = Double.valueOf(respostaMult);
            
                System.out.println("Digite o segundo numero a ser multiplicado e precione 'enter'");
                respostaMult = inputScanner.nextLine().trim();
                double multDois = Double.valueOf(respostaMult);
                double resultadoMult = (double) multUm * multDois;
                System.out.println("O resultado da multiplicação é: "+ resultadoMult);
            }
            if (operacaoMat == 4) {
                System.out.println("Digite o primeiro numero a ser dividido e precione 'enter'");
                String respostaDiv = inputScanner.nextLine().trim();
                double divUm = Double.valueOf(respostaDiv);
            
                System.out.println("Digite o segundo numero a ser dividido e precione 'enter'");
                respostaDiv = inputScanner.nextLine().trim();
                double divDois = Double.valueOf(respostaDiv);
                double resultadoDiv = (double) divUm / divDois;
                System.out.println("O resultado da divisão é:" + resultadoDiv);
            }
            if (operacaoMat >= 5 || operacaoMat == 0) {
                System.out.println("Resposta Invalida");
            }
            System.out.println("Deseja continuar?");
            System.out.println("[1] = Sim");
            System.out.println("[2] = Não");
            String respostaFinal = inputScanner.nextLine().trim();

            int rFinal = Integer.valueOf(respostaFinal);

            if (rFinal == 1) {
                sair = false;
            } else {
                sair = true;
                inputScanner.close();
            }
        }
    }
}
