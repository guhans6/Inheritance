public class App {
    public static void main(String[] args) throws Exception {

        MoreAdvCalc obj = new MoreAdvCalc();

        System.out.println("Square Root "+obj.sqrt(9));

        System.out.println("Add "+obj.add(1, 2)); 

        System.out.println(obj.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println(obj.multiply(1.5, 2.5));

        System.out.println(obj.average(65, 99.5, 78, 89, 90));
    }
  
}
