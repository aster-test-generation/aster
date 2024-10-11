/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Folder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSizeForCoder_nullCoder_LADy3() {
    Folder folder = new Folder();
    assertEquals(0, folder.getUnpackSizeForCoder(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForInStream_NotFound_KAwS3_EFva0() {
    Folder folder = new Folder();
    BindPair[] bindPairs = new BindPair[1];
    bindPairs[0] = new BindPair(1, 0);
    folder.bindPairs = bindPairs;
    assertEquals(-1, folder.findBindPairForInStream(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForInStream_Found_WmnH2_ysHn0() {
    Folder folder = new Folder();
    folder.bindPairs = new BindPair[1];
    folder.bindPairs[0] = new BindPair(0, 0);
    assertEquals(0, folder.findBindPairForInStream(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForOutStream_Found_WmnH2_AgiN1() {
    Folder folder = new Folder();
    folder.bindPairs = new BindPair[1];
    folder.bindPairs[0] = new BindPair(0, 0);
    assertEquals(0, folder.findBindPairForOutStream(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForOutStream_ReturnsMinusOne_WhenBindPairsIsNull_DILZ1_Rkpg0() {
    Folder folder = new Folder();
    folder.bindPairs = null;
    int result = folder.findBindPairForOutStream(1);
    assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForOutStream_ReturnsMinusOne_WhenOutIndexDoesNotMatch_hrqm3_Rygx0() {
    Folder folder = new Folder();
    folder.bindPairs = new BindPair[]{new BindPair(1, 2), new BindPair(3, 4)};
    int result = folder.findBindPairForOutStream(5);
    assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSize_FindBindPairForOutStreamNegative_OPZR1_aClm0() {
    Folder folder = new Folder();
    folder.packedStreams = new long[]{10};
    assertEquals(10, folder.packedStreams[0]);
}
}