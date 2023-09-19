package prak1.num6;
 
 public class Main {
    public static void main(String args[]) {
        double denominator = 0;
        for (int i = 0; i < 10; i++) {
            denominator++;
            double harmonic = 1 / denominator;
            System.out.println(harmonic);
        }
    }
}