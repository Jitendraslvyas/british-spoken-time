package com.andela.britishtime.strategy;

import com.andela.britishtime.core.SpokenTimeFormatter;

import java.time.LocalTime;

public class QuarterToStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.getMinute() == 45; }
    public String phrase(LocalTime time) {
        return "quarter to " + SpokenTimeFormatter.hourWord(time.plusHours(1).getHour());
    }
}
