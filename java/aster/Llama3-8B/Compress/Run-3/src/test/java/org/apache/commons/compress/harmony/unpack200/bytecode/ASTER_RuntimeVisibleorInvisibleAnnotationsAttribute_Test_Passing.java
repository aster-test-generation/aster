/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RuntimeVisibleorInvisibleAnnotationsAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_CHYV0_Bmov0() {
    CPUTF8 attributeName = new CPUTF8("attributeName");
    RuntimeVisibleorInvisibleAnnotationsAttribute.Annotation[] annotations = new RuntimeVisibleorInvisibleAnnotationsAttribute.Annotation[0];
    RuntimeVisibleorInvisibleAnnotationsAttribute attribute = new RuntimeVisibleorInvisibleAnnotationsAttribute(attributeName, annotations);
    String result = attribute.toString();
    assert result.equals("attributeName: 0 annotations");
}
}