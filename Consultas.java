import java.time.LocalDateTime;

public class Consultas{

    private int idConsulta;
    private String nomeMedico;
    private LocalDateTime dataDaConsulta;
    static String statusConsulta;
    private Paciente paciente;
    // Status da consulta seria agendado, cancelado, finalizado


    public Consultas(String nomeMedico, Paciente pacientee){
        this.dataDaConsulta = LocalDateTime.now();
        this.nomeMedico = nomeMedico;
        idConsulta = Consultorio.quantidadeConsultas;
        this.paciente = pacientee;
    }
    
    public void alterarStatusDaConsulta(String status){
        statusConsulta = status;
    }

    public String getCpfPaciente(){
        return paciente.getCPF();
    }

    
}

