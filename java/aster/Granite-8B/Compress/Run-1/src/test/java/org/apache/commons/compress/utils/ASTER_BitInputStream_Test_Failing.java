/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BitInputStream_Test_Failing {
    private InputStream in;
    private ByteOrder byteOrder;
    private BitInputStream bitInputStream;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadBits_rogd0_1() throws IOException {
        BitInputStream bitInputStream = new BitInputStream(null, null);
        long result = bitInputStream.readBits(0);
        result = bitInputStream.readBits(1);
        result = bitInputStream.readBits(57);
        result = bitInputStream.readBits(58);
        result = bitInputStream.readBits(100);
        assertEquals(-1, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void close_UXZX0() throws IOException
	{
	    in.close();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadBits_rogd0() throws IOException {
        BitInputStream bitInputStream = new BitInputStream(null, null);
        long result = bitInputStream.readBits(0);
        assertEquals(-1, result);
        result = bitInputStream.readBits(1);
        assertEquals(-1, result);
        result = bitInputStream.readBits(57);
        assertEquals(-1, result);
        result = bitInputStream.readBits(58);
        assertEquals(-1, result);
        result = bitInputStream.readBits(100);
        assertEquals(-1, result);
    }
}