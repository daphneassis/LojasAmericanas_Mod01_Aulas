
package Aula02;

        import javax.swing.*;
        import java.util.Locale;
        import java.util.Scanner;

public class Mainaula02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        menorValor(recebendoValores());


    }
    static double[] recebendoValores() {
        System.out.println("Digite os três valores em sequencia");
        double[] vetor= new double[3];
        vetor[0]= sc.nextDouble();
        vetor[1]= sc.nextDouble();
        vetor[2]= sc.nextDouble();
        return vetor;
    }
    static void menorValor(double[] vet){
        double auxMenorValor=vet[0];
        for (int i=0; i<vet.length; i++){
            if(vet[i]<auxMenorValor){
                auxMenorValor=vet[i];
            }
        }
        System.out.println("O menor valor é o "+auxMenorValor);
    }
}