/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_QCodec_Coverage_Test_Failing {
    private static final byte SPACE = (byte) ' ';
    private static final byte UNDERSCORE = (byte) '_';
    private boolean encodeBlanks;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonNull_supN1() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        Object obj = "Hello";
        Object result = qCodec.decode(obj);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonString_ifCD3() throws EncoderException {
        QCodec qCodec = new QCodec();
        Object result = qCodec.encode(new Object());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingWithUnderscores_wkIg0() throws DecoderException {
        QCodec qCodec = new QCodec();
        byte[] bytes = new byte[]{(byte) 0x68, (byte) 0x65, (byte) 0x6c, (byte) 0x6c, (byte) 0x5f, (byte) 0x6f, (byte) 0x20, (byte) 0x77, (byte) 0x6f, (byte) 0x72, (byte) 0x6c, (byte) 0x64};
        byte[] expected = new byte[]{(byte) 0x68, (byte) 0x65, (byte) 0x6c, (byte) 0x6c, (byte) 0x20, (byte) 0x77, (byte) 0x6f, (byte) 0x72, (byte) 0x6c, (byte) 0x64};
        byte[] result = qCodec.doDecoding(bytes);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextEmptyCharsetName_FPwn4() throws EncoderException {
        QCodec qCodec = new QCodec();
        String text = "Hello, World!";
        String charsetName = "";
        String result = qCodec.encodeText(text, charsetName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextInvalidCharsetName_MYgE5() throws EncoderException {
        QCodec qCodec = new QCodec();
        String text = "Hello, World!";
        String charsetName = "Invalid";
        String result = qCodec.encodeText(text, charsetName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextNullText_khNq1_eOHq0() throws EncoderException {
        QCodec qCodec = new QCodec();
        String text = null;
        String charsetName = "UTF-8";
        try {
            qCodec.encodeText(text, Charset.forName(charsetName));
            fail("EncoderException expected");
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_AWWB0_fid1() {
        QCodec qCodec = new QCodec();
        String defaultCharset = qCodec.getDefaultCharset();
        assertEquals("Default charset name", defaultCharset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SBll0_CDRv0_fid3() throws EncoderException {
        QCodec qCodec = new QCodec("UTF-8");
        String sourceStr = "Hello, World!";
        String expected = "Hello,+World!";
        String actual = qCodec.encodeText(sourceStr, Charset.forName("UTF-8"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedEncodingException_LRNT0_gmYC0_fid3() {
        QCodec qCodec = new QCodec();
        String str = "test";
        try {
            qCodec.decode(str);
            fail("DecoderException was expected");
        } catch (DecoderException e) {
            assertEquals("Unsupported encoding", e.getMessage());
        }
    }
}