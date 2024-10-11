/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Nysiis_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test1_MwLC0(){
Nysiis nysiis = new Nysiis();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test1_LJua0() {
    Nysiis nysiis = new Nysiis();
    String str = "EV";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test2_pflf1() {
    Nysiis nysiis = new Nysiis();
    String str = "A";
    assertEquals("A", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test3_NfJS2() {
    Nysiis nysiis = new Nysiis();
    String str = "Q";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test6_indR5() {
    Nysiis nysiis = new Nysiis();
    String str = "KN";
    assertEquals("N", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test7_Vivt6() {
    Nysiis nysiis = new Nysiis();
    String str = "K";
    assertEquals("C", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test8_xRyj7() {
    Nysiis nysiis = new Nysiis();
    String str = "SCH";
    assertEquals("S", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test9_xBXa8() {
    Nysiis nysiis = new Nysiis();
    String str = "PH";
    assertEquals("F", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test10_vlJh9() {
    Nysiis nysiis = new Nysiis();
    String str = "H";
    assertEquals("H", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test11_Qkao10() {
    Nysiis nysiis = new Nysiis();
    String str = "W";
    assertEquals("W", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test13_zyYi12() {
    Nysiis nysiis = new Nysiis();
    String str = "D";
    assertEquals("D", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test14_WCYN13() {
    Nysiis nysiis = new Nysiis();
    String str = "Y";
    assertEquals("Y", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test15_oiWs14() {
    Nysiis nysiis = new Nysiis();
    String str = "C";
    assertEquals("C", nysiis.nysiis(str));
}
}