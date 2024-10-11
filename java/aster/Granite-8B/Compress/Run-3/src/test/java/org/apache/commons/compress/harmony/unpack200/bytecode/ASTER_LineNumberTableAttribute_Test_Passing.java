/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LineNumberTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_pABt0() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
        assertTrue(attribute.equals(attribute));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_qKjG1() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
        assertTrue(!attribute.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_TAiJ0() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, new int[]{1, 2, 3}, new int[]{10, 20, 30});
        assertEquals("LineNumberTable: 10 lines", attribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetStartPCs_rESa0() {
		int[] startPcs = new int[10];
		int[] lineNumbers = new int[10];
		LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, startPcs, lineNumbers);
		int[] result = attribute.getStartPCs();
		assertEquals(startPcs, result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_ZKjx0() {
        LineNumberTableAttribute attribute = new LineNumberTableAttribute(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100});
        assertEquals(106, attribute.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_eUDJ0() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
        lineNumberTableAttribute.resolve(classConstantPool);
    }
}