/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMNamespacePointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCompareChildNodePointers_TIrb0() {
		JDOMNamespacePointer nodePointer = new JDOMNamespacePointer(null, null);
		int result = nodePointer.compareChildNodePointers(null, null);
		assertEquals(0, result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEquals_xnKf0() {
		JDOMNamespacePointer JDOMNamespacePointer1 = new JDOMNamespacePointer(null, "prefix");
		JDOMNamespacePointer JDOMNamespacePointer2 = new JDOMNamespacePointer(null, "prefix");
		assertEquals(true, JDOMNamespacePointer1.equals(JDOMNamespacePointer2));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsCollection_VIqp0() {
		JDOMNamespacePointer pointer = new JDOMNamespacePointer(null, null, null);
		boolean isCollection = pointer.isCollection();
		assertFalse(isCollection);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetBaseValue_QpVR0() {
		JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, null, null);
		jDOMNamespacePointer.getBaseValue();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath1_YWEw0() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix");
        jDOMNamespacePointer.asPath();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_jshX1() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix", "namespaceURI");
        jDOMNamespacePointer.asPath();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test1_Hauz0()
	{
	    JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, null, null);
	    assertEquals(1, jDOMNamespacePointer.getLength());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsLeaf_uvlX0() {
		JDOMNamespacePointer JDOMNamespacePointer = new JDOMNamespacePointer(null, null, null);
		boolean leaf = JDOMNamespacePointer.isLeaf();
		assertTrue(leaf);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_isLeaf_A58u0_Ffum1() {
	{
	    JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix");
	    assertTrue(jDOMNamespacePointer.isLeaf());
	}
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_isLeaf_A58u1_tPXk2() {
	{
	    JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix");
	}
}
}