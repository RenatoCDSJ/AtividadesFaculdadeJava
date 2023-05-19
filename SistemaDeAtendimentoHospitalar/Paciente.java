//Essa classe ira receber dados do paciente, sendo eles, nome, cpf e np(nivel de prioridade)
public class Paciente {
    private String nome;
    private int cpf;
    private int np;
    public int getNp() {
        return np;
    }
    public void setNp(int np) {
        this.np = np;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Paciente(String nome, int cpf, int np){
        this.nome = nome;
        this.cpf = cpf;
        this.np = np;
    }
}
