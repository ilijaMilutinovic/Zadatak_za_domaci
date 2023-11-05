package rs.ac.ni.pmf.oop2;

public class ParseandStore {

    public static void main(String[] args) {

        TextParser text = new TextParser();
        text.setEncoder(new UpperCaseEncoder());
        text.setStorage(new DBStorage());

        text.parse("    Ilija    ");
    }



}


