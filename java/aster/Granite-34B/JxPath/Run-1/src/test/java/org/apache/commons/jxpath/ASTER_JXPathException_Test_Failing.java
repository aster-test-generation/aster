/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathException_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getExceptionTest3_mAun2_fid1() {
        JXPathException jxpe = new JXPathException("msg", new Throwable());
        Throwable exception = jxpe.getException();
        assertEquals(null, exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getExceptionTest4_lYgQ3_fid1() {
        JXPathException jxpe = new JXPathException(new Throwable());
        Throwable exception = jxpe.getException();
        assertEquals(null, exception);
    }
}