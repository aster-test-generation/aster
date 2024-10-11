/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CPNameAndType_Test_Passing {
private CPSignature signature;
private CPSignature otherSignature;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_DifferentNameSameSignature_EBiy2_SLQm0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name1 = new org.apache.commons.compress.harmony.pack200.CPUTF8("testMethod1");
    org.apache.commons.compress.harmony.pack200.CPUTF8 name2 = new org.apache.commons.compress.harmony.pack200.CPUTF8("testMethod2");
    CPSignature signature = new CPSignature("LTest;", new org.apache.commons.compress.harmony.pack200.CPUTF8("LTest;"), new ArrayList<>());
    CPNameAndType cpNameAndType1 = new CPNameAndType(name1, signature);
    CPNameAndType cpNameAndType2 = new CPNameAndType(name2, signature);
    int result = cpNameAndType1.compareTo(cpNameAndType2);
    assertTrue(result != 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_mybb0_Hjox0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = new org.apache.commons.compress.harmony.pack200.CPUTF8("ExampleName");
    org.apache.commons.compress.harmony.pack200.CPUTF8 signatureForm = new org.apache.commons.compress.harmony.pack200.CPUTF8("LExampleClass;");
    List<CPClass> classes = new ArrayList<>();
    CPSignature signature = new CPSignature("ExampleSignature", signatureForm, classes);
    CPNameAndType cpNameAndType = new CPNameAndType(name, signature);
    String expected = "ExampleName:ExampleSignature";
    String actual = cpNameAndType.toString();
    assertEquals(expected, actual);
}
}