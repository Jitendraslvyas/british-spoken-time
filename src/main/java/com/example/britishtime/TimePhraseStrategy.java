package com.example.britishtime;

import java.time.LocalTime;

public interface TimePhraseStrategy {
    boolean matches(LocalTime time);
    String phrase(LocalTime time);
}
