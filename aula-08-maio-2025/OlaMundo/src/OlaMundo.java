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

    }
}
