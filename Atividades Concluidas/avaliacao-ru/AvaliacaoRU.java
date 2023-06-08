
public class AvaliacaoRU {
    Integer nota;
    String data;
    String turno;
    String proteina;
    String comentario;
    public AvaliacaoRU(String data, String turno, String proteina, Integer nota, String comentario){
        this.nota = nota;
        this.data = data;
        this.turno = turno;
        this.proteina = proteina;
        this.comentario = comentario;
    }
    public String getData(){
        return this.data;
    }
    public String getTurno(){
        return this.turno;
    }
    public String getProteina(){
        return this.proteina;
    }
    public Integer getNota(){
        return this.nota;
    }
    public String getComentario(){
        return this.comentario;
    }
    
}