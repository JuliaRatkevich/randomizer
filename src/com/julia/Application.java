package com.julia;

public class Application {

    public static void main(String[] args) {
        MinMaxRule minMaxRule = new MinMaxRule(99, 100);
        Randomizer randomizer = new Randomizer(minMaxRule);

        System.out.println(randomizer.next());
    }
}
