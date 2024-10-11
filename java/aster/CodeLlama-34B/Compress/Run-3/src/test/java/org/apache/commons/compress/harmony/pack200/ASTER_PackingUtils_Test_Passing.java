/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import java.io.IOException;
import java.util.List;
import java.util.jar.JarFile;
import org.apache.commons.compress.harmony.pack200.Archive.PackingFile;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackingUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPackingFileListFromJar_emptyJar_RiVA0() throws IOException {
    JarFile jarFile = new JarFile("empty.jar");
    List<PackingFile> packingFileList = PackingUtils.getPackingFileListFromJar(jarFile, false);
    assertTrue(packingFileList.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPackingFileListFromJar_nonEmptyJar_zLJI1() throws IOException {
    JarFile jarFile = new JarFile("non-empty.jar");
    List<PackingFile> packingFileList = PackingUtils.getPackingFileListFromJar(jarFile, false);
    assertFalse(packingFileList.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPackingFileListFromJar_keepFileOrder_yPbT2() throws IOException {
    JarFile jarFile = new JarFile("non-empty.jar");
    List<PackingFile> packingFileList = PackingUtils.getPackingFileListFromJar(jarFile, true);
    assertEquals(packingFileList.size(), jarFile.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPackingFileListFromJar_reorderPackingFiles_VXKU3() throws IOException {
    JarFile jarFile = new JarFile("non-empty.jar");
    List<PackingFile> packingFileList = PackingUtils.getPackingFileListFromJar(jarFile, false);
    assertNotEquals(packingFileList.size(), jarFile.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPackingFileListFromJar_invalidJarFile_XeJZ4() throws IOException {
    JarFile jarFile = new JarFile("invalid.jar");
    try {
        PackingUtils.getPackingFileListFromJar(jarFile, false);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Invalid JAR file", e.getMessage());
    }
}
}