public class Data {

    int dia;
    int mes;
    int ano;

    public void escreverData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public void escreverMes(){
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", "Outubro", 
                          "Novembro", "Dezembro"};

        System.out.println(meses[mes - 1]);
    }
    
}
