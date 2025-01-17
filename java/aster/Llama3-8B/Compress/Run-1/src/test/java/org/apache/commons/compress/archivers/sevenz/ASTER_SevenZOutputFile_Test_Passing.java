/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.File;
import java.io.IOException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZOutputFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithFileNameAndPassword_LHmk0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"), new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    sevenZOutputFile.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
        public void write(int b) throws IOException {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishAlreadyFinished_pJYE1() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"), new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    sevenZOutputFile.finish();
    try {
        sevenZOutputFile.finish();
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("This archive has already been finished", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithFile_MeAb0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"));
    sevenZOutputFile.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseFinished_AtIe0() throws IOException {
    SevenZOutputFile file = new SevenZOutputFile(new File("test.txt"));
    file.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseNotFinished_iWfo1() throws IOException {
    SevenZOutputFile file = new SevenZOutputFile(new File("test.txt"), new char[] {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    file.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithChannel_Jfev2_YYFq0() throws IOException {
    File file = new File("test.txt");
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(file);
    Path path = file.toPath();
    sevenZOutputFile.write(path, new OpenOption[0]);
}
}