package principal;

// import classes.Retangulo;
// import classes.Calculadora;
// import classes.Funcionario;
import classes.Data;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        //Declara e instancia um objeto chamado d1 da classe Data
        Data d1 = new Data();
        
        //Realiza a leitura do dia, mês e ano        
        System.out.println("Digite o dia:");
        d1.setDia(scanner.nextInt());
        System.out.println("Digite o mes:");
        d1.setMes(scanner.nextInt());
        System.out.println("Digite o ano:");
        d1.setAno(scanner.nextInt());
        
        //Escreve a data
        System.out.println("A data " + d1.getDia() + "/" + d1.getMes() + "/" + d1.getAno());
        //Verifica se o ano é bissexto
        if (d1.getBissexto()){
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }

        //******** Leitura do objeto 1
        //Declara e instancia um objeto chamado obj1 da classe Funcionário
        // Funcionario obj1 = new Funcionario();
        //******** Leitura do objeto 2
        //Realiza a leitura da matrícula e nome do funcionário para o objeto 2
        // System.out.println("Digite a matricula:");
        // int matricula = Integer.parseInt(scanner.nextLine());
        // System.out.println("Digite o nome:");
        // String nome = scanner.nextLine();
        //Declara e instancia um objeto chamado obj2 da classe Funcionário usando o construtor com parâmetros
        // Funcionario obj2 = new Funcionario(matricula, nome);
        //Saída de dados
        //Escreve os dados default do objeto 1
        // System.out.println("Matricula:" + obj1.getMatricula());
        // System.out.println("Nome:" + obj1.getNome());
        //Escreve os dados lidos objeto 2
        // System.out.println("Matricula:" + obj2.getMatricula());
        // System.out.println("Nome:" + obj2.getNome());

        // Declara e instância um objeto chamado hp da classe Calculadora
        // Calculadora hp = new Calculadora();
        // Realiza a leitura e seta os valores numero1 e numero2
        // System.out.println("Digite o numero1:");
        // hp.setNumero1(scanner.nextDouble());
        // System.out.println("Digite o numero2:");
        // hp.setNumero2(scanner.nextDouble());
        // Mostra os resultados das operações
        // System.out.println("Resultados:");
        // Adição
        // System.out.println(hp.getSoma());
        // Diferença
        // System.out.println(hp.getDiferenca());
        // Produto
        // System.out.println(hp.getProduto());
        // Divisão
        // System.out.println(hp.getQuociente());
        
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
