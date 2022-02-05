package garzeah;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    // Create an array of strings
    private String[] data = {
        "Be careful",
        "Lol",
        "haha"
    };

    // Create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        // Pick a random string from the array
        int index = random.nextInt(data.length);
        String fortune = data[index];

        return fortune;
    }
}
