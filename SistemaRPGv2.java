import java.util.Random;
import java.util.Scanner;

public class SistemaRPGv2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instanciando nossos dados
        Dado d6 = new Dado(6);
        Dado d8 = new Dado(8);
        Dado d10 = new Dado(10);
        Dado d12 = new Dado(12);
        Dado d20 = new Dado(20);

        System.out.println("--- Sistema de Dados RPG (Com Modificadores) ---");
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--------------------------------");
            System.out.println("Escolha o dado:");
            System.out.println("1. d6  | 2. d8  | 3. d10");
            System.out.println("4. d12 | 5. d20 | 0. Sair");
            System.out.print("Opção: ");

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                continuar = false;
                System.out.println("Saindo da mesa...");
                break; // Sai do loop imediatamente
            }

            // Validação simples para evitar erro se digitar número errado
            if (escolha < 1 || escolha > 5) {
                System.out.println("Opção inválida!");
                continue; // Volta para o início do loop
            }

            // Pergunta sobre o modificador
            System.out.print("Digite o modificador (ex: 3 para bônus, -1 para penalidade, 0 para nenhum): ");
            int modificador = scanner.nextInt();

            int resultadoDado = 0;
            String nomeDado = "";

            // Lógica de seleção do dado
            switch (escolha) {
                case 1:
                    resultadoDado = d6.rolar();
                    nomeDado = "d6";
                    break;
                case 2:
                    resultadoDado = d8.rolar();
                    nomeDado = "d8";
                    break;
                case 3:
                    resultadoDado = d10.rolar();
                    nomeDado = "d10";
                    break;
                case 4:
                    resultadoDado = d12.rolar();
                    nomeDado = "d12";
                    break;
                case 5:
                    resultadoDado = d20.rolar();
                    nomeDado = "d20";
                    break;
            }

            // Cálculo final
            int total = resultadoDado + modificador;

            // Exibição formatada do resultado
            System.out.println("\n>> Resultado [" + nomeDado + "]:");
            System.out.println("Rolagem: " + resultadoDado);
            System.out.println("Modificador: " + (modificador >= 0 ? "+" + modificador : modificador));
            System.out.println("TOTAL FINAL: " + total);

            // Regra especial para d20 (Crítico/Falha)
            if (nomeDado.equals("d20")) {
                if (resultadoDado == 20) System.out.println("!!! ACERTO CRÍTICO !!!");
                if (resultadoDado == 1) System.out.println("... FALHA CRÍTICA ...");
            }
        }
        
        scanner.close();
    }
}

// --- CLASSE DADO (Permanece igual, pois o dado não muda, só a matemática fora dele) ---
class Dado {
    private int numeroDeLados;
    private Random gerador;

    public Dado(int lados) {
        this.numeroDeLados = lados;
        this.gerador = new Random();
    }

    public int rolar() {
        return gerador.nextInt(numeroDeLados) + 1;
    }
}