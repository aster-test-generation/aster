/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SimpleCharStream_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSuffix_hbbP0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abcdef"), 1, 1);
        char[] result = stream.GetSuffix(5);
        char[] expected = new char[]{' ', 'b', 'c', 'd', 'e'};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSuffix2_hroh1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abcdef"), 1, 1);
        char[] result = stream.GetSuffix(7);
        char[] expected = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn_Fnmd0_1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        stream.adjustBeginLineColumn(3, 3);
        assertEquals(3, stream.getBeginLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn_rWaG0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, stream.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn2_PBDL1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, stream.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn2_ydoN1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 0);
        assertEquals(2, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn3_vXtI2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 0);
        assertEquals(3, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn4_Pcdo3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 0);
        assertEquals(4, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn5_Iumw4() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 0);
        assertEquals(5, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineReaderConstructor_zPQZ0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, stream.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineInputStreamConstructor_WIWB1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        assertEquals(1, stream.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineInputStreamConstructorWithBufferSize_BAcD2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1, 10);
        assertEquals(1, stream.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLineReaderConstructorWithStartLineAndStartColumnAndBufferSize_daGr6() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, stream.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine_dObm0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        assertEquals(1, stream.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine2_Evbt1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1, 10);
        assertEquals(1, stream.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine4_Mpzl3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"));
        assertEquals(1, stream.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn_yMRJ0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn2_HseP1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 2);
        assertEquals(2, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn3_Buld2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 3);
        assertEquals(3, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnCR_WrWM0_1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1);
        stream.UpdateLineColumn('\r');
        assertEquals(1, stream.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnCR_WrWM0_2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1);
        stream.UpdateLineColumn('\r');
        assertEquals(1, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnLF_Brre1_1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1);
        stream.UpdateLineColumn('\n');
        assertEquals(1, stream.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnLF_Brre1_2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1);
        stream.UpdateLineColumn('\n');
        assertEquals(1, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnTab_YeiB2_1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 3);
        stream.UpdateLineColumn('\t');
        assertEquals(1, stream.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnTab_YeiB2_2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 3);
        stream.UpdateLineColumn('\t');
        assertEquals(4, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnDefault_hnCF3_1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 3);
        stream.UpdateLineColumn('a');
        assertEquals(1, stream.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnDefault_hnCF3_2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 3);
        stream.UpdateLineColumn('a');
        assertEquals(4, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWrapAround_xkXh0_QLzZ0_2() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        simpleCharStream.UpdateLineColumn('a');
        assertEquals(2, simpleCharStream.column);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffNoWrapAround_ieJV1_Iqow0_1() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        simpleCharStream.UpdateLineColumn(' ');
        assertEquals(1, simpleCharStream.line);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffNoWrapAround_ieJV1_Iqow0_2() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        simpleCharStream.UpdateLineColumn(' ');
        assertEquals(2, simpleCharStream.column);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSuffix_hbbP0_fid2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abcdef"), 1, 1);
        char[] result = stream.GetSuffix(5);
        char[] expected = new char[]{'a', 'b', 'c', 'd', 'e'};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn_Fnmd0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        stream.adjustBeginLineColumn(2, 3);
        assertEquals(2, stream.getBeginLine());
        assertEquals(3, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginLine_gSTn0_fid2() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, simpleCharStream.getBeginLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginLine2_DgLR1_fid2() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, simpleCharStream.getBeginLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn_AMGe0_fid2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        assertEquals(1, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn2_ydoN1_fid2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 2);
        assertEquals(2, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn3_vXtI2_fid2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 3);
        assertEquals(3, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn4_Pcdo3_fid2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 4);
        assertEquals(4, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn5_Iumw4_fid2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 5);
        assertEquals(5, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnCR_WrWM0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1);
        stream.UpdateLineColumn('\r');
        assertEquals(1, stream.getLine());
        assertEquals(1, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnLF_Brre1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1);
        stream.UpdateLineColumn('\n');
        assertEquals(1, stream.getLine());
        assertEquals(1, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnTab_YeiB2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 3);
        stream.UpdateLineColumn('\t');
        assertEquals(1, stream.getLine());
        assertEquals(4, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnDefault_hnCF3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 3);
        stream.UpdateLineColumn('a');
        assertEquals(1, stream.getLine());
        assertEquals(4, stream.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn_Fnmd0_1_fid3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        stream.adjustBeginLineColumn(2, 3);
        assertEquals(2, stream.getBeginLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWrapAround_xkXh0_QLzZ0_1() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        simpleCharStream.UpdateLineColumn('a');
        assertEquals(1, simpleCharStream.line);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBackup_Xmdw0_hUmv0_1_fid3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        stream.backup(2);
        assertEquals(-2, stream.bufpos);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBackupAtEnd_FrWV1_kOGz0_2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        stream.backup(5);
        assertEquals(6, stream.column);
    }
}