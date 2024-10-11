/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Caverphone1_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEdgeCases_Yomo1_1() {
        Caverphone1 caverphone1 = new Caverphone1();
        String resultEmpty = caverphone1.encode("");
        String resultNull = caverphone1.encode(null);
        assertEquals("111111", resultEmpty);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEdgeCases_Yomo1_2() {
        Caverphone1 caverphone1 = new Caverphone1();
        String resultEmpty = caverphone1.encode("");
        String resultNull = caverphone1.encode(null);
        assertEquals("111111", resultNull);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithRegularInput_ODRa0_fid1() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("Christopher");
        assertEquals("KRSTF1", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpecialCharacters_aEZu2_fid1() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("Cough#Rough!123");
    }
}