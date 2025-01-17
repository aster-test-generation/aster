/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Coders_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindByMethod_DLsJ0() {
        AbstractCoder coder = Coders.findByMethod(SevenZMethod.LZMA);
        assertNotNull(coder);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddEncoder_LZMA_ZnXK0_HxjG0() throws IOException {
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    Object options = new Object();
    OutputStream result = Coders.addEncoder(out, SevenZMethod.LZMA, options);
    Assertions.assertNotNull(result);
}
}