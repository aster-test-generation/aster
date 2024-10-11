/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Metaphone_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsMetaphoneEqual_VKHV0_3_fid1() {
        Metaphone metaphone = new Metaphone();
        assertTrue(metaphone.isMetaphoneEqual("test", "taet"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsMetaphoneEqual_VKHV0_5_fid1() {
        Metaphone metaphone = new Metaphone();
        assertTrue(metaphone.isMetaphoneEqual("test", "tets"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_YkVt0_1_fid1() {
        Metaphone metaphone = new Metaphone();
        assertEquals("ALFKG", metaphone.encode("AlFKG"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_YkVt0_2_fid1() {
        Metaphone metaphone = new Metaphone();
        assertEquals("ALFK500", metaphone.encode("AlFK500"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_YkVt0_3_fid1() {
        Metaphone metaphone = new Metaphone();
        assertEquals("1234", metaphone.encode("1234"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_YkVt0_4_fid1() {
        Metaphone metaphone = new Metaphone();
        assertEquals("5678", metaphone.encode("5678"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_YkVt0_5_fid1() {
        Metaphone metaphone = new Metaphone();
        assertEquals("NULL", metaphone.encode(null));
    }
}