/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.bzip2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BZip2CompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testChooseBlockSize_smallInputLength_pVLg0() {
    int blockSize = BZip2CompressorOutputStream.chooseBlockSize(1000);
    assertEquals(1, blockSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testChooseBlockSize_largeInputLength_uXfx1() {
    int blockSize = BZip2CompressorOutputStream.chooseBlockSize(1000000);
    assertEquals(8, blockSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testChooseBlockSize_mediumInputLength_pMQa2() {
    int blockSize = BZip2CompressorOutputStream.chooseBlockSize(200000);
    assertEquals(2, blockSize);
}
}