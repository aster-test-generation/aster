/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;

public class Aster_Soundex_Coverage_Test_Failing {
    @Test
    public void testEncodeWithNullInput_PSWO2_ipIR0_fid3() {
        Soundex soundex = new Soundex();
        assertThrows(EncoderException.class, () -> soundex.encode(null));
    }

    @Test
    public void testIndexBelowRange_wjQZ1_MCTl0_fid3() {
        assertThrows(IllegalArgumentException.class, () -> {
            Soundex soundex = new Soundex("01230120022455012623010202");
            soundex.encode("@"); // '@' is before 'A' in ASCII, so index will be negative
        });
    }
}