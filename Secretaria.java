import java.time.LocalDate;
import java.time.LocalDate;
import java.util.ArrayList;;

class Secretaria extends Pessoa{

    private float salario;
    private LocalDate DataIngressoNoConsultorio;
    

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

    public LocalDate getDataIngressoNoConsultorio() {
        return DataIngressoNoConsultorio;
    }
    





}