public class Operator{
    public static void main(String  args[]){
        int a = 10;
        //Unary Operators
        System.out.println(a++); 
        System.out.println(++a); 
        System.out.println(a--);
        System.out.println(--a);
        
        int b = 20;
        int c = 25;
        System.out.println(b++ + ++b);
        System.out.println(c++ + c++);

        int d=10;
        int e=-10;
        boolean f = true;
        boolean g = false;
        System.out.println(~d);
        System.out.println(~e);
        System.out.println(!f);
        System.out.println(!g);


    }
}

// https://www.javatpoint.com/operators-in-java