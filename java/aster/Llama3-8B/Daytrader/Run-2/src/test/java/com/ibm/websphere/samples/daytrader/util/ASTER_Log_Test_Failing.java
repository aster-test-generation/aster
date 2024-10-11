/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Aster_Log_Test_Failing {
    private static final Logger log = Logger.getLogger(Log.class.getName());

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLog_pnzU0() {
        Log.log("Hello, ", "World!");
        assertEquals("org.apache.maven.surefire.api.report.ConsoleOutputCapture$ForwardingPrintStream@4e192ef5", System.out.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_DDYe0() {
        Log log = new Log();
        log.trace("Hello", "World");
        assertEquals("com.ibm.websphere.samples.daytrader.util.Log@516e2261", log.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoTraceFine_uurq0() {
        Logger log = Logger.getLogger(Log.class.getName());
        log.setLevel(Level.FINE);
        boolean result = Log.doTrace();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLog_wedM0() {
        String expected = "org.apache.maven.surefire.api.report.ConsoleOutputCapture$ForwardingPrintStream@4e192ef5";
        Log.log("msg1", "msg2", "msg3");
        assertEquals(expected, System.out.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_nbFa1() {
        try {
            Log.error("Error message 1", "Error message 2", new Exception("Test exception"));
            fail("This test should have thrown an exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_lHJW0() {
        String message = "Test message";
        Throwable e = new Exception("Test exception");
        Log.error(message, e);
        assertEquals(message + "\n\t" + e.toString(), System.out.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_hBmV0() {
        Log log = new Log();
        Collection<String> collection = new ArrayList<>();
        collection.add("Test");
        log.printCollection("Test message", collection);
        verify(log, times(1)).log("Test message");
        verify(log, times(1)).printCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLog_pnzU0_fid1() {
        Log.log("Hello, ", "World!");
        assertEquals("Hello, World!", System.out.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_DDYe0_fid1() {
        Log log = new Log();
        log.trace("Hello", "World");
        assertEquals("trace(Hello(World))", log.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLog_wedM0_fid1() {
        String expected = "msg1msg2msg3";
        Log.log("msg1", "msg2", "msg3");
        assertEquals(expected, System.out.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarning_vdlZ0() {
        Log.warning("This is a test warning message");
        assertEquals(Level.WARNING, log.getUseParentHandlers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDebug_KlZI0() {
        Log.debug("Test message");
        assertEquals(Level.INFO, log.getUseParentHandlers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLog_rUsL0() {
        Logger log = Logger.getLogger(Log.class.getName());
        Log.log("Test message");
        assertEquals(Level.INFO, log.getUseParentHandlers());
    }
}