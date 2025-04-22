import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Morador> listaMoradores = new ArrayList<>();

        while (true) {
            Morador morador = new Morador();

            System.out.println("\nCadastro de novo morador:");
            System.out.print("Nome: ");
            morador.setNome(sc.nextLine());

            System.out.print("CPF: ");
            morador.setCpf(sc.nextLine());

            System.out.print("Celular: ");
            morador.setCelular(sc.nextLine());

            System.out.print("Data de Nascimento: ");
            morador.setDataNascimento(sc.nextLine());

            System.out.print("Sexo: ");
            morador.setSexo(sc.nextLine());

            System.out.print("Bloco: ");
            morador.setBloco(sc.nextLine());

            System.out.print("Apartamento: ");
            morador.setApartamento(sc.nextLine());

            System.out.print("Código de Acesso: ");
            morador.setCodigoAcesso(sc.nextLine());

            listaMoradores.add(morador);

            System.out.print("Deseja cadastrar outro morador? (s/n): ");
            String resposta = sc.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\n=== Lista de Moradores Cadastrados ===");
        System.out.println(listaMoradores);

        sc.close();
    }
}
