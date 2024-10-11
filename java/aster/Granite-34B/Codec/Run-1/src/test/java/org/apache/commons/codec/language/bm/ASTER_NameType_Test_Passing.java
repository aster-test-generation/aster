/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_NameType_Test_Passing {
    NameType nameType = NameType.SEPHARDIC;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getName_SEPHARDIC_returnsCorrectName_VFWT2_suAy0() {
        NameType nameType = NameType.SEPHARDIC;
        assertEquals("sep", nameType.getName());
    }
}