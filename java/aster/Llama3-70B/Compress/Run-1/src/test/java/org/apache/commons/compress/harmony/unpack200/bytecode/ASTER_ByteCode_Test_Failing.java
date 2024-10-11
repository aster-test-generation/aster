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
public void testSetOperand2Bytes_NormalCase_VsGp0_1() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperand2Bytes(0x1234, 0);
    assertEquals(0x12, byteCode.getByteCodeForm().getRewrite()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperand2Bytes_NormalCase_VsGp0_2() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperand2Bytes(0x1234, 0);
    assertEquals(0x34, byteCode.getByteCodeForm().getRewrite()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPool_CvJe0() {
    ByteCode byteCode = new ByteCode(1);
    assertTrue(byteCode.nestedMustStartClassPool());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes_validOperands_EOHS0() {
    ByteCode byteCode = new ByteCode(1);
    int[] operands = {1, 2, 3};
    byteCode.setOperandBytes(operands);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes_nullOperands_gNKH3() {
    ByteCode byteCode = new ByteCode(1);
    try {
        byteCode.setOperandBytes(null);
        assert false;
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCode_Cached_Laid2() {
    ByteCode byteCode1 = ByteCode.getByteCode(0x10);
    ByteCode byteCode2 = ByteCode.getByteCode(0x10);
    assertSame(byteCode1, byteCode2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByte_positionGreaterThanByteCodeFormLength_IeoV2() {
    ByteCode byteCode = new ByteCode(1);
    try {
        byteCode.setOperandByte(10, 10);
        fail("Expected Error to be thrown");
    } catch (Error e) {
        assertEquals("Trying to rewrite " + byteCode + " with an byte at position 10 but this won't fit in the rewrite array", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_hUQe0() {
    ByteCode byteCode = new ByteCode(1);
    assertEquals(0, byteCode.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPosition_uIuo0() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] result = byteCode.getNestedPosition(0);
    assertArrayEquals(new int[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions_SHUL0() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[][] result = byteCode.getNestedPositions();
    assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_eBXV0() {
    ByteCode byteCode = new ByteCode(1);
    assertEquals("someOpcodeName", byteCode.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeTargets_AIRh0() {
    ByteCode byteCode = new ByteCode(1);
    int[] targets = byteCode.getByteCodeTargets();
    assertNotNull(targets);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeIndex_YVpM0() {
    ByteCode byteCode = new ByteCode(1);
    assertEquals(0, byteCode.getByteCodeIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandSigned2BytesPositive_Eeew0_ueUP0() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setByteCodeIndex(0);
    byteCode.setOperandSigned2Bytes(10, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes_nullOperands_gNKH3_fid1() {
    ByteCode byteCode = new ByteCode(1);
    try {
        byteCode.setOperandBytes(null);
        // This line is not reachable
    } catch (NullPointerException e) {
        // This is expected
    } catch (Exception e) {
        assert false;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPosition_uIuo0_fid1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    assertNull(byteCode.getNestedPosition(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions_SHUL0_fid1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[][] result = byteCode.getNestedPositions();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperand2Bytes_NormalCase_VsGp0() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperand2Bytes(0x1234, 0);
    assertEquals(0x12, byteCode.getByteCodeForm().getRewrite()[0]);
    assertEquals(0x34, byteCode.getByteCodeForm().getRewrite()[1]);
}
}