import java.lang.reflect.Array;
import java.util.ArrayList;

class Paciente extends Pessoa{


   public Paciente(String nome, String cpf, String endereco, String numeroTelefone, String dataNascimento){
        super(nome, cpf, endereco, numeroTelefone, dataNascimento);
    }

    public boolean solicitarAgendamentoConsulta(){
        return true;
    }

    void visualizarReceitas(ArrayList<String> receitas){

       for(String receita : receitas){
           System.out.println("================== RECEITA MEDICA ==================");
           System.out.println(receita);
           System.out.println("====================================================");
       }
    }

    void visualizarExames(ArrayList<String> exames){
        for(String exame : exames){
            System.out.println("======================= EXAME =======================");
            System.out.println(exame);
            System.out.println("=====================================================");
        }
    }


}