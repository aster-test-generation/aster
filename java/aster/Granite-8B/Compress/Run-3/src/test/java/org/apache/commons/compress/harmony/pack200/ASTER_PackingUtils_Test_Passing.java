/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import org.apache.commons.compress.harmony.pack200.Archive.PackingFile;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Enumeration;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackingUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConfigWithNullOptions_LikU0() throws Exception {
    PackingOptions options = null;
    try {
        PackingUtils.config(options);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConfigWithValidOptions_WZqx1() throws Exception {
    PackingOptions options = new PackingOptions();
    options.setVerbose(true);
    try {
        PackingUtils.config(options);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConfigWithInvalidOptions_AluK2() throws Exception {
    PackingOptions options = new PackingOptions();
    options.setVerbose(false);
    try {
        PackingUtils.config(options);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConfigWithValidLogFileName_vtTD3() throws Exception {
    PackingOptions options = new PackingOptions();
    options.setLogFile("test.log");
    try {
        PackingUtils.config(options);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConfigWithInvalidLogFileName_hvXX4() throws Exception {
    PackingOptions options = new PackingOptions();
    options.setLogFile("invalid/path/test.log");
    try {
        PackingUtils.config(options);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCopyThroughJarWithNullOutputStream_DQJp1() throws IOException {
    final JarInputStream jarInputStream = mock(JarInputStream.class);
    PackingUtils.copyThroughJar(jarInputStream, null);
    verify(jarInputStream, never()).getNextJarEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCopyThroughJarWithValidInputStreamAndOutputStream_LPyw2() throws IOException {
    final JarInputStream jarInputStream = mock(JarInputStream.class);
    final OutputStream outputStream = mock(OutputStream.class);
    final Manifest manifest = mock(Manifest.class);
    when(jarInputStream.getManifest()).thenReturn(manifest);
    PackingUtils.copyThroughJar(jarInputStream, outputStream);
    verify(outputStream).write(any(), anyInt(), anyInt());
    verify(jarInputStream).getNextJarEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getPackingFileListFromJar_with_empty_jar_dNBM2() throws IOException {
    final JarFile jarFile = mock(JarFile.class);
    final Enumeration<JarEntry> jarEntries = mock(Enumeration.class);
    when(jarFile.entries()).thenReturn(jarEntries);
    when(jarEntries.hasMoreElements()).thenReturn(false);
    final boolean keepFileOrder = false;
    final List<PackingFile> actualPackingFileList = PackingUtils.getPackingFileListFromJar(jarFile, keepFileOrder);
    assertTrue(actualPackingFileList.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLog_vyMK0() throws Exception {
        PackingUtils packingUtils = new PackingUtils();
        String message = "This is a test message";
        packingUtils.log(message);
    }
}