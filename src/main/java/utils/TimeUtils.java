package utils;

import java.time.LocalDateTime;

public class TimeUtils {

  public static String getCurrentDayOfMonth() {
    LocalDateTime now = LocalDateTime.now();
    return String.format("%d.%d.%d", now.getDayOfMonth(), now.getMonth().getValue(), now.getYear());
  }

}
