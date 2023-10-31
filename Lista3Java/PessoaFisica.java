public class PessoaFisica extends Pessoa {
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Tipo: Pessoa Física";
    }
}
