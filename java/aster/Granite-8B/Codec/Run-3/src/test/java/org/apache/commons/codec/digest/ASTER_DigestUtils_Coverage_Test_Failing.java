/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DigestUtils_Coverage_Test_Failing {
    {
    }

    {
        try {
        } catch (final Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShaHex_LSTY0() throws IOException {
        final InputStream data = null;
        assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", DigestUtils.shaHex(data));
    }
}