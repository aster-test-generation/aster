/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Aster_Log_Test_Passing {
    private static final Logger log = Logger.getLogger(Log.class.getName());

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObject_mqIm0() {
        Log log = new Log();
        Object obj = new Object();
        log.printObject(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStat_DgsV0() {
        Log log = new Log();
        log.stat("Test message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_hZJs0() {
        Collection<String> collection = new ArrayList<>();
        collection.add("Test1");
        collection.add("Test2");
        Log.printCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollectionEmpty_DlzD1() {
        Collection<String> collection = new ArrayList<>();
        Log.printCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoTraceFalse_lUZH1() {
        Logger log = Logger.getLogger("test");
        log.setLevel(Level.OFF);
        boolean result = Log.doTrace();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_yGPx0() {
        String message = "Test message";
        Object parm1 = "Parm1";
        Object parm2 = "Parm2";
        Object parm3 = "Parm3";
        Object parm4 = "Parm4";
        Log.trace(message, parm1, parm2, parm3, parm4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceEnter_SqIt0() {
        Log log = new Log();
        Logger logger = Logger.getLogger(Log.class.getName());
        logger.setLevel(Level.FINE);
        log.traceEnter("Test message");
        assertEquals(Level.FINE, logger.getLevel());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_fIEa0() {
        Throwable e = new Throwable();
        Log.error("msg1", "msg2", e);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDebug_WpZU0() {
        assertTrue(Log.doDebug());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_RvyQ0() {
        Throwable e = new Throwable();
        Log.error("msg1", "msg2", "msg3", e);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_KDUX0() {
        String message = "Test message";
        Throwable e = new Exception("Test exception");
        Log.error(message, e);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_UPlf0() {
        Log log = new Log();
        Collection<String> collection = new ArrayList<>();
        log.printCollection("Test message", collection);
        verify(log, times(1)).log("Test message");
        verify(log, times(1)).printCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_ixwj0_OJfQ0() {
        String message = "Hello";
        Object parm1 = "World";
        Log.printCollection(message, Arrays.asList(parm1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_fbWf0_mWFE1() {
        Log log = new Log();
        log.trace("Test", "param1", "param2", "param3");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLog_qWFf0_XHEY1() {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Log.class.getName());
        logger.info("Test message");
        assertTrue(logger.isLoggable(java.util.logging.Level.INFO));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_MCYH0_TmUy0() {
        String message = "TestMessage";
        Object parm1 = "Parm1";
        Object parm2 = "Parm2";
        Object parm3 = "Parm3";
        Object parm4 = "Parm4";
        Object parm5 = "Parm5";
        Object parm6 = "Parm6";
        Log.log(message);
        Log.printCollection(Arrays.asList(parm1, parm2, parm3));
        Log.printCollection(Arrays.asList(parm4, parm5, parm6));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_PHzW0_CyAN1() {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Log.class.getName());
        logger.log(Level.FINE, "Test message");
        assertTrue(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_HooB0_gPys1() {
        String message = "Test Message";
        Object parm1 = "Parm1";
        Object parm2 = "Parm2";
        Log.printCollection(message, Arrays.asList(parm1, parm2));
    }
}