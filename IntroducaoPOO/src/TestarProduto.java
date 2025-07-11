public class TestarProduto {
    
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 3000;

        produto1.informarNome();
        produto1.fazerPromocao();
        produto1.informarPreco();

        
    }

}
