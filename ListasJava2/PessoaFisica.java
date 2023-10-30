public class PessoaFisica extends Pessoa {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public PessoaFisica(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Tipo: Pessoa Física";
    }
}
