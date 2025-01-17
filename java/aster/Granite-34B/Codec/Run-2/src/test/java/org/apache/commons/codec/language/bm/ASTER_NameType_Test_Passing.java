/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NameType_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getName_SEPHARDIC_returnsCorrectName_mBHX2_yjtc3() {
        NameType nameType = NameType.SEPHARDIC;
        assertEquals("sep", nameType.getName());
    }
}