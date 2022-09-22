public interface Calc {

    double average(double...num); // By default all methods in an interface are public and abstract

    default float add(float a, float b){ // We can also define default methods in an interface
        return a+b;
    }
}
