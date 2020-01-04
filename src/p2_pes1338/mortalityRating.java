package p2_pes1338;

public class mortalityRating {

    private int hospitalCode = -1;
    private String conditionCode = "";
    private double mortalityScore = 0.0;

    public mortalityRating() {

    }

    public mortalityRating(int hospitalCodeIn, String conditionCodeIn, double mortalityScoreIn) {
        hospitalCode = hospitalCodeIn;
        conditionCode = conditionCodeIn;
        mortalityScore = mortalityScoreIn;
    }

    public int getHospitalCode() {
        return hospitalCode;
    }

    public String getConditionCode() {
        return conditionCode;
    }

    public double getMortalityScore() {
        return mortalityScore;
    }
}
