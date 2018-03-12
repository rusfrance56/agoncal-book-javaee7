package com.rusfrance;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Interceptor
@myLoggable
public class myLoggingInterceptor {

    @Inject
    private Logger logger;

    @AroundInvoke
    public Object logMethod(InvocationContext invocationContext) throws Exception {
        logger.entering(invocationContext.getTarget().getClass().getName(),"entering" );
        try{
            return invocationContext.proceed();
        } finally {
            logger.exiting(invocationContext.getTarget().getClass().getName(),"exiting");
        }
    }
}
