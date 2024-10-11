/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_VariablePointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild1_ZKEI1() throws Exception{
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetImmediateNode2_hZYH1() {
	VariablePointer variablePointer = new VariablePointer(new KeywordVariables("", null), new QName(""));
	variablePointer.getImmediateNode();
}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLength_OXSf0() {
		final VariablePointer variablePointer = new VariablePointer(new QName(""));
		assertEquals(1, variablePointer.getLength());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithThis_WTot0() {
    VariablePointer variablePointer = new VariablePointer(new QName(""));
    assertTrue(variablePointer.equals(variablePointer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithObjectNotVariablePointer_AqFE1() {
    VariablePointer variablePointer = new VariablePointer(new QName(""));
    assertFalse(variablePointer.equals(new Object()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithOtherVariablePointer_SgDl2() {
    VariablePointer variablePointer1 = new VariablePointer(new QName(""));
    VariablePointer variablePointer2 = new VariablePointer(new QName(""));
    assertTrue(variablePointer1.equals(variablePointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithoutIndex_pasz1() {
    VariablePointer variablePointer = new VariablePointer(new QName("name"));
    assertEquals("$name", variablePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithActualAndNullNode_MPeY2() {
    VariablePointer variablePointer = new VariablePointer(new KeywordVariables("keyword", null), new QName("name"));
    assertEquals("$name", variablePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithActualAndCollectionNode_nZEB3() {
    VariablePointer variablePointer = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name"));
    assertEquals("$name", variablePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetImmediateNode2_hZYH1_FXsa0() {
	VariablePointer variablePointer = new VariablePointer(new KeywordVariables("", null), new QName(""));
	variablePointer.isActual();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActual_SgDl2_lWVu0() {
    VariablePointer variablePointer1 = new VariablePointer(new QName(""));
    VariablePointer variablePointer2 = new VariablePointer(new QName(""));
    boolean actual = variablePointer1.isActual();
    boolean actual2 = variablePointer2.isActual();
    assertTrue(actual == actual2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetImmediateNode1_hpYi0_AzEt0() {
	QName name = new QName("");
	VariablePointer variablePointer = new VariablePointer(name);
	variablePointer.isActual();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetImmediateNode1_hpYi0_zGVv13() {
	QName name = new QName("");
	VariablePointer variablePointer = new VariablePointer(name);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActual_WAct1_XltL1() {
    VariablePointer variablePointer = new VariablePointer(new QName(""));
    assertFalse(variablePointer.isActual());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActual_WAct2_fBDG2() {
    VariablePointer variablePointer = new VariablePointer(new KeywordVariables("", new Object()), new QName(""));
    assertTrue(variablePointer.isActual());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActual_WAct3_RIFC3() {
    VariablePointer variablePointer = new VariablePointer(new KeywordVariables("", new Object()), new QName("", ""));
    assertTrue(variablePointer.isActual());
}
}