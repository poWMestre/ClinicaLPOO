import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Consultas{

    private final int idConsulta;
    private String MedicoDisponivel;
    private LocalDate dataDaConsulta;
    // Status da consulta seria agendado, cancelado, finalizado
    private String statusConsulta;
    private Paciente paciente;
    private ArrayList<String> receitaMedica;
    private ArrayList<String> examesPedidos;



    public Consultas(String nomeMedico, int idDaConsulta){
        this.dataDaConsulta = LocalDate.now();
        this.MedicoDisponivel = nomeMedico;
        idConsulta = idDaConsulta;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public void setStatusConsulta(statusMudarConsulta mudarStatus){

        switch (mudarStatus){

            case AGENDADO:
                this.statusConsulta = "Agendado";
                break;
            case CANCELADO:
                this.statusConsulta = "Cancelado";
                break;
            case FINALIZADO:
                this.statusConsulta = "Finalizado";
                break;
        }

    }

    public void setNomeMedico(String nomeMedico){
        this.MedicoDisponivel = nomeMedico;
    }

    public void setDataDaConsulta(LocalDate novaData){
        this.dataDaConsulta = novaData;
    }
    public void setReceitaMedica(String informacaoReceitaMedica){
        receitaMedica.add(informacaoReceitaMedica);
    }

    public ArrayList<String> getReceitaMedica(){
        return receitaMedica;
    }

    public ArrayList<String> getExamesPedidos() {
        return examesPedidos;
    }

    public void setExamesPedidos(String examesPedidos) {
        receitaMedica.add(examesPedidos);
    }

    //public enum statusMudarConsulta {
       // AGENDADO, CANCELADO, FINALIZADO
    //}

    //public String solicitarExames(){
        
    //}

    //public String inserirReceita(){
        
    //}

}

