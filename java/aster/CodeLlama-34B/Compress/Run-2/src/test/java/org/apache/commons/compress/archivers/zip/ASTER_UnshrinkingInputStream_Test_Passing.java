/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnshrinkingInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecompressNextSymbol6_nhSI5_wNHf0() throws IOException {
    UnshrinkingInputStream inputStream = new UnshrinkingInputStream(null);
    int code = inputStream.decompressNextSymbol();
    assertEquals(code, 4);
}
}