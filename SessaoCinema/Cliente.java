public class Cliente {
    String cpf;
    String telefone;

    public Cliente(String cpf, String telefone){
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getCpf(){
        return this.cpf;
    }
    public String getTelefone(){
        return this.telefone;
    }
}
