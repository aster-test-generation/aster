/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.FileInputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TarArchiveInputStream_Test_Passing {
private TarArchiveEntry currEntry;
TarArchiveInputStream tararchiveinputstream;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLength100_rNkP0() throws Exception {
    byte[] signature = new byte[100];
    boolean actual = TarArchiveInputStream.matches(signature, 100);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLength1000_GFmT1() throws Exception {
    byte[] signature = new byte[1000];
    boolean actual = TarArchiveInputStream.matches(signature, 1000);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLength10000_nVlZ2() throws Exception {
    byte[] signature = new byte[10000];
    boolean actual = TarArchiveInputStream.matches(signature, 10000);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLength100000_DynU3() throws Exception {
    byte[] signature = new byte[100000];
    boolean actual = TarArchiveInputStream.matches(signature, 100000);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLength1000000_PLPm4() throws Exception {
    byte[] signature = new byte[1000000];
    boolean actual = TarArchiveInputStream.matches(signature, 1000000);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLength10000000_sqlz5() throws Exception {
    byte[] signature = new byte[10000000];
    boolean actual = TarArchiveInputStream.matches(signature, 10000000);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLength100000000_rIEp6() throws Exception {
    byte[] signature = new byte[100000000];
    boolean actual = TarArchiveInputStream.matches(signature, 100000000);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLength1000000000_alkm7() throws Exception {
    byte[] signature = new byte[1000000000];
    boolean actual = TarArchiveInputStream.matches(signature, 1000000000);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntry_RnaS0() throws IOException {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new FileInputStream("file.tar"));
        TarArchiveEntry entry = tarArchiveInputStream.getNextEntry();
        assertEquals(entry.getName(), "test.txt");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntryWithCoverage_dyXe1() throws IOException {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new FileInputStream("file.tar"));
        tarArchiveInputStream.getNextEntry();
        tarArchiveInputStream.close();
        tarArchiveInputStream.mark(10);
        tarArchiveInputStream.reset();
        tarArchiveInputStream.skip(10);
        tarArchiveInputStream.available();
        tarArchiveInputStream.markSupported();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithValidInput_ScFG0() throws IOException {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new FileInputStream("input.tar"));
        long skipped = tarArchiveInputStream.skip(100);
        assertEquals(100, skipped);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithZeroInput_fiXq1() throws IOException {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new FileInputStream("input.tar"));
        long skipped = tarArchiveInputStream.skip(0);
        assertEquals(0, skipped);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithNegativeInput_xnTI2() throws IOException {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new FileInputStream("input.tar"));
        long skipped = tarArchiveInputStream.skip(-10);
        assertEquals(0, skipped);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithBufOffsetNumToRead_LIfm0() throws IOException {
    TarArchiveInputStream tais = new TarArchiveInputStream(new FileInputStream("test.tar"));
    byte[] buf = new byte[1024];
    int offset = 0;
    int numToRead = 10;
    int result = tais.read(buf, offset, numToRead);
    Assertions.assertEquals(numToRead, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithBufOffsetNumToRead2_kdnh1() throws IOException {
    TarArchiveInputStream tais = new TarArchiveInputStream(new FileInputStream("test.tar"));
    byte[] buf = new byte[1024];
    int offset = 10;
    int numToRead = 20;
    int result = tais.read(buf, offset, numToRead);
    Assertions.assertEquals(numToRead, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextEntryWithUnclosedEntry_Xqyi1() throws IOException {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetCurrentEntry() throws Exception{
        tararchiveinputstream = mock(TarArchiveInputStream.class);
        currEntry = mock(TarArchiveEntry.class);
        tararchiveinputstream.setCurrentEntry(currEntry);
        verify(tararchiveinputstream, times(1)).setCurrentEntry(currEntry);
    }
}