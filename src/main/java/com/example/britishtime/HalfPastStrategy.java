package com.example.britishtime;

import java.time.LocalTime;

class HalfPastStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.getMinute() == 30; }
    public String phrase(LocalTime time) {
        return "half past " + SpokenTimeFormatter.hourWord(time.getHour());
    }
}
