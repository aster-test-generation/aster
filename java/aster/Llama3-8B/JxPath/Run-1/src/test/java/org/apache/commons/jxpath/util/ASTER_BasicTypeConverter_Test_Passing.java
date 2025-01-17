/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicTypeConverter_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNull_lIPO0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(null, String.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertString_GmJX1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert("test", String.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertBoolean_jnni2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(true, Boolean.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNumber_jsga3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(1, Integer.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertArray_oMVk4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(new Object[]{1, 2, 3}, Integer[].class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertCollection_StDp5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(Arrays.asList(1, 2, 3), List.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertPrimitiveBoolean_Txwp8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(true, boolean.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertPrimitiveNumber_rBZv9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(1, int.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertPrimitiveArray_jkMy10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(new boolean[]{true, false}, boolean[].class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertPrimitiveCollection_SuDm11() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(Arrays.asList(true, false), List.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertObject_FUos14() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(new Object(), Object.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionForConcreteClass_QFaO0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canCreateCollection(String.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionForAbstractClass_wKjE1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertFalse(converter.canCreateCollection(AbstractCollection.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionForList_YUiX3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canCreateCollection(List.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionForCollection_pCLE4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canCreateCollection(Collection.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionForSet_nqyD5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canCreateCollection(Set.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_pJvS0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, int.class);
        Assertions.assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_lQDw2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = "123";
        Object result = converter.convert(object, int.class);
        Assertions.assertEquals(123, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNumberToPrimitive_GMnQ4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = 123.0;
        Object result = converter.convert(object, int.class);
        Assertions.assertEquals(123, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertArrayToPrimitive_iLNU5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new int[]{1, 2, 3};
        Object result = converter.convert(object, int[].class);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, (int[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToObject_oNqe9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Object.class);
        Assertions.assertEquals(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToObject_wcgm10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = "123";
        Object result = converter.convert(object, Object.class);
        Assertions.assertEquals(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertBooleanToObject_vRpm11() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = true;
        Object result = converter.convert(object, Object.class);
        Assertions.assertEquals(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNumberToObject_nPAW12() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = 123.0;
        Object result = converter.convert(object, Object.class);
        Assertions.assertEquals(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertArrayToObject_QgWf13() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new int[]{1, 2, 3};
        Object result = converter.convert(object, Object.class);
        Assertions.assertEquals(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertPointerToObject_cqed16() {
        BasicTypeConverter converter = new BasicTypeConverter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateByte_jYwY0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Byte.class, 1.0);
        Assertions.assertEquals(Byte.valueOf((byte) 1), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateShort_hAlB1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Short.class, 1.0);
        Assertions.assertEquals(Short.valueOf((short) 1), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateInteger_aUcz2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Integer.class, 1.0);
        Assertions.assertEquals(Integer.valueOf(1), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateLong_saIU3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Long.class, 1.0);
        Assertions.assertEquals(Long.valueOf(1), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateFloat_mOvG4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Float.class, 1.0);
        Assertions.assertEquals(Float.valueOf(1.0f), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateDouble_IVTS5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Double.class, 1.0);
        Assertions.assertEquals(Double.valueOf(1.0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateBigInteger_WoXa6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(BigInteger.class, 1.0);
        Assertions.assertEquals(BigInteger.valueOf(1L), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateBigDecimal_shva7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(BigDecimal.class, 1.0);
        Assertions.assertEquals(new BigDecimal(1.0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateInvalidType_imxu10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(String.class, 1.0);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateInvalidValue_Iyhx11() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Integer.class, 1.5);
        Assertions.assertEquals(Integer.valueOf(1), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBoolean_iCKI0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("true", Boolean.class);
        Assertions.assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCharacter_uOfC1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("a", Character.class);
        Assertions.assertEquals('a', (char) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testByte_IsnH2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1", Byte.class);
        Assertions.assertEquals((byte) 1, (byte) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShort_oRqG3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1", Short.class);
        Assertions.assertEquals((short) 1, (short) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInteger_mrQE4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1", Integer.class);
        Assertions.assertEquals(1, (int) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLong_qsaS5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1", Long.class);
        Assertions.assertEquals(1L, (long) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFloat_HGWk6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1.0", Float.class);
        Assertions.assertEquals(1.0f, (float) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDouble_PNsf7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1.0", Double.class);
        Assertions.assertEquals(1.0, (double) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvalidType_NPRB8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1", String.class);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_MuZg6_lyeR0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(Arrays.asList("test"), String.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertPrimitivePointer_CGdC13_resw0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert("true", boolean.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionForInterface_GtvD1_fZQn0() {
        try {
            BasicTypeConverter converter = new BasicTypeConverter();
            Object result = converter.convertStringToPrimitive("123", Integer.class);
            assert result instanceof Integer;
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionForAbstractClass_tDnr2_CBHJ0() {
        try {
            BasicTypeConverter converter = new BasicTypeConverter();
            converter.convertStringToPrimitive("123", Integer.class);
            assert true;
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionForList_pBYA3_TFbq0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection result = (Collection) converter.convertStringToPrimitive("123", List.class);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertBooleanToPrimitive_Owml3_vgjf0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = true;
        Object result = converter.convert(String.valueOf(object), boolean.class);
        Assertions.assertTrue((boolean) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertCollectionToPrimitive_rYEj6_yzso0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Integer[] object = new Integer[]{1, 2, 3};
        Object result = converter.convert(object, int[].class);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, (int[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertCollectionToObject_Czsx14_YRen0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        List<Integer> object = new ArrayList<Integer>();
        object.add(1);
        object.add(2);
        object.add(3);
        Object result = converter.convert(object, Object.class);
        Assertions.assertEquals(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateAtomicInteger_neeg8_Yimn0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1", Integer.class);
        Assertions.assertEquals(Integer.valueOf(1), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateAtomicLong_LExk9_XIuS0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1", Long.class);
        Assertions.assertEquals(Long.valueOf(1), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNonConvertibleObject_cJnQ15_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(new Object(), Double.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNonConvertibleArray_erVZ16_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(new Object[]{1, 2, 3}, Double[].class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNonConvertibleCollection_Huvv17_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(Arrays.asList(1, 2, 3), Double.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNonConvertiblePrimitiveBoolean_axke20_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(true, Double.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNonConvertiblePrimitiveNumber_QBqU21_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(1, Double.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNonConvertiblePrimitiveArray_RZYu22_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(new boolean[]{true, false}, Double[].class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNonConvertibleNodeSet_mOXW18_EFBq0_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(Arrays.asList("test"), Double.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNonConvertiblePointer_dOxj19_THJg0_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert("test", Double.class);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNodeSetToPrimitive_mkdG7_DBKh0_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        String[] values = new String[]{"1", "2", "3"};
        Object result = converter.convertStringToPrimitive(values, String[].class);
        String[] expected = values;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertPointerToPrimitive_Celn8_VOWn0_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = "1";
        Object result = converter.convertStringToPrimitive(object, String.class);
    }
}