/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CodecEncoding_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGettingSpecifierForDefaultCodec_sKKJ0() throws Exception {
        BHSDCodec defaultCodec = new BHSDCodec(1, 2);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(1, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGettingSpecifierForDefaultCodecWithBHS_wWmz1() throws Exception {
        BHSDCodec defaultCodec = new BHSDCodec(1, 2, 3, 4);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(1, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGettingSpecifierForDefaultCodecWithBH_wcxL2() throws Exception {
        BHSDCodec defaultCodec = new BHSDCodec(1, 2, 3);
        int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
        assertEquals(1, specifier);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getCodec_0_0_0_YWBB0() throws IOException, Pack200Exception {
		int value = 0;
		InputStream in = null;
		Codec defaultCodec = null;
		Codec actual = CodecEncoding.getCodec(value, in, defaultCodec);
		assertEquals(defaultCodec, actual);
}
}