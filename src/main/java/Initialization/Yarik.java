package Initialization;

public class Yarik extends Cat {
    private String name;

    static {
        System.out.println("Yarik statik block");
    }
    {
        System.out.println("Yarik first block");
    }
    {
        System.out.println("Yarik second block");
    }

    Yarik(){
        System.out.println("In Yarik default constructor");
    }
    Yarik(String name){
        //super(name);
        System.out.println("In Yarik constructor with name "+name);
        this.name=name;
    }
}
