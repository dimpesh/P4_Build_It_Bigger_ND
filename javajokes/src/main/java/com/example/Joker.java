package com.example;

import java.util.Random;

public class Joker {

    public  String jokes[]=
            {
                    "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all",
                    "Mother to Johnny: how was your exam, is all questions difficult?\n" +
                    "Johnny: No mom, all the questions were simple, It was the answers which gave me all the trouble!",
                    "How can you make number seven to an even number?\n" +
                            "Just take the S out from it!",
                    "Why did the computer consult with the doctor?\n" +
                            "Because it was suffering from a virus!",
                    "What kind of a star can be risky?\n" +
                            "A shooting star!",
                    "Teacher: Shamu, go to the map and find North America.\n" +
                            "Shamu: Here it is!\n" +
                            "Teacher: Correct. Now, Ramu, who discovered America?\n" +
                            "Ramu: Shamu!",
                    "Teacher: Ramu, your composition on \"My Dog\" is exactly the same as your brother's. Did u copy his?\n" +
                            "Ramu: No, teacher, it's the same dog!"



            };
    public  String getJoke()
    {
        return jokes[new Random().nextInt(jokes.length)];
    }
}
