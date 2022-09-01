package Lambda;

public class LambdaExercise {
    public static void main(String[] args) {
        // Functional Interfaces Runnable Callable comparable
        // The interface contains only on method is called as a functional interface
        System.out.println("My System Starts");
        // Normal implementation
        MyInterface myInterface = new MyInterfaceImplementation();
        myInterface.sayHello();

        // anonymous class
        MyInterface myInterface1  = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("My interface class ");

            }
        };
        myInterface1.sayHello();

        // Using lambda expression
        MyInterface myInterface2 = ()->{
            System.out.println("I am Groot ");
        };
        myInterface2.sayHello();

        // Using lambda function with two args
        DoMultiplication doMultiplication = (a,b)->{return a*b;};
        System.out.println(doMultiplication.multiplication(5,100));


        




    }
}
