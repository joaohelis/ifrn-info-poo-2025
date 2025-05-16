import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.println("Informe o segundo número: ");
        int numero2 = input.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("A soma dos números é: " + resultado);

    }
}