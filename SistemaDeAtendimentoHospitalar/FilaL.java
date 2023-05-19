//Essa classe irá fazer uma fila de nós
//terá metodos de adicionar e remover
public class FilaL<T>{
    private No<T> cabeca;
    private No<T> calda;
    public FilaL(){
        cabeca = null;
        calda = null;
    }
    public void addFila(T dado){
        No<T> no = new No<>(dado, cabeca);
        if(cabeca == null){
            cabeca = no;
        }else{
            calda.setProximo(no);
        }
        calda = no;
    }
    public void rmFila(){
        
    }
}