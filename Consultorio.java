import java.util.ArrayList;

class Consultorio{

    private String nome;
    private final String cnpj;

    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Secretaria> secretarias = new ArrayList<>();
    private ArrayList<Consultas> consultas = new ArrayList<>();
    
    public static float saldoContaConsultorio = 0;
    public static int quantidadePacientes = 0;
    public static int quantidadeMedicos = 0;
    public static int quantidadeConsultas = 0;

    public Consultorio(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    void addPacientes(Paciente paciente){
        quantidadePacientes += 1;
        pacientes.add(paciente);
        
    }

    void addMedicos(Medico medico){
        quantidadeMedicos += 1;
        medicos.add(medico);
        
    }

    void addSecretaria(Secretaria secretaria){
        secretarias.add(secretaria);
    }

    void arquivarConsultas(Consultas consulta){
        quantidadeConsultas += 1;
        consultas.add(consulta);
        
    }

    public ArrayList<Consultas> getConsulta(){
        return consultas;
    }
    
}