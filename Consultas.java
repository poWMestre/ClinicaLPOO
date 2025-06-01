import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Consultas{

    private final long idConsulta;
    private Medico medicoDaConsulta;
    private LocalDateTime dataDaConsulta;
    private float valorDaConsulta;
    private String sintomas;
    // Status da consulta seria agendado, cancelado, finalizado
    private String statusConsulta;
    private Paciente paciente;
    private List<String> receitaMedica;
    private List<String> exames;



    public Consultas(Medico nomeMedico, Paciente paciente, LocalDateTime dataConsulta, String sintomas){
        idConsulta = ++Consultorio.quantidadeConsultas;
        this.medicoDaConsulta = nomeMedico;
        this.dataDaConsulta = dataConsulta;
        this.paciente = paciente;
        setSintomas(sintomas);

        receitaMedica = new ArrayList<>();
        exames = new ArrayList<>();
    }

    public String getSintomas() {
        return sintomas;
    }

    public float getValorDaConsulta() {
        return valorDaConsulta;
    }

    public Medico getMedicoDaConsulta() {
        return medicoDaConsulta;
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

    public enum statusMudarConsulta {
        AGENDADO, CANCELADO, FINALIZADO
    }

    public LocalDateTime getDataDaConsulta() {
        return dataDaConsulta;
    }

    public void setSintomas(String sintomas) {
        validar.validarString(sintomas);
        this.sintomas = sintomas;
    }

    public void setDataDaConsulta(LocalDateTime dataDaConsulta) {
        
        validar.validarDataHora(dataDaConsulta);

        this.dataDaConsulta = dataDaConsulta;
    }

    public void setValorDaConsulta(float valorDaConsulta) {
        validar.validarValores(valorDaConsulta);
        this.valorDaConsulta = valorDaConsulta;
    }

    public void setReceita(String informacaoReceitaMedica){
        validar.validarString(informacaoReceitaMedica);
        receitaMedica.add(informacaoReceitaMedica);
    }

    public void setExames(String exames) {
        validar.validarString(exames);
        receitaMedica.add(exames);
    }

    public void setExames(String... exames) {
        for(String exame : exames){
            setExames(exame);
        }
    }

    public List<String> getReceita(){
        return Collections.unmodifiableList(receitaMedica);
    }

    public List<String> getExames() {
        return Collections.unmodifiableList(exames);
    }

    public long getIdConsulta(){
        return idConsulta;
    }

}

