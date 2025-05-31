import java.util.ArrayList;
import java.util.List;

class Consultorio{

    private String nome;
    private String cnpj;

    private final List<Paciente> pacientes;
    private final List<Medico> medicos;
    private final List<Secretaria> secretarias;
    private final List<Consultas> consultas;
    
    public float saldoContaConsultorio = 0;
    
    public int quantidadePacientes = 0;
    public int quantidadeConsultas = 0;

    public Consultorio(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;

        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        secretarias = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void adicionarPaciente(Paciente paciente){
        pacientes.add(paciente);
        
    }

    public void adicionarPacientes(Paciente... pacientes){
        for(Paciente paciente : pacientes){
            adicionarPaciente(paciente);
        }
        
    }

    public void adicionarMedico(Medico medico){
        medicos.add(medico);
    }

    public void adicionarMedicos(Medico... medicos){
        for(Medico medico : medicos){
            adicionarMedicos(medico);
        }
    }

    public void adicionarSecretaria(Secretaria secretaria){
        secretarias.add(secretaria);
    }

    public void adicinarSecretarias(Secretaria... secretarias){
        for(Secretaria secretaria : secretarias){
            adicionarSecretaria(secretaria);
        }
    }

    public void arquivarConsultas(Consultas consulta){
        consultas.add(consulta);
        
    }

    public Consultas getConsulta(Paciente paciente){
        for(Consultas consulta : consultas){
            if(consulta.getPaciente().equals(paciente)){
                return consulta;
            }
        }

        return null; 
    }

    public void setSaldoContaConsultorio(float valor){
        this.saldoContaConsultorio = valor;
    }


    public <T extends Paciente> void alterarDadosPaciente( T paciente, String novoDadoParaTrocar, tipoDoDado tipoDado){

        switch (tipoDado) {
            case NOME:
                paciente.setNome(novoDadoParaTrocar);
                break;
            case ENDERECO:
                paciente.setEndereco(novoDadoParaTrocar);
                break;
            case NUMERO_TELEFONE:
                paciente.setNumeroTelefone(novoDadoParaTrocar);
                break;
            case DATA_NASCIMENTO:
                paciente.setDataNascimento(novoDadoParaTrocar);
                break;
            case CPF:
                paciente.setCpf(novoDadoParaTrocar);
                break;

        }

    }

    public enum tipoDoDado{
        NOME, ENDERECO, NUMERO_TELEFONE, DATA_NASCIMENTO, CPF
    }

    //Valor que a secretaria recebe das consultas
    public void getValorRecebidoDaConsulta(float valorRecebidoDaConsulta){
        this.saldoContaConsultorio += valorRecebidoDaConsulta;
    }

    public boolean solicitarAgendamentoConsulta(){
        return true;
    }

    public void visualizarReceitas(ArrayList<String> receitas){

       for(String receita : receitas){
           System.out.println("================== RECEITA MEDICA ==================");
           System.out.println(receita);
           System.out.println("====================================================");
       }
    }

    public void visualizarExames(ArrayList<String> exames){
        for(String exame : exames){
            System.out.println("======================= EXAME =======================");
            System.out.println(exame);
            System.out.println("=====================================================");
        }
    }
}