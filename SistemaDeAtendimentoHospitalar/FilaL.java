//Essa classe irá fazer uma fila de nós
//terá atributos cabeca calda e num
//terá metodos de adicionar, remover e tirar print
public class FilaL<T>{
    private No<T> cabeca;
    private No<T> calda;
    private int num;
    public No<T> getCabeca() {
        return cabeca;
    }
    public void setCabeca(No<T> cabeca) {
        this.cabeca = cabeca;
    }
    public int getNum() {
        return num;
    }
    public FilaL(){
        cabeca = null;
        calda = null;
    }
    public void addFila(T dado){
        No<T> no = new No<>(dado);
        if(cabeca == null){
            cabeca = no;
        }else{
            calda.setProximo(no);
        }
        num++;
        calda = no;
    }
    public void rmFila(){
        if(cabeca == null){
            return;
        }
        cabeca = cabeca.getProximo();
        num--;
    }
    public void printFila(){
        No<T> no = cabeca;
        while(no != null){
            System.out.println(no);
            no = no.getProximo();
        }
    }
}