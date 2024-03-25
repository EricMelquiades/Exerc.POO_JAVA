package Lista2_POO;
//Autor: Eric Melquíades
// Tabuada
import java.util.Scanner;
public class Lista2_q14 {
    public static void Questao14() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número para a tabuada: ");
        int N = teclado.nextInt();

        System.out.println("Digite o valor inicial da tabuada: ");
        int inicio = teclado.nextInt();
        System.out.println("Digite o valor final da tabuada: ");
        int fim = teclado.nextInt();

        if (fim<inicio) {
            System.out.println("O valor final deve ser maior que o valor inicial" );
            return;
        }

        System.out.println("A tabuada de "+N+" no intervalo de "+inicio+" a "+ fim+ "é igual a: ");
        for (int i = inicio; i  <= fim; i++){
            System.out.println(N + "x"+ i +" = " + (N * i));
        }

        teclado.close();

    }
}
