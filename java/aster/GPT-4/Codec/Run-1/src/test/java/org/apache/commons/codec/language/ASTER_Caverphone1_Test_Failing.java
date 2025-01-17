/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Caverphone1_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithRegularInput_kAjO0() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("Coughing");
        assertEquals("KFN111111", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpecialCharacters_HpzZ2() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("Rough#123");
        assertEquals("RF111111", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualWithSimilarStrings_SZxM0() throws EncoderException {
        Caverphone1 caverphone = new Caverphone1();
        assertTrue(caverphone.isEncodeEqual("example", "exampel"));
    }
}