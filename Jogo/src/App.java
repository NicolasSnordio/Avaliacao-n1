import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int player, computador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha entre as opções abaixo\n");
        System.out.println("1 Para pedra");
        System.out.println("2 para papel");
        System.out.println("3 para tesoura\n");
        System.out.println("Digite a opção desejada abaixo");

        // Alt+Shift+F

        // player
        player = teclado.nextInt();
        switch (player) {
        case 1:
            System.out.println("Player escolheu pedra!");
            break;
        case 2:
            System.out.println("Player escolheu papel!");
            break;
        case 3:
            System.out.println("Player escolheu tesoura!");
            break;
        default:
            System.out.println("Esta opção não é valida");
        }

        // computador

        computador = (int) (Math.random() * 3 + 1 );
        teclado.close();
        switch (computador) {
        case 1:
            System.out.println("O computador escolheu pedra!");
            break;
        case 2:
            System.out.println("O computador escolheu papel!");
            break;
        case 3:
            System.out.println("O computador escolheu tesoura!");
            break;
        }
        // Determinar o vencedor 
        if (player == computador) {
            System.out.println("Empate");
        }else {
            if ((player == 1 && computador == 3) || (player == 2 && computador == 1) || (player == 3 && computador == 2)) {
                System.out.println("O player venceu!");
            }else {
                System.out.println("O computador venceu!");
            }
        }
    }
}
