package m4rt1nn.joke.domain;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class JokeMapper {
    abstract public JokeResponse convert(JokeApiModel jokeApiModel);
}
