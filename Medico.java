class Medico extends Pessoa{

    private String crm;
    private boolean disponibilidadeDoMedico = true;

    public Medico(String nome, String cpf){
        this(nome, cpf, null, null, null);
        
    }

    public Medico(String nome, String cpf, String endereco){
        this(nome, cpf, endereco, null, null);
        
    }

    public Medico(String nome, String cpf, String endereco, String numeroTelefone){
        this(nome, cpf, endereco, numeroTelefone, null);
        
    }

    public Medico(String nome, String cpf, String endereco, String numeroTelefone, String dataNascimento){
        super(nome, cpf, endereco, numeroTelefone, dataNascimento);
    
    }

    public Medico(String nome, String cpf, String endereco, String numeroTelefone, String dataNascimento, String crm){
        super(nome, cpf, endereco, numeroTelefone, dataNascimento);
        setCrm(crm);
    
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setDisponibilidadeDoMedico(boolean valor){
        this.disponibilidadeDoMedico = valor;
    }

    public boolean getDisponibilidadeDoMedico(){
        return disponibilidadeDoMedico;
    }

   

}