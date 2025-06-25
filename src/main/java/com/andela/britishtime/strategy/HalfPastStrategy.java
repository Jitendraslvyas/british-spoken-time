package com.andela.britishtime.strategy;

import com.andela.britishtime.core.SpokenTimeFormatter;

import java.time.LocalTime;

public class HalfPastStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.getMinute() == 30; }
    public String phrase(LocalTime time) {
        return "half past " + SpokenTimeFormatter.hourWord(time.getHour());
    }
}
