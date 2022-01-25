public class BMI {
    private double weight;
    private double height;
    private double BMI;

    public BMI(double weight, double height) {
        this.weight = weight * 0.45359237; //convert to kilograms
        this.height = height * 0.0254; //convert to meters
        this.BMI = this.weight / this.height / this.height; //calculate BMI
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        return BMI;
    }

    public String diagnoseBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
