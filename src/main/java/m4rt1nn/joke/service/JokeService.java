package m4rt1nn.joke.service;

import lombok.RequiredArgsConstructor;
import m4rt1nn.joke.client.JokeApiClient;
import m4rt1nn.joke.domain.JokeApiModel;
import m4rt1nn.joke.domain.JokeMapper;
import m4rt1nn.joke.domain.JokeModel;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JokeService {

    private final JokeApiClient jokeApiClient;
    private final JokeMapper mapper;

    public JokeModel getRandomJoke() {
        JokeApiModel joke = jokeApiClient.getJoke();

        return mapper.convert(joke);
    }
}
