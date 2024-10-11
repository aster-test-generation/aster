/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ConstructorFunction_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullParameters_OHdr0() {
        ConstructorFunction function = new ConstructorFunction(null);
        Object[] parameters = null;
        function.invoke(null, parameters);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithEmptyParameters_rhtc1() {
        ConstructorFunction function = new ConstructorFunction(null);
        Object[] parameters = new Object[0];
        function.invoke(null, parameters);
    }
}