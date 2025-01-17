/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_Unknown_Ubth2() {
    SevenZMethod method = SevenZMethod.byId("Unknown".getBytes());
    assertNull(method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_COPY_Ormo0() {
    SevenZMethod sevenZMethod = SevenZMethod.COPY;
    byte[] result = sevenZMethod.getId();
    assertArrayEquals(new byte[] {0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_LZMA2_kSuO2() {
    SevenZMethod sevenZMethod = SevenZMethod.LZMA2;
    byte[] result = sevenZMethod.getId();
    assertArrayEquals(new byte[] {0x21}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_DEFLATE_XeTZ3() {
    SevenZMethod sevenZMethod = SevenZMethod.DEFLATE;
    byte[] result = sevenZMethod.getId();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_DEFLATE64_Spvm4() {
    SevenZMethod sevenZMethod = SevenZMethod.DEFLATE64;
    byte[] result = sevenZMethod.getId();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_BCJ_PPC_FILTER_qova8() {
    SevenZMethod sevenZMethod = SevenZMethod.BCJ_PPC_FILTER;
    byte[] result = sevenZMethod.getId();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_BCJ_ARM_FILTER_mmoJ10() {
    SevenZMethod sevenZMethod = SevenZMethod.BCJ_ARM_FILTER;
    byte[] result = sevenZMethod.getId();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_BCJ_ARM_THUMB_FILTER_uMVB11() {
    SevenZMethod sevenZMethod = SevenZMethod.BCJ_ARM_THUMB_FILTER;
    byte[] result = sevenZMethod.getId();
}
}