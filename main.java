import java.time.LocalDate;
import java.time.LocalDateTime;
public class main {

    public static void main(String args[]){
        
        Consultorio consultorio = new Consultorio("Consultorio picaPau", "45.723.174/0001-63");
        Medico medico = new Medico("Carlos da Silva", "035.671.231-14");
        Secretaria secretaria = new Secretaria("Amanda dos Lopes", "035.671.231-14");
        Paciente paciente = new Paciente("Jorge de Menezes", "035.671.231-14");

        consultorio.adicionarMedico(medico);
        consultorio.adicionarSecretaria(secretaria);
        consultorio.adicionarPaciente(paciente);

        consultorio.solicitarConsulta(paciente, medico, "Dor de cabeça", LocalDateTime.now());

    }



}
