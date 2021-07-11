public class Calculator{
    int num = 100;
     public void calc(int num){
         this.num = num*10;
     }
     public void printnum(){
         System.out.println(num);
     }
     public static void main(String []args){
        Calculator obj = new Calculator();
        obj.calc(2);
        obj.printnum();
     }
}
/*
$javac Calculator.java
$java -Xmx128M -Xms16M Calculator
20
*/
///

class A{
    public void Print(){
        System.out.println("A");
    }
}

class B extends A {
    public void Print(){
        System.out.println("B");
    }
}

public class Main{
    public static void myPrint(A o){
        o.Print();
    }
    public static void main(String[] args) {
        A x = new A();
        B y = new B();
        B z = new B();
        myPrint(x);
        myPrint(y);
        myPrint(z);
    }
}

//output : 
/* 
$javac Main.java
$java -Xmx128M -Xms16M Main
A
B
*/

public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        divide(4,0);
        
     }
    public static int divide(int a, int b){
    int c = -1;
    try{
        c = a/b;
    }
    catch (Exception e){
        System.err.print("Exception");
    }
    finally{
        System.err.print("Finally");
    }
    return c;
}
}


/*
$javac HelloWorld.java
$java -Xmx128M -Xms16M HelloWorld
ExceptionFinally
*/

