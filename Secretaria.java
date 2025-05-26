import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;;

class Secretaria extends Pessoa{

    private float salario;
    private LocalDate DataIngressoNoConsultorio;
    private float valorRecebidoDaConsulta;

    public Secretaria(String nome, String cpf, String endereco, String numeroTelefone, String dataNascimento,float salario){
        super(nome, cpf, endereco, numeroTelefone, dataNascimento);
        setSalario(salario);
        DataIngressoNoConsultorio = LocalDate.now();
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorRecebidoDaConsulta(){
        float tmp = valorRecebidoDaConsulta;
        valorRecebidoDaConsulta = 0;
        return tmp;
    }

    public void setValorRecebidoDaConsulta(float pagamento){
        valorRecebidoDaConsulta = pagamento;
    }


    void alterarDadosPaciente(tipoDoDado tipoDado, String novoDadoTrocar, Paciente paciente){

        switch (tipoDado) {
            case NOME:
                paciente.setNome(novoDadoTrocar);
                break;
            case ENDERECO:
                paciente.setEndereco(novoDadoTrocar);
                break;
            case NUMERO_TELEFONE:
                paciente.setNumeroTelefone(novoDadoTrocar);
                break;
            case DATA_NASCIMENTO:
                paciente.setDataNascimento(novoDadoTrocar);
                break;
            case CPF:
                paciente.setCpf(novoDadoTrocar);
                break;

        }

    }

    public enum tipoDoDado{
        NOME, ENDERECO, NUMERO_TELEFONE, DATA_NASCIMENTO, CPF
    }



}