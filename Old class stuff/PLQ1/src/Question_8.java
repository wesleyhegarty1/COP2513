public class Question_8{

    public static void main(String[] args) {

        Something s = new Something();

    }

}



class Something extends SomethingElse {

    public Something() {    System.out.println("Merry Brandybuck");  }

}



class SomethingElse extends Nothing {

    public SomethingElse() {

        this("Frodo Baggins");

        System.out.println("Sam Gamgee");

    }

    public SomethingElse(String s) {    System.out.println(s);  }

}


class Nothing {

    public Nothing () {    System.out.println("Pippin Took");  }

}


