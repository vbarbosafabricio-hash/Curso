import java.time.*;
import java.util.*;

public class Timer {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int Hora = LocalDateTime.now().getHour();
        int Minuto = LocalDateTime.now().getMinute();
        int Segundo = LocalDateTime.now().getSecond();
        boolean sair = false;

        String respostaFinal;
        while (sair == false) { 
            while (sair == false) {
                System.out.println("A Hora é: " + Hora + ":" + Minuto + ":" + Segundo);
                System.out.println("Digite [1] e aperte 'enter' para parar o timer");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Erro: " + e);
                }
    
                try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                        System.out.println("\033[H\0332J");
                        System.out.flush();
                    }
                } catch (Exception e) {
                    System.out.println("Erro: " + e);
                }
                Segundo++;
                if (Segundo == 60) {
                    Segundo = 00;
                    Minuto++;
                }
    
                if (Minuto == 60) {
                    Minuto = 00;
                    Hora++;
                }
            }
            while(sair == false) {
                respostaFinal = inputScanner.nextLine().trim();
                int rFinal = Integer.valueOf(respostaFinal);
                if (rFinal == 1) {
                    sair = true;
                }
            }
        }
    }
}
