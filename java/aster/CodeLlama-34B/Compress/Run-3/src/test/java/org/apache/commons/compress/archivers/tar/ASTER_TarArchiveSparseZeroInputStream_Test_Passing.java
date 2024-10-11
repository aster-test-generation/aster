/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveSparseZeroInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip_sbSo0() {
    TarArchiveSparseZeroInputStream inputStream = new TarArchiveSparseZeroInputStream();
    long n = 10;
    long result = inputStream.skip(n);
    assertEquals(n, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipNegative_Zpne1() {
    TarArchiveSparseZeroInputStream inputStream = new TarArchiveSparseZeroInputStream();
    long n = -10;
    long result = inputStream.skip(n);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_OBFy0() throws IOException {
    TarArchiveSparseZeroInputStream inputStream = new TarArchiveSparseZeroInputStream();
    int result = inputStream.read();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithLength_PNEI1() throws IOException {
    TarArchiveSparseZeroInputStream inputStream = new TarArchiveSparseZeroInputStream();
    int result = inputStream.read(new byte[10]);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithOffsetAndLength_lOoS2() throws IOException {
    TarArchiveSparseZeroInputStream inputStream = new TarArchiveSparseZeroInputStream();
    int result = inputStream.read(new byte[10], 0, 10);
    assertEquals(0, result);
}
}