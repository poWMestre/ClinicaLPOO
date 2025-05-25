import java.lang.reflect.Array;

class Paciente extends Pessoa{

    private String cpf;
    private final int IdPaciente;

   public Paciente(String nome, String endereco, String numeroTelefone, String dataNascimento,float salario, String ingressoNoConsultorio, String CPF){
        super(nome, endereco, numeroTelefone, dataNascimento);
        this.cpf = CPF;
        this.IdPaciente = Consultorio.quantidadePacientes + 1;
    }
    


    void agendamentoDeConsulta(){}

    void visualizarReceitas(){}

    void visualizarExame(){}

    public String getCPF(){
        return cpf;
    }
}