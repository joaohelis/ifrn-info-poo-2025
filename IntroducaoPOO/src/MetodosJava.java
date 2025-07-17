public class MetodosJava {


    public static void main(String[] args) {
        
        // imprimirNaTelaSeNumeroEhPar(11);

        // boolean resultado = ehPrimo(5);
        // if(resultado == true){
        //     System.out.println("O número informado é primo!");
        // }else{
        //     System.out.println("O número informado NÃO é primo!");            
        // }

        // Teste do método soma
        int resultado = soma(50, 23);

        System.out.println("O resultado da soma é " + resultado);

    }

    // Em Java, eu posso ter métodos que não retornam nada, ou seja, o tipo de retorno é void.

    public static void imprimirNaTelaSeNumeroEhPar(int numero){
        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        }else{
            System.out.println("O número " + numero + " é ímpar.");
        }
    }

    // Ou posso ter métodos que retornam um valor, como por exemplo, um inteiro, um booleano, etc.

    public static boolean ehPrimo(int numero){
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }  
        return true;      
    }

    public static int soma(int num1, int num2){
        // int resultado = num1 + num2;
        return num1 + num2;
    }

     
}