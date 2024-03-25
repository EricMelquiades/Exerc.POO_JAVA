package Lista2_POO;
import java.util.Scanner;

//Autor: Eric Melquíades
// Sequancia de Fibonacci até N

public class Lista2_q1 {
    public static void Questao1() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("escolha o número máximo da sequência");
        int N = teclado.nextInt();

        int PrimeiroTermo = 1;
        int SegundoTermo = 1;
        System.out.print(PrimeiroTermo + " " + SegundoTermo + " ");

        for (int i = 3; i < N; i++) {
            int ProximoTermo = PrimeiroTermo + SegundoTermo;
            System.out.print(ProximoTermo + " " );

            PrimeiroTermo = SegundoTermo;
            SegundoTermo = ProximoTermo;

        }
        teclado.close();

    }
}

