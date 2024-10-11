/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PercentCodec_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_vlxN0() throws DecoderException {
        PercentCodec codec = new PercentCodec();
        assertNull(codec.decode(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_bQWX1() throws DecoderException {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = "Hello, World!".getBytes();
        Object result = codec.decode(bytes);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_rQMA0() throws EncoderException {
        PercentCodec codec = new PercentCodec();
        assertNull(codec.encode(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_VHJw1() throws EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[]{1, 2, 3};
        assertEquals(bytes, codec.encode(bytes));
    }
}