package Initialization;

public class Cat extends Pet{
    private String name;
    static {
        System.out.println("Cat static block");
    }

    {
        System.out.println("Cat First block");
    }
    {
        System.out.println("Cat Second block");
    }

    Cat(){
        System.out.println("Cat Empty constructor");
    }

    Cat (String name){
        super(name);
        /*
вызов метода super() должен быть в первом операто­ре, выполняемом в конструкторе подкласса.
Если метод super() не вызывается, то используется конструктор
по умолчанию или же конструктор без параметровиз каждого суперкласса.
         */
        System.out.println("Cat constructor with name "+name);
        this.name=name;
    }
}
