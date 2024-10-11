/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathException_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_MessageNotNull_HIKV0_NASM0() {
        JXPathException exception = new JXPathException("Test Message", new Throwable("Inner Exception"));
        String result = exception.getMessage();
        assert result.startsWith("Test Message; ");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_EmptyInnerExceptionMessage_nbNx1_EYmy0() {
        JXPathException exception = new JXPathException("Test Message", new Throwable());
        String result = exception.getMessage();
        assertTrue(result.endsWith("java.lang.Throwable"));
    }
}