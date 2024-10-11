/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CPMethodOrField_Test_Passing {
private CPClass className;
private CPNameAndType nameAndType;
private CPMethodOrField cpMethodOrField;
@Mock
    private CPClass mockCPClass;
@Mock
    private CPNameAndType mockCPNameAndType;
    private int indexInClass = -1;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareTo_SameObject() throws Exception {
        className = mock(CPClass.class);
        nameAndType = mock(CPNameAndType.class);
        cpMethodOrField = new CPMethodOrField(className, nameAndType);
        assertEquals(0, cpMethodOrField.compareTo(cpMethodOrField), "Comparing the same object should return 0");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareTo_DifferentClassHigher() throws Exception {
        className = mock(CPClass.class);
        nameAndType = mock(CPNameAndType.class);
        cpMethodOrField = new CPMethodOrField(className, nameAndType);
        CPClass otherClassName = mock(CPClass.class);
        CPNameAndType otherNameAndType = mock(CPNameAndType.class);
        CPMethodOrField otherCPMethodOrField = new CPMethodOrField(otherClassName, otherNameAndType);
        when(className.compareTo(otherClassName)).thenReturn(1);
        assertEquals(1, cpMethodOrField.compareTo(otherCPMethodOrField), "Should return 1 when this className is higher");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareTo_DifferentClassLower() throws Exception {
        className = mock(CPClass.class);
        nameAndType = mock(CPNameAndType.class);
        cpMethodOrField = new CPMethodOrField(className, nameAndType);
        CPClass otherClassName = mock(CPClass.class);
        CPNameAndType otherNameAndType = mock(CPNameAndType.class);
        CPMethodOrField otherCPMethodOrField = new CPMethodOrField(otherClassName, otherNameAndType);
        when(className.compareTo(otherClassName)).thenReturn(-1);
        assertEquals(-1, cpMethodOrField.compareTo(otherCPMethodOrField), "Should return -1 when this className is lower");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareTo_SameClassDifferentNameAndType() throws Exception {
        className = mock(CPClass.class);
        nameAndType = mock(CPNameAndType.class);
        cpMethodOrField = new CPMethodOrField(className, nameAndType);
        CPClass otherClassName = className; // same class name
        CPNameAndType otherNameAndType = mock(CPNameAndType.class);
        CPMethodOrField otherCPMethodOrField = new CPMethodOrField(otherClassName, otherNameAndType);
        when(className.compareTo(otherClassName)).thenReturn(0);
        when(nameAndType.compareTo(otherNameAndType)).thenReturn(1);
        assertEquals(1, cpMethodOrField.compareTo(otherCPMethodOrField), "Should return 1 when nameAndType is higher");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareTo_NonCPMethodOrFieldObject() throws Exception {
        className = mock(CPClass.class);
        nameAndType = mock(CPNameAndType.class);
        cpMethodOrField = new CPMethodOrField(className, nameAndType);
        Object nonCPMethodOrFieldObject = new Object();
        assertEquals(0, cpMethodOrField.compareTo(nonCPMethodOrFieldObject), "Should return 0 when object is not an instance of CPMethodOrField");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndexInClass() throws Exception {
        // Initialization of mocks is handled by MockitoExtension
        int expectedIndex = 5;
        cpMethodOrField.setIndexInClass(expectedIndex);
        // Use reflection to access the private field to verify its value
        Field indexField = CPMethodOrField.class.getDeclaredField("indexInClass");
        indexField.setAccessible(true);
        int actualIndex = (int) indexField.get(cpMethodOrField);
        assertEquals(expectedIndex, actualIndex, "The indexInClass should be updated to the value set.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassName() throws Exception {
        className = mock(CPClass.class);
        nameAndType = mock(CPNameAndType.class);
        cpMethodOrField = new CPMethodOrField(className, nameAndType);
        assertEquals(className, cpMethodOrField.getClassName(), "The getClassName method should return the correct CPClass instance.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString() throws Exception {
        when(className.toString()).thenReturn("MockedClassName");
        when(nameAndType.toString()).thenReturn("MockedNameAndType");
        String expected = "MockedClassName: MockedNameAndType";
        String actual = cpMethodOrField.toString();
        assertEquals(expected, actual, "The toString method should concatenate class name and name and type with a colon and space.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassIndex() throws Exception {
        // Initialize CPMethodOrField with mocked CPClass
        cpMethodOrField = new CPMethodOrField(className, null);
        // Arrange
        int expectedIndex = 5;
        when(className.getIndex()).thenReturn(expectedIndex);
        // Act
        int actualIndex = cpMethodOrField.getClassIndex();
        // Assert
        assertEquals(expectedIndex, actualIndex, "The index returned by getClassIndex should match the mocked value");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDesc() throws Exception {
        className = mock(CPClass.class);
        nameAndType = mock(CPNameAndType.class);
        cpMethodOrField = new CPMethodOrField(className, nameAndType);
        assertEquals(nameAndType, cpMethodOrField.getDesc(), "getDesc should return the correct CPNameAndType instance");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescIndex() throws Exception {
        // Initialize CPMethodOrField with mocked CPNameAndType
        cpMethodOrField = new CPMethodOrField(null, nameAndType);
        // Arrange
        int expectedIndex = 5;
        when(nameAndType.getIndex()).thenReturn(expectedIndex);
        // Act
        int actualIndex = cpMethodOrField.getDescIndex();
        // Assert
        assertEquals(expectedIndex, actualIndex, "The index returned by getDescIndex should match the mocked value");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexInClass() throws Exception {
        // Mocking dependencies
        CPClass mockCPClass = mock(CPClass.class);
        CPNameAndType mockCPNameAndType = mock(CPNameAndType.class);
        // Creating the instance of CPMethodOrField
        cpMethodOrField = new CPMethodOrField(mockCPClass, mockCPNameAndType);
        // Using reflection to set the private field 'indexInClassForConstructor'
        java.lang.reflect.Field field = CPMethodOrField.class.getDeclaredField("indexInClassForConstructor");
        field.setAccessible(true);
        field.setInt(cpMethodOrField, 5); // Setting a test value
        // Act
        int result = cpMethodOrField.getIndexInClass();
        // Assert
        assertEquals(5, result, "The index in class should match the set value.");
    }
}