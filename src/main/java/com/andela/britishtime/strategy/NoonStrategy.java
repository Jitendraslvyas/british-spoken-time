package com.andela.britishtime.strategy;

import java.time.LocalTime;

public class NoonStrategy implements TimePhraseStrategy {
    public boolean matches(LocalTime time) { return time.equals(LocalTime.NOON); }
    public String phrase(LocalTime time) { return "noon"; }
}
