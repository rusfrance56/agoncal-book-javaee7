package com.rusfrance;

import javax.inject.Inject;
import java.util.logging.Logger;

@myEighteen
public class myEighteenGenerator implements myNumberGenerator {

    @Inject
    private Logger logger;

    @Override @myLoggable
    public String generateNumber() {
        String number = "88888888";
        logger.info("GENERATE NUMBER:" + number);
        return number;
    }
}
