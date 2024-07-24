public class MethodPractice {
    public static void main(String[] args) {
      System.out.println("5ft, 8in = " + convertToCentimeter(5,8) + " cm" );
      System.out.println("68in = " + convertToCentimeter(68) + " cm");

    }

    public static double convertToCentimeter(int heightInInches){
        double result = heightInInches* 2.54;
        System.out.println("The converted value of height in cm =" + result);
        return result;
    }

    public static double convertToCentimeter(int feet, int inches){
        int totalInches= (feet*12) + inches;
        convertToCentimeter(totalInches);
        return 0;
    }
}
