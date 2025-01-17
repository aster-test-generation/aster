/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_PfKJ2() throws DecoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] ascii = new byte[]{1, 2, 3};
        Object result = codec.decode(ascii);
        assert result != null;
        assert result instanceof byte[];
        assert ((byte[]) result).length == 3;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharArray_FVQw3() throws DecoderException {
        BinaryCodec codec = new BinaryCodec();
        char[] ascii = new char[]{'1', '2', '3'};
        Object result = codec.decode(ascii);
        assert result != null;
        assert result instanceof byte[];
        assert ((byte[]) result).length == 3;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_LtCE4() throws DecoderException {
        BinaryCodec codec = new BinaryCodec();
        String ascii = "123";
        Object result = codec.decode(ascii);
        assert result != null;
        assert result instanceof byte[];
        assert ((byte[]) result).length == 3;
    }
}