@FunctionalInterface
interface A {
    void show();
}

public class Lambdaex {
    public static void main(String[] args) {
        
        //using Anonymous class
        /*
        A obj  = new A() {
            @Override
            public void show()
            {
                System.out.println("i am in annonymous class");
            }
        };
        */

        //using lambda expression
        A obj = () -> System.out.println("i am in lambda expression");
        obj.show();
    }
}