import java.util.Scanner;

public class Questao02 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        int nota1 = input.nextInt();

        System.out.println("Informe a segunda nota: ");
        int nota2 = input.nextInt();

        System.out.println("Informe a terceira nota: ");
        int nota3 = input.nextInt();

        float media = (float)(nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);

    }

}
