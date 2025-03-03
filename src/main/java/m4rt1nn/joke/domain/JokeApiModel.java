package m4rt1nn.joke.domain;

public record JokeApiModel(
        boolean error,
        String category,
        String type,
        String setup,
        String delivery,
        Flags flags,
        int id,
        boolean safe,
        String lang
) {
    public record Flags(
            boolean nsfw,
            boolean religious,
            boolean racist,
            boolean sexist,
            boolean political,
            boolean explicit
    ) {
    }
}