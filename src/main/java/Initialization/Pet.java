package Initialization;

public class Pet {
   private String name;
   static {
       System.out.println("Parent static block");
    }

    {
        System.out.println("Parent First block");
    }
    {
        System.out.println("Parent Second block");
    }

    Pet(){
        System.out.println(" Parent Empty constructor");
    }

    Pet (String name){

        System.out.println("Parent constructor with name "+name);
        this.name=name;
    }
}
