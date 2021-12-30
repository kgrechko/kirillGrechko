package com.hillel.hw9;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.info("test for info");
        logger.debug("test for debug");
        logger.warn("test for warn");
        logger.error("test for error");
    }
}
