/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BCodec_Test_Failing {
    @Test
    public void testEncodeNonString_qpII2_nKwt0() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        try {
            bCodec.encodeText(null, Charset.forName("UTF-8"));
            throw new AssertionError("EncoderException should be thrown");
        } catch (EncoderException e) {
            // expected
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_HvcZ0_fid1() {
        BCodec bCodec = new BCodec("UTF-8");
        try {
            String result = bCodec.decode("Hello World");
            assertNotNull(result);
        } catch (DecoderException e) {
            fail();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_withNonNullBytes_VPrP0_fid1() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] bytes = "Hello, World!".getBytes();
        byte[] result = bCodec.doDecoding(bytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_TnGK0() throws EncoderException {
        BCodec bCodec = new BCodec("UTF-8");
        String text = "Hello World";
        Charset charset = Charset.forName("UTF-8");
        String result = bCodec.encodeText(text, charset);
        assertNotNull(result);
        assertEquals("PREFIXUTF-8SEPUTF-8SEPHello WorldPOSTFIX", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_TnGK0_2_fid2() throws EncoderException {
        BCodec bCodec = new BCodec("UTF-8");
        String text = "Hello World";
        Charset charset = Charset.forName("UTF-8");
        String result = bCodec.encodeText(text, charset);
        assertEquals("PREFIXUTF-8SEPUTF-8SEPHello WorldPOSTFIX", result);
    }

    @Test
    public void testEncodeNonString_qpII2_nKwt0_fid2() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        try {
            bCodec.encodeText(null, Charset.forName("UTF-8")); // Passing null to encodeText method
            assert false; // EncoderException should be thrown
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_gCwD1_kGfr0_fid2() {
        BCodec bCodec = new BCodec("UTF-8");
        try {
            String result = bCodec.decode("Hello World");
            assertEquals("Hello World", result);
        } catch (DecoderException e) {
            fail("DecoderException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_LhmA0_WWAE0() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        try {
            String result = bCodec.encodeText("Hello World", Charset.forName("UTF-8"));
            assertEquals("Expected encoded string", result, "Encoded String");
        } catch (EncoderException e) {
            fail("EncoderException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_xuZS0_BAur0() {
        BCodec bCodec = new BCodec("UTF-8");
        try {
            String result = bCodec.encodeText("Hello World", Charset.forName("UTF-8"));
            try {
                assertEquals("Expected encoded string", result, bCodec.encodeText("Hello World", Charset.forName("UTF-8")));
            } catch (EncoderException e) {
                fail("EncoderException occurred");
            }
        } catch (EncoderException e) {
            fail("EncoderException occurred");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_dTuK0_jXli0_fid2() {
        BCodec bCodec = new BCodec("UTF-8");
        try {
            String result = bCodec.encodeText("Hello World", Charset.forName("UTF-8"));
            assertNotNull(result);
            assertEquals("PREFIXUTF-8SEPUTF-8SEPHello WorldPOSTFIX", result);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }
}