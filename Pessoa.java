
public abstract class Pessoa{
    
    private String nome;
    private String endereco;
    private String numeroTelefone;
    private String dataNascimento;
    private String cpf;

    public Pessoa(String nome, String cpf){
        this(nome, cpf, null, null, null);

    }

    public Pessoa(String nome, String cpf, String endereco){
        this(nome, cpf, endereco, null, null);

    }
    public Pessoa(String nome,String  cpf, String endereco, String telefone){
        this(nome, cpf, endereco, telefone,  null);
    }
    public Pessoa(String nome, String cpf,String endereco, String telefone, String dataNascimento){

        
        setCpf(cpf);
        setNome(nome);
        setEndereco(endereco);
        setNumeroTelefone(telefone);
        setDataNascimento(dataNascimento);
        
        //VALIDAR OS ATRIBUTOS
    }

    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getNumeroTelefone(){
        return numeroTelefone;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome){
        validar.validarString(nome);
        validar.validarNome(nome);
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        validar.validarString(endereco);
        validar.validarEndereco(endereco);
        this.endereco = endereco;
    }
    public void setNumeroTelefone(String numeroTelefone){
        validar.validarString(numeroTelefone);
        validar.validarTelefone(numeroTelefone);
        this.numeroTelefone = numeroTelefone;
    }

    public void setDataNascimento(String dataNascimento){
        validar.validarString(dataNascimento);
        validar.validarDataNascimento(dataNascimento);
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(String cpf) {
        validar.validarString(cpf);
        validar.validarCPF(cpf);
        this.cpf = cpf;
    }
}