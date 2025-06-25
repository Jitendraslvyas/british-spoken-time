package com.andela.britishtime.strategy;

import java.time.LocalTime;

public class MidnightStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.equals(LocalTime.MIDNIGHT); }
    public String phrase(LocalTime time) { return "midnight"; }
}
