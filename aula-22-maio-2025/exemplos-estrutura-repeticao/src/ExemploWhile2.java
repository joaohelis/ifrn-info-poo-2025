import java.util.Scanner;

public class ExemploWhile2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) { // enquanto continuar for verdaeiro

            System.out.println("POO é a minha paixão! s2");

            System.out.println("Deseja sair: (s) sim (n) não: ");
            String opcaoUsuario = input.nextLine(); // O nextLine é usado para pegar um texto

            if(opcaoUsuario.equals("s")){
                continuar = false;
            }
        }
    }    
}
