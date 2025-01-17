/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_XXHash32_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest8_JXlz7() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 2, 4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest9_AXRq8() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 3, 4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest10_YzvF9() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 4, 4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest11_awaC10() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 5, 4);
    }
}