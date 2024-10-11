/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveStructSparse_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumbytesWithMinValueNumbytes_DUXA8() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10, Long.MIN_VALUE);
    long numbytes = tarArchiveStructSparse.getNumbytes();
    assertEquals(0, numbytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOffsetWithNegativeOffset_BjHp2_fid1() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(-100, 1000);
    long offset = tarArchiveStructSparse.getOffset();
    assertEquals(-100, offset);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumbytesWithNegativeOffset_YqKU1_fid1() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(-10, 20);
    long numbytes = tarArchiveStructSparse.getNumbytes();
    assertEquals(20, numbytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumbytesWithNegativeNumbytes_avjr2_fid1() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10, -20);
    long numbytes = tarArchiveStructSparse.getNumbytes();
    assertEquals(-20, numbytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumbytesWithMinValueOffset_YCYo7_fid1() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(Long.MIN_VALUE, 20);
    long numbytes = tarArchiveStructSparse.getNumbytes();
    assertEquals(20, numbytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumbytesWithMinValueNumbytes_DUXA8_fid1() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10, Long.MIN_VALUE);
    long numbytes = tarArchiveStructSparse.getNumbytes();
    assertEquals(Long.MIN_VALUE, numbytes);
}
}