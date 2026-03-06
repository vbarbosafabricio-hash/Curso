import java.util.*;

public class TryCatch {
    public static void main(String[] args){
        while(true) {

            try {
                Scanner inputScanner = new Scanner(System.in);
                System.out.println("Digite um numero");
                float respostaUsuario = inputScanner.nextFloat();
                System.out.println("O numero digitado é: " + respostaUsuario);

            } catch (InputMismatchException e) {
                System.out.println("Erro generico:" + e);

            } catch (Exception e) {
                System.out.println("Ops... Voce n digitou um numero... erro: " + e);

            }
        }     
    }   
}
