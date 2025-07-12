package principal;

// import classes.Retangulo;
import classes.Calculadora;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Declara e instância um objeto chamado hp da classe Calculadora
        Calculadora hp = new Calculadora();

        //Realiza a leitura e seta os valores numero1 e numero2
        System.out.println("Digite o numero1:");
        hp.setNumero1(scanner.nextDouble());

        System.out.println("Digite o numero2:");
        hp.setNumero2(scanner.nextDouble());

        //Mostra os resultados das operações
        System.out.println("Resultados:");

        //Adição
        System.out.println(hp.getSoma());

        //Diferença
        System.out.println(hp.getDiferenca());

        //Produto
        System.out.println(hp.getProduto());

        //Divisão
        System.out.println(hp.getQuociente());

        // Declara e instancia um objeto chamado ret da classe Retangulo;;
        // Retangulo ret = new Retangulo(4, 2);
        // Recupera a base do objeto ret
        // System.out.println(ret.getBase());
        // Recupera a altura do objeto ret
        // System.out.println(ret.getAltura());
        // Recupera a área a objeto ret
        // System.out.println(ret.getArea());
        
        // Declara e instancia um objeto chamado ret da classe Retangulo
        // Retangulo ret = new Retangulo();
        // Modifica o atributo base do objeto ret
        // ret.setBase(2);
        // Modifica o atributo altura do objeto ret
        // ret.setAltura(3);
    }
}
