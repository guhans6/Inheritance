// Inheritance 
public class Calculator {
    
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    // Ovewrriding add
    public int add(int...numbers){
        int sum = 0;
        for(int i: numbers){
            sum += i;
        }
        return sum;
    }

}