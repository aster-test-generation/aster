/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeprecatedAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_pLCy0() {
        DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
        assertEquals("Deprecated Attribute", deprecatedAttribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLength_MWws0() {
        DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
        int length = deprecatedAttribute.getLength();
        assertEquals(0, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testWriteBody_fKjR0() throws IOException {
		DataOutputStream dos = mock(DataOutputStream.class);
		DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
		deprecatedAttribute.writeBody(dos);
		verify(dos).writeByte(14);
	}
}