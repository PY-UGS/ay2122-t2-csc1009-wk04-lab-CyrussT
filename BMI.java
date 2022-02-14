public class BMI {
    private double weight;
    private double height;
    private double BMI;

    public BMI(double weight, double height) {
        this.weight = weight * 0.45359237; //convert to kilograms
        this.height = height * 0.0254; //convert to meters
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
