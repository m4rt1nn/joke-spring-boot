package m4rt1nn.joke.client;

import m4rt1nn.joke.domain.JokeApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Optional;

@Component
public class JokeApiClient {

    @Autowired
    RestClient restClient;

    public JokeApiModel getJoke() {
        return Optional.ofNullable(restClient
                        .get()
                        .uri(builder -> builder
                                .scheme("https")
                                .host("official-joke-api.appspot.com")
                                .pathSegment("jokes", "programming", "random")
                                .build())
                        .accept(MediaType.APPLICATION_JSON)
                        .retrieve()
                        .body(new ParameterizedTypeReference<List<JokeApiModel>>() {
                        }))
                .map(List::getFirst)
                .orElse(new JokeApiModel("", "No joke found!", "Sorry :-(", 0));
    }
}
