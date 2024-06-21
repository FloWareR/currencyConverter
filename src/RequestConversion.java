import java.net.URI;

public class RequestConversion {
    public Currency fetchData(String from, String to, float amount){
        URI URL = URI.create("https://v6.exchangerate-api.com/v6/26326636e6e810d6b62039f3/pair/"+from+"/"+to+"/"+amount);
        System.out.println(URL);
        return new Currency(1,1);
    }

}
