package m4rt1nn.joke.domain;

//[{"type":"programming","setup":"Why did the developer quit his job?","punchline":"Because he didn't get arrays.","id":408}]

public record JokeApiModel(
        String type,
        String setup,
        String punchline,
        int id
) {
}