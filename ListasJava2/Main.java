import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add( new PessoaFisica("Yasmin", 25));
        pessoas.add(new PessoaJuridica("UNIESP","98115454785" ));

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa);
        }

    }
}
