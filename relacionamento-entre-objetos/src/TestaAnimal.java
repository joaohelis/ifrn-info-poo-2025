public class TestaAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setNome("Luck");
        animal.setRaca("Girafa");

        animal.caminhar();

        Gato gato = new Gato();
        gato.setNome("Chanin");
        gato.setRaca("Cianês");
        gato.mia();

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setRaca("Caramelo");
        cachorro.late();
        
    }
    
}
