/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ByteCode_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNestedMustStartClassPool_Budp0() {
        ByteCode byteCodeForm = new ByteCode(0);
        ClassFileEntry[] nested = new ClassFileEntry[0];
        ByteCode byteCodeForm2 = new ByteCode(0, nested);
        boolean result = byteCodeForm2.nestedMustStartClassPool();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getByteCode_with_opcode_0x7FFFFFFF_lHEM8() {
        ByteCode byteCode = ByteCode.getByteCode(0x7FFFFFFF);
        assertNotNull(byteCode);
        assertEquals(0x7F, byteCode.getOpcode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_fFyr0() {
        ByteCode bytecode1 = new ByteCode(1);
        ByteCode bytecode2 = new ByteCode(1);
        ByteCode bytecode3 = new ByteCode(1, new ClassFileEntry[0]);
        ByteCode bytecode4 = new ByteCode(1, new ClassFileEntry[0]);
        assertEquals(bytecode1.hashCode(), bytecode2.hashCode());
        assertEquals(bytecode3.hashCode(), bytecode4.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_VJLy0() {
        ByteCode bytecode = new ByteCode(0);
        assertEquals(0, bytecode.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedPosition_nsJG0() {
        ByteCode byteCode = new ByteCode(0);
        int[] nestedPosition = byteCode.getNestedPosition(0);
        assertNotNull(nestedPosition);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedPositions_QJaA0() {
        ByteCode byteCode = new ByteCode(0);
        int[][] nestedPositions = byteCode.getNestedPositions();
        assertNotNull(nestedPositions);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_czNd0() {
        ByteCode byteCode = new ByteCode(1, null);
        String expected = "INEFFECTIVE";
        String actual = byteCode.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteCodeTargets_IblO0() {
        ByteCode byteCode = new ByteCode(0);
        int[] targets = byteCode.getByteCodeTargets();
        assertNotNull(targets);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteCodeIndex_rOUe0() {
        ByteCode byteCode = new ByteCode(0);
        int index = byteCode.getByteCodeIndex();
        assertEquals(0, index);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteCodeIndexWithNested_XSSa1() {
        ClassFileEntry[] nested = new ClassFileEntry[1];
        ByteCode byteCode = new ByteCode(0, nested);
        int index = byteCode.getByteCodeIndex();
        assertEquals(0, index);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHasMultipleByteCodes_XhKr0() {
        ByteCode byteCode1 = new ByteCode(1);
        ByteCode byteCode2 = new ByteCode(2, new ClassFileEntry[0]);
        ByteCode byteCode3 = new ByteCode(3, new ClassFileEntry[0]);
        assertTrue(byteCode1.hasMultipleByteCodes());
        assertTrue(byteCode2.hasMultipleByteCodes());
        assertTrue(byteCode3.hasMultipleByteCodes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getByteCode_with_opcode_0x7FFFFFFF_lHEM8_2() {
        ByteCode byteCode = ByteCode.getByteCode(0x7FFFFFFF);
        assertEquals(0x7F, byteCode.getOpcode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_fFyr0_1() {
        ByteCode bytecode1 = new ByteCode(1);
        ByteCode bytecode2 = new ByteCode(1);
        ByteCode bytecode3 = new ByteCode(1, new ClassFileEntry[0]);
        ByteCode bytecode4 = new ByteCode(1, new ClassFileEntry[0]);
        assertEquals(bytecode1.hashCode(), bytecode2.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_fFyr0_2() {
        ByteCode bytecode1 = new ByteCode(1);
        ByteCode bytecode2 = new ByteCode(1);
        ByteCode bytecode3 = new ByteCode(1, new ClassFileEntry[0]);
        ByteCode bytecode4 = new ByteCode(1, new ClassFileEntry[0]);
        assertEquals(bytecode3.hashCode(), bytecode4.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteCodeIndexWithNested_XSSa1_fid1() {
        ClassFileEntry[] nested = new ClassFileEntry[1];
        ByteCode byteCode = new ByteCode(-1, nested);
        int index = byteCode.getByteCodeIndex();
        assertEquals(-1, index);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHasMultipleByteCodes_XhKr0_1_fid2() {
        ByteCode byteCode1 = new ByteCode(1);
        ByteCode byteCode2 = new ByteCode(2, new ClassFileEntry[0]);
        ByteCode byteCode3 = new ByteCode(3, new ClassFileEntry[0]);
        assertTrue(byteCode1.hasMultipleByteCodes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHasMultipleByteCodes_XhKr0_2() {
        ByteCode byteCode1 = new ByteCode(1);
        ByteCode byteCode2 = new ByteCode(2, new ClassFileEntry[0]);
        ByteCode byteCode3 = new ByteCode(3, new ClassFileEntry[0]);
        assertTrue(byteCode2.hasMultipleByteCodes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHasMultipleByteCodes_XhKr0_3() {
        ByteCode byteCode1 = new ByteCode(1);
        ByteCode byteCode2 = new ByteCode(2, new ClassFileEntry[0]);
        ByteCode byteCode3 = new ByteCode(3, new ClassFileEntry[0]);
        assertTrue(byteCode3.hasMultipleByteCodes());}
}