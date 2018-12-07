public class BMIanalyzer {

    private String bmiAnalyzeResult = "";
    private String[] bmiAnalyzeOptions = {"extreme malnuration", "malnuration", "minimal correct weight", "correct weight", "maximal correct weight", "overveight", "extreme overweight"};

    public BMIanalyzer() {
    }

    public BMIanalyzer(String[] bmiAnalyzeOptions){
        this.bmiAnalyzeOptions = bmiAnalyzeOptions;
    }

    public boolean checkIfMalnuration(Gender gender, double bmi) {

        if (gender.equals(Gender.FEMALE)) {
            if (bmi < 19 && bmi >=13) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[1];
                return true;
            } else if (bmi < 13) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[0];
                return true;
            }
        } else if (gender.equals(Gender.MALE)) {
            if (bmi < 21 && bmi >=15) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[1];
                return true;
            } else if (bmi < 15) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[0];
                return true;
            }
        }
        return false;
    }

    public boolean checkIfCorrectWeight(Gender gender, double bmi) {

        if (gender.equals(Gender.FEMALE)) {
            if (bmi == 19) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[2];
                return true;
            } else if (bmi > 19 && bmi < 23) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[3];
                return true;
            } else if (bmi == 23) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[4];
                return true;
            }
        } else if (gender.equals(Gender.MALE)) {
            if (bmi == 21) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[2];
                return true;
            } else if (bmi > 21 && bmi < 25) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[3];
                return true;
            } else if (bmi == 25) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[4];
                return true;
            }
        }
        return false;
    }

    public boolean checkIfOverweight(Gender gender, double bmi) {

        if (gender.equals(Gender.FEMALE)) {
            if (bmi > 23 && bmi <= 29) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[5];
                return true;
            } else if (bmi > 29) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[6];
                return true;
            }
        } else if (gender.equals(Gender.MALE)) {
            if (bmi > 25 && bmi <= 31) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[5];
                return true;
            } else if (bmi > 31) {
                this.bmiAnalyzeResult = bmiAnalyzeOptions[6];
                return true;
            }
        }
        return false;
    }

    public String getBmiAnalyzeResult() {
        return bmiAnalyzeResult;
    }

    public void setBmiAnalyzeResult(String bmiAnalyzeResult) {
        this.bmiAnalyzeResult = bmiAnalyzeResult;
    }
}
