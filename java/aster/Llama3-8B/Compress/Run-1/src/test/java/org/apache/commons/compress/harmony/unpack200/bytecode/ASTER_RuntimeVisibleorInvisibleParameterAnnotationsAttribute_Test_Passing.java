/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RuntimeVisibleorInvisibleParameterAnnotationsAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntriesEmpty_BSMS1_aaSq0() {
    final CPUTF8 attributeName = new CPUTF8("attributeName", 0);
    final RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] parameterAnnotations = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[0];
    final RuntimeVisibleorInvisibleParameterAnnotationsAttribute attribute = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(attributeName, parameterAnnotations);
    final ClassFileEntry[] result = attribute.getNestedClassFileEntries();
    Assertions.assertArrayEquals(new ClassFileEntry[] {attributeName}, result);
}
}