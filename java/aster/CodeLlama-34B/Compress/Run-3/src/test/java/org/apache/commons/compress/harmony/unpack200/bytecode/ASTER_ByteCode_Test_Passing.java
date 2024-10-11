/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ByteCode_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperand2Bytes_InvalidOperand_ikOS1() {
    ByteCode byteCode = new ByteCode(1);
    try {
        byteCode.setOperand2Bytes(-1, 0);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Operand must be non-negative", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperand2Bytes_InvalidPosition_AHaf2() {
    ByteCode byteCode = new ByteCode(1);
    try {
        byteCode.setOperand2Bytes(10, -1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Position must be non-negative", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperand2Bytes_InvalidOperand_WithNested_BauC4() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    try {
        byteCode.setOperand2Bytes(-1, 0);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Operand must be non-negative", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperand2Bytes_InvalidPosition_WithNested_sJAT5() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    try {
        byteCode.setOperand2Bytes(10, -1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Position must be non-negative", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes1_Uxpo0() {
    ByteCode byteCode = new ByteCode(1);
    int[] operands = new int[] {1, 2, 3};
    byteCode.setOperandBytes(operands);
    assertEquals(1, byteCode.getByteCodeForm().firstOperandIndex());
    assertEquals(3, byteCode.getByteCodeForm().operandLength());
    assertEquals(1, byteCode.getRewrite()[0]);
    assertEquals(2, byteCode.getRewrite()[1]);
    assertEquals(3, byteCode.getRewrite()[2]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes2_lCOx1() {
    ByteCode byteCode = new ByteCode(2);
    int[] operands = new int[] {4, 5, 6};
    byteCode.setOperandBytes(operands);
    assertEquals(2, byteCode.getByteCodeForm().firstOperandIndex());
    assertEquals(3, byteCode.getByteCodeForm().operandLength());
    assertEquals(4, byteCode.getRewrite()[0]);
    assertEquals(5, byteCode.getRewrite()[1]);
    assertEquals(6, byteCode.getRewrite()[2]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes3_cQsb2() {
    ByteCode byteCode = new ByteCode(3);
    int[] operands = new int[] {7, 8, 9};
    byteCode.setOperandBytes(operands);
    assertEquals(3, byteCode.getByteCodeForm().firstOperandIndex());
    assertEquals(3, byteCode.getByteCodeForm().operandLength());
    assertEquals(7, byteCode.getRewrite()[0]);
    assertEquals(8, byteCode.getRewrite()[1]);
    assertEquals(9, byteCode.getRewrite()[2]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes4_PVPA3() {
    ByteCode byteCode = new ByteCode(4);
    int[] operands = new int[] {10, 11, 12};
    byteCode.setOperandBytes(operands);
    assertEquals(4, byteCode.getByteCodeForm().firstOperandIndex());
    assertEquals(3, byteCode.getByteCodeForm().operandLength());
    assertEquals(10, byteCode.getRewrite()[0]);
    assertEquals(11, byteCode.getRewrite()[1]);
    assertEquals(12, byteCode.getRewrite()[2]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPool1_OZWy0() {
    ByteCode byteCode = new ByteCode(1);
    assertTrue(byteCode.nestedMustStartClassPool());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPool2_WZPl1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    assertFalse(byteCode.nestedMustStartClassPool());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeTargets_nJkj0() {
    ByteCode byteCode = new ByteCode(1);
    int[] byteCodeTargets = new int[10];
    for (int i = 0; i < 10; i++) {
        byteCodeTargets[i] = i;
    }
    byteCode.setByteCodeTargets(byteCodeTargets);
    assertArrayEquals(byteCodeTargets, byteCode.getByteCodeTargets());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeTargetsWithNested_AZHj1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] byteCodeTargets = new int[10];
    for (int i = 0; i < 10; i++) {
        byteCodeTargets[i] = i;
    }
    byteCode.setByteCodeTargets(byteCodeTargets);
    assertArrayEquals(byteCodeTargets, byteCode.getByteCodeTargets());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRewrite_tXme0() {
    ByteCode byteCode = new ByteCode(1);
    int[] rewrite = {1, 2, 3};
    byteCode.setRewrite(rewrite);
    assertArrayEquals(rewrite, byteCode.getRewrite());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRewriteWithNull_ITmp2() {
    ByteCode byteCode = new ByteCode(1);
    int[] rewrite = null;
    byteCode.setRewrite(rewrite);
    assertNull(byteCode.getRewrite());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByte_xsZT0() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, 0);
    assertEquals(1, byteCode.getByteCodeForm().firstOperandIndex());
    assertEquals(1, byteCode.getByteCodeForm().operandLength());
    assertEquals(1, byteCode.getRewrite()[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByteWithNegativePosition_vXSo1() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, -1);
    assertEquals(1, byteCode.getByteCodeForm().firstOperandIndex());
    assertEquals(1, byteCode.getByteCodeForm().operandLength());
    assertEquals(1, byteCode.getRewrite()[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByteWithPositionOutOfBounds_DZlb2() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, 2);
    assertEquals(1, byteCode.getByteCodeForm().firstOperandIndex());
    assertEquals(1, byteCode.getByteCodeForm().operandLength());
    assertEquals(1, byteCode.getRewrite()[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode1_QapG0() {
    ByteCode byteCode = new ByteCode(1);
    assertEquals(1, byteCode.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode2_Dhfp1() {
    ByteCode byteCode = new ByteCode(2, new ClassFileEntry[0]);
    assertEquals(2, byteCode.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode3_ErfQ2() {
    ByteCode byteCode = new ByteCode(3, new ClassFileEntry[1]);
    assertEquals(3, byteCode.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName1_UyPR0() {
    ByteCode byteCode = new ByteCode(1);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName2_rJlU1() {
    ByteCode byteCode = new ByteCode(2);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName3_wrFh2() {
    ByteCode byteCode = new ByteCode(3);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName4_BQCR3() {
    ByteCode byteCode = new ByteCode(4);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName5_UVMn4() {
    ByteCode byteCode = new ByteCode(5);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName6_iLio5() {
    ByteCode byteCode = new ByteCode(6);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName7_Jgbf6() {
    ByteCode byteCode = new ByteCode(7);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName8_UGWL7() {
    ByteCode byteCode = new ByteCode(8);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName9_hDGt8() {
    ByteCode byteCode = new ByteCode(9);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName10_BdCX9() {
    ByteCode byteCode = new ByteCode(10);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName11_XceL10() {
    ByteCode byteCode = new ByteCode(11);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName12_HhLP11() {
    ByteCode byteCode = new ByteCode(12);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName13_KCej12() {
    ByteCode byteCode = new ByteCode(13);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName14_BUGs13() {
    ByteCode byteCode = new ByteCode(14);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName15_EOgL14() {
    ByteCode byteCode = new ByteCode(15);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName16_aTpw15() {
    ByteCode byteCode = new ByteCode(16);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName17_sBzw16() {
    ByteCode byteCode = new ByteCode(17);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName18_CrBi17() {
    ByteCode byteCode = new ByteCode(18);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName19_JNRQ18() {
    ByteCode byteCode = new ByteCode(19);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName20_VYCs19() {
    ByteCode byteCode = new ByteCode(20);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName21_ePOF20() {
    ByteCode byteCode = new ByteCode(21);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName22_wDDl21() {
    ByteCode byteCode = new ByteCode(22);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName23_aYIQ22() {
    ByteCode byteCode = new ByteCode(23);
    assertEquals("ByteCode", byteCode.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength1_JarW0() {
    ByteCode byteCode = new ByteCode(1);
    assertEquals(1, byteCode.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength2_OWIz1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    assertEquals(1, byteCode.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewrite_BHJF0() {
    ByteCode byteCode = new ByteCode(1);
    int[] expected = new int[] { 1, 2, 3 };
    int[] actual = byteCode.getRewrite();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewriteWithInvalidOpcode_lLbG2() {
    ByteCode byteCode = new ByteCode(0);
    int[] expected = new int[] { 0 };
    int[] actual = byteCode.getRewrite();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewriteWithNullNested_IZhM3() {
    ByteCode byteCode = new ByteCode(1, null);
    int[] expected = new int[] { 1 };
    int[] actual = byteCode.getRewrite();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewriteWithEmptyNested_nAPn4() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] expected = new int[] { 1 };
    int[] actual = byteCode.getRewrite();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_WYyp0() {
    ByteCode byteCode = new ByteCode(1);
    assertTrue(byteCode.equals(byteCode));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullArgument_jeZv2() {
    ByteCode byteCode = new ByteCode(1);
    assertFalse(byteCode.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_NSmb3() {
    ByteCode byteCode = new ByteCode(1);
    assertFalse(byteCode.equals(new Object()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentOpcode_IOxr4() {
    ByteCode byteCode1 = new ByteCode(1);
    ByteCode byteCode2 = new ByteCode(2);
    assertFalse(byteCode1.equals(byteCode2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions1_EYfA0() {
    ByteCode byteCode = new ByteCode(1);
    int[][] nestedPositions = byteCode.getNestedPositions();
    assertEquals(1, nestedPositions.length);
    assertEquals(1, nestedPositions[0].length);
    assertEquals(1, nestedPositions[0][0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions2_zatj1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[][] nestedPositions = byteCode.getNestedPositions();
    assertEquals(1, nestedPositions.length);
    assertEquals(0, nestedPositions[0].length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString1_xEQo0() {
    ByteCode byteCode = new ByteCode(1);
    String expected = "ByteCode";
    String actual = byteCode.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString2_MUbG1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    String expected = "ByteCode";
    String actual = byteCode.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString3_ixXG2() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[1]);
    String expected = "ByteCode";
    String actual = byteCode.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_opcode_Doie0() {
    ByteCode byteCode = new ByteCode(1);
    ClassFileEntry[] nested = byteCode.getNestedClassFileEntries();
    assertEquals(1, nested.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_empty_sYSU2() {
    ByteCode byteCode = new ByteCode(1);
    ClassFileEntry[] nested = byteCode.getNestedClassFileEntries();
    assertEquals(0, nested.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_null_iEos3() {
    ByteCode byteCode = new ByteCode(1);
    ClassFileEntry[] nested = byteCode.getNestedClassFileEntries();
    assertNull(nested);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_invalid_Iagb4() {
    ByteCode byteCode = new ByteCode(1);
    ClassFileEntry[] nested = byteCode.getNestedClassFileEntries();
    assertNotNull(nested);
    assertEquals(1, nested.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeTargets1_KXdn0() {
    ByteCode byteCode = new ByteCode(1);
    int[] byteCodeTargets = byteCode.getByteCodeTargets();
    assertEquals(1, byteCodeTargets.length);
    assertEquals(1, byteCodeTargets[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeForm_VHjX0() {
    ByteCode byteCode = new ByteCode(1);
    ByteCodeForm byteCodeForm = byteCode.getByteCodeForm();
    assertEquals(byteCodeForm.getOpcode(), 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeFormWithNested_XsMh1() {
    ClassFileEntry[] nested = new ClassFileEntry[0];
    ByteCode byteCode = new ByteCode(1, nested);
    ByteCodeForm byteCodeForm = byteCode.getByteCodeForm();
    assertEquals(byteCodeForm.getOpcode(), 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeFormWithRewriteCopy_xEYS2() {
    ByteCode byteCode = new ByteCode(1);
    ByteCodeForm byteCodeForm = byteCode.getByteCodeForm();
    int[] rewriteCopy = byteCodeForm.getRewriteCopy();
    assertEquals(rewriteCopy.length, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeFormWithHasNoOperand_vOwE3() {
    ByteCode byteCode = new ByteCode(1);
    ByteCodeForm byteCodeForm = byteCode.getByteCodeForm();
    assertTrue(byteCodeForm.hasNoOperand());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeFormWithGetName_zFmh4() {
    ByteCode byteCode = new ByteCode(1);
    ByteCodeForm byteCodeForm = byteCode.getByteCodeForm();
    assertEquals(byteCodeForm.getName(), "ByteCodeForm");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeFormWithHasMultipleByteCodes_NYCe6() {
    ByteCode byteCode = new ByteCode(1);
    ByteCodeForm byteCodeForm = byteCode.getByteCodeForm();
    assertFalse(byteCodeForm.hasMultipleByteCodes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeFormWithGetRewrite_sVyT7() {
    ByteCode byteCode = new ByteCode(1);
    ByteCodeForm byteCodeForm = byteCode.getByteCodeForm();
    int[] rewrite = byteCodeForm.getRewrite();
    assertEquals(rewrite.length, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNestedPositions_zksH0() {
    ByteCode byteCode = new ByteCode(1);
    int[][] nestedPositions = {{1, 2}, {3, 4}};
    byteCode.setNestedPositions(nestedPositions);
    assertArrayEquals(nestedPositions, byteCode.getNestedPositions());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNestedPositionsWithNull_ssyo1() {
    ByteCode byteCode = new ByteCode(1);
    int[][] nestedPositions = null;
    byteCode.setNestedPositions(nestedPositions);
    assertNull(byteCode.getNestedPositions());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeIndex_CqnZ0() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int byteCodeIndex = byteCode.getByteCodeIndex();
    assertEquals(1, byteCodeIndex);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeIndexWithInvalidOpcode_yZjU2() {
    ByteCode byteCode = new ByteCode(0, new ClassFileEntry[0]);
    int byteCodeIndex = byteCode.getByteCodeIndex();
    assertEquals(0, byteCodeIndex);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeIndexWithNullNested_inWQ3() {
    ByteCode byteCode = new ByteCode(1, null);
    int byteCodeIndex = byteCode.getByteCodeIndex();
    assertEquals(1, byteCodeIndex);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpcode1_ljzy0() {
    ByteCode byteCode = new ByteCode(1);
    assertEquals(1, byteCode.getOpcode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpcode2_uIsa1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    assertEquals(1, byteCode.getOpcode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasMultipleByteCodes_SingleByteCode_ZECW0() {
    ByteCode byteCode = new ByteCode(1);
    assertFalse(byteCode.hasMultipleByteCodes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeIndexWithInvalidValue_oMdN2() {
    ByteCode byteCode = new ByteCode(1);
    try {
        byteCode.setByteCodeIndex(-1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid byte code offset: -1", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes1_Uxpo0_1() {
    ByteCode byteCode = new ByteCode(1);
    int[] operands = new int[] {1, 2, 3};
    byteCode.setOperandBytes(operands);
    assertEquals(1, byteCode.getByteCodeForm().firstOperandIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes1_Uxpo0_2() {
    ByteCode byteCode = new ByteCode(1);
    int[] operands = new int[] {1, 2, 3};
    byteCode.setOperandBytes(operands);
    assertEquals(3, byteCode.getByteCodeForm().operandLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes1_Uxpo0_3() {
    ByteCode byteCode = new ByteCode(1);
    int[] operands = new int[] {1, 2, 3};
    byteCode.setOperandBytes(operands);
    assertEquals(1, byteCode.getRewrite()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes1_Uxpo0_4() {
    ByteCode byteCode = new ByteCode(1);
    int[] operands = new int[] {1, 2, 3};
    byteCode.setOperandBytes(operands);
    assertEquals(2, byteCode.getRewrite()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes1_Uxpo0_5() {
    ByteCode byteCode = new ByteCode(1);
    int[] operands = new int[] {1, 2, 3};
    byteCode.setOperandBytes(operands);
    assertEquals(3, byteCode.getRewrite()[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes2_lCOx1_1() {
    ByteCode byteCode = new ByteCode(2);
    int[] operands = new int[] {4, 5, 6};
    byteCode.setOperandBytes(operands);
    assertEquals(2, byteCode.getByteCodeForm().firstOperandIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes2_lCOx1_2() {
    ByteCode byteCode = new ByteCode(2);
    int[] operands = new int[] {4, 5, 6};
    byteCode.setOperandBytes(operands);
    assertEquals(3, byteCode.getByteCodeForm().operandLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes2_lCOx1_3() {
    ByteCode byteCode = new ByteCode(2);
    int[] operands = new int[] {4, 5, 6};
    byteCode.setOperandBytes(operands);
    assertEquals(4, byteCode.getRewrite()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes2_lCOx1_4() {
    ByteCode byteCode = new ByteCode(2);
    int[] operands = new int[] {4, 5, 6};
    byteCode.setOperandBytes(operands);
    assertEquals(5, byteCode.getRewrite()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes2_lCOx1_5() {
    ByteCode byteCode = new ByteCode(2);
    int[] operands = new int[] {4, 5, 6};
    byteCode.setOperandBytes(operands);
    assertEquals(6, byteCode.getRewrite()[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes3_cQsb2_1() {
    ByteCode byteCode = new ByteCode(3);
    int[] operands = new int[] {7, 8, 9};
    byteCode.setOperandBytes(operands);
    assertEquals(3, byteCode.getByteCodeForm().firstOperandIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes3_cQsb2_2() {
    ByteCode byteCode = new ByteCode(3);
    int[] operands = new int[] {7, 8, 9};
    byteCode.setOperandBytes(operands);
    assertEquals(3, byteCode.getByteCodeForm().operandLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes3_cQsb2_3() {
    ByteCode byteCode = new ByteCode(3);
    int[] operands = new int[] {7, 8, 9};
    byteCode.setOperandBytes(operands);
    assertEquals(7, byteCode.getRewrite()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes3_cQsb2_4() {
    ByteCode byteCode = new ByteCode(3);
    int[] operands = new int[] {7, 8, 9};
    byteCode.setOperandBytes(operands);
    assertEquals(8, byteCode.getRewrite()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes3_cQsb2_5() {
    ByteCode byteCode = new ByteCode(3);
    int[] operands = new int[] {7, 8, 9};
    byteCode.setOperandBytes(operands);
    assertEquals(9, byteCode.getRewrite()[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes4_PVPA3_1() {
    ByteCode byteCode = new ByteCode(4);
    int[] operands = new int[] {10, 11, 12};
    byteCode.setOperandBytes(operands);
    assertEquals(4, byteCode.getByteCodeForm().firstOperandIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes4_PVPA3_2() {
    ByteCode byteCode = new ByteCode(4);
    int[] operands = new int[] {10, 11, 12};
    byteCode.setOperandBytes(operands);
    assertEquals(3, byteCode.getByteCodeForm().operandLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes4_PVPA3_3() {
    ByteCode byteCode = new ByteCode(4);
    int[] operands = new int[] {10, 11, 12};
    byteCode.setOperandBytes(operands);
    assertEquals(10, byteCode.getRewrite()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes4_PVPA3_4() {
    ByteCode byteCode = new ByteCode(4);
    int[] operands = new int[] {10, 11, 12};
    byteCode.setOperandBytes(operands);
    assertEquals(11, byteCode.getRewrite()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes4_PVPA3_5() {
    ByteCode byteCode = new ByteCode(4);
    int[] operands = new int[] {10, 11, 12};
    byteCode.setOperandBytes(operands);
    assertEquals(12, byteCode.getRewrite()[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByte_xsZT0_1() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, 0);
    assertEquals(1, byteCode.getByteCodeForm().firstOperandIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByte_xsZT0_2() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, 0);
    assertEquals(1, byteCode.getByteCodeForm().operandLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByte_xsZT0_3() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, 0);
    assertEquals(1, byteCode.getRewrite()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByteWithNegativePosition_vXSo1_1() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, -1);
    assertEquals(1, byteCode.getByteCodeForm().firstOperandIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByteWithNegativePosition_vXSo1_2() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, -1);
    assertEquals(1, byteCode.getByteCodeForm().operandLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByteWithNegativePosition_vXSo1_3() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, -1);
    assertEquals(1, byteCode.getRewrite()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByteWithPositionOutOfBounds_DZlb2_1() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, 2);
    assertEquals(1, byteCode.getByteCodeForm().firstOperandIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByteWithPositionOutOfBounds_DZlb2_2() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, 2);
    assertEquals(1, byteCode.getByteCodeForm().operandLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByteWithPositionOutOfBounds_DZlb2_3() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setOperandByte(1, 2);
    assertEquals(1, byteCode.getRewrite()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions1_EYfA0_1() {
    ByteCode byteCode = new ByteCode(1);
    int[][] nestedPositions = byteCode.getNestedPositions();
    assertEquals(1, nestedPositions.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions1_EYfA0_2() {
    ByteCode byteCode = new ByteCode(1);
    int[][] nestedPositions = byteCode.getNestedPositions();
    assertEquals(1, nestedPositions[0].length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions1_EYfA0_3() {
    ByteCode byteCode = new ByteCode(1);
    int[][] nestedPositions = byteCode.getNestedPositions();
    assertEquals(1, nestedPositions[0][0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions2_zatj1_1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[][] nestedPositions = byteCode.getNestedPositions();
    assertEquals(1, nestedPositions.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions2_zatj1_2() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[][] nestedPositions = byteCode.getNestedPositions();
    assertEquals(0, nestedPositions[0].length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_invalid_Iagb4_1() {
    ByteCode byteCode = new ByteCode(1);
    ClassFileEntry[] nested = byteCode.getNestedClassFileEntries();
    assertNotNull(nested);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeTargets1_KXdn0_1() {
    ByteCode byteCode = new ByteCode(1);
    int[] byteCodeTargets = byteCode.getByteCodeTargets();
    assertEquals(1, byteCodeTargets.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetByteCodeTargets1_KXdn0_2() {
    ByteCode byteCode = new ByteCode(1);
    int[] byteCodeTargets = byteCode.getByteCodeTargets();
    assertEquals(1, byteCodeTargets[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPosition2_wiXx1_xygz0() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[][] nestedPositions = byteCode.getNestedPositions();
    assertEquals(0, nestedPositions.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeIndexWithNested_ccjK1_hYJB0() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    byteCode.setByteCodeIndex(10);
    assertEquals(10, byteCode.getByteCodeIndex());
}
}