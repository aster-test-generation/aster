/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200ClassReader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFileName_PdSk0() {
    Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[0]);
    assertNull(pack200ClassReader.getFileName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetFileName_qGMI0() {
    Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[0]);
    pack200ClassReader.setFileName("testFileName");
    assertEquals("testFileName", pack200ClassReader.getFileName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadConst1_ciKG0() {
    Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
    char[] buf = new char[0];
    Object result = reader.readConst(1, buf);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasSyntheticAttributes_GnjL0() {
    Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[0]);
    boolean result = pack200ClassReader.hasSyntheticAttributes();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadUnsignedShort2_nzpf1() {
    Pack200ClassReader reader = new Pack200ClassReader(new byte[10]);
    assertEquals(Short.MAX_VALUE, reader.readUnsignedShort(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLastConstantHadWideIndex_CnOj0() {
    Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[0]);
    boolean result = pack200ClassReader.lastConstantHadWideIndex();
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadUTF8_PdSk0() {
    Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[10]);
    char[] arg1 = new char[10];
    assertEquals("", pack200ClassReader.readUTF8(0, arg1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadConst1_ciKG0_fid1() {
    Pack200ClassReader reader = new Pack200ClassReader(new byte[10]);
    char[] buf = new char[10];
    String result = reader.readUTF8(1, buf);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasSyntheticAttributes_GnjL0_fid1() {
    Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[1]);
    pack200ClassReader.readUTF8(0, new char[0]);
    assertFalse(pack200ClassReader.hasSyntheticAttributes());
}
}