public class ContaBancaria {

    private String nomeUsuario;
    private String agencia;
    private String conta;
    private float saldo;

    public void transferir(ContaBancaria contaParaTransferir, float valor){
        saldo = saldo - valor;
        contaParaTransferir.depositar(valor);
    }

    public void sacar(float valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        }        
    }

    public void depositar(float valor){
        saldo = saldo + valor;
    }

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeUsuario(){
        return nomeUsuario;
    }

    public void imprimirInformacoesDaConta(){
        System.out.println("-------------------------");
        System.out.println("INFORMAÇÕES DA CONTA");
        System.out.println("-------------------------");
        System.out.println("Nome do Usuário: " + nomeUsuario);
        System.out.println("Saldo: " + saldo);
    }
    
}
