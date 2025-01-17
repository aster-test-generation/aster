/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.java.util.jar.Pack200;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
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
public void testNormalize_ylaS0_1() throws IOException {
    File from = new File("from.txt");
    File to = new File("to.txt");
    Pack200Utils.normalize(from, to);
    assertTrue(to.exists());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_ylaS0_2() throws IOException {
    File from = new File("from.txt");
    File to = new File("to.txt");
    Pack200Utils.normalize(from, to);
    assertEquals(from.length(), to.length());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_ylaS0_3() throws IOException {
    File from = new File("from.txt");
    File to = new File("to.txt");
    Pack200Utils.normalize(from, to);
    assertEquals(from.lastModified(), to.lastModified());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNullFrom_Afcs1() throws IOException {
    File to = new File("to.txt");
    try {
        Pack200Utils.normalize(null, to);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertTrue(e.getMessage().contains("from"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithInvalidFrom_BYmo5() throws IOException {
    File from = new File("invalid.txt");
    File to = new File("to.txt");
    try {
        Pack200Utils.normalize(from, to);
        fail("Expected IOException");
    } catch (IOException e) {
        assertTrue(e.getMessage().contains("from"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithInvalidTo_WAMN6() throws IOException {
    File from = new File("from.txt");
    File to = new File("invalid.txt");
    try {
        Pack200Utils.normalize(from, to);
        fail("Expected IOException");
    } catch (IOException e) {
        assertTrue(e.getMessage().contains("to"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithSameFromAndTo_vNFn7() throws IOException {
    File from = new File("from.txt");
    File to = from;
    try {
        Pack200Utils.normalize(from, to);
        fail("Expected IOException");
    } catch (IOException e) {
        assertTrue(e.getMessage().contains("from and to"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithDifferentFromAndToAndDifferentLengths_KvxE9_1() throws IOException {
    File from = new File("from.txt");
    File to = new File("to.txt");
    from.createNewFile();
    to.createNewFile();
    Pack200Utils.normalize(from, to);
    assertTrue(to.exists());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithDifferentFromAndToAndDifferentLengths_KvxE9_2() throws IOException {
    File from = new File("from.txt");
    File to = new File("to.txt");
    from.createNewFile();
    to.createNewFile();
    Pack200Utils.normalize(from, to);
    assertEquals(from.length(), to.length());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithDifferentFromAndToAndDifferentLengths_KvxE9_3() throws IOException {
    File from = new File("from.txt");
    File to = new File("to.txt");
    from.createNewFile();
    to.createNewFile();
    Pack200Utils.normalize(from, to);
    assertEquals(from.lastModified(), to.lastModified());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_nullProps_lVtO0() throws IOException {
    File from = new File("from.jar");
    File to = new File("to.jar");
    Map<String, String> props = null;
    Pack200Utils.normalize(from, to, props);
    assertTrue(Files.exists(to.toPath()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_emptyProps_CqsK1() throws IOException {
    File from = new File("from.jar");
    File to = new File("to.jar");
    Map<String, String> props = new HashMap<>();
    Pack200Utils.normalize(from, to, props);
    assertTrue(Files.exists(to.toPath()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_nonEmptyProps_SfcT2() throws IOException {
    File from = new File("from.jar");
    File to = new File("to.jar");
    Map<String, String> props = new HashMap<>();
    props.put(Pack200.Packer.SEGMENT_LIMIT, "-1");
    Pack200Utils.normalize(from, to, props);
    assertTrue(Files.exists(to.toPath()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_invalidProps_bAur3() throws IOException {
    File from = new File("from.jar");
    File to = new File("to.jar");
    Map<String, String> props = new HashMap<>();
    props.put(Pack200.Packer.SEGMENT_LIMIT, "invalid");
    try {
        Pack200Utils.normalize(from, to, props);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid value for property 'segment_limit': 'invalid'", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_Fqdv0_1() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(2, props.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_Fqdv0_2() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals("value1", props.get("key1"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_Fqdv0_3() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals("value2", props.get("key2"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNullJar_kGaM1_1() throws IOException {
    File jar = null;
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(2, props.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNullJar_kGaM1_2() throws IOException {
    File jar = null;
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals("value1", props.get("key1"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNullJar_kGaM1_3() throws IOException {
    File jar = null;
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals("value2", props.get("key2"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNullProps_DGdB2() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = null;
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(0, props.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithEmptyProps_VYYn3() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(0, props.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithDuplicateKeys_goJK4_1() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    props.put("key1", "value3");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(2, props.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithDuplicateKeys_goJK4_2() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    props.put("key1", "value3");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals("value1", props.get("key1"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithDuplicateKeys_goJK4_3() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    props.put("key1", "value3");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals("value2", props.get("key2"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithInvalidKey_BegY5_1() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    props.put("key3", "value3");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(3, props.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithInvalidKey_BegY5_2() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    props.put("key3", "value3");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals("value1", props.get("key1"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithInvalidKey_BegY5_3() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    props.put("key3", "value3");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals("value2", props.get("key2"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithInvalidKey_BegY5_4() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    props.put("key3", "value3");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals("value3", props.get("key3"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNormalize_CLQl0() throws IOException {
        File jar = new File("test.jar");
        File expected = new File("expected.jar");
        Pack200Utils.normalize(jar, expected, null);
        assertTrue(expected.exists());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNormalizeWithNullJar_gwFf5() throws IOException {
        File expected = new File("expected.jar");
        Pack200Utils.normalize(null, expected, null);
        assertTrue(expected.exists());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNormalizeWithNullExpected_wFPl6() throws IOException {
        File jar = new File("test.jar");
        Pack200Utils.normalize(jar, null, null);
        assertTrue(jar.exists());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNormalizeWithNullJarAndExpected_XphB7() throws IOException {
        Pack200Utils.normalize(null, null, null);
        assertTrue(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNormalizeWithValidJarAndExpectedAndNull_HtIt14() throws IOException {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithEmpty_VpvZ2_JSue0() throws IOException {
    File jar = new File("test.jar");
    File expected = new File("expected.jar");
    Pack200Utils.normalize(jar, expected, Collections.emptyMap());
    assertTrue(expected.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithValid_doSA4_HaFA0() throws IOException {
    File jar = new File("test.jar");
    File expected = new File("expected.jar");
    Map<String, String> options = new HashMap<>();
    options.put("valid", "valid");
    Pack200Utils.normalize(jar, expected, options);
    assertTrue(expected.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNullJarAndValidExpected_SBed8_QyBT0() throws IOException {
    File expected = new File("expected.jar");
    Pack200Utils.normalize(null, expected, Collections.singletonMap("valid", "valid"));
    assertTrue(expected.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_ylaS0() throws IOException {
    File from = new File("from.txt");
    File to = new File("to.txt");
    Pack200Utils.normalize(from, to);
    assertTrue(to.exists());
    assertEquals(from.length(), to.length());
    assertEquals(from.lastModified(), to.lastModified());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithDifferentFromAndToAndDifferentLengths_KvxE9() throws IOException {
    File from = new File("from.txt");
    File to = new File("to.txt");
    from.createNewFile();
    to.createNewFile();
    Pack200Utils.normalize(from, to);
    assertTrue(to.exists());
    assertEquals(from.length(), to.length());
    assertEquals(from.lastModified(), to.lastModified());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalize_Fqdv0() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(2, props.size());
    assertEquals("value1", props.get("key1"));
    assertEquals("value2", props.get("key2"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithNullJar_kGaM1() throws IOException {
    File jar = null;
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(2, props.size());
    assertEquals("value1", props.get("key1"));
    assertEquals("value2", props.get("key2"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithDuplicateKeys_goJK4() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    props.put("key1", "value3");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(2, props.size());
    assertEquals("value1", props.get("key1"));
    assertEquals("value2", props.get("key2"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNormalizeWithInvalidKey_BegY5() throws IOException {
    File jar = new File("test.jar");
    Map<String, String> props = new HashMap<>();
    props.put("key1", "value1");
    props.put("key2", "value2");
    props.put("key3", "value3");
    Pack200Utils.normalize(jar, jar, props);
    assertEquals(3, props.size());
    assertEquals("value1", props.get("key1"));
    assertEquals("value2", props.get("key2"));
    assertEquals("value3", props.get("key3"));
}
}