package day09_switch_review;

public class task2 {
    public static void main(String[] args) {


        double mass = 50, height = 1.7;

        if ((mass >=40 && mass <=185) && (height >=1.2 && height<=2.5)) {
            // valid value

            double bmi = mass / (height * height);
            String report = "Mass: " + mass + " kg | Height: " + height +
                    "m\nBMI: " + bmi + " - ";

            if (bmi < 18.5) {
                report += "Underweight";  // + stands for concatenation
            } else if (bmi<=18.5 && bmi<=24.5) {
                report+="Normal weight";
            } else if (bmi>= 25 && bmi <= 29.9){
                report+= "Overweight";
            }else {
                report+="Obese";
            }
            System.out.println(report);

        }else {
            // invalid value

            System.out.println("Sorry we cannot calculate the MBI" +
                    " with these metrics");

        }
    }
}
