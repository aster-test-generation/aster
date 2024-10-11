/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIdForLZMA_Rszx0() throws Exception {
    SevenZMethod method = SevenZMethod.LZMA;
    byte[] expectedId = new byte[] {0x03}; // Assuming LZMA has an ID of {0x03}
    assertArrayEquals(expectedId, method.getId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testByIdWithUnknownId_LGqz1() throws Exception {
    byte[] id = new byte[]{0x12, 0x34}; // Assuming this ID does not match any enum id
    SevenZMethod result = SevenZMethod.byId(id);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testByIdWithNullId_IvLw2() throws Exception {
    byte[] id = null;
    SevenZMethod result = SevenZMethod.byId(id);
    assertNull(result);
}
}