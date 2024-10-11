/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_RefinedSoundex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMappingCodeWithValidInput_bMzt1() {
        RefinedSoundex soundex = new RefinedSoundex();
        char result = soundex.getMappingCode('0');
        assertEquals('0', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMappingCodeWithValidInput_bMzt1_fid1() {
        RefinedSoundex soundex = new RefinedSoundex();
        char result = soundex.getMappingCode('A');
        assertEquals('A', result);
    }
}