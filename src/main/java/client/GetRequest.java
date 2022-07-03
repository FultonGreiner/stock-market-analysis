package client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;

@AllArgsConstructor
public class GetRequest {
    @Getter @Setter private String apiKey;
    @Getter @Setter private URL url;

    public static void getRequest() {

    }

}
