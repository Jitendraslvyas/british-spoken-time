package com.andela.britishtime.strategy;

import com.andela.britishtime.core.SpokenTimeFormatter;

import java.time.LocalTime;

public class ToFromThirtyFiveStrategy implements TimePhraseStrategy {
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
