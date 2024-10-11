/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
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
public void testUnpack_nullOut_znfl1() throws IOException {
    Pack200UnpackerAdapter unpacker = new Pack200UnpackerAdapter();
    File file = new File("test.jar");
    JarOutputStream out = null;
    try {
        unpacker.unpack(file, out);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Must specify both input and output streams", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewBoundedInputStreamWithInvalidUrl_iDIN3() throws IOException, URISyntaxException {
    URL url = new URL("http://www.example.com");
    BoundedInputStream bis = Pack200UnpackerAdapter.newBoundedInputStream(url);
    assertNull(bis);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewBoundedInputStreamWithFileInputStream_kfUD2() throws IOException {
    File file = File.createTempFile("test", ".txt");
    FileInputStream fileInputStream = new FileInputStream(file);
    BoundedInputStream boundedInputStream =Pack200UnpackerAdapter.newBoundedInputStream(fileInputStream);
    assertEquals(fileInputStream, boundedInputStream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnwrapWithNullInputStream_qhKl1_abBn0() {
    InputStream inputStream = Pack200UnpackerAdapter.unwrap(null);
    assertNull(inputStream);
}
}