/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200Utils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_wFUe0() throws IOException {
    File from = new File("from.txt");
    File to = new File("to.txt");
    Pack200Utils.normalize(from, to);
    assertTrue(to.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_withNullProps_lmMj0() throws IOException {
    File from = new File("from.jar");
    File to = new File("to.jar");
    Pack200Utils.normalize(from, to, null);
    assertTrue(to.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_withProps_tQfs1() throws IOException {
    File from = new File("from.jar");
    File to = new File("to.jar");
    Map<String, String> props = new HashMap<>();
    props.put("foo", "bar");
    Pack200Utils.normalize(from, to, props);
    assertTrue(to.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_withExistingFile_VgNX2() throws IOException {
    File from = new File("from.jar");
    File to = new File("to.jar");
    to.createNewFile();
    Map<String, String> props = new HashMap<>();
    Pack200Utils.normalize(from, to, props);
    assertTrue(to.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_wfVe0() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key", "value");
    Pack200Utils.normalize(jar, props);
    assertTrue(jar.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_XNDW0() throws IOException {
    File jar = new File("test.jar");
    Pack200Utils.normalize(jar);
    assertTrue(jar.exists());
}
}