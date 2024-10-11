/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CPNameAndType_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNameIndexWithNullName_Gpaf1() {
    CPSignature signature = new CPSignature("signature", null, Collections.emptyList());
    CPNameAndType nameAndType = new CPNameAndType(null, signature);
    assertEquals(0, nameAndType.getNameIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTypeIndexWithNullNameAndSignature_pGCN3_zwrl0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = null;
    CPSignature signature = null;
    CPNameAndType nameAndType = new CPNameAndType(name, signature);
    int typeIndex = nameAndType.getTypeIndex();
    assertEquals(-1, typeIndex);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNameWithNullSignature_RxGM2_yoDB0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = new org.apache.commons.compress.harmony.pack200.CPUTF8("name");
    CPSignature signature = null;
    CPNameAndType nameAndType = new CPNameAndType(name, signature);
    assertNull(nameAndType.getName());
}
}