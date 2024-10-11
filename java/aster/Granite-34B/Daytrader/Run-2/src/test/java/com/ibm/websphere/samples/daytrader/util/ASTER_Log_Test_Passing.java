/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Log_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObject_SuUU0() {
        Object o = new Object();
        Log.printObject(o);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogCoverage_jNRE1() {
        Log.log(null, null);
        Log.log("", "");
        Log.log("Hello", "World");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest1_sLgD0() {
        Log.trace("message", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest2_Knrc1() {
        Log.trace("message", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_HDdP0() {
        Collection<String> collection = new ArrayList<>(Arrays.asList("item1", "item2", "item3"));
        Log.printCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollectionWithEmptyCollection_waVg1() {
        Collection<String> collection = new ArrayList<>();
        Log.printCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_qZSL0() {
        Log.error("Test message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_PYar0() {
        Log.trace("message", "parm1", "parm2", "parm3", "parm4", "parm5");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithNullParameters_gVPN1() {
        Log.trace("message", null, null, null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithEmptyParameters_QCdR2() {
        Log.trace("message", "", "", "", "", "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoTraceWhenLoggable_pXXP0() {
        Log log = new Log();
        boolean result = Log.doTrace();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_qbFg0() {
        Log.trace("message", "parm1", "parm2", "parm3", "parm4");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithNullParameters_rlNV1() {
        Log.trace("message", null, null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithEmptyParameters_QgtG2() {
        Log.trace("message", "", "", "", "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceExit_uQtT0() {
        Log.traceExit("message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarning_jrVY0() {
        Log.warning("This is a warning message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceInterceptor_pNTD0() {
        Log.traceInterceptor("message", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithNullMessage_apYf0() {
        Log.trace(null, null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithNonNullMessage_hAdv1() {
        Log.trace("message", new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithAllNullParameters_Pjju2() {
        Log.trace("message", null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrint_KqlW0() {
        Log.print("test message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_waHE0() {
        Log.error("msg1", "msg2", new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithEmptyMessages_xnux2() {
        Log.error("", "", new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullMessages_Opej3() {
        Log.error(null, null, new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDebug_aAnH0() {
        Log.debug("test message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDebugWithEmptyMessage_EknY1() {
        Log.debug("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDebugWithNullMessage_Apaq2() {
        Log.debug(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_dxlo0() {
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithNullParameters_UiWL1() {
        Log.trace(null, null, null, null, null, null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithEmptyParameters_PgoI2() {
        Log.trace("", "", "", "", "", "", "", "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithAllParametersNotSame_QcXT6() {
        Log.trace("message1", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message2", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message3", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message4", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message5", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message6", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message7", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message8", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTraceWithAllParametersSame_czDD7() {
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testTrace_KZvd0() {
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_yPuW0() {
        Throwable e = new Throwable();
        String msg1 = "msg1";
        String msg2 = "msg2";
        Log.error(e, msg1, msg2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullMsg1_ILII2() {
        Throwable e = new Throwable();
        String msg1 = null;
        String msg2 = "msg2";
        Log.error(e, msg1, msg2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullMsg2_Oexq3() {
        Throwable e = new Throwable();
        String msg1 = "msg1";
        String msg2 = null;
        Log.error(e, msg1, msg2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithAllNull_nNAw4() {
        Throwable e = new Throwable();
        String msg1 = null;
        String msg2 = null;
        Log.error(e, msg1, msg2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDebug_bBLY0() {
        assertTrue(Log.doDebug());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest1_cnUk0() {
        Log.trace("message", new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest2_QTuR1() {
        Log.trace("message", null, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest3_oapE2() {
        Log.trace("message", new Object(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest4_XxUs3() {
        Log.trace("message", null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest5_fjXf4() {
        Log.trace(null, new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest6_lKOl5() {
        Log.trace(null, null, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest7_bgqS6() {
        Log.trace(null, new Object(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest8_rDCI7() {
        Log.trace(null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_lnFH0() {
        Log.error("Error message", new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_qaOC0() {
        Collection<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        collection.add("item3");
        Log.printCollection("Test message", collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollectionWithEmptyCollection_WepF1() {
        Collection<String> collection = new ArrayList<>();
        Log.printCollection("Test message", collection);
    }
}