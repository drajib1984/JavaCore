package Inheritance;

public class Run {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println(sbi.HomeLoanROI());
        System.out.println(sbi.PersonalLoanROI());

        ICICI icici = new ICICI();
        System.out.println(icici.HomeLoanROI());
        System.out.println(icici.PersonalLoanROI());
    }
}
