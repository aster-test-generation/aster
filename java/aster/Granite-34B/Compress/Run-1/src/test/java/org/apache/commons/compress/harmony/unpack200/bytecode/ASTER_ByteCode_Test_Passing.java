/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ByteCode_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteCodeWithNoOperand_yyOJ0() {
        final int opcode = 0x00;
        ByteCode byteCode = ByteCode.getByteCode(opcode);
        assertEquals(0x00, byteCode.getOpcode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteCodeWithOperand_Uqoq1() {
        final int opcode = 0x01;
        ByteCode byteCode = ByteCode.getByteCode(opcode);
        assertEquals(0x01, byteCode.getOpcode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteCodeWithMaxOperand_TIiu2() {
        final int opcode = 0xFF;
        ByteCode byteCode = ByteCode.getByteCode(opcode);
        assertEquals(0xFF, byteCode.getOpcode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_zzyC0() {
        ByteCode byteCode = new ByteCode(1);
        int actual = byteCode.hashCode();
        int expected = byteCode.objectHashCode();
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNested_WtQk1() {
        ClassFileEntry[] nested = new ClassFileEntry[1];
        ByteCode byteCode = new ByteCode(1, nested);
        int actual = byteCode.hashCode();
        int expected = byteCode.objectHashCode();
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRewrite_vTXJ0() {
        final int opcode = 0;
        final ClassFileEntry[] nested = new ClassFileEntry[0];
        final ByteCode byteCode = new ByteCode(opcode, nested);
        final int[] rewrite = new int[0];
        byteCode.setRewrite(rewrite);
        assertEquals(rewrite, byteCode.getRewrite());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRewriteWithNullParameter_gGcC1() {
        final int opcode = 0;
        final ClassFileEntry[] nested = new ClassFileEntry[0];
        final ByteCode byteCode = new ByteCode(opcode, nested);
        final int[] rewrite = null;
        byteCode.setRewrite(rewrite);
        assertEquals(rewrite, byteCode.getRewrite());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRewriteWithValidParameter_npFp3() {
        final int opcode = 0;
        final ClassFileEntry[] nested = new ClassFileEntry[0];
        final ByteCode byteCode = new ByteCode(opcode, nested);
        final int[] rewrite = new int[] {1, 2, 3};
        byteCode.setRewrite(rewrite);
        assertEquals(rewrite, byteCode.getRewrite());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRewriteWithInvalidParameter_XwVB4() {
        final int opcode = 0;
        final ClassFileEntry[] nested = new ClassFileEntry[0];
        final ByteCode byteCode = new ByteCode(opcode, nested);
        final int[] rewrite = new int[] {-1, -2, -3};
        byteCode.setRewrite(rewrite);
        assertEquals(rewrite, byteCode.getRewrite());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRewriteWithNegativeParameter_qFax5() {
        final int opcode = 0;
        final ClassFileEntry[] nested = new ClassFileEntry[0];
        final ByteCode byteCode = new ByteCode(opcode, nested);
        final int[] rewrite = new int[] {-1};
        byteCode.setRewrite(rewrite);
        assertEquals(rewrite, byteCode.getRewrite());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRewriteWithPositiveParameter_ZdVi6() {
        final int opcode = 0;
        final ClassFileEntry[] nested = new ClassFileEntry[0];
        final ByteCode byteCode = new ByteCode(opcode, nested);
        final int[] rewrite = new int[] {1};
        byteCode.setRewrite(rewrite);
        assertEquals(rewrite, byteCode.getRewrite());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRewriteWithZeroParameter_NBqR7() {
        final int opcode = 0;
        final ClassFileEntry[] nested = new ClassFileEntry[0];
        final ByteCode byteCode = new ByteCode(opcode, nested);
        final int[] rewrite = new int[] {0};
        byteCode.setRewrite(rewrite);
        assertEquals(rewrite, byteCode.getRewrite());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoWrite_ZLEz0() throws IOException {
        ByteCode bytecode = new ByteCode(1);
        DataOutputStream dos = new DataOutputStream(System.out);
        bytecode.doWrite(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEqualsWithDifferentObject_bSZF1() {
        ByteCode bytecode = new ByteCode(1);
        Object obj1 = new Object();
        Object obj2 = new Object();
        boolean result = bytecode.equals(obj1);
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOperandManager_NPhM0() {
        final int[] bcCaseCount = new int[10];
        final int[] bcCaseValue = new int[10];
        final int[] bcByte = new int[10];
        final int[] bcShort = new int[10];
        final int[] bcLocal = new int[10];
        final int[] bcLabel = new int[10];
        final int[] bcIntRef = new int[10];
        final int[] bcFloatRef = new int[10];
        final int[] bcLongRef = new int[10];
        final int[] bcDoubleRef = new int[10];
        final int[] bcStringRef = new int[10];
        final int[] bcClassRef = new int[10];
        final int[] bcFieldRef = new int[10];
        final int[] bcMethodRef = new int[10];
        final int[] bcIMethodRef = new int[10];
        final int[] bcThisField = new int[10];
        final int[] bcSuperField = new int[10];
        final int[] bcThisMethod = new int[10];
        final int[] bcSuperMethod = new int[10];
        final int[] bcInitRef = new int[10];
        final int[] wideByteCodes = new int[10];
        OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_ZzQn2() {
        Segment segment = new Segment();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNestedClassFileEntriesTest_cKhd0() {
        ClassFileEntry[] nested = new ClassFileEntry[10];
        ByteCode bytecode = new ByteCode(1, nested);
        ClassFileEntry[] result = bytecode.getNestedClassFileEntries();
        assertEquals(nested, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNestedClassFileEntriesTest2_TDPI1() {
        ClassFileEntry[] nested = new ClassFileEntry[20];
        ByteCode bytecode = new ByteCode(2, nested);
        ClassFileEntry[] result = bytecode.getNestedClassFileEntries();
        assertEquals(nested, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGet_uwlP1() {
        int opcode = 1;
        ByteCodeForm byteCodeForm = ByteCodeForm.get(opcode);
        assertNotNull(byteCodeForm);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNestedPositions_rSGR0() {
        ByteCode byteCode = new ByteCode(1);
        int[][] nestedPositions = new int[1][1];
        byteCode.setNestedPositions(nestedPositions);
        assertEquals(nestedPositions, byteCode.getNestedPositions());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNestedPositionsWithNull_rhXM1() {
        ByteCode byteCode = new ByteCode(1);
        byteCode.setNestedPositions(null);
        assertEquals(null, byteCode.getNestedPositions());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpcode_jDKm0() {
        ByteCode byteCode = new ByteCode(1);
        int opcode = byteCode.getOpcode();
        assert opcode == 1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpcodeWithNestedClasses_INmN1() {
        ClassFileEntry[] nested = new ClassFileEntry[1];
        ByteCode byteCode = new ByteCode(2, nested);
        int opcode = byteCode.getOpcode();
        assert opcode == 2;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEntries_vmPq1() {
        ClassConstantPool pool = new ClassConstantPool();
        List<ClassFileEntry> expected = new ArrayList<>();
        List<ClassFileEntry> actual = pool.entries();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_iBgs2() {
        ClassConstantPool pool = new ClassConstantPool();
        Segment segment = new Segment();
        pool.resolve(segment);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSize_kmAj6() {
        ClassConstantPool pool = new ClassConstantPool();
        int expected = 0;
        int actual = pool.size();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_XQyq1() {
        ByteCode bytecode = new ByteCode(1);
        assertEquals(1, bytecode.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEqualsWithSameObject_estf0_fid1() {
        ByteCode bytecode = new ByteCode(1);
        Object obj = new Object();
        boolean result = bytecode.equals(obj);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteCodeIndexWithNestedClasses_LbHa1_fid1() {
        ClassFileEntry[] nested = new ClassFileEntry[1];
        ByteCode byteCode = new ByteCode(2, nested);
        assertEquals(-1, byteCode.getByteCodeIndex());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasMultipleByteCodes_eKoH0_fid1() {
        ByteCode byteCode = new ByteCode(1);
        assertFalse(byteCode.hasMultipleByteCodes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNestedMustStartClassPool_dpEs0_hAJp1() {
        ByteCode byteCode = new ByteCode(0);
        boolean result = byteCode.nestedMustStartClassPool();
        org.junit.jupiter.api.Assertions.assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNestedMustStartClassPoolWithOpcodeAndNested_lYTM2_gqsX0() {
        ClassFileEntry[] nested = new ClassFileEntry[0];
        ByteCode byteCode = new ByteCode(2, nested);
        boolean result = byteCode.nestedMustStartClassPool();
        org.junit.jupiter.api.Assertions.assertFalse(result);
    }
}