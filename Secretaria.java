import java.time.LocalDate;

class Secretaria extends Pessoa{

    private float salario;
    private LocalDate DataIngressoNoConsultorio;
    

    public Secretaria(String nome, String cpf){
        this(nome, cpf, null, null, null, 0);
        
    }

    public Secretaria(String nome, String cpf, String endereco){
        this(nome, cpf, endereco, null, null,  0);
        
    }

    public Secretaria(String nome, String cpf, String endereco, String numeroTelefone){
        this(nome, cpf, endereco, numeroTelefone, null, 0);
        
    }

    public Secretaria(String nome, String cpf, String endereco, String numeroTelefone, String dataNascimento){
        this(nome, cpf, endereco, numeroTelefone, dataNascimento, 0);
        
    }

    public Secretaria(String nome, String cpf, String endereco, String numeroTelefone, String dataNascimento,float salario){
        super(nome, cpf, endereco, numeroTelefone, dataNascimento);
        setSalario(salario);
        DataIngressoNoConsultorio = LocalDate.now();
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        validar.validarValores(salario);
        this.salario = salario;
    }

    public LocalDate getDataIngressoNoConsultorio() {
        return DataIngressoNoConsultorio;
    }
    





}