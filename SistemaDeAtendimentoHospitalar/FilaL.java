//Essa classe irá fazer uma fila de nós
//terá metodos de adicionar, remover e tirar print
public class FilaL<T>{
    private No<T> cabeca;
    private No<T> calda;
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
        calda = no;
    }
    public void rmFila(){
        cabeca = cabeca.getProximo();
    }
    public void printFila(){
        No<T> no = cabeca;
        while(no != null){
            System.out.println(no);
        }
    }
}