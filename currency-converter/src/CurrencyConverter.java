import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    private String fromValueLocal;
    private String toValueLocal;

    public Budget money(String fromValueLocal, String toValueLocal, double initialValue) {
        this.fromValueLocal = fromValueLocal;
        this.toValueLocal = toValueLocal;

//        String fromValueLocal = "BRL";
//        String toValueLocal = "USD";
//        double initialValue = 100;

        URI address = URI.create("https://v6.exchangerate-api.com/v6/0822a454030b5fbbd09f942d/latest/" + fromValueLocal);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
//        System.out.println(json);

        Budget budget = new Gson().fromJson(json, Budget.class);
//        System.out.println(budget);
        double conversionRate = budget.conversion_rates().get(toValueLocal);
        System.out.println("Valor inicial: " + initialValue + " " + fromValueLocal);
        System.out.println("Taxa de conversão: " + conversionRate);
        System.out.println("Valor convertido: " + initialValue * conversionRate + " " + toValueLocal);

        return budget;
    }
}
