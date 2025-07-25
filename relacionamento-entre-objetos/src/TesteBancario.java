public class TesteBancario {

    public static void main(String[] args) {

        ContaBancaria contaJoao = new ContaBancaria();
        contaJoao.setNomeUsuario("João Helis");

        ContaBancaria contaMaria = new ContaBancaria();
        contaMaria.setNomeUsuario("Maria Clara");
        
        // conta.imprimirInformacoesDaConta();
        
        contaJoao.depositar(1000);        
        
        contaJoao.sacar(300); // 700

        contaJoao.transferir(contaMaria, 1000);        

        contaJoao.imprimirInformacoesDaConta();

        contaMaria.imprimirInformacoesDaConta();
        
    }
    
}
