public class Produto{

    public String nome;
    public float preco;

    public void informarNome(){
        System.out.println("O nome do produto é " + this.nome);
    }

    public void informarPreco(){
        System.out.println("O preço do produto é " + this.preco);
    }

    public void fazerPromocao(){
        float precoPromocional = this.preco - this.preco * 10 / 100;
        this.preco = precoPromocional;
    }

}