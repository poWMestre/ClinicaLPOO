import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

class Consultorio{

    private String nome;
    private String cnpj;

    private final List<Paciente> pacientes;
    private final List<Medico> medicos;
    private final List<Secretaria> secretarias;
    private final List<Consultas> consultas;
    
    public static long quantidadeConsultas = 0;

    public Consultorio(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;

        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        secretarias = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public static long getQuantidadeConsultas() {
        return quantidadeConsultas;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    public String getNome(){
        return nome;
    }

    public void adicionarPaciente(Paciente paciente){
        
        if(pacientes.contains(paciente)){
            throw new IllegalArgumentException("Paciente já existente!");
        }

        pacientes.add(paciente);
        
    }

    public void adicionarPacientes(Paciente... pacientes){
        for(Paciente paciente : pacientes){
            adicionarPaciente(paciente);
        }
        
    }

    public void removerPaciente(Paciente pacienteRemover){

        for(Paciente paciente : pacientes){
            if(paciente.equals(pacienteRemover)){
                pacientes.remove(paciente);
            }
        }
    }

    public void adicionarMedico(Medico medico){
        
        if(medicos.contains(medico)){
            throw new IllegalArgumentException("Médico já existente!");
        }

        medicos.add(medico);
    }

    public void adicionarMedicos(Medico... medicos){
        for(Medico medico : medicos){
            adicionarMedicos(medico);
        }
    }

    public void removerMedico(Medico medicoRemover){
        for(Medico medico : medicos){
            if(medico.equals(medicoRemover)){
                medicos.remove(medico);
            }
        }
    }

    public void adicionarSecretaria(Secretaria secretaria){
        
        if(secretarias.contains(secretaria)){
            throw new IllegalArgumentException("Secretaria já existente!");
        }

        secretarias.add(secretaria);
    }

    public void adicionarSecretarias(Secretaria... secretarias){
        for(Secretaria secretaria : secretarias){
            adicionarSecretaria(secretaria);
        }
    }

    public void arquivarConsultas(Consultas consulta){
        consultas.add(consulta);
        
    }


    /*
     * Buscas sendo feitas via nome do paciente ou via ID da consulta
     */

    public Consultas buscarConsulta(Paciente paciente){
        
        if(paciente == null){
            throw new IllegalArgumentException("Informações do paciente faltando!");
        }

        for(Consultas consulta : consultas){
            if(consulta.getPaciente().equals(paciente)){
                return consulta;
            }
        }

        return null; 
    }

    public Consultas buscarConsulta(int idConsulta){
        
        for(Consultas consulta : consultas){
            if(consulta.getIdConsulta() == idConsulta){
                return consulta;
            }
        }

        return null;
    }

    public Consultas solicitarConsulta(Paciente paciente, Medico medico, String sintomas, LocalDateTime dataHora){
        
        if (!medico.getDisponibilidadeDoMedico()) {
            throw new IllegalArgumentException("Médico indisponivel!");
        }

        validar.validarString(sintomas);

        validar.validarDataHora(dataHora);

        return new Consultas(medico, paciente, dataHora, sintomas);
    }

    public void visualizarReceitas(List<String> receitas){

       for(String receita : receitas){
           System.out.println("================== RECEITA MEDICA ==================");
           System.out.println(receita);
           System.out.println("====================================================");
       }
    }

    public void visualizarExames(List<String> exames){
        for(String exame : exames){
            System.out.println("======================= EXAME =======================");
            System.out.println(exame);
            System.out.println("=====================================================");
        }
    }

}