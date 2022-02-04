package com.garzeah;

public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        String[] array = { "Today is your lucky day", "You will win the lottery", "Hide" };
        int min = 0;
        int max = 2;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

        return array[random_int];
    }
}
