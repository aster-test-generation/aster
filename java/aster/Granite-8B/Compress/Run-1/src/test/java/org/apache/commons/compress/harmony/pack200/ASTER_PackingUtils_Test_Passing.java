/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackingUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLog_XoWi0() {
        PackingUtils packingUtils = new PackingUtils();
        String message = "This is a test message";
        packingUtils.log(message);
    }
}