import java.time.LocalDate;
import java.util.ArrayList;;

class Secretaria extends Pessoa{

    private float salario;
    private LocalDate DataIngressoNoConsultorio;

    public Secretaria(String nome, String endereco, String numeroTelefone, String dataNascimento,float salario, String ingressoNoConsultorio){
        super(nome, endereco, numeroTelefone, dataNascimento);
        this.salario = salario;
        this.DataIngressoNoConsultorio = LocalDate.now();
        
    }

    public float getSalario() {
        return salario;
    }

    void receberPagamento(float pagamento){
        Consultorio.saldoContaConsultorio += pagamento;
    }


    void marcarConsultar(){}

    public ArrayList<Consultas> alterarStatusConsulta(ArrayList<Consultas> consultas, String cpf){
        
        consultas.forEach(consulta -> {
            if(consulta.getCpfPaciente().equals(cpf)){
                consulta.alterarStatusDaConsulta(alterarStatus);
            }
        });
        //Pensei em pegar a consulta do consultorio, remove, modificar e
        // fazer um add colocando ela no começo, oq isso traria de ruim
        // seria que os IDs ficariam quebrados
        return consulta;
    }
    

    void verificarDisponibilidadeMedico(){}

    void cadastrarPaciente(){}

    void alterarDadosPaciente(){}

    



}