import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPessoas cp = new CadastroPessoas();

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Cadastrar Pessoa Física");
            System.out.println("2. Cadastrar Pessoa Jurídica");
            System.out.println("3. Listar Pessoas");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarPessoa(cp,new PessoaFisica(),scanner);
                    break;
                case 2:
                    cadastrarPessoa(cp, new PessoaJuridica(), scanner);
                    break;
                case 3:
                    cp.listar();
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }
    }
    private static void cadastrarPessoa (CadastroPessoas cp ,Pessoa pessoa,Scanner scanner){
        System.out.println("Digite o nome da pessoa: ");
        scanner.nextLine();
        pessoa.setNome(scanner.nextLine());

        if (pessoa instanceof PessoaFisica) {
            System.out.println("Digite a idade da pessoa: ");
            ((PessoaFisica) pessoa).setIdade(scanner.nextInt());
        }
        if (pessoa instanceof PessoaJuridica) {
            System.out.println("Digite o CNPJ: ");
            ((PessoaJuridica) pessoa).setCnpj(scanner.next());
        }
        cp.cadastrarPessoa(pessoa);
    }
}





