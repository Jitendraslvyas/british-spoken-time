package com.example.britishtime;

import java.time.LocalTime;

class ExactHourStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.getMinute() == 0; }
    public String phrase(LocalTime time) {
        return SpokenTimeFormatter.hourWord(time.getHour()) + " o'clock";
    }
}
