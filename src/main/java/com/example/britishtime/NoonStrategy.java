package com.example.britishtime;

import java.time.LocalTime;

class NoonStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.equals(LocalTime.NOON); }
    public String phrase(LocalTime time) { return "noon"; }
}
