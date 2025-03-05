package m4rt1nn.joke.domain;

public record JokeApiModel(
        String type,
        String setup,
        String punchline,
        int id
) {
}