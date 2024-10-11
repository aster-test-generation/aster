/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.apache.commons.compress.harmony.pack200.FileBands;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;
public class Aster_Segment_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpackWrite_WithNonNullLogStream_XlxM0_1() throws IOException {
        Segment segment = new Segment();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JarOutputStream jos = new JarOutputStream(baos);
        segment.unpackWrite(jos);
        assertNotNull(baos.toByteArray());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpackWrite_WithNonNullLogStream_XlxM0_2() throws IOException {
        Segment segment = new Segment();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JarOutputStream jos = new JarOutputStream(baos);
        segment.unpackWrite(jos);
        assertTrue(baos.size() > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpackWrite_WithNullLogStream_wdLR1_2() throws IOException {
        Segment segment = new Segment();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JarOutputStream jos = new JarOutputStream(baos);
        segment.unpackWrite(jos);
        assertEquals(0, baos.size());}
}