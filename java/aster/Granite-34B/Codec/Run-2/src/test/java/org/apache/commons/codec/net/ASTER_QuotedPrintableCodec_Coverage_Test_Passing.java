/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuotedPrintableCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullSourceStr_rtrP0() throws UnsupportedEncodingException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        String actual = qp.encode(null, "UTF-8");
        Assertions.assertNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptySourceStr_phCp1() throws UnsupportedEncodingException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        String actual = qp.encode("", "UTF-8");
        Assertions.assertEquals("", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_mBhm0() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = new byte[]{0x41, 0x42, 0x43};
        Object result = codec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_HscB1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String input = "ABC";
        Object result = codec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUnsupportedType_CBiO3() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object input = new Object();
        try {
            codec.encode(input);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_vmuw0() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        Object obj = null;
        Object actual = qp.decode(obj);
        Assertions.assertEquals(null, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedType_JfcX3() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        Object obj = new Object();
        try {
            qp.decode(obj);
            Assertions.fail("DecoderException expected");
        } catch (DecoderException e) {
            Assertions.assertEquals("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable decoded", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableWithEscapeChar_fAXm0() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = new byte[]{33, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127};
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        try {
            byte[] result = codec.decodeQuotedPrintable(bytes);
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_TCSK1_fid1() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        byte[] obj = new byte[10];
        Object actual = qp.decode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_oTDx2_fid1() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        String obj = "test";
        Object actual = qp.decode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNegativeValue_JzyI0_1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{-128, -127};
        byte[] encodedBytes = codec.encodeQuotedPrintable(null, bytes, false);
        assertNotEquals(null, encodedBytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNegativeValue_JzyI0_2() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{-128, -127};
        byte[] encodedBytes = codec.encodeQuotedPrintable(null, bytes, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithPositiveValue_kXjf1_RMyv0_1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{-128, 127};
        byte[] encodedBytes = codec.encodeQuotedPrintable(null, bytes, false);
        assertNotEquals(null, encodedBytes);
    }
}