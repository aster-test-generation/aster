/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JarMarker_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstance_Dfmo0() {
    JarMarker jarMarker = JarMarker.getInstance();
    assertNotNull(jarMarker);
    assertEquals(jarMarker.getHeaderId().getBytes(), jarMarker.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstance_Dfmo0_2() {
    JarMarker jarMarker = JarMarker.getInstance();
    assertEquals(jarMarker.getHeaderId().getBytes(), jarMarker.getCentralDirectoryData());}
}