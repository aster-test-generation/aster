/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.io.input.BoundedInputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200UnpackerAdapter_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testUnwrapWithNullInputStream_sjJQ1() {
		InputStream result = Pack200UnpackerAdapter.unwrap(null);
		assertEquals(null, result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpackerAdapterWithNullInputStream_qhaF1_hbUI0() {
        Pack200UnpackerAdapter unpacker = new Pack200UnpackerAdapter();
        try {
            unpacker.unwrap(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must specify both input and output streams", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewBoundedInputStream_ygOu0_GPUH0() throws IOException {
        Path path = Paths.get("path/to/file");
        BoundedInputStream boundedInputStream = Pack200UnpackerAdapter.newBoundedInputStream(path.toString());
        assertNotNull(boundedInputStream);
        Path path1 = Paths.get("path/to/file1");
        Path path2 = Paths.get("path/to/file2");
        BoundedInputStream boundedInputStream2 = Pack200UnpackerAdapter.newBoundedInputStream(path1.toString(), path2.toString());
        assertNotNull(boundedInputStream2);
        Path emptyPath = Paths.get("");
        IOException exception = null;
        try {
            Pack200UnpackerAdapter.newBoundedInputStream(emptyPath.toString());
        } catch (IOException e) {
            exception = e;
        }
        assertNotNull(exception);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testUnwrapWithNullInputStream_sjJQ1_fid2() {
		InputStream result = Pack200UnpackerAdapter.unwrap(null);
		assertNull(result);
	}
}