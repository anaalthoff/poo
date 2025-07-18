package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o que deseja testar:");
        System.out.println("1 - Calculadora");
        System.out.println("2 - Data");
        System.out.println("3 - Funcionário");
        System.out.println("4 - Rádio");
        System.out.println("5 - Retângulo");
        System.out.println("6 - Triângulo");
        System.out.println("7 - Veículo");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                PrincipalCalculadora.main(args);
                break;
            case 2:
                PrincipalData.main(args);
                break;
            case 3:
                PrincipalFuncionario.main(args);
                break;
            case 4:
                PrincipalRadio.main(args);
                break;
            case 5:
                PrincipalRetangulo.main(args);
                break;
            case 6:
                PrincipalTriangulo.main(args);
                break;
            case 7:
                PrincipalVeiculo.main(args);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
