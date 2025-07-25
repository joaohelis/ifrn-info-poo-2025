public class TesteAluno {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "José";
        pessoa1.email = "jose@escolar.ifrn.edu.br";
        pessoa1.cpf = "000.000.000-02";
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.email = "maria@escolar.ifrn.edu.br";
        pessoa2.cpf = "000.000.000-01";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Narte";
        aluno1.email = "narte@escolar.ifrn.edu.br";
        aluno1.cpf = "111.111.111-11";
        aluno1.mae = pessoa2;
        aluno1.pai = pessoa1;

        aluno1.imprimirDados();
    } 
}
