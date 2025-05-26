class Medico extends Pessoa{

    private String crm;
    private final int IdMedico;
    private boolean disponibilidadeDoMedico = true;

    public Medico(String nome, String endereco, String numeroTelefone, String dataNascimento,float salario,
                  String ingressoNoConsultorio, String CRM, int IdDoMedico){
        super(nome, endereco, numeroTelefone, dataNascimento);
        this.crm = CRM;
        this.IdMedico = IdDoMedico;
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

    public String solicitarExames(){
        return "Consultório Médico Vida & Saúde\n" +
                "Dr. Carlos Alberto Mendes – CRM-SP 123456\n" +
                "Endereço: Rua das Flores, 123 – Centro – São Paulo/SP\n" +
                "Telefone: (11) 1234-5678\n\n" +
                "SOLICITAÇÃO DE EXAMES\n\n" +
                "Paciente: João da Silva\n" +
                "Idade: 45 anos\n" +
                "Data de nascimento: 15/08/1979\n" +
                "Data: 26/05/2025\n\n" +
                "Exames solicitados:\n\n" +
                "1. Hemograma completo\n" +
                "2. Glicemia em jejum\n" +
                "3. Colesterol total e frações\n" +
                "4. Eletrocardiograma (ECG)\n\n" +
                "Justificativa clínica:\n" +
                "Avaliação de rotina e investigação de queixas de cansaço frequente e tonturas.\n\n" +
                "Orientações:\n" +
                "– Comparecer em jejum de 8 a 12 horas para exames laboratoriais.\n" +
                "– Levar exames anteriores, se houver.\n" +
                "– Retornar com os resultados para reavaliação médica.\n\n" +
                "____________________________________\n" +
                "Dr. Carlos Alberto Mendes\n" +
                "CRM-SP 123456\n";
    }

    public String inserirReceita(){
        return "Consultório Médico \n" +
                "Dr. Carlos Alberto  – CRM-SP 123456\n" +
                "Endereço: Rua das Flores, 123 – Centro – São Paulo/SP\n" +
                "Telefone: (11) 1234-5678\n" +
                "\n" +
                "RECEITA MÉDICA\n" +
                "\n" +
                "Paciente: João da Silva\n" +
                "Idade: 45 anos\n" +
                "Data de nascimento: 15/08/1979\n" +
                "Data: 26/05/2025\n" +
                "\n" +
                "Prescrição:\n" +
                "\n" +
                "1. Amoxicilina 500mg\n" +
                "   - Tomar 1 cápsula a cada 8 horas por 7 dias.\n" +
                "\n" +
                "2. Dipirona 500mg\n" +
                "   - Tomar 1 comprimido se houver dor ou febre, até 4 vezes ao dia.\n" +
                "\n" +
                "3. Omeprazol 20mg\n" +
                "   - Tomar 1 cápsula em jejum pela manhã, durante 14 dias.\n" +
                "\n" +
                "Observações:\n" +
                "Ingerir os medicamentos com água.\n" +
                "Não suspender o uso sem orientação médica.\n" +
                "Retorno em 10 dias para reavaliação.\n" +
                "\n" +
                "____________________________________\n" +
                "Dr. Carlos Alberto Mendes\n" +
                "CRM-SP 123456";
    }

}