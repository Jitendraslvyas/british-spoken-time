package com.example.britishtime;

import java.time.LocalTime;

class ToFromThirtyFiveStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) {
        int m = time.getMinute();
        return m >= 35 && m <= 59;
    }
    public String phrase(LocalTime time) {
        int minutesTo = 60 - time.getMinute();
        return SpokenTimeFormatter.numberToWords(minutesTo) + " to " +
               SpokenTimeFormatter.hourWord(time.plusHours(1).getHour());
    }
}
