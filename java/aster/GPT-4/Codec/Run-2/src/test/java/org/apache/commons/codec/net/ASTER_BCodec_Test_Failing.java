/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_SDwN0() {
        BCodec codec = new BCodec();
        assertThrows(EncoderException.class, () -> {
            codec.encode(null);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidInput_vbBI0() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        String originalString = "Hello World!";
        String encodedString = codec.encode(originalString, "UTF-8");
        assertNotNull(encodedString);
        assertEquals("Hello World!", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidInput_vbBI0_2_fid2() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        String originalString = "Hello World!";
        String encodedString = codec.encode(originalString, "UTF-8");
        assertEquals("Hello World!", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidInput_KktC0_Fljs0() {
        BCodec codec = new BCodec(StandardCharsets.UTF_8);
        String input = "Hello World";
        Charset charset = StandardCharsets.UTF_8;
        String expected = "SGVsbG8gV29ybGQ="; // Assuming base64 encoding for demonstration
        try {
            String result = codec.encode(input, charset);
            assertEquals(expected, result);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidInput_pNYl0_lxdr0() {
        BCodec codec = new BCodec(StandardCharsets.UTF_8);
        String input = "SGVsbG8gV29ybGQ="; // Base64 encoded string of "Hello World"
        String expected = "Hello World";
        try {
            String result = (String) codec.decode(input);
            assertEquals(expected, result);
        } catch (DecoderException e) {
            fail(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_GXPC1_ojWn0() {
        BCodec codec = new BCodec();
        String input = "Hello World";
        try {
            assertEquals("Hello World", codec.decode(input));
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }
}