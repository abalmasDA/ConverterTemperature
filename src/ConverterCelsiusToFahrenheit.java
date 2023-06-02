public class ConverterCelsiusToFahrenheit extends ConverterTemperature {
    private final double VALUE1_TO_CONVERT = 32.0;
    private final double VALUE2_TO_CONVERT = 1.8;

    @Override
    public double convert(double temperatureCelsiusValue) {
        return temperatureCelsiusValue * VALUE2_TO_CONVERT + VALUE1_TO_CONVERT;
    }
}
