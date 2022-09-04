package Interface.MultipleInheritance;

public class SBI implements Bank, BankRule{


    @Override
    public void CalculateInterest() {
        interest = (principal*rateOfInterest*time)/100;
        System.out.println(interest);
    }

    int principal =1000;
    int time = 5;
    double interest;

    @Override
    public void bankRule() {
        System.out.println("SBI must implement rules set by Reserve Bank of India");
    }

    public static void main(String[] args) {

        SBI sbi = new SBI();
        sbi.bankRule();
        sbi.CalculateInterest();
    }
}
