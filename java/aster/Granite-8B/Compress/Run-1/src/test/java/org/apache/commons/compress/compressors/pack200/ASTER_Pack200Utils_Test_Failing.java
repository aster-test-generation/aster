/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200Utils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNormalize_fDkX0() {
        File from = new File("from.jar");
        File to = new File("to.jar");
        assertDoesNotThrow(() -> Pack200Utils.normalize(from, to));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNullProperties_WPfS0() throws IOException {
    final File from = new File("from.jar");
    final File to = new File("to.jar");
    final Map<String, String> props = null;
    Pack200Utils.normalize(from, to, props);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithEmptyProperties_yskO1() throws IOException {
    final File from = new File("from.jar");
    final File to = new File("to.jar");
    final Map<String, String> props = new HashMap<>();
    Pack200Utils.normalize(from, to, props);
    // Add assertion here
    // For example:
    // assertEquals(expectedValue, actualValue);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNonEmptyProperties_WPJP2() throws IOException {
    final File from = new File("from.jar");
    final File to = new File("to.jar");
    final Map<String, String> props = new HashMap<>();
    props.put("key", "value");
    Pack200Utils.normalize(from, to, props);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNullFromFile_DoJZ3() throws IOException {
    final File from = null;
    final File to = new File("to.jar");
    final Map<String, String> props = new HashMap<>();
    Pack200Utils.normalize(from, to, props);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNormalize_FOtq0() throws IOException {
        File jar = new File("path/to/jar");
        Map<String, String> props = new HashMap<>();
        Pack200Utils.normalize(jar, props);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithEmptyProperties_yskO1_fid1() throws IOException {
    final File from = new File("from.jar");
    final File to = new File("to.jar");
    final Map<String, String> props = new HashMap<>();
    Pack200Utils.normalize(from, to, props);
}
}