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

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
         
@ExtendWith(MockitoExtension.class)

@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ByteCode_Fixed_Test_Temp {

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperand2BytesWithInvalidPosition_FSCS2() {
    ByteCode byteCode = new ByteCode(1);
    try {
        byteCode.setOperand2Bytes(10, 2);
        fail("Expected an error to be thrown");
    } catch (Error e) {
   
    }
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes_InvalidOperands_VbTv1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] operands = new int[] {1, 2, 3, 4};
    try {
        byteCode.setOperandBytes(operands);
        fail("Expected Error to be thrown");
    } catch (Error e) {
        assertEquals("Trying to rewrite aconst_null that has no rewrite", e.getMessage());
    }
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandBytes_InvalidByteCodeFormLength_aehz2() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] operands = new int[] {1, 2, 3};
    try {
        byteCode.setOperandBytes(operands);
        fail("Expected Error to be thrown");
    } catch (Error e) {
        assertEquals("Trying to rewrite aconst_null that has no rewrite", e.getMessage());
    }
}


@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPool_YLwc0() {
    ByteCode byteCode = new ByteCode(1);
    assertFalse(byteCode.nestedMustStartClassPool());
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPoolWithNested_ppid1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    assertFalse(byteCode.nestedMustStartClassPool());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedMustStartClassPoolWithoutNested_INGE2() {
    ByteCode byteCode = new ByteCode(1);
    assertFalse(byteCode.nestedMustStartClassPool());
}


@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeTargets_Hunp0() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] byteCodeTargets = new int[1];
    byteCode.setByteCodeTargets(byteCodeTargets);
    assertEquals(byteCodeTargets, byteCode.getByteCodeTargets());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeTargetsWithNested_anwH1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[1]);
    int[] byteCodeTargets = new int[1];
    byteCode.setByteCodeTargets(byteCodeTargets);
    assertEquals(byteCodeTargets, byteCode.getByteCodeTargets());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeTargetsWithInvalidOpcode_zYBQ2() {
    ByteCode byteCode = new ByteCode(0, new ClassFileEntry[0]);
    int[] byteCodeTargets = new int[1];
    try {
        byteCode.setByteCodeTargets(byteCodeTargets);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid opcode: 0", e.getMessage());
    }
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeTargetsWithNullByteCodeTargets_zETG3() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    try {
        byteCode.setByteCodeTargets(null);
        assertNull(byteCode.getByteCodeTargets());
    } catch (NullPointerException e) {
        assertEquals("byteCodeTargets cannot be null", e.getMessage());
    }
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeTargetsWithEmptyByteCodeTargets_fIxY4() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] byteCodeTargets = new int[0];
    try {
        byteCode.setByteCodeTargets(byteCodeTargets);
        assertEquals(0, byteCode.getByteCodeTargets().length);
    } catch (IllegalArgumentException e) {
        fail("Unexpected IllegalArgumentException");
    }
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetByteCodeTargetsWithInvalidByteCodeTargets_NNfW5() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] byteCodeTargets = new int[1];
    byteCodeTargets[0] = -1;
    try {
        byteCode.setByteCodeTargets(byteCodeTargets);
        assertEquals("Invalid byte code target: -1", byteCode.getByteCodeTargets()[0]);
    } catch (IllegalArgumentException e) {
        fail("Expected IllegalArgumentException");
    }
}



@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRewrite_qigZ0() {
    ByteCode byteCode = new ByteCode(1);
    int[] rewrite = {1, 2, 3};
    byteCode.setRewrite(rewrite);
    assertArrayEquals(rewrite, byteCode.getRewrite());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRewriteWithNested_oTSn1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] rewrite = {1, 2, 3};
    byteCode.setRewrite(rewrite);
    assertArrayEquals(rewrite, byteCode.getRewrite());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRewriteWithNull_vaCA2() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setRewrite(null);
    assertNull(byteCode.getRewrite());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRewriteWithEmptyArray_Howa3() {
    ByteCode byteCode = new ByteCode(1);
    byteCode.setRewrite(new int[0]);
    assertEquals(0, byteCode.getRewrite().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRewriteWithInvalidOpcode_Sert4() {
    ByteCode byteCode = new ByteCode(0);
    int[] rewrite = {1, 2, 3};
    try {
        byteCode.setRewrite(rewrite);
        assertEquals(rewrite, byteCode.getRewrite());
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid opcode", e.getMessage());
    }
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRewriteWithInvalidNested_jJHU5() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[1]);
    int[] rewrite = {1, 2, 3};
    try {
        byteCode.setRewrite(rewrite);
   
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid nested", e.getMessage());
    }
}


@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperandByteWithInvalidPosition_WnfX2() {
    ByteCode byteCode = new ByteCode(1);
    try {
        byteCode.setOperandByte(1, 10);
        fail("Expected Error");
    } catch (Error e) {
        assertEquals("Trying to rewrite aconst_null that has no rewrite", e.getMessage());
    }
}





@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_ocWf0() {
    ByteCode byteCode = new ByteCode(1);
   
}

@Test
@Timeout(value =-791855072, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithNullNested_hfAj3() {
    ByteCode byteCode = new ByteCode(1, null);
    assertEquals(1, byteCode.hashCode());
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithEmptyNested_FDTX4() {
    ClassFileEntry[] nested = new ClassFileEntry[0];
    ByteCode byteCode = new ByteCode(1, nested);
   
}




@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_ToWx0() {
    ByteCode byteCode = new ByteCode(1);
    assertEquals(1, byteCode.getLength());
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewrite_mRfa0() {
    ByteCode byteCode = new ByteCode(1);
    int[] expected = {1, 2, 3};
    int[] actual = byteCode.getRewrite();
   
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewriteWithNested_GjLP1() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] expected = {1, 2, 3};
    int[] actual = byteCode.getRewrite();
    assertArrayEquals(expected, actual);
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewriteWithInvalidOpcode_BaZC2() {
    ByteCode byteCode = new ByteCode(0);
    int[] expected = {0};
    int[] actual = byteCode.getRewrite();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewriteWithInvalidNested_gfIM3() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] expected = {1, 2, 3};
    int[] actual = byteCode.getRewrite();
    assertArrayEquals(expected, actual);
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewriteWithNullNested_qNkr4() {
    ByteCode byteCode = new ByteCode(1, null);
    int[] expected = {1};
    int[] actual = byteCode.getRewrite();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRewriteWithEmptyNested_ONRG5() {
    ByteCode byteCode = new ByteCode(1, new ClassFileEntry[0]);
    int[] expected = {1};
    int[] actual = byteCode.getRewrite();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_Heyf0() {
    ByteCode byteCode = new ByteCode(1);
    assertTrue(byteCode.equals(byteCode));

}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_WxXN2() {
    ByteCode byteCode = new ByteCode(1);
    assertFalse(byteCode.equals(null));
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_ICHB3() {
    ByteCode byteCode = new ByteCode(1);
    assertFalse(byteCode.equals(new Object()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions1_XQJm0_1() {
    ByteCode byteCode = new ByteCode(1);
    int[][] nestedPositions = byteCode.getNestedPositions();
    assertEquals(1, nestedPositions.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedPositions1_XQJm0_2() {
    ByteCode byteCode = new ByteCode(1);
    int[][] nestedPositions = byteCode.getNestedPositions();
   



















































}
}