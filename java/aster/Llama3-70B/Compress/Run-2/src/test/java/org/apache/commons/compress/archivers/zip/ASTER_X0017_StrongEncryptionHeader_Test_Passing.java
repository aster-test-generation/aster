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
public class Aster_X0017_StrongEncryptionHeader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRecordCount_YVdg0() {
    X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader = new X0017_StrongEncryptionHeader();
    long result = x0017_StrongEncryptionHeader.getRecordCount();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRecordCount_JqcK0() {
    X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader = new X0017_StrongEncryptionHeader();
    long recordCount = x0017_StrongEncryptionHeader.getRecordCount();
    assertNotNull(recordCount);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRecordCount_DWCw0_JgRA0() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    long recordCount = header.getRecordCount();
    assertNotNull(recordCount);
}
}