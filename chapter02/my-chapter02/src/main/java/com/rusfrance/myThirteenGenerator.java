package com.rusfrance;

import javax.inject.Inject;
import java.util.logging.Logger;

@myThirteen
public class myThirteenGenerator implements myNumberGenerator {

    @Inject
    private Logger logger;

    @Override @myLoggable
    public String generateNumber() {
        String number = "13";
        logger.info("GENERATE NUMBER:" + number);
        return number;
    }
}
