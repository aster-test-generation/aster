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
    private Coder[] coders;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForOutStream_ReturnsMinusOne_WhenBindPairsIsNull_maPg1() {
    Folder folder = new Folder();
    int result = folder.findBindPairForOutStream(1);
    assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSizeForCoder_nullCoder_EIRj3() {
    Folder folder = new Folder();
    assertEquals(0, folder.getUnpackSizeForCoder(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setCoders(Coder[] coders) {
        this.coders = coders;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSizeForCoder_nullCoders_arij2_nWYs0() {
    Folder folder = new Folder();
    folder.coders = null;
    Coder coder = null;
    assertEquals(0, folder.getUnpackSizeForCoder(coder));
}
}