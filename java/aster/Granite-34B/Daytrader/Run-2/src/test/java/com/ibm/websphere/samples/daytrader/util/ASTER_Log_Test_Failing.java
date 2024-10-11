/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Log_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollectionWithNullCollection_vbqO2() {
        Collection<String> collection = null;
        Log.printCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullThrowable_Huqz1() {
        Log.error("msg1", "msg2", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithEmptyMessageAndNullThrowable_DbIB4() {
        Log.error("", "", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollectionWithNullCollection_dRIz2() {
        Log.printCollection("Test message", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullMessageAndNullThrowable_Vjxm6_ZvGs0() {
        Log.printCollection(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoTraceWhenLoggable_pXXP0_fid1() {
        Log log = new Log();
        boolean result = Log.doTrace();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithAllNull_nNAw4_fid1() {
        Throwable e = null;
        String msg1 = null;
        String msg2 = null;
        Log.error(e, msg1, msg2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_yeeD0() {
        String msg1 = "Error message 1";
        String msg2 = "Error message 2";
        String msg3 = "Error message 3";
        String expected = msg1 + "\n" + msg2 + "\n" + msg3 + "\n\t";
        Log.error(null, msg1, msg2, msg3);
    }
}