/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RefinedSoundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_Xigb1() throws org.apache.commons.codec.EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String obj = "Hello";
        String result = refinedSoundex.encode(obj);
        assertEquals("H070", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullObject_MsnC2() throws org.apache.commons.codec.EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String obj = null;
        String result = refinedSoundex.encode(obj);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCodeWithNonLetterCharacter_gAvW0() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        char c = '!';
        char result = refinedSoundex.getMappingCode(c);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCodeWithInvalidIndex_PVzz1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        char c = 'A';
        char result = refinedSoundex.getMappingCode(c);
        assertEquals(48, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_wfnw0_vxcy0() throws org.apache.commons.codec.EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String obj = new String();
        String result = refinedSoundex.encode(obj);
        assertEquals("", result);
    }
}