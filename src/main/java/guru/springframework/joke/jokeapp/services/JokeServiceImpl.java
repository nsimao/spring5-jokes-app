package guru.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@Service
public class JokeServiceImpl implements JokeService {
// ------------------------------ FIELDS ------------------------------

    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface JokeService ---------------------

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
