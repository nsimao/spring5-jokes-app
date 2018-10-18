package guru.springframework.joke.jokeapp.controllers;

import guru.springframework.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@Controller
public class JokeController {
// ------------------------------ FIELDS ------------------------------

    @Value("${message:Hello default}")
    private String message;
    private JokeService jokeService;

// --------------------------- CONSTRUCTORS ---------------------------

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

// -------------------------- OTHER METHODS --------------------------

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        model.addAttribute("message", message);

        return "chucknorris";
    }
}
