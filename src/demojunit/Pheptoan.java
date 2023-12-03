
package demojunit;


public class Pheptoan {

    public int Nhan(int a, int b){
        int kq = a*b;
        return kq;
    }
    
    public static void main(String[] args) {
        Pheptoan pheptoanCalculator = new Pheptoan();
        int result = pheptoanCalculator.Nhan(5, 7);
        System.out.println("Result of multiplication: " + result);
    }
}
