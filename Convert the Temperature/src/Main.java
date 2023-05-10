public class Main {

    public static void main(String[] args) {
        double[] doubles = convertTemperature(36.5);
        System.out.println(doubles[0]+" "+doubles[1]);
    }

    public static double[] convertTemperature(double celsius) {
        double convertTemperature[] = new double[2];
        convertTemperature[0] = 36.5 + 273.15;
        convertTemperature[1] = celsius * 1.8 + 32;
        return convertTemperature;
    }

}
