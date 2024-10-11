/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArchiveStreamFactory_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamArchiveNames_JHkY0_1() {
    ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
    Set<String> archiveNames = archiveStreamFactory.getInputStreamArchiveNames();
    assertEquals(8, archiveNames.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamArchiveNames_JHkY0_2() {
    ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
    Set<String> archiveNames = archiveStreamFactory.getInputStreamArchiveNames();
    assertFalse(archiveNames.contains("AR"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamArchiveNames_JHkY0_3() {
    ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
    Set<String> archiveNames = archiveStreamFactory.getInputStreamArchiveNames();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetEntryEncoding_UvdE0() {
    ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
    archiveStreamFactory.setEntryEncoding("UTF-8");
    assertEquals("UTF-8", archiveStreamFactory.getEntryEncoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntryEncoding_withEncoding_Cdvu0() {
    ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory("UTF-8");
    assertEquals("UTF-8", archiveStreamFactory.getEntryEncoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntryEncoding_withoutEncoding_TXmh1() {
    ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
    assertNull(archiveStreamFactory.getEntryEncoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDetectUnknownArchive_cJoL10() throws Exception {
    byte[] unknownSignature = {0x00, 0x00, 0x00, 0x00};
    InputStream in = new ByteArrayInputStream(unknownSignature);
    try {
        ArchiveStreamFactory.detect(in);
        fail();
    } catch (ArchiveException e) {
        assertEquals("No Archiver found for the stream signature", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOutputStreamArchiveNames_qLSS0_1() {
    ArchiveStreamFactory archiveStreamFactory = new ArchiveStreamFactory();
    Set<String> archiveNames = archiveStreamFactory.getOutputStreamArchiveNames();
    assertEquals(6, archiveNames.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveOutputStream_AR_ahwG0_DysN0() throws ArchiveException {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    ArArchiveOutputStream ar = (ArArchiveOutputStream) factory.createArchiveOutputStream("ar", out);
    assertNotNull(ar);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveOutputStream_ZIP_rajS1_Thdg0() throws ArchiveException {
    ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    ZipArchiveOutputStream zip = (ZipArchiveOutputStream) factory.createArchiveOutputStream("zip", out, "UTF-8");
    assertNotNull(zip);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveOutputStream_TAR_koDJ2_FUQR0() throws ArchiveException {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    TarArchiveOutputStream tar = (TarArchiveOutputStream) factory.createArchiveOutputStream("tar", out);
    assertNotNull(tar);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveOutputStream_JAR_ewkz3_ikBB0() throws ArchiveException {
    ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    JarArchiveOutputStream jar = (JarArchiveOutputStream) factory.createArchiveOutputStream("jar", out, "UTF-8");
    assertNotNull(jar);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDetect_TJDC0_OsBi0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        factory.detect(new ByteArrayInputStream(new byte[0]));
        fail();
    } catch (ArchiveException e) {
        assertNotNull(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream3_nOkB2_Ppcd0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        ArArchiveInputStream in = (ArArchiveInputStream) factory.createArchiveInputStream("AR", new ByteArrayInputStream(new byte[0]), null);
        assertNotNull(in);
    } catch (ArchiveException e) {
        fail("ArchiveException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream6_Hqim5_HLRM0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        try {
            ZipArchiveInputStream in = (ZipArchiveInputStream) factory.createArchiveInputStream("ZIP", new ByteArrayInputStream(new byte[0]), null);
            assertNotNull(in);
        } catch (ArchiveException e) {
            fail("ArchiveException should not be thrown");
        }
    } catch (Exception e) {
        fail("An unexpected exception occurred");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream7_JmIT6_ZXcH0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        try {
            ZipArchiveInputStream in = (ZipArchiveInputStream) factory.createArchiveInputStream("ZIP", new ByteArrayInputStream(new byte[0]), "UTF-8");
            assertNotNull(in);
        } catch (ArchiveException e) {
            fail("ArchiveException should not be thrown");
        }
    } catch (Exception e) {
        fail("Unexpected exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream8_lFpq7_FNOm0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        TarArchiveInputStream in = (TarArchiveInputStream) factory.createArchiveInputStream("TAR", new ByteArrayInputStream(new byte[0]), null);
        assertNotNull(in);
    } catch (ArchiveException e) {
        fail("ArchiveException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream9_DRPy8_iidu0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        TarArchiveInputStream in = (TarArchiveInputStream) factory.createArchiveInputStream("TAR", new ByteArrayInputStream(new byte[0]), "UTF-8");
        assertNotNull(in);
    } catch (ArchiveException e) {
        fail("ArchiveException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream10_BlLs9_WPKu0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        JarArchiveInputStream in = (JarArchiveInputStream) factory.createArchiveInputStream("JAR", new ByteArrayInputStream(new byte[0]), null);
        assertNotNull(in);
    } catch (ArchiveException e) {
        fail("ArchiveException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream11_SqYS10_GTOe0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        JarArchiveInputStream in = (JarArchiveInputStream) factory.createArchiveInputStream("JAR", new ByteArrayInputStream(new byte[0]), "UTF-8");
        assertNotNull(in);
    } catch (ArchiveException e) {
        fail("ArchiveException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream12_kxmO11_Louo0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        try {
            JarArchiveInputStream in = (JarArchiveInputStream) factory.createArchiveInputStream("APK", new ByteArrayInputStream(new byte[0]), null);
            assertNotNull(in);
        } catch (ArchiveException e) {
            fail("ArchiveException was thrown");
        }
    } catch (Exception e) {
        fail("An unexpected exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream13_socV12_qhNV0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        try {
            JarArchiveInputStream in = (JarArchiveInputStream) factory.createArchiveInputStream("APK", new ByteArrayInputStream(new byte[0]), "UTF-8");
            assertNotNull(in);
        } catch (ArchiveException e) {
            fail("ArchiveException was thrown");
        }
    } catch (Exception e) {
        fail("An unexpected exception was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream14_ykev13_kjCD0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        CpioArchiveInputStream in = (CpioArchiveInputStream) factory.createArchiveInputStream("CPIO", new ByteArrayInputStream(new byte[0]), null);
        assertNotNull(in);
    } catch (ArchiveException e) {
        fail("ArchiveException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveInputStream15_XHYh14_weZi0() {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        try {
            CpioArchiveInputStream in = (CpioArchiveInputStream) factory.createArchiveInputStream("CPIO", new ByteArrayInputStream(new byte[0]), "UTF-8");
            assertNotNull(in);
        } catch (ArchiveException e) {
            fail("ArchiveException was thrown");
        }
    } catch (Exception e) {
        fail("An unexpected exception occurred");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateArchiveOutputStream_NullOutputStream_pblP7_cguw1() throws ArchiveException {
    ArchiveStreamFactory factory = new ArchiveStreamFactory();
    try {
        factory.createArchiveOutputStream("ar", null, null);
        fail();
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDetectNullInputStream_ZCTp0_CvBA0() {
    try {
        try {
            ArchiveStreamFactory.detect(null);
            fail();
        } catch (ArchiveException e) {
        }
        throw new AssertionError("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Stream must not be null.", e.getMessage());
    }
}
}