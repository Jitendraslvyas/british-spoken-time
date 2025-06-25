package com.example.britishtime;

public class SpokenTimeFormatter {
    private static final String[] NUMBERS = {
        "zero", "one", "two", "three", "four", "five", "six",
        "seven", "eight", "nine", "ten", "eleven", "twelve",
        "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
        "eighteen", "nineteen", "twenty", "twenty one", "twenty two",
        "twenty three", "twenty four", "twenty five", "twenty six",
        "twenty seven", "twenty eight", "twenty nine", "thirty",
        "thirty one", "thirty two", "thirty three", "thirty four",
        "thirty five"
    };

    public static String numberToWords(int n) {
        return n < NUMBERS.length ? NUMBERS[n] : Integer.toString(n);
    }

    public static String hourWord(int h) {
        int hour12 = h % 12 == 0 ? 12 : h % 12;
        return numberToWords(hour12);
    }
}
