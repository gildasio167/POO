
public class ControladorAvaliacoes{
    
    AvaliacaoRU[] avaliacoes;
    Integer cursor;
    
    public ControladorAvaliacoes(){
        avaliacoes = new AvaliacaoRU[50];
        cursor = 0;
    }
    public Boolean adicionarAvaliacao(AvaliacaoRU avaliacao){
        // verificacoes de validade da avaliacao
        if(avaliacao.getData() == ""){
            return false;
        }
        if(!(avaliacao.getTurno() == "almoco" || avaliacao.getTurno() == "jantar")){
            return false;
        }
        if(!(avaliacao.getProteina() == "animal" || avaliacao.getProteina() == "vegetal")){
            return false;
        }
        if(!(avaliacao.getNota() >= 1 && avaliacao.getNota() <= 5)){
            return false;
        }
        if(avaliacao.getComentario() == ""){
            if(avaliacao.getNota() <= 2){
                return false;
            }
        }
        // registrar a avaliacao no Array
        avaliacoes[cursor] = avaliacao;
        cursor++;
        return true;
    }
    public Double getMediaAvaliacoes(){
        Double total = 0.0;
        Integer i = 0;
        while(i < cursor){
            total += avaliacoes[i].getNota();
            i++;
        }
        if(cursor == 0) { 
            return 0.0;
        }
        return total/cursor;
    }
    public Double getMediaAvaliacoesPorProteina(String proteina){
        Double total = 0.0;
        Integer i = 0;
        Integer quantidade = 0;
        while(i < cursor){
            if(avaliacoes[i].getProteina() == proteina){
                total += avaliacoes[i].getNota();
                quantidade++;
            }
            i++;
        }
        if(quantidade == 0) { 
            return 0.0;
        }
        return total/quantidade;
    }
    public Double getMediaAvaliacoesPorTurno(String turno){
        Double total = 0.0;
        Integer i = 0;
        Integer quantidade = 0;
        while(i < cursor){
            if(avaliacoes[i].getTurno() == turno){
                total += avaliacoes[i].getNota();
                quantidade++;
            }
            i++;
        }
        if(quantidade == 0) { 
            return 0.0;
        }
        return total/quantidade;
    }
    public Double getMediaAvaliacoesPorData(String data){
        Double total = 0.0;
        Integer i = 0;
        Integer quantidade = 0;
        while(i < cursor){
            if(avaliacoes[i].getData() == data){
                total += avaliacoes[i].getNota();
                quantidade++;
            }
            i++;
        }
        if(quantidade == 0) { 
            return 0.0;
        }
        return total/quantidade;
    }
    public String getTodosComentarios(){
        Integer i = 0;
        String resultado = "";
        while(i < cursor){
            if(avaliacoes[i].getComentario() != ""){
                resultado += avaliacoes[i].getData() + "-" + avaliacoes[i].getTurno() + "-" +
                avaliacoes[i].getProteina() + "-" + avaliacoes[i].getNota() + "-" +
                avaliacoes[i].getComentario() + "\n";
            }
            i++;
        }
        return resultado;
    }
}

