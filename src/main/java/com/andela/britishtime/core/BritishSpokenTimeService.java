package com.andela.britishtime.core;

import com.andela.britishtime.strategy.*;

import java.time.LocalTime;
import java.util.List;

public class BritishSpokenTimeService {
    private final List<TimePhraseStrategy> strategies = List.of(
        new MidnightStrategy(),
        new NoonStrategy(),
        new ExactHourStrategy(),
        new QuarterPastStrategy(),
        new HalfPastStrategy(),
        new QuarterToStrategy(),
        new PastToTwentyFiveStrategy(),
        new ToFromThirtyFiveStrategy(),
        new FallbackNumericStrategy()
    );

    public String convert(LocalTime time) {
        return strategies.stream()
                .filter(s -> s.matches(time))
                .findFirst()
                .map(s -> s.phrase(time))
                .orElse("Invalid time");
    }
}
