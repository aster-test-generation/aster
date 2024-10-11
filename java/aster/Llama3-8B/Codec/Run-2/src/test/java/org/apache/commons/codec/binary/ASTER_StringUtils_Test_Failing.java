/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_StringUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16Le_HKRu0() {
        byte[] bytes = new byte[] {(byte) 0x00, (byte) 0x01, (byte) 0x02, (byte) 0x03};
        String result = StringUtils.newStringUtf16Le(bytes);
        assertEquals("\u0000\u0001\u0002\u0003", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16Be_yIzL0() {
        byte[] bytes = new byte[] {(byte) 0x00, (byte) 0x01, (byte) 0x02, (byte) 0x03};
        String result = StringUtils.newStringUtf16Be(bytes);
        assertEquals("\u0000\u0001\u0002\u0003", result);
    }
}