//Essa classe ira receber dados do paciente, sendo eles, nome, cpf e np(nivel de prioridade)
public class Paciente {
    private String nome;
    private String cpf;
    private String np;
    public String getNp() {
        return np;
    }
    public void setNp(String np) {
        this.np = np;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Paciente(String nome, String cpf, String np){
        this.nome = nome;
        this.cpf = cpf;
        this.np = np;
    }
    @Override
    public String toString(){
        return "nome: "+nome+"\ncpf: "+cpf+"\nnp: "+np;
    }
}
