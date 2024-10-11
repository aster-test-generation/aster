/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MurmurHash2_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testHash64_AYZg0() throws Exception {
		byte[] data = new byte[0];
		int length = 5;
		long expected = 29873967890L;
		long actual = MurmurHash2.hash64(data, length);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_QUXt0() throws Exception {
        byte[] data = new byte[0];
        int length = 0;
        int expected = 0x9747b28c;
        int actual = MurmurHash2.hash32(data, length);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_qsAX0() throws Exception {
        byte[] data = {};
        int length = 0;
        int seed = 0;
        int expected = 0;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithNonEmptyData_aMmI1() throws Exception {
        byte[] data = {0x01, 0x02, 0x03};
        int length = 3;
        int seed = 123;
        int expected = 0x010203;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_JUMB0() throws Exception {
        byte[] data = new byte[10];
        int length = 10;
        int seed = 123;
        long expected = 123456789;
        long actual = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithEmptyData_zUCX1() throws Exception {
        byte[] data = new byte[0];
        int length = 0;
        int seed = 123;
        long expected = 0;
        long actual = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_1() throws Exception {
        assertEquals(0, MurmurHash2.hash32("", 0, 0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_2() throws Exception {
        assertEquals(0, MurmurHash2.hash32("a", 0, 1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_3() throws Exception {
        assertEquals(0, MurmurHash2.hash32("ab", 0, 2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_4() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abc", 0, 3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_5() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcd", 0, 4));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_6() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcde", 0, 5));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_7() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdef", 0, 6));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_8() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefg", 0, 7));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_9() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefgh", 0, 8));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_10() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefghi", 0, 9));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_11() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefghij", 0, 10));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_12() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefghijk", 0, 11));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_13() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefghijkl", 0, 12));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_14() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefghijklm", 0, 13));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_15() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefghijklmn", 0, 14));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_16() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefghijklmno", 0, 15));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_XTVn0_17() throws Exception {
        assertEquals(0, MurmurHash2.hash32("abcdefghijklmnop", 0, 16));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testHash64_001_gQxo0() throws Exception {
		String str = "";
		int from = 0;
		int len = 0;
		long expected = 0L;
		long actual = MurmurHash2.hash64(str, from, len);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testHash64_002_yoCy1() throws Exception {
		String str = "This is a test string";
		int from = 0;
		int len = 10;
		long expected = 1234567890L;
		long actual = MurmurHash2.hash64(str, from, len);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testHash64_003_IebS2() throws Exception {
		String str = "Another test string";
		int from = 5;
		int len = 15;
		long expected = 987654321L;
		long actual = MurmurHash2.hash64(str, from, len);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testHash64_004_irjU3() throws Exception {
		String str = "A really long test string that goes on and on";
		int from = 20;
		int len = 30;
		long expected = 5432109876L;
		long actual = MurmurHash2.hash64(str, from, len);
		assertEquals(expected, actual);
	}
}