package Wrapper;

class Outer_Class {

    public static void main(String[] args) {
        Outer_Class.NestedClass nestedStatic = new Outer_Class.NestedClass();
        System.out.println(nestedStatic.NestedMethod());
        /*
        Статические вложенные классы, не имеют доступа к нестатическим полям и методам обрамляющего класса,
что в некотором роде аналогично статическим методам, объявленным внутри класса. Доступ к
нестатическим полям и методам может осуществляться только через ссылку на экземпляр обрамляющего
класса. В этом плане static nested классы очень похожи на любые другие классы верхнего уровня.
         */
        System.out.println(NestedClass.sumMethod(5,6));
        Outer_Class outer = new Outer_Class();
        Outer_Class.InnerClass inner = outer.new InnerClass();
       // Outer_Class.InnerClass ineer2 = outer.new InnerClass();
        System.out.println(inner.ineerMethod());

    }

    static class NestedClass {
        public String NestedMethod() {
            return "I am Nested";
        }
        public static int sumMethod(int a, int b){
            return a + b;
        }
        public static int sumMethod(int a, int b, int c){
            return a+b+c;
        }
    }

    static class NestedChildrenClass extends NestedClass{
        public static int sumMethod(int a,int b){
            return a-b;
        }
    }

    class InnerClass {
        public String ineerMethod() {
            return "I am Inner";
        }

    }
}
