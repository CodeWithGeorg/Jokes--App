package com.example.jokeapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;
import java.util.Map;

@RestController
public class JokeController {

    private final List<String> jokes = List.of(
        "If i could ask for something now it could be your kiss abd your warm hugs",
        "I told my computer I needed a break, and now it won’t stop sending me KitKat ads.",
        "Why don’t programmers like nature? It has too many bugs!",
        "How many programmers does it take to change a light bulb? None – that’s a hardware problem!",
        "A SQL query walks into a bar, walks up to two tables and asks: 'Can I join you?'",
        "There are only 10 kinds of people in the world: those who understand binary and those who don’t."
    );

    @GetMapping("/joke")
    public Map<String, String> getJoke() {
        Random random = new Random();
        String joke = jokes.get(random.nextInt(jokes.size()));
        return Map.of("joke", joke);
    }
}
