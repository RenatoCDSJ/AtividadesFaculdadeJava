/*  Menu terá um menu que poderá
 *  Adicionar um paciente à fila
 *  Atender o próximo paciente
 *  Exibir o número de pacientes na fila.
 */
import java.util.Scanner;
public class Menu {
    
    GestaoHospital gh = new GestaoHospital();
    public void menu(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1) Adicionar um paciente à fila.");
        System.out.println("2) Atender o próximo paciente.");
        System.out.println("3) Exibir o númerio de pacientes na fila.");
        System.out.println("4) sair do programa.");
        String opcao = scn.nextLine();
        if(opcao.equals("1")){
            System.out.println("Opção 1:");
            gh.novoPaciente();
        }else if(opcao.equals("2")){
            System.out.println("Opção 2:");
            gh.atenderPaciente();
        }else if(opcao.equals("3")){
            System.out.println("Opção 3:");
            gh.exibirNumeroPacientesFila();
        }else if(opcao.equals("4")){
            return;
        }
        menu();
    }
}
