/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Resources_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStream_ValidResource_QRWN0() {
        assertThrows(IllegalArgumentException.class, () -> Resources.getInputStream("validResource.txt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStream_InvalidResource_gvVE1() {
        assertThrows(IllegalArgumentException.class, () -> {
            Resources.getInputStream("nonExistentResource.txt");
        });
    }
}