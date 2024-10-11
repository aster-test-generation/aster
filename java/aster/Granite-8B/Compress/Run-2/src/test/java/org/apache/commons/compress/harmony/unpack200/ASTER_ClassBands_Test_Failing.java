/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;
public class Aster_ClassBands_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_vnIj0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] codeHandlerStartP = classBands.getCodeHandlerStartP();
        assertNotNull(codeHandlerStartP);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldAttributes_BkYI0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] fieldAttributes = classBands.getFieldAttributes();
        assertNotNull(fieldAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testUnpack_WcOH0() {
		Segment segment = new Segment();
		ClassBands classBands = new ClassBands(segment);
		classBands.unpack();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodAttributes_wPAy0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[][] methodAttributes = classBands.getMethodAttributes();
        assertNotNull(methodAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxNALocals_orhR1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] codeMaxNALocals = classBands.getCodeMaxNALocals();
        assertNotNull(codeMaxNALocals);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerCount_iZqn1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] codeHandlerCount = classBands.getCodeHandlerCount();
        assertNotNull(codeHandlerCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassFieldCount_kcaI0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] classFieldCount = classBands.getClassFieldCount();
        assertEquals(0, classFieldCount.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_uRlZ0_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] methodDescrInts = classBands.getMethodDescrInts();
        for (int[] ints : methodDescrInts) {
        }
        assertNotNull(methodDescrInts);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_uRlZ0_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] methodDescrInts = classBands.getMethodDescrInts();
        for (int[] ints : methodDescrInts) {
        }
        assertTrue(methodDescrInts.length > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMajor_GUlY0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[] result = classBands.getClassVersionMajor();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerEndPO_SRBu1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] codeHandlerEndPO = classBands.getCodeHandlerEndPO();
        assertNotNull(codeHandlerEndPO);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_KCMu0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        boolean[] codeHasAttributes = classBands.getCodeHasAttributes();
        assertNotNull(codeHasAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_pvXr0() throws IOException, Pack200Exception {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        InputStream in = mock(InputStream.class);
        when(in.read()).thenReturn(1);
        when(in.available()).thenReturn(1);
        classBands.read(in);
        verify(in, times(1)).read();
        verify(in, times(1)).available();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_mbvs0() throws IOException, Pack200Exception {
        final InputStream in = null; // Replace with actual input stream
        final ClassBands classBands = new ClassBands(new Segment());
        classBands.read(in);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldDescrInts_omLl1_1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] fieldDescrInts = classBands.getFieldDescrInts();
        for (int[] array : fieldDescrInts) {
        }
        assertNotNull(fieldDescrInts);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldDescrInts_omLl1_2() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] fieldDescrInts = classBands.getFieldDescrInts();
        for (int[] array : fieldDescrInts) {
        }
        assertTrue(fieldDescrInts.length > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_gSPd0_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] result = classBands.getClassInterfacesInts();
        for (int[] row : result) {
        }
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_gSPd0_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] result = classBands.getClassInterfacesInts();
        for (int[] row : result) {
        }
        assertNotEquals(0, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeHandlerClassRCN_BddC1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] codeHandlerClassRCN = classBands.getCodeHandlerClassRCN();
        assertNotNull(codeHandlerClassRCN);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxStack_DHkJ1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] codeMaxStack = classBands.getCodeMaxStack();
        assertNotNull(codeMaxStack);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodeMaxStackWithNullSegment_KMVV2() {
        ClassBands classBands = new ClassBands(null);
        int[] codeMaxStack = classBands.getCodeMaxStack();
        assertNull(codeMaxStack);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderedCodeAttributes_ckZq0_1() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<List<Attribute>> result = classBands.getOrderedCodeAttributes();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderedCodeAttributes_ckZq0_2() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<List<Attribute>> result = classBands.getOrderedCodeAttributes();
        assertEquals(0, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_ywYD0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        String[][] methodDescr = classBands.getMethodDescr();
        assertNotNull(methodDescr);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassAttributes_IetZ0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<Attribute>[] actualClassAttributes = classBands.getClassAttributes();
        assertNotNull(actualClassAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testUnpack_WcOH0_fid1() {
		Segment segment = new Segment();
		ClassBands classBands = new ClassBands(segment);
		classBands.unpack();
		// Add assertion here
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodDescrInts_uRlZ0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] methodDescrInts = classBands.getMethodDescrInts();
        assertNotNull(methodDescrInts);
        assertTrue(methodDescrInts.length > 0);
        for (int[] ints : methodDescrInts) {
            assertTrue(ints.length > 0);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFieldDescrInts_omLl1() {
        ClassBands classBands = new ClassBands(new Segment());
        int[][] fieldDescrInts = classBands.getFieldDescrInts();
        assertNotNull(fieldDescrInts);
        assertTrue(fieldDescrInts.length > 0);
        for (int[] array : fieldDescrInts) {
            assertTrue(array.length > 0);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassInterfacesInts_gSPd0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        int[][] result = classBands.getClassInterfacesInts();
        assertNotNull(result);
        assertNotEquals(0, result.length);
        for (int[] row : result) {
            assertNotEquals(0, row.length);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderedCodeAttributes_ckZq0() {
        Segment segment = new Segment();
        ClassBands classBands = new ClassBands(segment);
        ArrayList<List<Attribute>> result = classBands.getOrderedCodeAttributes();
        assertNotNull(result);
        assertEquals(0, result.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassVersionMinor_obxE0() {
        ClassBands classBands = new ClassBands(new Segment());
        int[] actual = classBands.getClassVersionMinor();
        int[] expected = {1, 0};
        assertEquals(expected, actual);
    }
}