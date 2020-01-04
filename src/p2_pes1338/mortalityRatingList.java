package p2_pes1338;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class mortalityRatingList {

    private ArrayList<mortalityRating> mortalityRatingArray;

    public mortalityRatingList(String fileNameIn) {
        this.mortalityRatingArray = new ArrayList<>();

        Scanner readFromFile;

        try {
            readFromFile = new Scanner(new File(fileNameIn));
            while (readFromFile.hasNext()) {

                int hospitalCode = Integer.parseInt(readFromFile.next());
                String conditionCode = readFromFile.next();
                double mortalityScore = Double.parseDouble(readFromFile.next());

                mortalityRatingArray.add(new mortalityRating(hospitalCode, conditionCode, mortalityScore));
            }
            readFromFile.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int validNumberOfMortalityScores(String conditionCodeIn) {
        int sum = 0;

        for (mortalityRating o : mortalityRatingArray) {
            if (o.getConditionCode().compareTo(conditionCodeIn) == 0
                    && o.getMortalityScore() != -1) {
                sum += 1;
            }
        }
        return sum;
    }

    public double maxMortalityScore(String conditionCodeIn) {
        double max = -1;

        for (mortalityRating o : mortalityRatingArray) {
            if (o.getConditionCode().compareTo(conditionCodeIn) == 0
                    && o.getMortalityScore() > max) {
                max = o.getMortalityScore();
            }
        }
        return max;
    }

    public double minMortalityScore(String conditionCodeIn) {
        double min = mortalityRatingArray.get(0).getMortalityScore();

        for (mortalityRating o : mortalityRatingArray) {
            if (o.getConditionCode().compareTo(conditionCodeIn) == 0
                    && o.getMortalityScore() < min
                    && o.getMortalityScore() != -1) {
                min = o.getMortalityScore();
            }
        }
        return min;
    }

    public String hospitalCodeForMax(String conditionCodeIn) {
        String codes = "";

        for (mortalityRating o : mortalityRatingArray) {
            if (o.getConditionCode().compareTo(conditionCodeIn) == 0
                    && o.getMortalityScore() == this.maxMortalityScore(conditionCodeIn)) {
                codes += o.getHospitalCode() + " ";
            }
        }
        return codes;
    }

    public String hospitalCodeForMin(String conditionCodeIn) {
        String codes = "";

        for (mortalityRating o : mortalityRatingArray) {
            if (o.getConditionCode().compareTo(conditionCodeIn) == 0
                    && o.getMortalityScore() == this.minMortalityScore(conditionCodeIn)) {
                codes += o.getHospitalCode() + " ";
            }
        }
        return codes;
    }

    public double avgMortalityScore(String conditionCodeIn) {
        double sum = 0;

        for (mortalityRating o : mortalityRatingArray) {
            if (o.getConditionCode().compareTo(conditionCodeIn) == 0
                    && o.getMortalityScore() != -1) {
                sum += o.getMortalityScore();
            }
        }
        return sum / this.validNumberOfMortalityScores(conditionCodeIn);
    }

    public String highRiskHospitals(String conditionCodeIn) {
        String codes = "";
        int codeLength = 0;

        for (mortalityRating o : mortalityRatingArray) {
            if (o.getConditionCode().compareTo(conditionCodeIn) == 0
                    && o.getMortalityScore() >= (this.maxMortalityScore(conditionCodeIn) - 25 * this.maxMortalityScore(conditionCodeIn) / 100)) {

                codeLength += Integer.toString(o.getHospitalCode()).length() + 1;

                if (codeLength >= 85) {
                    codes += "\n" + o.getHospitalCode() + " ";
                    codeLength = 0;
                } else {
                    codes += o.getHospitalCode() + " ";
                }
            }
        }
        return codes;
    }

    public String lowRiskHospitals(String conditionCodeIn) {
        String codes = "";
        int codeLength = 0;

        for (mortalityRating o : mortalityRatingArray) {
            if (o.getConditionCode().compareTo(conditionCodeIn) == 0
                    && o.getMortalityScore() != -1
                    && o.getMortalityScore() >= (this.minMortalityScore(conditionCodeIn) - 25 * this.minMortalityScore(conditionCodeIn) / 100)
                    && o.getMortalityScore() <= this.minMortalityScore(conditionCodeIn)) {

                codeLength += Integer.toString(o.getHospitalCode()).length() + 1;

                if (codeLength >= 85) {
                    codes += "\n" + o.getHospitalCode() + " ";
                    codeLength = 0;
                } else {
                    codes += o.getHospitalCode() + " ";
                }
            }
        }
        return codes;
    }
}
