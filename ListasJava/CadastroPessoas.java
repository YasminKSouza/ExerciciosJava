import java.util.ArrayList;

public class CadastroPessoas {
    private ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();

    public void cadastrarPessoa(Pessoa p) {
        pessoas.add(p);
        System.out.println("Pessoa cadastrada com sucesso!");
    }
    public void listar() {
        for (Pessoa p: pessoas) {
            System.out.println("Nome: " + p.getNome() + "Idade: "+ p.getIdade());
        }
    }
}
