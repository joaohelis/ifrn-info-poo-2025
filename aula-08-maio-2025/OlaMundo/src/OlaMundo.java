public class OlaMundo {
    
    public static void main(String[] args){

        // ------------------------------
        // Exibindo uma mensagem na tela
        // ------------------------------
        
        System.out.println("Ola Mundo!");
        System.out.println("Estou aprendendo Java!");

        // ------------------------------
        // Declarando variaveis
        // ------------------------------

        // Tipos primitivos
        // byte, short, int, long, float, double, char, boolean

        // O byte é um tipo de dado inteiro que ocupa 1 byte de memória - vai de -128 a 127
        // O short é um tipo de dado inteiro que ocupa 2 bytes de memória - vai de -32.768 a 32.767
        // O int é um tipo de dado inteiro que ocupa 4 bytes de memória - vai de -2.147.483.648 a 2.147.483.647
        // O long é um tipo de dado inteiro que ocupa 8 bytes de memória - vai de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        // O float é um tipo de dado decimal que ocupa 4 bytes de memória - vai de -3.40282347E+38 a 3.40282347E+38
        // O double é um tipo de dado decimal que ocupa 8 bytes de memória - vai de -1.79769313486231570E+308 a 1.79769313486231570E+308

        // O char é um tipo de dado que ocupa 2 bytes de memória - vai de 0 a 65.535

        // O boolean é um tipo de dado que ocupa 1 byte de memória - pode ser true ou false

        // ------------------------------
        // Declaração de variáveis
        // ------------------------------
        String nome = "João Helis"; // variável inicializada
        int idade = 31;
        float altura = 1.73f;
        char sexo = 'M';
        boolean estudante = true; 
        
        String endereco; // variável não inicializada (apenas declarada)

        endereco = "Baía da Traição, PB"; // variável inicializada

        // Exibindo os valores das variáveis
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estudante: " + estudante);
        System.out.println("Endereço: " + endereco);

            
        // ------------------------------
        // Operadores aritméticos        
        // ------------------------------
        // +, -, *, /, %
        // + é o operador de adição
        // - é o operador de subtração
        // * é o operador de multiplicação
        // / é o operador de divisão
        // % é o operador de módulo (resto da divisão)
        
        // ------------------------------
        // Exemplo de operadores aritméticos
        // ------------------------------
        int a = 10;
        int b = 5;

        int soma = a + b; // operador de adição
        
        // ------------------------------
        // operador lógico
        // ------------------------------

        // && (E) - retorna true se ambos os operandos forem verdadeiros
        // || (OU) - retorna true se pelo menos um dos operandos for verdadeiro
        // ! (NÃO) - inverte o valor lógico do operando

        // Exemplo de operadores lógicos
        boolean x = true;
        boolean y = false;
        
        boolean resultado = x && y; // operador lógico E
        System.out.println("Resultado do operador lógico E: " + resultado);
        
        resultado = x || y; // operador lógico OU
        System.out.println("Resultado do operador lógico OU: " + resultado);

        resultado = !x; // operador lógico NÃO
        System.out.println("Resultado do operador lógico NÃO: " + resultado);

        // O que são estruturas de repetição?
        
        // Estruturas de repetição são comandos que permitem executar um bloco de código várias vezes, enquanto uma condição for verdadeira.
        // Existem três tipos de estruturas de repetição em Java: for, while e do while.
        // A estrutura de repetição for é usada quando sabemos o número de vezes que queremos repetir um bloco de código.
        // A estrutura de repetição while é usada quando não sabemos o número de vezes que queremos repetir um bloco de código.
        // A estrutura de repetição do while é semelhante ao while, mas garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição seja falsa na primeira verificação.
        // Exemplo de estrutura de repetição for
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i: " + i);
        }
        // Exemplo de estrutura de repetição while
        int j = 0;
        while (j < 10) {
            System.out.println("Valor de j: " + j);
            j++;
        }
        // Exemplo de estrutura de repetição do while
        int k = 0;
        do {
            System.out.println("Valor de k: " + k);
            k++;
        } while (k < 10);

        // ------------------------------
        // Estruturas de decisão
        // ------------------------------

        // Estruturas de decisão são comandos que permitem executar um bloco de código, dependendo do resultado de uma condição.
        // Existem três tipos de estruturas de decisão em Java: if, else if e else.
        // A estrutura de decisão if é usada para executar um bloco de código se uma condição for verdadeira.
        // A estrutura de decisão else if é usada para executar um bloco de código se a condição do if for falsa e a condição do else if for verdadeira.
        // A estrutura de decisão else é usada para executar um bloco de código se todas as condições anteriores forem falsas.
        // Exemplo de estrutura de decisão if
        int numero = 10;
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        // Exemplo de estrutura de decisão switch
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido.");
        }        

    }
}
