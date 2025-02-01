import Projeto.Pessoa;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa juliana = new Pessoa("Juliana", new Date(97, 06, 25));

        System.out.println(juliana);

    }
}