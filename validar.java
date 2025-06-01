import java.time.LocalDateTime;

public class validar{


    public static void validarString(String validarString){

        if(validarString == null || validarString.isEmpty()){
            throw new IllegalArgumentException("Campo inválido");
        }
        
    }

    public static void validarString(String... validarString){

        for(String campo : validarString){
            validarString(campo);
        }
    
    }

    public static void validarNome(String validarNome){

        if (!validarNome.matches("^[A-Za-zÀ-ÿ]+(?: [A-Za-zÀ-ÿ]+)*$")){
            throw new IllegalArgumentException("Nome inválido, coloque outro");
        }
    
    }

    public static void validarEndereco(String endereco){

        if (!endereco.matches("^[A-Za-zÀ-ÿ0-9\\s.,-]+,\\s*\\d+[A-Za-z0-9\\s-]*$")){
            throw new IllegalArgumentException("Endereço inválido, coloque outro");
        }

    }

    public static void validarTelefone(String telefone){
        
        if (!telefone.matches("^\\(?\\d{2}\\)?[\\s-]?9?\\d{4}[\\s-]?\\d{4}$")){
            throw new IllegalArgumentException("Telefone inválido tente outro!");
        }

    }

    public static void validarDataNascimento(String dataNascimento){

        if(!dataNascimento.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\\\d{4}$")){
            throw new IllegalArgumentException("Formato inválido, coloque: xx/xx/xxxx");
        }

    }

    public static void validarCPF(String cpf) {
        
        cpf = cpf.replaceAll("\\D", "");

        
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido: tamanho incorreto.");
        }

          if (cpf.matches("^(\\d)\\1{10}$")) {
            throw new IllegalArgumentException("CPF inválido: sequência repetida.");
        }

        int[] digitos = cpf.chars().map(Character::getNumericValue).toArray();

    
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += digitos[i] * (10 - i);
        }

        int resto = soma % 11;
        int digitoVerificador1 = (resto < 2) ? 0 : 11 - resto;

        if (digitos[9] != digitoVerificador1) {
            throw new IllegalArgumentException("CPF inválido: primeiro dígito verificador incorreto.");
        }

        
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += digitos[i] * (11 - i);
        }

        resto = soma % 11;
        int digitoVerificador2 = (resto < 2) ? 0 : 11 - resto;

        if (digitos[10] != digitoVerificador2) {
            throw new IllegalArgumentException("CPF inválido: segundo dígito verificador incorreto.");
        }
    }


    public static void validarCNPJ(String cnpj) {
        
        cnpj = cnpj.replaceAll("\\D", "");

        
        if (cnpj.length() != 14) {
            throw new IllegalArgumentException("CNPJ inválido: tamanho incorreto.");
        }

        
        if (cnpj.matches("^(\\d)\\1{13}$")) {
            throw new IllegalArgumentException("CNPJ inválido: sequência repetida.");
        }

        int[] digitos = cnpj.chars().map(Character::getNumericValue).toArray();

        
        int soma = 0;
        int peso = 2;
        for (int i = 11; i >= 0; i--) {
            soma += digitos[i] * peso;
            peso = (peso == 9) ? 2 : peso + 1;
        }

        int digitoVerificador1 = (soma % 11 < 2) ? 0 : 11 - (soma % 11);
        if (digitos[12] != digitoVerificador1) {
            throw new IllegalArgumentException("CNPJ inválido: primeiro dígito verificador incorreto.");
        }

        
        soma = 0;
        peso = 2;
        for (int i = 12; i >= 0; i--) {
            soma += digitos[i] * peso;
            peso = (peso == 9) ? 2 : peso + 1;
        }

        int digitoVerificador2 = (soma % 11 < 2) ? 0 : 11 - (soma % 11);
        if (digitos[13] != digitoVerificador2) {
            throw new IllegalArgumentException("CNPJ inválido: segundo dígito verificador incorreto.");
        }
    }


    public static void validarCRM(String crm){

        if(!crm.matches("^\\d{4,6}[-/ ]?[A-Z]{2}$")){
            throw new IllegalArgumentException("CRM incorreto digite novamente!");
        }

    }

    public static void validarValores(float salario){

        if(salario <= 0){
            throw new IllegalArgumentException("Valor do salário está incorreto!");
        }

    }

    public static void validarDataHora(LocalDateTime dataHora){

        if(dataHora == null){
            throw new IllegalArgumentException("Data e hora estão nulos, coloque algum valor");
        }else if(dataHora.isBefore(LocalDateTime.now().minusYears(10))){
            throw new IllegalArgumentException("Data e hora inválida, coloque outras ");
        }

    }
}