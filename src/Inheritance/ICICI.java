package Inheritance;

public class ICICI extends Bank{
    @Override
    public double HomeLoanROI() {
        return 8.5;
    }

    @Override
    public double PersonalLoanROI() {
        return 16.7;
    }
}
