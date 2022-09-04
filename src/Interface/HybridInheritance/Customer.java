package Interface.HybridInheritance;

public class Customer extends Bank implements SBI,HDFC{

    double principal=1000;
    double time=6;
    double interest;
    @Override
    public double calculateInterestHDFC() {
        interest = (principal*HDFC.rateOfInterest*time)/100;
        return interest;
    }

    @Override
    public double calculateInterestSBI() {
        interest = (principal*SBI.rateOfInterest*time)/100;
        return interest;
    }

    @Override
    public void bankRule() {
        super.bankRule();
    }

    public static void main(String[] args) {

        Customer customer = new Customer();
        System.out.println(customer.calculateInterestSBI());
        System.out.println(customer.calculateInterestHDFC());
        customer.bankRule();
    }
}
