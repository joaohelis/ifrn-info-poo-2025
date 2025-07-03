// Importa a classe Scanner para permitir a entrada de dados pelo teclado
import java.util.Scanner;

// Definição da classe principal
public class ExemploArrays {

    // Método principal: ponto de entrada da aplicação
    public static void main(String[] args) {

        // -------------------------------
        // Bloco comentado: exemplo de vetor de meses e quantidade de dias
        // -------------------------------

        // String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
        //                   "Junho", "Julho", "Agosto", "Setembro", "Outubro",
        //                   "Novembro", "Dezembro"};

        // int numerosDias[] = new int[12];
        // numerosDias[0] = 31;
        // numerosDias[1] = 28;
        // numerosDias[2] = 31;
        // numerosDias[3] = 30;
        // numerosDias[4] = 31;
        // numerosDias[5] = 30;
        // numerosDias[6] = 31;
        // numerosDias[7] = 31;
        // numerosDias[8] = 30;
        // numerosDias[9] = 31;
        // numerosDias[10] = 30;
        // numerosDias[11] = 31;

        // Exibe o tamanho do vetor de meses
        // System.out.println("O tamanho do vetor é: " + meses.length);

        // Percorre os vetores e exibe o mês e a quantidade de dias
        // for(int i = 0; i < meses.length; i++){
        //     System.out.println("O mês de " + meses[i] + " tem um total de " + numerosDias[i] + " dias!");
        // }

        // -------------------------------
        // Exemplo em execução: leitura de nomes de alunos
        // -------------------------------

        // Criação de um objeto Scanner para ler dados do teclado
        Scanner input = new Scanner(System.in);

        // Declaração de um vetor de Strings para armazenar os nomes dos alunos
        String[] alunos = new String[5];

        // Laço for para ler o nome de 5 alunos
        for(int i = 0; i < 5; i++){
            System.out.println("Informe o nome do aluno: ");
            String nome = input.nextLine(); // Lê o nome digitado
            alunos[i] = nome; // Armazena o nome no vetor
        }

        // Laço for para exibir os nomes armazenados no vetor
        for(int i = 0; i < alunos.length; i++){
            System.out.println("O nome do aluno é: " + alunos[i]);
        }
        
    }

}