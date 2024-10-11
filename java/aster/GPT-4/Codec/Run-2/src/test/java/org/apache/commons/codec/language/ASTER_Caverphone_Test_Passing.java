/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Caverphone_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCaverphoneEqual_SameCaverphoneCode_Pwry0() {
        Caverphone caverphone = new Caverphone();
        assertTrue(caverphone.isCaverphoneEqual("Peter", "Pita"));
    }

    @Test
    public void testEncodeWithInvalidType_ViYa1_oTwR0() {
        Caverphone caverphone = new Caverphone();
        Object input = new Integer(123);
        assertThrows(EncoderException.class, () -> caverphone.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCaverphoneWithValidInput_KMxY0_fid2() {
        Caverphone caverphone = new Caverphone();
        String input = "AKMPA11111";
        String expected = "AKMPA11111"; // Expected should be the encoded form of "AKMPA11111"
        String result = caverphone.caverphone(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidString_ndQl0_fid2() {
        Caverphone caverphone = new Caverphone();
        String input = "example";
        String expected = "AKMPA11111"; // Assuming caverphone method returns this transformed string
        String result = (String) caverphone.encode(input);
        assertEquals(expected, result);
    }
}