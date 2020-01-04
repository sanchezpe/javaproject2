package p2_pes1338;

public class P2_pes1338 {

    public static void main(String[] args) {

        mortalityRatingList hospitalsData = new mortalityRatingList("hospitalMortality.txt");

        java.util.Scanner input = new java.util.Scanner(System.in);

        String choiceCode = "";
        String choiceDescription = "";
        int sentinelValue = -1;

        do {
            System.out.print("\n1 – Acute Myocardial Infarction\n"
                    + "2 – Chronic Obstructive Pulmonary Disease\n"
                    + "3 – Heart Failure\n"
                    + "4 – Pneumonia\n"
                    + "5 – Stroke\n"
                    + "0 – Exit Program\n"
                    + "Enter choice: ");
            switch (input.nextInt()) {
                case 1:
                    choiceCode = "MORT_30_AMI";
                    choiceDescription = "Acute Myocardial Infarction ";
                    break;
                case 2:
                    choiceCode = "MORT_30_COPD";
                    choiceDescription = "Death rate for chronic obstructive pulmonary disease ";
                    break;
                case 3:
                    choiceCode = "MORT_30_HF";
                    choiceDescription = "Heart failure ";
                    break;
                case 4:
                    choiceCode = "MORT_30_PN";
                    choiceDescription = "Pneumonia ";
                    break;
                case 5:
                    choiceCode = "MORT_30_STK";
                    choiceDescription = "Death rate for stroke patients ";
                    break;
                default:
                    return;
            }

            System.out.print("\n1 - number of mortality scores\n"
                    + "2 – maximum mortality score\n"
                    + "3 – minimum mortality score\n"
                    + "4 – hospitals with the maximum mortality score\n"
                    + "5 – hospitals with the minimum mortality score\n"
                    + "6 – average mortality score\n"
                    + "7 – high risk hospitals\n"
                    + "8 – low risk hospitals\n"
                    + "Enter choice: ");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("\n" + hospitalsData.validNumberOfMortalityScores(choiceCode)
                            + " valid scores for " + choiceDescription);
                    break;
                case 2:
                    System.out.println("\nMaximum value for " + choiceDescription
                            + hospitalsData.maxMortalityScore(choiceCode));
                    break;
                case 3:
                    System.out.println("\nMinimum value for " + choiceDescription
                            + hospitalsData.minMortalityScore(choiceCode));
                    break;
                case 4:
                    System.out.println("\nHospital Codes for " + choiceDescription + "maximum value:\n"
                            + hospitalsData.hospitalCodeForMax(choiceCode));
                    break;
                case 5:
                    System.out.println("\nHospital Codes for " + choiceDescription + "minimum value:\n"
                            + hospitalsData.hospitalCodeForMin(choiceCode));
                    break;
                case 6:
                    System.out.println("\nAverage score for " + choiceDescription
                            + hospitalsData.avgMortalityScore(choiceCode));
                    break;
                case 7:
                    System.out.println("\nHigh Risk Hospitals for " + choiceDescription + ":\n"
                            + hospitalsData.highRiskHospitals(choiceCode));
                    break;
                case 8:
                    System.out.println("\nLow Risk Hospitals for " + choiceDescription + ":\n"
                            + hospitalsData.lowRiskHospitals(choiceCode));
                    break;
                default:
                    sentinelValue = 0;
            }
        } while (sentinelValue != 0);
    }
}
