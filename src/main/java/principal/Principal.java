package principal;

import classes.Retangulo;

public class Principal {

    public static void main(String args[]) {
        //Declara e instancia um objeto chamado ret da classe Retangulo;;
        Retangulo ret = new Retangulo(4, 2);
        //Recupera a base do objeto ret
        // System.out.println(ret.getBase());
        //Recupera a altura do objeto ret
        // System.out.println(ret.getAltura());

        //Declara e instância um objeto chamado ret da classe Retangulo
        // Retangulo ret = new Retangulo();
        //Modifica o atributo base do objeto ret
        // ret.setBase(2);

        //Modifica o atributo altura do objeto ret
        // ret.setAltura(3);

        //Recupera a base do objeto ret
        System.out.println(ret.getBase());

        //Recupera a altura do objeto ret
        System.out.println(ret.getAltura());

        //Recupera a área a objeto ret
        System.out.println(ret.getArea());
    }
}
