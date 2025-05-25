public abstract class Pessoa{
    
    private String nome;
    private String endereco;
    private String numeroTelefone;
    private String dataNascimento;

    public Pessoa(String nome){
        this(nome, " ");

    }

    public Pessoa(String nome, String endereco){
        this(nome, endereco, " ");

    }
    public Pessoa(String nome, String endereco, String telefone){
        this(nome, endereco, telefone, " ");
    }
    public Pessoa(String nome, String endereco, String telefone, String dataNascimento){

        this.nome = nome;
        this.endereco = endereco;
        this.numeroTelefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    
}