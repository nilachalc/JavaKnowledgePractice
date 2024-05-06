package com.example.prac;
public class WordTransformation {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java WordTransformation <word> <P> <Q>");
            return;
        }

        String word = args[0];
        int P = Integer.parseInt(args[1]);
        int Q = Integer.parseInt(args[2]);

        int turns = getNumberOfTurns(word, P, Q);
        System.out.println("Number of turns: " + turns);
    }

    public static int getNumberOfTurns(String word, int input1, int input2) {
        int length = word.length();
        if (input1 >= length || input2 >= length) {
            throw new IllegalArgumentException("P and Q must be less than the length of the word.");
        }

        int turns = 0;
        String currentWord = word;

        while (true) {
            String johnWord = currentWord.substring(length - input1) + currentWord.substring(0, length - input1);
            String michelWord = johnWord.substring(length - input2) + johnWord.substring(0, length - input2);

            turns++;

            if (michelWord.equals(word)) {
                break;
            }

            currentWord = michelWord;
        }

        return turns;
    }
}
