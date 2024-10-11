/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZOutputFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_withNoData_IgBr1() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.txt"));
    byte[] b = {1, 2, 3};
    sevenZOutputFile.write(b, 0, 0);
    assert true;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_withNoData_vitI1() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.txt"));
    byte[] data = new byte[] {1, 2, 3};
    sevenZOutputFile.write(data, 0, 0);
    assert true;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_rKuG0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test"));
    sevenZOutputFile.finish();
    assert true;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_withPassword_goAs1() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test"), "password".toCharArray());
    sevenZOutputFile.finish();
    assert true;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_WhenFinishedIsFalse_ThenFinishIsCalled_mpTy0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test"));
    sevenZOutputFile.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveEntry_yVfH0_wvdL0() throws IOException {
    try {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"));
        File inputFile = new File("inputFile");
        SevenZArchiveEntry entry = sevenZOutputFile.createArchiveEntry(inputFile, "entryName");
        assertEquals("entryName", entry.getName());
        assertEquals(inputFile.isDirectory(), entry.isDirectory());
        assertEquals(inputFile.lastModified(), entry.getLastModifiedDate().getTime());
    } catch (IOException e) {
    }
}
}