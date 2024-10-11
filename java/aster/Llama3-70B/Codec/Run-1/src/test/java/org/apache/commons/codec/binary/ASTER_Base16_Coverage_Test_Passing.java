/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base16_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_eofTrue_ttad0_Jlui0() {
        Base16 base16 = new Base16();
        org.apache.commons.codec.binary.BaseNCodec.Context context = new org.apache.commons.codec.binary.BaseNCodec.Context();
        context.eof = true;
        byte[] data = new byte[0];
        base16.decode(data, 0, 0, context);
        assertTrue(context.eof);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_loopEnd_FvXR12_Zpun0() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) '='};
        assertTrue(base16.containsAlphabetOrPad(arrayOctet));
    }
}