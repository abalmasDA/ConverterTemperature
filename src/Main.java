public class Main {
    public static void main(String[] args) {

        ConverterTemperature converterTemperature1 = new ConverterCelsiusToKelvin();
        System.out.println(converterTemperature1.convert(10));

        ConverterTemperature converterTemperature2 = new ConverterCelsiusToFahrenheit();
        System.out.println(converterTemperature2.convert(12));


    }

}
