import java.util.Scanner;

public class TestaData {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("---------------------------------");
            System.out.println("Sistema de Manipulação de Datas");
            System.out.println("---------------------------------");
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Informar Data");
            System.out.println("2 - Sair");
            
            int opcao = input.nextInt();
            if(opcao == 2){
                break;
            }

            System.out.println("Informe o dia: ");
            int dia = input.nextInt();
            System.out.println("Informe o mes: ");
            int mes = input.nextInt();
            System.out.println("Informe o ano: ");
            int ano = input.nextInt();

            Data dataUsuario = new Data();
            dataUsuario.dia = dia;
            dataUsuario.mes = mes;
            dataUsuario.ano = ano;

            dataUsuario.escreverData();
            dataUsuario.escreverMes();
        }
        
        // Data data1 = new Data();
        // data1.dia = 27;
        // data1.mes = 12;
        // data1.ano = 1993;

        // data1.escreverData();

        // data1.escreverMes();

    }
    
}
