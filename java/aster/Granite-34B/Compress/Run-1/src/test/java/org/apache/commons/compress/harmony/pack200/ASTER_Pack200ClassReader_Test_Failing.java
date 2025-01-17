/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200ClassReader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFileName_Fgdy0() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        assertEquals("fileName", reader.getFileName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFileNameWithCoverage_kwEh1() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        String fileName = reader.getFileName();
        assertEquals("fileName", fileName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLastConstantHadWideIndex_uFxS0() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        boolean result = reader.lastConstantHadWideIndex();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLastConstantHadWideIndexWithCoverage_rhOZ1() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        reader.lastConstantHadWideIndex();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_zxTk0() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        char[] chars = new char[10];
        String result = reader.readUTF8(5, chars);
        assertEquals("Result should be equal to expected value", "expectedValue", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFileName_SPhv0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        pack200ClassReader.setFileName("test.txt");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFileNameWithNullName_atnu1() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        pack200ClassReader.setFileName(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFileNameWithEmptyName_Zzyk2() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        pack200ClassReader.setFileName("");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFileNameWithLongName_mpwB4() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        pack200ClassReader.setFileName("ThisIsAVeryLongFileNameThatExceedsTheMaximumLimitOf64Characters.txt");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFileNameWithInvalidName_opEz5() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        pack200ClassReader.setFileName("Invalid File Name");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadUnsignedShortWithIndexOneAndByteValueOne_aBlM1_Qdqf0() {
    Pack200ClassReader reader = new Pack200ClassReader(new byte[] { 19, 0 });
    int result = reader.readUnsignedShort(1);
    int expected = 19;
    assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadUnsignedShortWithIndexOneAndByteValueNotOne_eZyI2_mvBE0() {
    Pack200ClassReader reader = new Pack200ClassReader(new byte[] { 20, 0 });
    int result = reader.readUnsignedShort(1);
    int expected = 20;
    assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasSyntheticAttributes_XIkG0_fid1() {
        byte[] bytes = new byte[10]; // initialize with appropriate values
        Pack200ClassReader reader = new Pack200ClassReader(bytes);
        boolean result = reader.hasSyntheticAttributes();
        assertTrue(result);
    }
}