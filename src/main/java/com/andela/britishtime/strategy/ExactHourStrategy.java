package com.andela.britishtime.strategy;

import com.andela.britishtime.core.SpokenTimeFormatter;

import java.time.LocalTime;

public class ExactHourStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.getMinute() == 0; }
    public String phrase(LocalTime time) {
        return SpokenTimeFormatter.hourWord(time.getHour()) + " o'clock";
    }
}
