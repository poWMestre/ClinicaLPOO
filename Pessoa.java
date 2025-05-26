public abstract class Pessoa{
    
    private String nome;
    private String endereco;
    private String numeroTelefone;
    private String dataNascimento;
    private String cpf;

    protected Pessoa(String nome, String cpf){
        this(nome, cpf, null, null, null);

    }

    protected Pessoa(String nome, String cpf, String endereco){
        this(nome, cpf, endereco, null, null);

    }
    protected Pessoa(String nome,String  cpf, String endereco, String telefone){
        this(nome, cpf, endereco, telefone,  null);
    }
    protected Pessoa(String nome, String cpf,String endereco, String telefone, String dataNascimento){

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
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setNumeroTelefone(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}