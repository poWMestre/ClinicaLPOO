class Medico extends Pessoa{

    private String crm;
    private final int IdMedico;
    private boolean disponibilidadeDoMedico;

    public Medico(String nome, String endereco, String numeroTelefone, String dataNascimento,float salario, String ingressoNoConsultorio, String CRM){
        super(nome, endereco, numeroTelefone, dataNascimento);
        this.crm = CRM;
        this.IdMedico = Consultorio.quantidadeMedicos + 1;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    void mudarDisponibilidadeDoMedico(boolean valor){
        this.disponibilidadeDoMedico = valor;
    }

    void solicitarExames(){
        throw new RuntimeException("Solicito que você faça exames de Raio-X e da barriga");
    }

}