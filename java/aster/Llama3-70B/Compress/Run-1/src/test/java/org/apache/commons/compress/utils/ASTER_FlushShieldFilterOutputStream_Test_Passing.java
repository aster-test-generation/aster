/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import java.io.OutputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FlushShieldFilterOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlush_opUD0_jMGs0() throws IOException {
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    FlushShieldFilterOutputStream flushShieldFilterOutputStream = new FlushShieldFilterOutputStream(out);
    flushShieldFilterOutputStream.flush();
}
}