public class Produto {

    String nome;
    float preco;

    public void informarNome(){
        System.out.println("O nome do produto é " + nome);
    }

    public void informarPreco(){
        System.out.println("O preço do produto é " + preco);
    }

    public void fazerPromocao(){
        preco = preco - preco * 10 / 100;
    }
    
}
