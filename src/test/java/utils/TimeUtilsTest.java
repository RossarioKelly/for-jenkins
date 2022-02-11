package utils;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeUtilsTest {

  @Test
  void getCurrentDayOfMonth() {
    // Given
    LocalDateTime now = LocalDateTime.now();
    String expectedResult = String.format("%d.%d.%d", now.getDayOfMonth(), now.getMonth().getValue(), now.getYear());

    // When
    String result = TimeUtils.getCurrentDayOfMonth();

    // Then
    assertEquals(expectedResult, result);
  }
}