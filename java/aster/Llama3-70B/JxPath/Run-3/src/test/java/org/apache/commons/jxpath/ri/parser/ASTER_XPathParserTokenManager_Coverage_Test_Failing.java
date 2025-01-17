/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XPathParserTokenManager_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_Stream_LexState_ReInitCalled_YmKC0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"));
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.ReInit(stream, 1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken_IOException_Iass0() throws Exception {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("")));
        try {
            tokenManager.getNextToken();
            fail("Expected IOException");
        } catch (TokenMgrError e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextTokenIOException_XMho0() throws Exception {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("")));
        try {
            tokenManager.getNextToken();
            fail("IOException expected");
        } catch (TokenMgrError e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken7_Htju6_UsBZ0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("36"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(17, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken6_YxWa5_DtrA0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("33"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(9, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken8_rtFq7_DmqU0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("40"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(81, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken9_aElt8_rdrE0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("41"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(82, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken14_BevJ13_iCeW0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("46"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(83, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_rHmo16_YkFE0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("60"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(13, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken15_paUZ14_ONpg0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("91"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(85, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken14_XsYD13_Gldf0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("64"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(87, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken6_VffW5_gSFB0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken16_LDsP15_LZPs0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("93"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(86, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken11_IYOt10_KTvz0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("f"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken18_casP17_KtXy0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("62"), 1, 1));
    tokenManager.setDebugStream(System.out);
    tokenManager.getNextToken(); // You need to call getNextToken() at least once before checking the kind
    assertEquals(15, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken7_trmz6_KXfC0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("b"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken8_EKUa7_Cszf0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("c"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken15_rRQZ14_snOz0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("j"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken10_SzUK9_sIlK0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("e"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken13_wcQz12_shDS0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("h"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_JmPv16_CCRY0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("97"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(21, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken18_hoHU17_xDQc0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("98"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(22, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_qZAI16_Dwme0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("l"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken9_jAqj8_YpXY0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("d"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken12_mXIA11_zdzh0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("g"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken16_sjAK15_CiDt0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("k"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken18_maMI17_pTyI0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("m"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(20, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken2_vEYQ1_eZel0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("$"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(81, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken3_rCpq2_oWog0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("("), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(82, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken18_kEnO17_jvDg0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("b"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(98, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_FWaY16_Xead0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(51, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_NHnv16_HRoh0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(97, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken18_rhUs17_XIbh0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("b"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(27, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken18_foWx17_Tlqq0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("div"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(70, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_PMff16_HXfH0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("or"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(69, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken1_EAzy0_kunq0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("!="), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(17, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken12_ecHP11_ljeC0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("pqr"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(800, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken6_JBLd5_hUJs0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader(">"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(16, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken2_dbhW1_euOn0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(84, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken16_nsad15_urke0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(140, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken9_OTtC8_EdAZ0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("ghi"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(24, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken8_GpAW7_dzpz0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("f"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(102, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken7_YUHV6_yNcv0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("e"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(101, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken11_OFtw10_ozon0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("i"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(105, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken8_YEKT7_EQep0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("def"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(27, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testJjMoveStringLiteralDfa1_0_NMXB2_jeEU0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
    tokenManager.curChar = 'a';
    assertEquals(51, tokenManager.curLexState);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken15_ULsN14_dFct0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("yz"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(680, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken11_KPLI10_mFHz0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("mno"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(680, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken6_HAfh5_arLE0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("d"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(100, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken9_uwIC8_xvhk0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("g"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(103, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken5_iESU4_HyHr0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("c"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(99, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken13_juKS12_SKhV0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("stu"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(24, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken12_dejt11_XcHM0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("j"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(106, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken16_efjO15_kwpx0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("n"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(110, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_dnuC16_ZeZh0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("o"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(111, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken15_RcMq14_xNfK0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("m"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(109, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken13_LTLy12_xdyo0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("k"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(107, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken4_Oyfy3_MCnJ0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("$"), 1, 1, 1024));
    tokenManager.setDebugStream(System.out);
    assertEquals(87, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_xuCk16_mRyy0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("and"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(51, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken8_SBsN7_QlAw0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("g"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(23, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken11_XikS10_DvkC0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("j"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(26, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken14_HiGi13_qxLX0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("m"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(29, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken12_nuBC11_uogk0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("k"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(27, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken9_duus8_rmTq0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("h"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(24, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken13_pNox12_tdaG0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("l"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(28, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken10_QueL9_LKnx0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("i"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(25, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken18_etpl17_ohXO0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("p"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(112, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_Xevh16_QgcM0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("every"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(80, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken16_omhj15_MwxZ0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("@"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(64, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken6_NYFQ5_Vnlm0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("def"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(17, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken9_BMDf8_avGt0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("e"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(31, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken12_YPSk11_yEbm0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("h"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(33, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken17_fzAO16_VBEQ0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("m"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(38, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken18_IDlC17_yNZF0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("n"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(39, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken15_ZktH14_xPsI0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("k"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(36, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken16_Qjse15_dUgW0_fid3() throws Exception {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("o"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(31, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken13_wiHB12_jikv0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("i"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(34, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken16_WiJj15_ucTL0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("l"), 1, 1));
    tokenManager.setDebugStream(System.out);
    assertEquals(37, tokenManager.getNextToken().kind);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextToken15_NBqe14_pkFv0_fid3() {
    XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("def456"), 1, 1));
    assertEquals(17, tokenManager.getNextToken().kind);
}
}