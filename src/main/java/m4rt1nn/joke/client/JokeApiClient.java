package m4rt1nn.joke.client;

import m4rt1nn.joke.domain.JokeApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class JokeApiClient {

    @Autowired
    RestClient restClient;

    public JokeApiModel getJoke() {
        return restClient
                .get()
                .uri(builder -> builder
                        .scheme("https")
                        .host("v2.jokeapi.dev")
                        .pathSegment("joke", "Programming")
                        .queryParam("type", "twopart")
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(JokeApiModel.class);
    }
}
