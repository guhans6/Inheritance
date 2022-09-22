public class MoreAdvCalc extends AdvCalculator implements Calc { 
    // We can achieve multiple inheritance by using interfaces

    public double sqrt(double a){
        return Math.sqrt(a);
    }
    public double pow(double a, double b){
        return Math.pow(a, b);
    }
    @Override
    public double average(double... num) {
        double sum = 0;
        for(double i : num){
            sum += i;
        }
        return sum/num.length;
    }
    
}
