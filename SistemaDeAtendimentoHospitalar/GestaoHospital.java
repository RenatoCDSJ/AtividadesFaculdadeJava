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
        if(paciente.getNp() == "0"){
            addFila(0, paciente);
        }else if(paciente.getNp() == "1"){
            addFila(1, paciente);
        }else if(paciente.getNp() == "2"){
            addFila(2, paciente);
        }else if(paciente.getNp() == "3"){
            addFila(3, paciente);
        }
    }
    public void novoPaciente(){
        Scanner scn = new Scanner(System.in);
        System.out.println("nome: ");
        String nome = scn.nextLine();
        System.out.println("cpf: ");
        String cpf = scn.nextLine();
        System.out.println("nivel prioridade de 0 a 3: ");
        String np = scn.nextLine();
        while(np != "0"||np != "1"||np != "2"||np != "3"){
            System.out.println("nivel prioridade de 0 a 3: ");
            np = scn.nextLine();
        }
        Paciente paciente = new Paciente(nome,cpf,np);
        noPaciente(paciente);
        scn.close();
    }
    public int exibirNumeroPacientesFila(){
        return fila0.getNum()+fila1.getNum()+fila2.getNum()+fila3.getNum();
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
    public void atenderPaciente(){
        if(exibirNumeroPacientesFila() == 0){
            System.out.println("nenhum paciente na fila de espera.");
        }
        int num = ordem();
        rmFila(num);
    }

}
