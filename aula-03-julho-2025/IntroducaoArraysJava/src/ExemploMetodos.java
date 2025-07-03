// Definição da classe principal
public class ExemploMetodos {

    // Método principal: ponto de entrada da aplicação
    public static void main(String[] args){
        // Chamadas comentadas: exemplos de uso do método imprimirSaudacaoComNome
        // imprimirSaudacaoComNome("Alex");
        // imprimirSaudacaoComNome("Maiara");

        // Chamada do método soma passando dois números como parâmetros
        int resultadoSoma = soma(17, 18);

        // Impressão do resultado retornado pelo método soma
        System.out.println("O resultado da soma foi " + resultadoSoma);
    }

    // Método sem parâmetro e sem retorno: imprime uma saudação fixa
    public static void imprimirSaudacao(){
        System.out.println("Olá, eu amo estudar POO!");
    }

    // Método com parâmetro e sem retorno: imprime uma saudação personalizada com o nome
    public static void imprimirSaudacaoComNome(String nome){
        System.out.println("Olá, me chamo " + nome + " e eu amo estudar POO!");
    }

    // Método com parâmetros e com retorno: soma dois números inteiros e devolve o resultado
    public static int soma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado; // Retorna o valor da soma
    }

}