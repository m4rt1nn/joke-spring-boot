package m4rt1nn.joke.domain;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface JokeMapper {
    @Mapping(target = "punchline", source = "delivery")
    JokeModel convert(JokeApiModel jokeApiModel);
    default JokeModel mapJokeApiModelToJokeModel(JokeApiModel jokeApiModel) {
        // Manually map the fields
        return new JokeModel(jokeApiModel.setup(), jokeApiModel.delivery());
    }
}
