/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BaseNCodecInputStream_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_Small_LEIx2() throws IOException {
        BaseNCodecInputStream bnis = new BaseNCodecInputStream(null, null, false);
        assertEquals(5, bnis.skip(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_Large_ZfVz3() throws IOException {
        BaseNCodecInputStream bnis = new BaseNCodecInputStream(null, null, false);
        assertEquals(512, bnis.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_EOF_hlez4() throws IOException {
        BaseNCodecInputStream bnis = new BaseNCodecInputStream(null, null, false);
        assertEquals(0, bnis.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_Read_YHoG5() throws IOException {
        BaseNCodecInputStream bnis = new BaseNCodecInputStream(null, null, false);
        assertEquals(5, bnis.skip(5));
        assertEquals(512, bnis.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_ReadEOF_RdVP6() throws IOException {
        BaseNCodecInputStream bnis = new BaseNCodecInputStream(null, null, false);
        assertEquals(5, bnis.skip(5));
        assertEquals(0, bnis.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_ReadEOF2_rDMH7() throws IOException {
        BaseNCodecInputStream bnis = new BaseNCodecInputStream(null, null, false);
        assertEquals(5, bnis.skip(5));
        assertEquals(512, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_ReadEOF3_QcBO8() throws IOException {
        BaseNCodecInputStream bnis = new BaseNCodecInputStream(null, null, false);
        assertEquals(5, bnis.skip(5));
        assertEquals(512, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_ReadEOF4_aUst9() throws IOException {
        BaseNCodecInputStream bnis = new BaseNCodecInputStream(null, null, false);
        assertEquals(5, bnis.skip(5));
        assertEquals(512, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_ReadEOF5_oGxC10() throws IOException {
        BaseNCodecInputStream bnis = new BaseNCodecInputStream(null, null, false);
        assertEquals(5, bnis.skip(5));
        assertEquals(512, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
        assertEquals(0, bnis.skip(512));
    }
}