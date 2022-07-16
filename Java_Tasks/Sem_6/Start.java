package Sem_6;

public class Start {

    public static void main(String[] args) {

        Restore_equality start = new Restore_equality();

        String expression = "2? + ?5 = ?9".replace(" ", "");

        start.combination(expression);


    }

}