package com.johnmcgrath;

/**
 * Created by john on 4/12/17.
 */



import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomText {

    private static String[] texts = {
            "I'll be back",
            "Get out!",
            "I want your clothes, boots, and motorcycle."
    };

    public static String getTexts() {
        Random random = new Random();

        return texts[random.nextInt(texts.length)];
    }


}
