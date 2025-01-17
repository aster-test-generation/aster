/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Coders_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindByMethod_LZMA_HpgS0() {
    AbstractCoder coder = Coders.findByMethod(SevenZMethod.LZMA);
    assertNotNull(coder);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddEncoder_LZMA_RvWI0_Eimz0() throws IOException {
    OutputStream out = new java.io.ByteArrayOutputStream();
    SevenZMethod method = SevenZMethod.LZMA;
    Object options = null;
    OutputStream result = Coders.addEncoder(out, method, options);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddEncoder_UNSUPPORTED_PYDW1_tvSv0() {
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    SevenZMethod method = null;
    Object options = null;
    try {
        Coders.addEncoder(out, method, options);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Unsupported compression method null", e.getMessage());
    }
}
}