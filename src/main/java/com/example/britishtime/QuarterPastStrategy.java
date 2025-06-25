package com.example.britishtime;

import java.time.LocalTime;

class QuarterPastStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.getMinute() == 15; }
    public String phrase(LocalTime time) {
        return "quarter past " + SpokenTimeFormatter.hourWord(time.getHour());
    }
}
