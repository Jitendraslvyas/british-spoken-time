package com.example.britishtime;

import java.time.LocalTime;

class PastToTwentyFiveStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) {
        int m = time.getMinute();
        return m >= 1 && m <= 25;
    }
    public String phrase(LocalTime time) {
        return SpokenTimeFormatter.numberToWords(time.getMinute()) + " past " +
               SpokenTimeFormatter.hourWord(time.getHour());
    }
}
