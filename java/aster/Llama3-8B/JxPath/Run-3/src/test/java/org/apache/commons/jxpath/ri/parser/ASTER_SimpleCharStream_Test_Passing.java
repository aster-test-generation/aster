/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SimpleCharStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSuffix_oVvz0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abcdef"), 1, 1);
        char[] result = stream.GetSuffix(5);
        char[] expected = new char[]{'a', 'b', 'c', 'd', 'e'};
        assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSuffix2_avIj1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abcdef"), 1, 1);
        char[] result = stream.GetSuffix(7);
        char[] expected = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitReaderStartLineStartColumnBufferSize_pJDl0_2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello"), 1, 1, 10);
        stream.ReInit(new java.io.StringReader("World"), 2, 2, 10);
        assertEquals(2, stream.getLine());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitReaderStartLineStartColumnBufferSize_pJDl0_3() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello"), 1, 1, 10);
        stream.ReInit(new java.io.StringReader("World"), 2, 2, 10);
        assertEquals(1, stream.getColumn());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitReaderStartLineStartColumn_EAVm1_2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello"), 1, 1);
        stream.ReInit(new java.io.StringReader("World"), 2, 2);
        assertEquals(2, stream.getLine());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitReaderStartLineStartColumn_EAVm1_3() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello"), 1, 1);
        stream.ReInit(new java.io.StringReader("World"), 2, 2);
        assertEquals(1, stream.getColumn());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitReader_urJu2_2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello"));
        stream.ReInit(new java.io.StringReader("World"));
        assertEquals(1, stream.getLine());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitReader_urJu2_3() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello"));
        stream.ReInit(new java.io.StringReader("World"));
        assertEquals(1, stream.getColumn());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn_RQMQ0() throws Exception {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, simpleCharStream.getEndColumn());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn2_qrDN1() throws Exception {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, simpleCharStream.getEndColumn());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginLine_hxtq0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        assertEquals(1, stream.getBeginLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginLine2_kNVs1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 2, 2);
        assertEquals(2, stream.getBeginLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginLine3_juQL2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 3, 3);
        assertEquals(3, stream.getBeginLine());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn1_rEIN0_1() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(2, simpleCharStream.getBeginLine());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn1_rEIN0_2() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(3, simpleCharStream.getBeginColumn());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn2_BMCw1_1() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.tokenBegin = 5;
    simpleCharStream.bufpos = 5;
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(2, simpleCharStream.getBeginLine());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn2_BMCw1_2() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.tokenBegin = 5;
    simpleCharStream.bufpos = 5;
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(3, simpleCharStream.getBeginColumn());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn3_JKOF2_1() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.tokenBegin = 5;
    simpleCharStream.bufpos = 10;
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(2, simpleCharStream.getBeginLine());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn3_JKOF2_2() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.tokenBegin = 5;
    simpleCharStream.bufpos = 10;
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(3, simpleCharStream.getBeginColumn());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn4_PgeF3_1() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.tokenBegin = 5;
    simpleCharStream.bufpos = 0;
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(2, simpleCharStream.getBeginLine());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn4_PgeF3_2() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.tokenBegin = 5;
    simpleCharStream.bufpos = 0;
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(3, simpleCharStream.getBeginColumn());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn5_LkWA4_1() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.tokenBegin = 5;
    simpleCharStream.bufpos = 5;
    simpleCharStream.bufline = new int[] {1, 1, 1, 1, 2};
    simpleCharStream.bufcolumn = new int[] {1, 2, 3, 4, 5};
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(2, simpleCharStream.getBeginLine());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdjustBeginLineColumn5_LkWA4_2() throws Exception {
    SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    simpleCharStream.tokenBegin = 5;
    simpleCharStream.bufpos = 5;
    simpleCharStream.bufline = new int[] {1, 1, 1, 1, 2};
    simpleCharStream.bufcolumn = new int[] {1, 2, 3, 4, 5};
    simpleCharStream.adjustBeginLineColumn(2, 3);
    assertEquals(3, simpleCharStream.getBeginColumn());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImageBufposGreaterThanOrEqualToTokenBegin_JNpn0() throws Exception {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello"), 1, 1);
        String result = simpleCharStream.GetImage();
        assertEquals("Hello", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImageBufposLessThanTokenBegin_IJWm1() throws Exception {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello"), 1, 2);
        String result = simpleCharStream.GetImage();
        assertEquals("He", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_BRfU0() throws Exception {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.ByteArrayInputStream("Hello, World!".getBytes()), 1, 1);
        simpleCharStream.ReInit(new java.io.ByteArrayInputStream("Hello, World!".getBytes()), 2, 2, 4096);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitWithNegativeBufferSize_HMVM2() throws Exception {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.ByteArrayInputStream("Hello, World!".getBytes()), 1, 1);
        try {
            simpleCharStream.ReInit(new java.io.ByteArrayInputStream("Hello, World!".getBytes()), 2, 2, -1);
        } catch (Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_DbIr0() throws Exception {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        simpleCharStream.ReInit(new java.io.ByteArrayInputStream(new byte[0]));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitWithBufferSize_MFUN1() throws Exception {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1, 4096);
        simpleCharStream.ReInit(new java.io.ByteArrayInputStream(new byte[0]));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitWithoutStartLineAndColumn_qOVT3() throws Exception {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]));
        simpleCharStream.ReInit(new java.io.ByteArrayInputStream(new byte[0]));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_qpyK0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        stream.ReInit(new java.io.ByteArrayInputStream(new byte[0]), 2, 2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitWithBufferSize_Onro1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        stream.ReInit(new java.io.ByteArrayInputStream(new byte[0]), 2, 2, 4096);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBeginColumn_Ahbn0() throws Exception {
    SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
    int result = stream.getBeginColumn();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineReaderConstructor_Plcq0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, stream.getEndLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineInputStreamConstructor_QYCj1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        assertEquals(1, stream.getEndLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineReaderConstructorWithBufferSize_MBbb2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, stream.getEndLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineInputStreamConstructorWithStartLineAndStartColumn_hfhm3() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1, 10);
        assertEquals(1, stream.getEndLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineInputStreamConstructorWithoutStartLineAndStartColumn_jBVS4() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(1, stream.getEndLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineReaderConstructorWithoutStartLineAndStartColumn_KBVK5() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(1, stream.getEndLine());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine_ZPyH0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        assertEquals(1, stream.getLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine2_emGv1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1, 10);
        assertEquals(1, stream.getLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine4_wdzf3() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"));
        assertEquals(1, stream.getLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn_mcPD0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        assertEquals(1, stream.getColumn());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn2_GMju1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 2);
        assertEquals(2, stream.getColumn());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnCR_XzXa0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc\r"), 1, 1);
        stream.UpdateLineColumn('\r');
        assert stream.getLine() == 1 && stream.getColumn() == 1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnLF_EWCr1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc\n"), 1, 1);
        stream.UpdateLineColumn('\n');
        assert stream.getLine() == 2 && stream.getColumn() == 1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnTab_PBAE2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc\t"), 1, 1);
        stream.UpdateLineColumn('\t');
        assert stream.getLine() == 1 && stream.getColumn() == 8;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnDefault_IGXq3() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1);
        stream.UpdateLineColumn('a');
        assert stream.getLine() == 1 && stream.getColumn() == 2;
    }
}