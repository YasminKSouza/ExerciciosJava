import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa p = new Pessoa();
        CadastroPessoas cp = new CadastroPessoas();

        System.out.println("Digite o nome da pessoa a ser cadastrada: ");
        p.setNome(scanner.next());

        System.out.println("Digite a idade da pessoa a ser cadastrada: ");
        p.setIdade(scanner.nextInt());

        cp.cadastrarPessoa(p);

    }
}
