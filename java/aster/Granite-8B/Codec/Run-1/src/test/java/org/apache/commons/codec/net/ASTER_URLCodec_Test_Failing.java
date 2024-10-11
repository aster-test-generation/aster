/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_URLCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByte_dVNY1() {
        URLCodec codec = new URLCodec();
        byte[] input = new byte[]{1, 2, 3};
        Object encoded = codec.encode(input);
        assertArrayEquals(new byte[]{1, 2, 3}, (byte[]) encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrl3_cFVR2() {
        final byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final byte[] result = URLCodec.encodeUrl(null, bytes);
        assert result[0] == 0;
        assert result[1] == 1;
        assert result[2] == 2;
        assert result[3] == 3;
        assert result[4] == 4;
        assert result[5] == 5;
        assert result[6] == 6;
        assert result[7] == 7;
        assert result[8] == 8;
        assert result[9] == 9;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrl4_rvjx3() {
        final byte[] bytes = new byte[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        final byte[] result = URLCodec.encodeUrl(null, bytes);
        assert result[0] == 0;
        assert result[1] == 255;
        assert result[2] == 0;
        assert result[3] == 254;
        assert result[4] == 0;
        assert result[5] == 253;
        assert result[6] == 0;
        assert result[7] == 252;
        assert result[8] == 0;
        assert result[9] == 251;
        assert result[10] == 0;
        assert result[11] == 250;
        assert result[12] == 0;
        assert result[13] == 249;
        assert result[14] == 0;
        assert result[15] == 248;
        assert result[16] == 0;
        assert result[17] == 247;
        assert result[18] == 0;
        assert result[19] == 246;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodingWithNoCharset_EmWR1_fid1() {
        URLCodec urlCodec = new URLCodec();
        assertEquals(null, urlCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_NullCharset_iPVu2_fid1() {
        URLCodec urlCodec = new URLCodec(null);
        assertEquals("UTF-8", urlCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_EmptyCharset_iIGH3_fid1() {
        URLCodec urlCodec = new URLCodec("");
        assertEquals("UTF-8", urlCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrl3_cFVR2_fid1() {
        final byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final byte[] result = URLCodec.encodeUrl(null, bytes);
        assert result.length == 10;
        assert result[0] == 0;
        assert result[1] == 1;
        assert result[2] == 2;
        assert result[3] == 3;
        assert result[4] == 4;
        assert result[5] == 5;
        assert result[6] == 6;
        assert result[7] == 7;
        assert result[8] == 8;
        assert result[9] == 9;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrl4_rvjx3_fid1() {
        final byte[] bytes = new byte[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        final byte[] result = URLCodec.encodeUrl(null, bytes);
        assert result.length == 20;
        assert result[0] == 0;
        assert result[1] == 255;
        assert result[2] == 0;
        assert result[3] == 254;
        assert result[4] == 0;
        assert result[5] == 253;
        assert result[6] == 0;
        assert result[7] == 252;
        assert result[8] == 0;
        assert result[9] == 251;
        assert result[10] == 0;
        assert result[11] == 250;
        assert result[12] == 0;
        assert result[13] == 249;
        assert result[14] == 0;
        assert result[15] == 248;
        assert result[16] == 0;
        assert result[17] == 247;
        assert result[18] == 0;
        assert result[19] == 246;
    }
}