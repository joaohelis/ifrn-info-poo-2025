public class WhileDoWhile {
    
    public static void main(String[] args) {

        // EXEMPLO COM WHILE
        // int i = 1;
        // while (i > 10) {
        //     System.err.println("O valor de i é: " + i);
        //     i++;
        // }

        // EXEMPLO COM DO WHILE
        // int j = 1;
        // do{
        //     System.out.println("O valor de j é: " + j);
        //     j++;
        // }while(j > 10);

        // EXEMPLO COM O FOR
        // for(int i = 100; i > 0; i -= 1){
        //     System.out.println("O valor de i é: " + i);
        // }        

        // EXEMPLO COM O BREAK
        // for(int i = 0; i <= 10; i++){
        //     System.out.println("O valor de i é: " + i);
        //     if(i == 5){
        //         break;
        //     }
        // }

        // EXEMPLO COM O CONTINUE
        for(int i = 0; i <= 10; i++){
            System.out.print("Número: ");
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }

    }
}