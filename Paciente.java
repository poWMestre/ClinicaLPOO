import java.lang.reflect.Array;
import java.util.ArrayList;

class Paciente extends Pessoa{


   public Paciente(String nome, String cpf){
        this(nome, cpf, null, null, null);
    }

    public Paciente(String nome, String cpf, String endereco){
        this(nome, cpf, endereco, null, null);
    }

    public Paciente(String nome, String cpf, String endereco, String numeroTelefone){
        this(nome, cpf, endereco, numeroTelefone, null);
    }

    public Paciente(String nome, String cpf, String endereco, String numeroTelefone, String dataNascimento){
        super(nome, cpf, endereco, numeroTelefone, dataNascimento);
    }



    


}