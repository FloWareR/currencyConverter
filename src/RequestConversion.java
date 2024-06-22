import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestConversion {
    public Currency fetchData(String from, String to, float amount){
        URI URL = URI.create("https://v6.exchangerate-api.com/v6/26326636e6e810d6b62039f3/pair/"+from+"/"+to+"/"+amount);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URL)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new Currency(0,0);
    }

}
