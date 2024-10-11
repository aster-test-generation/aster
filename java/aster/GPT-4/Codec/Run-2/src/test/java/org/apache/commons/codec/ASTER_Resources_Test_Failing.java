/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Resources_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStream_ValidResource_QRWN0_fid1() {
        InputStream result = Resources.getInputStream("validResource.txt");
        assertNotNull(result);
    }
}