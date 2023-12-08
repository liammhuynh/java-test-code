package taxreturn;

import org.junit.Test;

public class TaxReturnTest {

    private static final double SINGLE_CUTOFF1 = 21450;
    private static final double SINGLE_CUTOFF2 = 51900;
    private static final double MARRIED_CUTOFF1 = 35800;
    private static final double MARRIED_CUTOFF2 = 86500;

    @Test
    public void testCase1() {
        TaxReturn taxReturnCase1 = new TaxReturn(SINGLE_CUTOFF1, TaxReturn.SINGLE);
        System.out.println("Test Case 1 - Tax for SINGLE status with income at SINGLE_CUTOFF1: " + taxReturnCase1.getTax());
    }

    @Test
    public void testCase2() {
        double incomeCase2 = SINGLE_CUTOFF1 + 1000; // example income greater than SINGLE_CUTOFF1
        TaxReturn taxReturnCase2 = new TaxReturn(incomeCase2, TaxReturn.SINGLE);
        System.out.println("Test Case 2 - Tax for SINGLE status with income greater than SINGLE_CUTOFF1: " + taxReturnCase2.getTax());
    }

    @Test
    public void testCase3() {
        double incomeCase3 = SINGLE_CUTOFF2 + 1000;
        TaxReturn taxReturnCase3 = new TaxReturn(incomeCase3, TaxReturn.SINGLE);
        System.out.println("Test Case 3 - Tax for SINGLE status with income greater than SINGLE_CUTOFF2: " + taxReturnCase3.getTax());
    }

    @Test
    public void testCase4() {
        TaxReturn taxReturnCase4 = new TaxReturn(MARRIED_CUTOFF1, TaxReturn.MARRIED);
        System.out.println("Test Case 4 - Tax for MARRIED status with income at MARRIED_CUTOFF1: " + taxReturnCase4.getTax());
    }

    @Test
    public void testCase5() {
        double incomeCase5 = MARRIED_CUTOFF1 + 1000; // example income greater than MARRIED_CUTOFF1
        TaxReturn taxReturnCase5 = new TaxReturn(incomeCase5, TaxReturn.MARRIED);
        System.out.println("Test Case 5 - Tax for MARRIED status with income greater than MARRIED_CUTOFF1: " + taxReturnCase5.getTax());
    }

    @Test
    public void testCase6() {
        double incomeCase6 = MARRIED_CUTOFF2 + 1000;
        TaxReturn taxReturnCase6 = new TaxReturn(incomeCase6, TaxReturn.MARRIED);
        System.out.println("Test Case 6 - Tax for MARRIED status with income greater than MARRIED_CUTOFF2: " + taxReturnCase6.getTax());
    }
}
