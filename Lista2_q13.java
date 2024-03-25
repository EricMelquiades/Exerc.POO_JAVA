package Lista2_POO;
//Autor: Eric Melquíades
//Loja 1.99
public class Lista2_q13 {
    public static void Questao13 () {

    double precoProdut = 1.99;

        System.out.println("Número de produtos / valor da Conta");

        for (int numProdut = 1; numProdut <= 50 ; numProdut++) {
            double valorConta = precoProdut * numProdut;
            System.out.println("\t\t\tR$ " + valorConta);
        }

    }
}
