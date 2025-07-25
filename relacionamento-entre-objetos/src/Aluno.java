public class Aluno{

    String nome;
    String email;
    String cpf;
    
    Pessoa mae;
    Pessoa pai;

    public void imprimirDados(){
        System.out.println("-------------------");
        System.out.println("INFORMAÇÕES DO ALUNO");
        System.out.println("-------------------");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("CFP: " + cpf);

        System.out.println("-------------------");
        System.out.println("RESPONSÁVEIS PELO ALUNO");
        System.out.println("-------------------");
        System.out.println("DADOS DA MÃE");
        mae.imprimirDados();
        
        System.out.println("DADOS DO PAI");
        pai.imprimirDados();
    }
}