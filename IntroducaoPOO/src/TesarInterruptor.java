public class TesarInterruptor {
    
    public static void main(String[] args) {
        
        System.out.println("-----------------");
        System.out.println("Esses prints são referntes ao Interruptor 1");
        System.out.println("-----------------");
        Interruptor interruptor1 = new Interruptor();
        interruptor1.verificarLampada();
        interruptor1.pressionar();
        interruptor1.verificarLampada();
        interruptor1.pressionar();
        interruptor1.verificarLampada();

        System.out.println("-----------------");
        System.out.println("Esses prints são referntes ao Interruptor 2");
        System.out.println("-----------------");
        Interruptor interruptor2 = new Interruptor();
        interruptor2.pressionar();
        interruptor2.verificarLampada();

    }

}
