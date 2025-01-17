/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarOutputStream;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Segment_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnPack_tizB0() throws IOException, Pack200Exception {
        Segment segment = new Segment();
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        JarOutputStream out = new JarOutputStream(new ByteArrayOutputStream());
        segment.unpack(inputStream, out);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnPackNullJarOutputStream_mMbH2() throws IOException, Pack200Exception {
        Segment segment = new Segment();
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        try {
            segment.unpack(inputStream, null);
            fail("Should have thrown an exception");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnPackWithEmptyInputStream_spbN3() throws IOException, Pack200Exception {
        Segment segment = new Segment();
        InputStream inputStream = new ByteArrayInputStream("".getBytes());
        JarOutputStream out = new JarOutputStream(new ByteArrayOutputStream());
        try {
            segment.unpack(inputStream, out);
            fail("Should have thrown an exception");
        } catch (Pack200Exception e) {
            assertNotNull(e);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnPackWithInvalidData_fGJZ4() throws IOException, Pack200Exception {
        Segment segment = new Segment();
        InputStream inputStream = new ByteArrayInputStream("invalid".getBytes());
        JarOutputStream out = new JarOutputStream(new ByteArrayOutputStream());
        try {
            segment.unpack(inputStream, out);
            fail("Should have thrown an exception");
        } catch (Pack200Exception e) {
            assertNotNull(e);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConstantPool_HCiA0() {
        Segment segment = new Segment();
        SegmentConstantPool segmentConstantPool = segment.getConstantPool();
        assertNotNull(segmentConstantPool);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassBands_ZyjA0() {
        Segment segment = new Segment();
        ClassBands classBands = segment.getClassBands();
        assertNotNull(classBands);
    }
}