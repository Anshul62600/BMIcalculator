import java.util.Scanner;

public class Bmi {


        public static String bmi(float h,float w){
            float bmiVal;
            bmiVal=w/((h/100.0f)*(h/100.0f));
            if(bmiVal<18.5)
                return "Underweight";
            else if(bmiVal>=18.5&&bmiVal<=24.9)
                return "Normal weight";
            else if(bmiVal>=25&&bmiVal<=29.9)
                return "Pre Obesity";
            else if(bmiVal>=30&&bmiVal<=34.9)
                return "Obesity Class 1";
            else if(bmiVal>=35&&bmiVal<=39.9)
                return "Obesity Class 2";
            else
                return "Obesity Class 3";
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the height in cm");
            float height=sc.nextFloat();
            System.out.println("Enter the weight in kg");
            float weight=sc.nextFloat();
            System.out.println(bmi(height,weight));
        }
    }


