package com.andela.britishtime.core;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BritishSpokenTimeServiceTest {
    private final BritishSpokenTimeService service = new BritishSpokenTimeService();
    private final DateTimeFormatter strictFormatter = DateTimeFormatter.ofPattern("H:mm").withResolverStyle(ResolverStyle.STRICT);


    @Test void testMidnight()         { assertEquals("midnight", service.convert(LocalTime.of(0, 0))); }
    @Test void testNoon()             { assertEquals("noon", service.convert(LocalTime.of(12, 0))); }
    @Test void testOneOClock()        { assertEquals("one o'clock", service.convert(LocalTime.of(1, 0))); }
    @Test void testQuarterPast()      { assertEquals("quarter past four", service.convert(LocalTime.of(4, 15))); }
    @Test void testHalfPast()         { assertEquals("half past seven", service.convert(LocalTime.of(7, 30))); }
    @Test void testQuarterTo()        { assertEquals("quarter to ten", service.convert(LocalTime.of(9, 45))); }
    @Test void testFivePast()         { assertEquals("five past two", service.convert(LocalTime.of(2, 5))); }
    @Test void testTwentyTo()         { assertEquals("twenty to nine", service.convert(LocalTime.of(8, 40))); }
    @Test void testFallbackNumeric()  { assertEquals("six thirty two", service.convert(LocalTime.of(6, 32))); }

    @Test void testNineFive() {
        int hour = 9;
        int minute = 5;
        String normalized = String.format("%d:%02d", hour, minute);
        LocalTime time = LocalTime.parse(normalized, strictFormatter);
        assertEquals("five past nine", service.convert(time));
    }

    @Test void testInvalid24_00() {
        assertThrows(DateTimeParseException.class, () -> {
            LocalTime.parse("24:00", strictFormatter);
        }, "24:00 should not be parsable as a valid LocalTime");
    }

}