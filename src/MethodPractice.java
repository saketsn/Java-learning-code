public class MethodPractice {
    public static void main(String[] args) {
        convertToCentimeter(100);

        convertToCentimeter(5,5);

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
