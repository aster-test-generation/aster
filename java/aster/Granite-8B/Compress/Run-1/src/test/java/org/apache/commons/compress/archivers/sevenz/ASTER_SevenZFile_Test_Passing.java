/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesMethod1_Vaph3() {
        byte[] signature = new byte[10];
        int length = 10;
        boolean result = SevenZFile.matches(signature, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesMethod2_Ieqp4() {
        byte[] signature = new byte[10];
        int length = 9;
        boolean result = SevenZFile.matches(signature, length);
    }
}