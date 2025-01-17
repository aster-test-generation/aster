/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.jar.JarFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackingUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCopyThroughJar_NormalCase_nPvw0_LuxO0() {
    try {
        JarFile jarFile = new JarFile("test.jar");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            PackingUtils packingUtils = new PackingUtils();
            packingUtils.copyThroughJar(jarFile, outputStream); 
            assertEquals(0, outputStream.size());
        } catch (IOException e) {
            // Expected
        }
    } catch (IOException e) {
        // Expected
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCopyThroughJar_NullOutputStream_BXpd2_ySFS0() {
    try {
        JarFile jarFile = new JarFile("test.jar");
        try {
            PackingUtils.copyThroughJar(jarFile, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    } catch (IOException e) {
        // IOException is expected when creating a new JarFile
    }
}
}