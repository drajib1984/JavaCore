package Inheritance;

public class SBI extends Bank{
    @Override
    public double HomeLoanROI() {
        return 7.5;
    }

    @Override
    public double PersonalLoanROI() {
        return 12.5;
    }
}
