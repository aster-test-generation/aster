/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BaseNCodecOutputStream_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose_Apby0() throws IOException {
        BaseNCodecOutputStream baseNCodecOutputStream = new BaseNCodecOutputStream(null, null, true);
        baseNCodecOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose2_IvRB1() throws IOException {
        BaseNCodecOutputStream baseNCodecOutputStream = new BaseNCodecOutputStream(null, null, true);
        baseNCodecOutputStream.close();
        baseNCodecOutputStream.flush();
    }
}