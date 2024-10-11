/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.jar.JarOutputStream;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Archive_Test_Failing {
private int logLevel;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_Pack200Exception_qKcG7() throws Pack200Exception, IOException {
    Archive archive = new Archive(new FileInputStream("inputFile"), new JarOutputStream(new FileOutputStream("outputFile")));
    try {
        archive.unpack();
        fail("Expected Pack200Exception");
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_IllegalStateException_wYbU8() throws Pack200Exception, IOException {
    Archive archive = new Archive(new FileInputStream("inputFile"), new JarOutputStream(new FileOutputStream("outputFile")));
    try {
        archive.unpack();
        fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_RemovePackFile_Aimf9() throws Pack200Exception, IOException {
    Archive archive = new Archive(new FileInputStream("inputFile"), new JarOutputStream(new FileOutputStream("outputFile")));
    archive.setRemovePackFile(true);
    archive.unpack();
    assertFalse(Files.exists(Paths.get("inputFile")));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_GZIPInputStream_ReTi0_oqJk0() throws Pack200Exception, IOException {
    Archive archive = new Archive("inputFile", "outputFile");
    archive.setQuiet(true);
    archive.unpack();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuiet_DcDc0() throws Pack200Exception, IOException {
    FileInputStream fileInputStream = new FileInputStream("inputFile");
    FileOutputStream fileOutputStream = new FileOutputStream("outputFile");
    JarOutputStream jarOutputStream = new JarOutputStream(fileOutputStream);
    Archive archive = new Archive(fileInputStream, jarOutputStream);
    archive.setQuiet(true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuiet_BPJx1() throws Pack200Exception, IOException {
    Archive archive = new Archive("inputFile", "outputFile");
    archive.setQuiet(true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_Pack200Exception_qKcG7_UrBa0() throws Pack200Exception, IOException {
    Archive archive = new Archive("inputFile", "outputFile");
    try {
        archive.setQuiet(true);
        archive.unpack();
        fail("Expected Pack200Exception");
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_IllegalStateException_wYbU8_vsuS0() throws Pack200Exception, IOException {
    Archive archive = new Archive("inputFile", "outputFile");
    try {
        archive.setQuiet(true);
        archive.unpack();
        fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_RemovePackFile_Aimf9_zIOb0() throws Pack200Exception, IOException {
    FileInputStream fileInputStream = new FileInputStream("inputFile");
    FileOutputStream fileOutputStream = new FileOutputStream("outputFile");
    JarOutputStream jarOutputStream = new JarOutputStream(fileOutputStream);
    Archive archive = new Archive(fileInputStream, jarOutputStream);
    archive.setQuiet(true);
    archive.unpack();
    assertFalse(Files.exists(Paths.get("inputFile")));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_LogStream_dwUs11_oMIR0() throws Pack200Exception, IOException {
    Archive archive = new Archive(new FileInputStream("inputFile"), new JarOutputStream(new FileOutputStream("outputFile")));
    archive.setQuiet(true);
    archive.unpack();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_DeflateHint_SeEI13_yVpf0() throws Pack200Exception, IOException {
    Archive archive = new Archive(new FileInputStream("inputFile"), new JarOutputStream(new FileOutputStream("outputFile")));
    boolean quietStatus = true;
    archive.setQuiet(quietStatus);
    archive.unpack();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_OverrideDeflateHint_nqYD12_bXxo0_fid2() throws Pack200Exception, IOException {
    FileInputStream fileInputStream = new FileInputStream("src/test/resources/inputFile");
    FileOutputStream fileOutputStream = new FileOutputStream("outputFile");
    Archive archive = new Archive(fileInputStream, new JarOutputStream(fileOutputStream));
    archive.setQuiet(true); 
    archive.unpack();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_DeflateHint_SeEI13_yVpf0_fid2() throws Pack200Exception, IOException {
    FileInputStream fileInputStream = new FileInputStream("src/test/resources/inputFile");
    FileOutputStream fileOutputStream = new FileOutputStream("outputFile");
    Archive archive = new Archive(fileInputStream, new JarOutputStream(fileOutputStream));
    boolean quietStatus = true;
    archive.setQuiet(quietStatus);
    archive.unpack();
}
}