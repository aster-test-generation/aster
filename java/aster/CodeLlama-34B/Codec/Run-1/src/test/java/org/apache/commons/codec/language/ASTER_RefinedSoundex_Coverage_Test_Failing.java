/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_RefinedSoundex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_InvalidIndex_LlyJ0() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        char c = 'a';
        int index = -1;
        char actual = refinedSoundex.getMappingCode(c);
        char expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ValidString_OQDP2_fid1() throws org.apache.commons.codec.EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String result = refinedSoundex.encode("hello");
        assertEquals("H400", result);
    }
}