package m4rt1nn.joke.service;

import m4rt1nn.joke.client.JokeApiClient;
import m4rt1nn.joke.domain.JokeMapper;
import m4rt1nn.joke.domain.JokeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    @Autowired
    private JokeApiClient jokeApiClient;
    @Autowired
    private JokeMapper mapper;

    public JokeResponse getRandomJoke() {
        return mapper.convert(jokeApiClient.getJoke());
    }
}
