/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_VariablePointer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue1_dqIX1() {
	VariablePointer variablePointer = new VariablePointer(new QName(""));
	variablePointer.setValue(new Object());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue2_ISmN2() {
	VariablePointer variablePointer = new VariablePointer(new KeywordVariables("", new Object()), new QName(""));
	variablePointer.setValue(new Object());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollectionWhenValueIsNull_uKVl0() {
    VariablePointer variablePointer = new VariablePointer(null);
    boolean result = variablePointer.isCollection();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetImmediateNode1_hpYi0() {
	VariablePointer variablePointer = new VariablePointer(new QName(""));
	variablePointer.getImmediateNode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsLeaf1_BjLN0() {
		VariablePointer variablePointer = new VariablePointer(new QName(""));
		variablePointer.getNode();
		variablePointer.getNode();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNamespacePointer_fqKY0() {
	VariablePointer variablePointer = new VariablePointer(null, null);
	variablePointer.namespacePointer("name");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove1_BifW1() {
	VariablePointer variablePointer = new VariablePointer(null, null);
	variablePointer.remove();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove8_cbNB8_zSvP0() {
	VariablePointer variablePointer = new VariablePointer(null, null);
	variablePointer.setIndex(3);
	variablePointer.remove();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActual_WAct1_XltL1_fid1() {
    VariablePointer variablePointer = new VariablePointer(new QName(""));
    assertTrue(variablePointer.isActual());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActual_WAct3_RIFC3_fid1() {
    VariablePointer variablePointer = new VariablePointer(new KeywordVariables("", new Object()), new QName("", ""));
    assertFalse(variablePointer.isActual());
}
}