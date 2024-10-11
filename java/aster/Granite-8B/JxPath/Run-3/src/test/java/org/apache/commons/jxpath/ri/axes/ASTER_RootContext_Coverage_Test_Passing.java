/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RootContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRegisteredValueWhenRegistersIsNull_cpHC0() {
        RootContext rootContext = new RootContext(null, null);
        rootContext.setRegisteredValue(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullRegisters_FvYK0() {
        RootContext rootContext = new RootContext(null, null);
        Object result = rootContext.getRegisteredValue(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIdExceedsMaxRegister_tWlK1() {
        RootContext rootContext = new RootContext(null, null);
        Object result = rootContext.getRegisteredValue(10);
    }
}