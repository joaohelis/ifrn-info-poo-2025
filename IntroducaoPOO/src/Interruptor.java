public class Interruptor {

    boolean ligado;

    public void pressionar(){
        if(ligado == true){
            ligado = false;
        }else{
            ligado = true;
        }
    }

    public void verificarLampada(){
        if(ligado == true){
            System.out.println("A lâmpada está ligada");
        }else{
            System.out.println("A lâmpada está desligada");
        }
    }
    
}
