//a classe GestaoHospital terá filas de prioridade 0,1,2,3
//as filas de espera receberão pacientes
/* 
 * pacientes serão chamados de acordo com a a regra
 * Chama 1 paciente severo
 * Chama 1 paciente moderado
 * Chama 1 paciente leve
 * Chama 1 paciente severo
 * Chama 1 paciente moderado
 * Chama 1 paciente severo
 * Chama 1 paciente normal
*/
import java.util.Scanner;
public class GestaoHospital {
    private int ordem = 0;
    FilaL<Paciente> fila0 = new FilaL<>();
    FilaL<Paciente> fila1 = new FilaL<>();
    FilaL<Paciente> fila2 = new FilaL<>();
    FilaL<Paciente> fila3 = new FilaL<>();
    
    private void addFila(int num, Paciente paciente){
        if(num == 0){
            fila0.addFila(paciente);
        }else if(num == 1){
            fila1.addFila(paciente);
        }else if(num == 2){
            fila2.addFila(paciente);
        }else if(num == 3){
            fila3.addFila(paciente);
        }
    }
    
    private void rmFila(int num){
        if(num == 0){
            fila0.rmFila();
        }else if(num == 1){
            fila1.rmFila();
        }else if(num == 2){
            fila2.rmFila();
        }else if(num == 3){
            fila3.rmFila();
        }
    }
    
    private void noPaciente(Paciente paciente){
        if(paciente.getNp().equals("0")){
            addFila(0, paciente);
        }else if(paciente.getNp().equals("1")){
            addFila(1, paciente);
        }else if(paciente.getNp().equals("2")){
            addFila(2, paciente);
        }else if(paciente.getNp().equals("3")){
            addFila(3, paciente);
        }
    }

    public void novoPaciente(){
        Scanner scn = new Scanner(System.in);
        boolean npAprovado = false;
        System.out.println("nome: ");
        String nome = scn.nextLine();
        System.out.println("cpf: ");
        String cpf = scn.nextLine();
        String np = null;
        while(npAprovado == false){
            System.out.println("nivel prioridade de 0 a 3: ");
            np = scn.nextLine();
            if(np.equals("0") || np.equals("1") || np.equals("2") || np.equals("3")){
                npAprovado = true;
            }
        }
        Paciente paciente = new Paciente(nome,cpf,np);
        noPaciente(paciente);
        System.out.println("Paciente: "+ paciente.getNome() +" adicionado á fila!");
    }

    public void exibirNumeroPacientesFila(){
        int pacientes = fila0.getNum()+fila1.getNum()+fila2.getNum()+fila3.getNum();
        int f0 = fila0.getNum();
        int f1 = fila1.getNum();
        int f2 = fila2.getNum();
        int f3 = fila3.getNum();
        System.out.println("Pacientes na fila:"+ pacientes+ "\nf0: "+ f0+ "\nf1: "+ f1+ "\nf2: "+ f2+ "\nf3: "+ f3);
    }

    private int ordem(){
        ordem++;
        int num = 0;
        if(ordem == 1){
            num = 3;
            return num;
        }else if(ordem == 2){
            num = 2;
            return num;
        }else if(ordem == 4){
            num = 1;
            return num;
        }else if(ordem == 5){
            num = 3;
            return num;
        }else if(ordem == 6){
            num = 2;
            return num;
        }else if(ordem == 7){
            num = 3;
            return num;
        }else if(ordem == 8){
            num = 0;
            ordem = 0;
            return num;
        }
        return num;
    }

    public boolean filaVazia(int num){
        if(num == 0){
            if(fila0.getCabeca() == null){
                return false;
            }else{
                return true;
            }
        }else if(num == 1){
            if(fila1.getCabeca() == null){
                return false;
            }else{
                return true;
            }
        }else if(num == 2){
            if(fila2.getCabeca() == null){
                return false;
            }else{
                return true;
            }
        }else if(num == 3){
            if(fila3.getCabeca() == null){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
    private void printPaciente(int num){
        System.out.println("Paciente atendido:");
        if(num == 0){
            System.out.println(fila0.getCabeca().getDado());
        }else if(num == 1){
            System.out.println(fila1.getCabeca().getDado());
        }else if(num == 2){
            System.out.println(fila2.getCabeca().getDado());
        }else if(num == 3){
            System.out.println(fila3.getCabeca().getDado());
        }
    }

    public void atenderPaciente(){
        int pacientes = fila0.getNum()+fila1.getNum()+fila2.getNum()+fila3.getNum();
        if(pacientes == 0){
            System.out.println("nenhum paciente na fila de espera.");
            return;
        }
        int num = ordem();
        while(filaVazia(num) == false){
            num = ordem();
        }
        printPaciente(num);
        rmFila(num);
    }

}
