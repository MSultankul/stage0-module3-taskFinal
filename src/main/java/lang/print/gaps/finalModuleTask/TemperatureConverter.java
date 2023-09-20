package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        double temperatureFahrenheit = (9.0 / 5.0) * temperatureCelsius + 32;
        System.out.println(temperatureFahrenheit);
    }
}