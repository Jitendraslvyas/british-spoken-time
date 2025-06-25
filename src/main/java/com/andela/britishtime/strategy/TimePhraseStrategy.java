package com.andela.britishtime.strategy;

import java.time.LocalTime;

public interface TimePhraseStrategy {
    boolean matches(LocalTime time);
    String phrase(LocalTime time);
}
