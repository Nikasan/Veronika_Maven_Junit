package Static_learner;

public class Cat {
    private String name;
    static void printer() {
        System.out.println("printer");

    }
    Cat(){
        System.out.println("in default constructor");
    }

    Cat(String name){
        System.out.println("in constructor with parameters");
        this.name = name;
    }
    static void printer(String s) {
        System.out.println("override printer method" + s);
    }
}
