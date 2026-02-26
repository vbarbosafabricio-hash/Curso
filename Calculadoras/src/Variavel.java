import java.time.*;

public class Variavel {
    public static void main(String[] args) {
        int hora = LocalDateTime.now().getHour();
        int minuto = LocalDateTime.now().getMinute();
        int segundo = LocalDateTime.now().getSecond();
        int ano = LocalDateTime.now().getYear();
        int mes = LocalDateTime.now().getMonthValue();
        int dia = LocalDateTime.now().getDayOfMonth();
        
        if (mes == 10) {
            System.out.println(dia + "/" + mes + "/" + ano); 
        } else {
            System.out.println(dia + "/" + "0" + mes + "/" + ano); 
        }         
        System.out.println(hora + ":" + minuto + ":" + segundo);
        // Shift + Alt + seta pra baixo = copia a linha pra baixo
    }
}