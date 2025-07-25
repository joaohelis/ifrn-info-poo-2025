public class Animal {

    private String nome;
    private String raca;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public void caminhar(){
        System.out.println("O animal está caminhando...");
    }
    
}
