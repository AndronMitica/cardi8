package loggerUtility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtility {
    private static final Logger logger = LogManager.getLogger();

    public static void startTestCase(String testCase) {
//        logger.info("****** Execution Started: " + testCase + " ******");
        logger.info("****** Execution Started: "+testCase + " ******");
    }

    public static void finishTestCase(String testCase) {
//        logger.info("****** Execution Finished: " + testCase + " ******");
        logger.info("****** Execution Finished: "+testCase + " ******");
    }

    public static void infoTest(String message) {
        logger.info(message);
    }

    public static void errorTest(String message) {
        logger.error(message);
    }
}