/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPMethodOrField_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareTo_WhenBothObjectsAreNull_ReturnsZero_gpJL0() {
        final CPMethodOrField mof1 = new CPMethodOrField(null, null);
        final CPMethodOrField mof2 = new CPMethodOrField(null, null);
        final int result = mof1.compareTo(mof2);
        assert result == 0;
    }
}