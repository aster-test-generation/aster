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
    public void testGetSuffix1_ORtL0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader("Hello World"), 1, 1);
        char[] suffix = scs.GetSuffix(5);
        assertArrayEquals(new char[]{'H', 'e', 'l', 'l', 'o'}, suffix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSuffix2_HNwo1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("Hello World".getBytes()), 1, 1, 10);
        scs.bufpos = 5;
        char[] suffix = scs.GetSuffix(5);
        assertArrayEquals(new char[]{'W', 'o', 'r', 'l', 'd'}, suffix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginLine_jFsm0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getBeginLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn1_cerm0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn2_biNP1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 10);
        assertEquals(1, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn3_cVVv2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn4_HBvu3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(0, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn5_idBB4() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(0, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn6_rAlx5() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, scs.getEndColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn1_lIzu0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn2_WDyI1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 1024);
        assertEquals(1, scs.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn3_yuAQ2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeginColumn6_lkJB5() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        assertEquals(1, scs.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine1_QpMW0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine2_oXza1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 10);
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine3_FFPt2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine4_WCnq3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine5_PYWR4() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndLine6_PRaN5() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, scs.getEndLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine1_zINA0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine2_bxyI1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 1024);
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine3_eone2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine4_upHK3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(0, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine5_xSZQ4() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(0, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine6_RuNX5() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_mUWS0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\r');
        assertEquals(1, scs.getLine());
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_pKwi1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\n');
        assertEquals(2, scs.getLine());
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_TBNh2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\t');
        assertEquals(1, scs.getLine());
        assertEquals(9, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Default_iKdw3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('a');
        assertEquals(1, scs.getLine());
        assertEquals(2, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn1_FxSm0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn2_fCaF1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 10);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn3_mwoC2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn4_EVqp3() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn5_QmhH4() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn6_gXcF5() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_mUWS0_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\r');
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_mUWS0_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\r');
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_pKwi1_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\n');
        assertEquals(2, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_pKwi1_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\n');
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_TBNh2_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\t');
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_TBNh2_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\t');
        assertEquals(9, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Default_iKdw3_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('a');
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Default_iKdw3_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('a');
        assertEquals(2, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn4_Xwvg3_UcAl0_1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        scs.adjustBeginLineColumn(8, 9);
        assertEquals(8, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn4_Xwvg3_UcAl0_2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        scs.adjustBeginLineColumn(8, 9);
        assertEquals(9, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuff_WrapAroundTrue_rDmo0_XeIA0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        scs.ExpandBuff(true);
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuff_WrapAroundTrue_rDmo0_auKv1() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        scs.ExpandBuff(true);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn2_txMI1_VcvA0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[]{}), 1, 1, 10);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn3_zkVD2_OCoW0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[]{}), 1, 1);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuff_WrapAroundFalse_HPHM1_oSwF0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        scs.ExpandBuff(false);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn6_SmSv5_fWnZ0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[]{}));
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFillBuff2_Pkld1_LWuJ0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1, 10);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn_oRSX0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFillBuff3_cLmf2_ssJL0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadChar4_eYHB3_McHj0() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[]{(byte) 'b'}), 1, 1);
        int c = scs.getColumn();
        assertEquals(1, c);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn3_cVVv2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1);
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn4_HBvu3_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(-1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEndColumn5_idBB4_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(-1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine2_bxyI1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 1024);
        assertEquals(-1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine4_upHK3_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()));
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine5_xSZQ4_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine6_RuNX5_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1024);
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_mUWS0_1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\r');
        assertEquals(0, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_CR_mUWS0_2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\r');
        assertEquals(0, scs.getLine());
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_pKwi1_1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\n');
        assertEquals(1, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_LF_pKwi1_2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\n');
        assertEquals(0, scs.getLine());
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_TBNh2_1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(" "));
        scs.UpdateLineColumn('\t');
        assertEquals(0, scs.getLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Tab_TBNh2_2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('\t');
        assertEquals(1, scs.getLine());
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumn_Default_iKdw3_2_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
        scs.UpdateLineColumn('a');
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn1_FxSm0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn2_fCaF1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream("".getBytes()), 1, 1, 10);
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn6_gXcF5_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 10);
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuff_WrapAroundTrue_rDmo0_XeIA0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        scs.buffer = new char[1];
        scs.ExpandBuff(true);
        assertNotNull(scs.buffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuff_WrapAroundFalse_HPHM1_oSwF0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        scs.ExpandBuff(false);
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFillBuff2_Pkld1_LWuJ0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1, 10);
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn_oRSX0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetColumn_sFdm1_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFillBuff3_cLmf2_ssJL0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        assertEquals(0, scs.getColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadChar4_eYHB3_McHj0_fid2() {
        SimpleCharStream scs = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[]{(byte) 'b'}), 1, 1);
        int c = scs.getLine();
        assertEquals(1, c);
    }
}