package m4rt1nn.joke.controller;

import m4rt1nn.joke.service.JokeService;
import m4rt1nn.joke.domain.JokeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JokeController {

    @Autowired
    JokeService jokeService;

    @GetMapping("/jokes/random")
    public ResponseEntity<JokeResponse> getRandomJoke() {
        return ResponseEntity.ok(jokeService.getRandomJoke());
    }
}
