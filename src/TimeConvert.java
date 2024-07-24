public class TimeConvert {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }
    public static String getDurationString(int second){

        int minutes = second / 60;
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = second % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
    }

    public static String getDurationString(int minutes,int second){

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = second % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";

    }

}
