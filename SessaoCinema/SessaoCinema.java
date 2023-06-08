public class SessaoCinema {
    String data;
    String horario;
    String filme;
    Cliente[] assentos;
    public SessaoCinema(String data, String horario, String filme, Integer capacidade){
        this.data = data;
        this.horario = horario;
        this.filme = filme;
        this.assentos = new Cliente[capacidade];
    }

    public Boolean reservar(Cliente c, Integer assento){
        if()
        
        return false;
    }

    public void cancelar(String cpf){

    }

    public String getMapaReservas(){
        return "";
    }

}
