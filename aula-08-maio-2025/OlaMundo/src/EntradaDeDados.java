import java.util.Scanner; // importando a classe Scanner

public class EntradaDeDados {

    public static void main(String[] args) {

        // Criando um objeto da classe Scanner
        Scanner input = new Scanner(System.in);

        // input em python >>>> nome = input("Digite seu nome: ")

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine(); // Lendo uma string

        System.out.println("O nome informado foi: " + nome);

        // lendo um inteiro
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt(); // Lendo um inteiro

        System.out.println("A idade informada foi: " + idade);

        // lendo um float
        System.out.println("Digite sua altura: ");
        float altura = input.nextFloat(); // Lendo um float
        System.out.println("A altura informada foi: " + altura);


        // ------------------------------
        // estruturas de decisão
        // ------------------------------
        
        // if, else if, else
        
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é idoso.");
        }

    }
    
}