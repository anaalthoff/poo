package principal;

import classes.Retangulo;

public class Principal {

    public static void main(String args[]) {
        //Declara e instancia um objeto chamado ret da classe Retangulo
        Retangulo ret = new Retangulo(5, 3);

        //Recupera a base do objeto ret
        System.out.println(ret.getBase());

        //Recupera a altura do objeto ret
        System.out.println(ret.getAltura());
    }
}
