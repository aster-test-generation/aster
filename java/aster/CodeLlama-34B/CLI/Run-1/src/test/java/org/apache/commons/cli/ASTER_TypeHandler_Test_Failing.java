/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFilesWithValidString_ADaV0_1() {
        String string = "file1.txt,file2.txt,file3.txt";
        File[] files = TypeHandler.createFiles(string);
        assertEquals(3, files.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFilesWithValidString_ADaV0_2() {
        String string = "file1.txt,file2.txt,file3.txt";
        File[] files = TypeHandler.createFiles(string);
        assertEquals(3, files.length);
        assertEquals("file1.txt", files[0].getName());
        assertEquals("file2.txt", files[1].getName());
        assertEquals("file3.txt", files[2].getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFilesWithValidString_ADaV0_3() {
        String string = "file1.txt,file2.txt,file3.txt";
        File[] files = TypeHandler.createFiles(string);
        assertEquals("file2.txt", files[1].getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFilesWithValidString_ADaV0_4() {
        String string = "file1.txt,file2.txt,file3.txt";
        File[] files = TypeHandler.createFiles(string);
        assertEquals("file3.txt", files[2].getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFilesWithEmptyString_VZnn2() {
        String string = "";
        File[] files = TypeHandler.createFiles(string);
        assertEquals(0, files.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDate_hTNA0() {
        String string = "2022-01-01";
        Date expected = new Date(2022, 0, 1);
        Date actual = TypeHandler.createDate(string);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDateWithNullString_qJVA2() {
        String string = null;
        try {
            TypeHandler.createDate(string);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            assertEquals("String is null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_NullString_KtRj1() throws ParseException {
        String string = null;
        Class<?> clazz = Integer.class;
        Object result = TypeHandler.createValue(string, clazz);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_InvalidString_acVQ3() throws ParseException {
        String string = "abc";
        Class<?> clazz = Integer.class;
        Object result = TypeHandler.createValue(string, clazz);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithNullClassName_gKbO2() throws ParseException {
        String className = null;
        try {
            TypeHandler.createObject(className);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Class name cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_NullClassName_UNMp2() throws ParseException {
        String className = null;
        try {
            TypeHandler.createClass(className);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Class name cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_PrimitiveType_Wtla6() throws ParseException {
        String className = "int";
        Class<?> expectedClass = Integer.class;
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_ArrayType_Rnjv7() throws ParseException {
        String className = "java.lang.String[]";
        Class<?> expectedClass = String[].class;
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_GenericType_mhjV8() throws ParseException {
        String className = "java.util.List<java.lang.String>";
        Class<?> expectedClass = List.class;
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_WildcardType_apjB9() throws ParseException {
        String className = "java.util.List<? extends java.lang.String>";
        Class<?> expectedClass = List.class;
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_TypeVariable_FNVZ10() throws ParseException {
        String className = "java.util.List<T>";
        Class<?> expectedClass = List.class;
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_AnonymousType_rpNA13() throws ParseException {
        String className = "java.util.List<java.lang.String>$1";
        Class<?> expectedClass = List.class;
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Boolean_vlaT2() throws ParseException {
        String string = "true";
        Class<Boolean> clazz = Boolean.class;
        Boolean expected = true;
        Object actual = TypeHandler.createValue(string, clazz);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Date_HqBR11() throws ParseException {
        String string = "2022-01-01";
        Class<Date> clazz = Date.class;
        Date expected = new Date(2022, 0, 1);
        Date actual = TypeHandler.createValue(string, clazz);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_NullFilePath_tgDv2() throws ParseException {
        String filePath = null;
        try {
            TypeHandler.openFile(filePath);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("File path cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_NestedType_WJFa12_kqQA0() throws ParseException {
        String className = "java.util.List<java.lang.String>.InnerClass";
        Class<?> expectedClass = List.class.getDeclaredClasses()[0];
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_LocalType_Dgnq14_ysor0() throws ParseException {
        String className = "java.util.List<java.lang.String>$1LocalClass";
        Class<?> expectedClass = List.class;
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_MemberType_WAJU15_XCOM0() throws ParseException {
        String className = "java.util.List<java.lang.String>.MemberClass";
        Class<?> expectedClass = List.class.getDeclaredClasses()[0];
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_StaticMemberType_YvOO16_TwHk0() throws ParseException {
        String className = "java.util.List<java.lang.String>.StaticMemberClass";
        Class<?> expectedClass = List.class.getDeclaredClasses()[0];
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_StaticInnerType_XEvi18_EDhx0() throws ParseException {
        String className = "java.util.List<java.lang.String>.StaticInnerClass";
        Class<?> expectedClass = List.class.getDeclaredClasses()[0];
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_trhL0_1_fid1() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertEquals(16, map.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFilesWithValidString_ADaV0_2_fid1() {
        String string = "file1.txt,file2.txt,file3.txt";
        File[] files = TypeHandler.createFiles(string);
        assertEquals("file1.txt", files[0].getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFilesWithInvalidString_eypW1_fid1() {
        String string = "file1.txt,file2.txt,file3.txt";
        File[] files = TypeHandler.createFiles(string);
        assertEquals(0, files.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_NullClass_HsNs2_fid1() throws ParseException {
        String string = "123";
        Class<?> clazz = null;
        Object result = TypeHandler.createValue(string, clazz);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_InvalidClass_Yhbf4_fid1() throws ParseException {
        String string = "123";
        Class<?> clazz = String.class;
        Object result = TypeHandler.createValue(string, clazz);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Class_InvalidStringAndInvalidClass_mtRY8_fid1() throws ParseException {
        String string = "abc";
        Class<?> clazz = String.class;
        Object result = TypeHandler.createValue(string, clazz);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultWithNullConverterMapAndDefaultConstructor_HtnD6_fid1() {
        TypeHandler typeHandler = new TypeHandler(null);
        assertNotNull(typeHandler);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithEmptyClassName_BzJF3_fid1() throws ParseException {
        String className = "";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Class name cannot be empty", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithWhitespaceClassName_nXbg4_fid1() throws ParseException {
        String className = "   ";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Class name cannot be whitespace", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithNonExistentClass_AaBB5_fid1() throws ParseException {
        String className = "com.example.NonExistentClass";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Class not found: com.example.NonExistentClass", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithAbstractClass_kBAp6_fid1() throws ParseException {
        String className = "java.lang.AbstractStringBuilder";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Cannot instantiate abstract class: java.lang.AbstractStringBuilder", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithInterface_DMdP7_fid1() throws ParseException {
        String className = "java.lang.CharSequence";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Cannot instantiate interface: java.lang.CharSequence", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithPrimitiveType_nwXg8_fid1() throws ParseException {
        String className = "int";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Cannot instantiate primitive type: int", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_EmptyClassName_tArt3_fid1() throws ParseException {
        String className = "";
        try {
            TypeHandler.createClass(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Class name cannot be empty", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_WhitespaceClassName_rXNb4_fid1() throws ParseException {
        String className = "   ";
        try {
            TypeHandler.createClass(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Class name cannot be whitespace", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_NonExistentClassName_XluR5_fid1() throws ParseException {
        String className = "non.existent.class.name";
        try {
            TypeHandler.createClass(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Class not found: " + className, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateClass_PrimitiveType_Wtla6_fid1() throws ParseException {
        String className = "int";
        Class<?> expectedClass = int.class;
        Class<?> actualClass = TypeHandler.createClass(className);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_String_Boolean_vlaT2_fid1() throws ParseException {
        String string = "true";
        Class<Boolean> clazz = Boolean.class;
        Boolean expected = true;
        Boolean actual = TypeHandler.createValue(string, clazz);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_InvalidFilePath_kZlb1_fid1() throws ParseException {
        String filePath = "path/to/invalid_file.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Invalid file path: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_EmptyFilePath_lwpW3_fid1() throws ParseException {
        String filePath = "";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File path cannot be empty", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileDoesNotExist_WrXS4_fid1() throws ParseException {
        String filePath = "path/to/file_does_not_exist.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File does not exist: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsDirectory_zgZq5_fid1() throws ParseException {
        String filePath = "path/to/directory";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is a directory: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotReadable_xLUn6_fid1() throws ParseException {
        String filePath = "path/to/file_not_readable.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is not readable: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotWritable_cqjm7_fid1() throws ParseException {
        String filePath = "path/to/file_not_writable.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is not writable: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotExecutable_HHEg8_fid1() throws ParseException {
        String filePath = "path/to/file_not_executable.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is not executable: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotHidden_YAus9_fid1() throws ParseException {
        String filePath = "path/to/file_not_hidden.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is not hidden: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotArchive_bdXg10_fid1() throws ParseException {
        String filePath = "path/to/file_not_archive.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is not an archive: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotSymbolicLink_ISOB11_fid1() throws ParseException {
        String filePath = "path/to/file_not_symbolic_link.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is not a symbolic link: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotSocket_gLkC12_fid1() throws ParseException {
        String filePath = "path/to/file_not_socket.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is not a socket: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotFIFO_GIoO13_fid1() throws ParseException {
        String filePath = "path/to/file_not_fifo.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is not a FIFO: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFile_FileIsNotBlockDevice_UdMl14_fid1() throws ParseException {
        String filePath = "path/to/file_not_block_device.txt";
        try {
            TypeHandler.openFile(filePath);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("File is not a block device: " + filePath, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNumber_NullInput_ThrowsNullPointerException_HOKJ2_iyBc0_fid1() {
        String string = null;
        try {
            TypeHandler.createNumber(string);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            assertTrue(e instanceof NullPointerException);
        } catch (ParseException e) {
            fail("Expected ParseException to be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_trhL0() {
        Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
        assertEquals(16, map.size());
        assertTrue(map.containsKey(Object.class));
        assertTrue(map.containsKey(Class.class));
        assertTrue(map.containsKey(Date.class));
        assertTrue(map.containsKey(File.class));
        assertTrue(map.containsKey(Path.class));
        assertTrue(map.containsKey(Number.class));
        assertTrue(map.containsKey(URL.class));
        assertTrue(map.containsKey(FileInputStream.class));
        assertTrue(map.containsKey(Long.class));
        assertTrue(map.containsKey(Integer.class));
        assertTrue(map.containsKey(Short.class));
        assertTrue(map.containsKey(Byte.class));
        assertTrue(map.containsKey(Character.class));
        assertTrue(map.containsKey(Double.class));
        assertTrue(map.containsKey(Float.class));
        assertTrue(map.containsKey(BigInteger.class));
        assertTrue(map.containsKey(BigDecimal.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObjectWithArrayType_EzeN9() throws ParseException {
        String className = "java.lang.String[]";
        try {
            TypeHandler.createObject(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Cannot instantiate array type: java.lang.String[]", e.getMessage());
        }
    }
}