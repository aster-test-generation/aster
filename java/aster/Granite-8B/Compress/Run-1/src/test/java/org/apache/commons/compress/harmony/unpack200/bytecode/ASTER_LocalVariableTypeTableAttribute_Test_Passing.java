/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalVariableTypeTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testRenumber1_mamJ0() throws Pack200Exception {
		final int localVariableTypeTableLength = 0;
		final int[] startPcs = new int[0];
		final int[] lengths = new int[0];
		final CPUTF8[] names = new CPUTF8[0];
		final CPUTF8[] signatures = new CPUTF8[0];
		final int[] indexes = new int[0];
		final List<Integer> byteCodeOffsets = new ArrayList<>();
		final LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(localVariableTypeTableLength, startPcs, lengths, names, signatures, indexes);
		attribute.renumber(byteCodeOffsets);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testRenumber2_NuyB1() throws Pack200Exception {
		final int localVariableTypeTableLength = 1;
		final int[] startPcs = new int[1];
		final int[] lengths = new int[1];
		final CPUTF8[] names = new CPUTF8[1];
		final CPUTF8[] signatures = new CPUTF8[1];
		final int[] indexes = new int[1];
		final List<Integer> byteCodeOffsets = new ArrayList<>();
		byteCodeOffsets.add(0);
		final LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(localVariableTypeTableLength, startPcs, lengths, names, signatures, indexes);
		attribute.renumber(byteCodeOffsets);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStartPCs_HAGr0_iFmF0() {
        CPUTF8 cpUTF8Value = new CPUTF8("attributeName");
        LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(1, new int[]{1, 2, 3}, new int[]{1, 1, 1}, new CPUTF8[]{new CPUTF8("name1"), new CPUTF8("name2"), new CPUTF8("name3")}, new CPUTF8[]{new CPUTF8("signature1"), new CPUTF8("signature2"), new CPUTF8("signature3")}, new int[]{1, 2, 3});
        int[] startPCs = attribute.getStartPCs();
        assert startPCs.length == 3;
        assert startPCs[0] == 1;
        assert startPCs[1] == 2;
        assert startPCs[2] == 3;
    }
}