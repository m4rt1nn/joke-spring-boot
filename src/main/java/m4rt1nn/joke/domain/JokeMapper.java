package m4rt1nn.joke.domain;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JokeMapper {
    JokeModel convert(JokeApiModel jokeApiModel);

    default JokeModel mapJokeApiModelToJokeModel(JokeApiModel jokeApiModel) {
        return new JokeModel(jokeApiModel.setup(), jokeApiModel.punchline());
    }
}
