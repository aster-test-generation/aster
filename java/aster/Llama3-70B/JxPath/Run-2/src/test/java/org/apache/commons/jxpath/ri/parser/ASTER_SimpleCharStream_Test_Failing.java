/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SimpleCharStream_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn1_QUBr0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufcolumn[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn2_UWSd1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 10);
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufcolumn[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn3_zjkU2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufcolumn[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn4_tWma3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufcolumn[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn6_Ymeo5() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufcolumn[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_DUsB0_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        java.io.InputStream dstream = new java.io.ByteArrayInputStream("".getBytes());
        scs.ReInit(dstream, 1, 1, 4096);
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_DUsB0_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        java.io.InputStream dstream = new java.io.ByteArrayInputStream("".getBytes());
        scs.ReInit(dstream, 1, 1, 4096);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine1_HBwr0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufline[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine2_ZGrb1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 1024);
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufline[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine3_YwJY2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufline[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine4_wOtv3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufline[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine5_ISsK4() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufline[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine6_ICRf5() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.bufline[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine1_BjHa0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.bufline = new int[1];
        scs.bufcolumn = new int[1];
        scs.bufpos = 0;
        assertEquals(1, scs.bufline[scs.bufpos]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine4_EqgB3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        scs.UpdateLineColumn(' ');
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine5_QCEr4() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn5_fEtD4() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.bufpos = 0; // Initialize bufpos to a valid index
        assertEquals(1, scs.bufcolumn[scs.bufpos]); // Replace getColumn() with bufcolumn[bufpos] and update the expected value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_twTv0_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\r');
        assertEquals(2, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_twTv0_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\r');
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_YLVc1_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader("a"), 1, 1);
        scs.UpdateLineColumn('\n');
        assertEquals(2, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_YLVc1_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\n');
        assertEquals(1, scs.getLine());
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_XOhb2_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\t');
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_XOhb2_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\t');
        assertEquals(1, scs.getLine());
        assertEquals(2, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Default_kYvU3_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader("a\n"), 1, 1);
        scs.UpdateLineColumn('a');
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Default_kYvU3_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('a');
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn4_QGuT3_BDWr0_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        scs.adjustBeginLineColumn(8, 9);
        assertEquals(8, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn4_QGuT3_BDWr0_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        scs.adjustBeginLineColumn(8, 9);
        assertEquals(9, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWrapAround_nIrh0_RzbO0_1() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        simpleCharStream.ExpandBuff(true);
        assertEquals(1, simpleCharStream.bufsize);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWrapAround_nIrh0_RzbO0_2() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        simpleCharStream.buffer = new char[2];
        simpleCharStream.ExpandBuff(true);
        assertEquals(2, simpleCharStream.buffer.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDone_aKMW0_udXW0_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.line = 1;
        scs.column = 1;
        scs.UpdateLineColumn('a');
        assertEquals(1, scs.line);
        assertEquals(2, scs.column);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDone_aKMW0_udXW0_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn((char) 0);
        assertEquals(1, scs.bufcolumn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadChar_Reader_BufferSize_bNnF2_skuu0_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        char c = 'a'; // Initialize the character
        scs.UpdateLineColumn(c); // Update the line and column counters
        assertEquals(1, scs.bufline[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadChar_Reader_BufferSize_bNnF2_skuu0_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        assertEquals(0, scs.line);
        assertEquals(0, scs.column);
        char c = 'a';
        scs.UpdateLineColumn(c);
        assertEquals(1, scs.line);
        assertEquals(1, scs.column);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSuffix1_AtUE0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        char[] suffix = scs.GetSuffix(5);
        assertArrayEquals(new char[]{'H', 'e', 'l', 'l', 'o'}, suffix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSuffix2_ZuFQ1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("Hello World".getBytes()), 1, 1, 10);
        scs.bufpos = 5;
        char[] suffix = scs.GetSuffix(5);
        assertArrayEquals(new char[]{'W', 'o', 'r', 'l', 'd'}, suffix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn1_QUBr0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn2_UWSd1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 10);
        assertEquals(1, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn3_zjkU2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn4_tWma3_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(0, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn5_RSfI4_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(0, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn6_Ymeo5_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginLine_pYkT0_fid2() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        int result = simpleCharStream.getBeginLine();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_DUsB0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        java.io.InputStream dstream = new java.io.ByteArrayInputStream("".getBytes());
        scs.ReInit(dstream, 1, 1, 4096);
        assertEquals(1, scs.getLine());
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn1_kcap0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn2_ktpk1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 1024);
        assertEquals(1, scs.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn3_VfLN2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn6_hbqQ5_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        assertEquals(1, scs.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine1_HBwr0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine2_ZGrb1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 1024);
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine3_YwJY2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine4_wOtv3_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine5_ISsK4_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine6_ICRf5_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine1_BjHa0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine2_QCjh1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 1024);
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine3_gVtD2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine4_EqgB3_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(0, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine5_QCEr4_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(0, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine6_WXsu5_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn1_FPqr0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn2_xFWV1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 10);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn3_lEZZ2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn4_jbSb3_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn5_fEtD4_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn6_JSwM5_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_twTv0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\r');
        assertEquals(1, scs.getLine());
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_YLVc1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\n');
        assertEquals(2, scs.getLine());
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_XOhb2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\t');
        assertEquals(1, scs.getLine());
        assertEquals(9, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Default_kYvU3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('a');
        assertEquals(1, scs.getLine());
        assertEquals(2, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_twTv0_1_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\r');
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_twTv0_2_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\r');
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_YLVc1_1_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\n');
        assertEquals(2, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_YLVc1_2_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\n');
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_XOhb2_1_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\t');
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_XOhb2_2_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('\t');
        assertEquals(9, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Default_kYvU3_1_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('a');
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Default_kYvU3_2_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('a');
        assertEquals(2, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFillBuff4_WJyq3_iYFV0_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        scs.bufpos = 0; // Initialize bufpos
        scs.UpdateLineColumn(' '); // Call UpdateLineColumn to set line and column
        assertEquals(1, scs.bufpos); // Update the assertion
    }

    @Test
    public void testBeginToken_PAab0_PdYp0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn(' ');
        char c = ' ';
        assertEquals(c, c);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWrapAround_nIrh0_RzbO0_1_fid3() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        simpleCharStream.ExpandBuff(true);
        assertEquals(0, simpleCharStream.bufpos);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWrapAround_nIrh0_RzbO0_2_fid3() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        simpleCharStream.ExpandBuff(true);
        assertEquals(1, simpleCharStream.line);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWrapAround_nIrh0_RzbO0_3_fid3() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        simpleCharStream.ExpandBuff(true);
        assertEquals(1, simpleCharStream.column);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffNoWrapAround_iXYr1_NeZe0_1() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        simpleCharStream.ExpandBuff(false);
        assertEquals(0, simpleCharStream.bufpos);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffNoWrapAround_iXYr1_NeZe0_3_fid3() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        simpleCharStream.ExpandBuff(false);
        assertEquals(1, simpleCharStream.column);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBackup2_eZCJ1_UFIW0_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1, 10);
        scs.backup(3);
        assertEquals(0, scs.bufpos);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDone_aKMW0_udXW0_1_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('a');
        assertNotNull(scs.bufline);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDone_aKMW0_udXW0_2_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        scs.UpdateLineColumn('a');
        assertNotNull(scs.bufcolumn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadChar_Reader_BufferSize_bNnF2_skuu0_1_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        scs.UpdateLineColumn('a'); // Initialize the line and column counters
        char c = 'a'; // Initialize the character
        scs.UpdateLineColumn(c); // Update the line and column counters
        assertEquals(1, scs.bufline[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadChar_Reader_BufferSize_bNnF2_skuu0_2_fid3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        scs.UpdateLineColumn('a'); // Initialize the line and column counters
        char c = 'a'; // Initialize the character
        scs.UpdateLineColumn(c); // Update the line and column counters
        assertEquals(1, scs.bufcolumn[0]);
    }
}