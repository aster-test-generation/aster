/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base32_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_DefaultConstructor_ceHO0() {
        Base32 base32 = new Base32();
        byte[] lineSeparator = base32.getLineSeparator();
        assertNotNull(lineSeparator);
        assertEquals(0, lineSeparator.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_BooleanConstructor_oAIm3() {
        Base32 base32 = new Base32(true);
        byte[] lineSeparator = base32.getLineSeparator();
        assertNotNull(lineSeparator);
        assertEquals(0, lineSeparator.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_DefaultConstructor_ceHO0_fid2() {
        Base32 base32 = new Base32();
        byte[] lineSeparator = base32.getLineSeparator();
        assertEquals(0, lineSeparator.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_IntConstructor_jBVc1_fid2() {
        Base32 base32 = new Base32(10);
        byte[] lineSeparator = base32.getLineSeparator();
        assertEquals(0, lineSeparator.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_ByteConstructor_CgeQ2_fid2() {
        Base32 base32 = new Base32((byte) 10);
        byte[] lineSeparator = base32.getLineSeparator();
        assertEquals(0, lineSeparator.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_BooleanConstructor_oAIm3_fid2() {
        Base32 base32 = new Base32(true);
        byte[] lineSeparator = base32.getLineSeparator();
        assertEquals(0, lineSeparator.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_ValidOctet_ccYf0_fid2() {
        Base32 base32 = new Base32(true);
        byte octet = 0;
        assertTrue(base32.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_ValidOctetWithPadding_XlSI2_fid2() {
        Base32 base32 = new Base32(true, (byte) 0xFF);
        byte octet = 0;
        assertTrue(base32.isInAlphabet(octet));
    }
}