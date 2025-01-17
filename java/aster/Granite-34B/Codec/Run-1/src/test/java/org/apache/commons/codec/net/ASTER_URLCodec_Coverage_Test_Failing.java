/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_URLCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlWithPositiveValue_gNYA1() {
        URLCodec codec = new URLCodec();
        byte[] bytes = new byte[]{1};
        byte[] expected = new byte[]{1};
        assertArrayEquals(expected, codec.encodeUrl(null, bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_DJoj2() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = "";
        Object result = urlCodec.decode(obj);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_fjTX1_fid2() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = new byte[0];
        Object result = urlCodec.decode(obj);
        Assertions.assertNull(result);
    }
}