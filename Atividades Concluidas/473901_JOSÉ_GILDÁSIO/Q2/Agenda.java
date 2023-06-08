public class Agenda {
    private Contato[] contatos;
    int cursor;

    public Agenda(){
        contatos = new Contato[50];
        cursor = 0;
    }

    public Boolean adicionar(Contato c){
        //if(buscarNome(nome) == null){
          //  this.contatos[i] = new Contato(nome, telefone);
            //this.cursor++;
            //return true;
        //}
        //return false;
        contatos[cursor] = c;
        cursor++;
        return true;
    }
    public String getTelefone(String telefone){
        if(buscarTelefone(telefone) != null){
            return "";
        }
        else{ 
            return "nao existe";
        }
    }
    public Integer getTotalContatos(){
        int cont = 0;
        for(int i = 0; i <cursor; i++){
            if(contatos[i] != null){
                cont++;
                
            }
        }
        return cont-1;
    }

    public Contato buscarNome(String nome){
        Contato contatoAchado = null;
        for(int i = 0; i < this.cursor; i++){
            if(this.contatos[i].getNome() == nome){
                contatoAchado = this.contatos[i];
                break;
            }
        }
        return contatoAchado;
    }
    public Contato buscarTelefone(String telefone){
        Contato contatoAchado = null;
        for(int i = 0; i < this.cursor; i++){
            if(this.contatos[i].getTelefone() == telefone){
                contatoAchado = this.contatos[i];
                break;
            }
        }
        return contatoAchado;
    }

}
