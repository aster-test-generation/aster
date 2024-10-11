/**
 * Generated by Aster
 */
package org.apache.commons.codec;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Resources_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStream_ExistingResource_UDiR0_fid1() {
    try {
        Resources.getInputStream("existingResource.txt");
    } catch (IllegalArgumentException e) {
        assertEquals("Unable to resolve required resource: existingResource.txt", e.getMessage());
    }
}
}