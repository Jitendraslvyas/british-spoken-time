package com.andela.britishtime.strategy;

import com.andela.britishtime.core.SpokenTimeFormatter;

import java.time.LocalTime;

public class FallbackNumericStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) {
        int m = time.getMinute();
        return (m >= 26 && m <= 29) || (m >= 31 && m <= 34);
    }
    public String phrase(LocalTime time) {
        return SpokenTimeFormatter.hourWord(time.getHour()) + " " +
               SpokenTimeFormatter.numberToWords(time.getMinute());
    }
}
