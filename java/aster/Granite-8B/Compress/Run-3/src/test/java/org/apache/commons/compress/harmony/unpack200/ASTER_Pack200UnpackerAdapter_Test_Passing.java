/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.jar.JarOutputStream;
import org.apache.commons.io.input.BoundedInputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200UnpackerAdapter_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewBoundedInputStream_ovVb0() throws IOException {
        Path path = null; // Initialize with a valid path
        BoundedInputStream boundedInputStream = Pack200UnpackerAdapter.newBoundedInputStream(path);
        assertNotNull(boundedInputStream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpackWithNullOutputStream_Kstj1() throws Exception {
        Pack200UnpackerAdapter adapter = new Pack200UnpackerAdapter();
        File file = new File("example.jar");
        try {
            adapter.unpack(file, null);
            fail("Must specify both input and output streams");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpackWithValidFileAndOutputStream_fKoV2() throws Exception {
        Pack200UnpackerAdapter adapter = new Pack200UnpackerAdapter();
        File file = new File("example.jar");
        JarOutputStream out = new JarOutputStream(System.out);
        adapter.unpack(file, out);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpackWithZeroLengthFile_XRIU3() throws Exception {
        Pack200UnpackerAdapter adapter = new Pack200UnpackerAdapter();
        File file = new File("example.jar");
        JarOutputStream out = new JarOutputStream(System.out);
        try {
            adapter.unpack(file, out);
            fail("Must specify both input and output streams");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewBoundedInputStream_yAiw0() throws IOException {
        Path path = Files.createTempFile("test", ".tmp");
        BoundedInputStream boundedInputStream = Pack200UnpackerAdapter.newBoundedInputStream(path);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewBoundedInputStream_mXJE0() throws IOException, URISyntaxException {
        URL url = new URL("http://example.com");
        Path path = Paths.get(url.toURI());
        BoundedInputStream boundedInputStream = Pack200UnpackerAdapter.newBoundedInputStream(path);
        assertNotNull(boundedInputStream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewBoundedInputStreamWithFileInputStream_XHxx2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        BoundedInputStream result = Pack200UnpackerAdapter.newBoundedInputStream(fileInputStream);
        assertTrue(result instanceof BoundedInputStream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testUnwrapWithNullFilterInputStream_Vhzg1_1() throws Exception {
        IOException exception =
                assertThrows(
                        IOException.class,
                        () -> Pack200UnpackerAdapter.unwrap(null));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewBoundedInputStream_ogsq0() throws IOException {
        BoundedInputStream bis = Pack200UnpackerAdapter.newBoundedInputStream("first", "more");
        assertNotNull(bis);
    }
}