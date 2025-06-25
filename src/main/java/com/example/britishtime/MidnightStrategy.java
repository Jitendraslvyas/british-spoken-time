package com.example.britishtime;

import java.time.LocalTime;

class MidnightStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.equals(LocalTime.MIDNIGHT); }
    public String phrase(LocalTime time) { return "midnight"; }
}
