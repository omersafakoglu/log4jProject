package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Thread;
import java.time.LocalTime;

public class myTimerLoggings {
    private static final Logger logger =  LogManager.getLogger(myTimerLoggings.class);

    public static void main(String[] args) throws InterruptedException {

        do {
            LocalTime time = LocalTime.now();

            if (time.getSecond() == 0) {
                if (time.getMinute() == 0) {
                    logger.error("Error Message Logged");

                } else
                    logger.info("Info Message Logged");

            } else
                logger.debug("Debug Message Logged");

            Thread.sleep(1000);
        } while (true);

    }
}