package com.example;

import java.util.Random;

public class Joker {

    public  String jokes[]=
            {
                    "Keyboard not connected, press F1 to continue.",
                    "Unix is user friendly. It’s just selective about who its friends are.",
                    "How can you make number seven to an even number?\n" +
                            "Just take the S out from it!",
                    "Why did the computer consult with the doctor?\n" +
                            "Because it was suffering from a virus!",
                    "What kind of a star can be risky?\n" +
                            "A shooting star!",
                    "My software never has bugs. It just develops random features."


            };
    public  String getJoke()
    {
        return jokes[new Random().nextInt(jokes.length)];
    }
}
