public class ConverterCelsiusToKelvin extends ConverterTemperature {
    private final double VALUE_TO_CONVERT = 273.15;

    @Override
    public double convert(double temperatureCelsiusValue) {
        return VALUE_TO_CONVERT + temperatureCelsiusValue;
    }
}

