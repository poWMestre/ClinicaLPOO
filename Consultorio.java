import java.util.ArrayList;

class Consultorio{

    private String nome;
    private String cnpj;

    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Secretaria> secretarias = new ArrayList<>();
    private ArrayList<Consultas> consultas = new ArrayList<>();
    
    public  float saldoContaConsultorio = 0;
    public  int quantidadePacientes = 0;
    public  int quantidadeMedicos = 0;
    public  int quantidadeConsultas = 0;

    public Consultorio(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    void setPacientes(Paciente paciente){
        quantidadePacientes += 1;
        pacientes.add(paciente);
        
    }

    void adicionarMedico(Medico medico){
        quantidadeMedicos += 1;
        medicos.add(medico);
    }

    void adicionarMedicos(Medico... medicos){
        for(Medico medico : medicos){
            adicionarMedicos(medico);
        }
    }

    void adicionarSecretaria(Secretaria secretaria){
        secretarias.add(secretaria);
    }

    void adicinarSecretaria(Secretaria... secretarias){
        for(Secretaria secretaria : secretarias){
            adicionarSecretaria(secretaria);
        }
    }

    void arquivarConsultas(Consultas consulta){
        quantidadeConsultas += 1;
        consultas.add(consulta);
        
    }

    public ArrayList<Consultas> getConsulta(){
        return consultas;
    }

    public void setSaldoContaConsultorio(float valor){
        this.saldoContaConsultorio = valor;
    }

    public int getQuantidadeMedicos() {
        return ++quantidadeMedicos;
    }

    public int getQuantidadePacientes() {
        return ++quantidadePacientes;
    }

    public int getQuantidadeConsultas() {
        return ++quantidadeConsultas;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}