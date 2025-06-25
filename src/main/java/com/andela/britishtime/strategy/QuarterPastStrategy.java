package com.andela.britishtime.strategy;

import com.andela.britishtime.core.SpokenTimeFormatter;

import java.time.LocalTime;

public class QuarterPastStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.getMinute() == 15; }
    public String phrase(LocalTime time) {
        return "quarter past " + SpokenTimeFormatter.hourWord(time.getHour());
    }
}
