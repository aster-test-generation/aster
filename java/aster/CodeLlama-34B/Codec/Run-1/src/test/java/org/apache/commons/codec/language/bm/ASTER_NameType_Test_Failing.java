/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_NameType_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_Null_hFxr3_whYw0_fid3() {
        NameType nameType = NameType.GENERIC;
        String name = nameType.getName();
        assertNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_Empty_idyN4_lKmq0() {
        NameType nameType = NameType.ASHKENAZI;
        String name = nameType.getName();
        assertEquals("", name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_Invalid_JNLJ5_tlrW0_fid3() {
        NameType nameType = NameType.GENERIC;
        String name = nameType.getName();
        assertEquals("Invalid", name);
    }
}