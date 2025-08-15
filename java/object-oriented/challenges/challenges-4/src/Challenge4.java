/* 4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados. */

interface ConversorTemperatura {
    double celsiusParaFahrenheit(double celsius);
    double fahrenheitParaCelsius(double fahrenheit);
}

class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8 ;
    }
}

public class Challenge4 {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();
        double farenheit = conversor.celsiusParaFahrenheit(25);
        double celsius = conversor.fahrenheitParaCelsius(77);

        System.out.println(celsius);
        System.out.println(farenheit);

    }
}
