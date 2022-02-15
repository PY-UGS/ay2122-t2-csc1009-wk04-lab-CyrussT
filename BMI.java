public class BMI {
    private double weight;
    private double height;
    private double BMI;
    private static final double POUND_TO_KG = 0.45359237;
    private static final double CM_TO_METERS = 0.0254;


    public BMI(double weight, double height) {
        this.weight = weight * POUND_TO_KG; //convert to kilograms
        this.height = height * CM_TO_METERS; //convert to meters
        this.updateBMI(); //calculate BMI
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.updateBMI();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.updateBMI();
    }

    public double getBMI() {
        return BMI;
    }

    private void updateBMI()
    {
        this.BMI = this.weight / this.height / this.height;
    }

    public String diagnoseBMI() {
        if (this.BMI < 18.5) {
            return "Underweight";
        } else if (this.BMI < 25) {
            return "Normal";
        } else if (this.BMI < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
