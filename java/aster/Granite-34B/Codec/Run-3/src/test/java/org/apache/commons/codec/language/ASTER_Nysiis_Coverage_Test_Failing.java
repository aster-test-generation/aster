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
public class Aster_Nysiis_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test1_MwLC0_fid2(){
Nysiis nysiis = new Nysiis();
assertEquals("ALEXANDER",nysiis.nysiis("Alexander"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test1_LJua0_fid2() {
    Nysiis nysiis = new Nysiis();
    String str = "EV";
    assertEquals("AF", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test3_NfJS2_fid2() {
    Nysiis nysiis = new Nysiis();
    String str = "Q";
    assertEquals("G", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test4_iirf3() {
    Nysiis nysiis = new Nysiis();
    String str = "Z";
    assertEquals("S", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test5_BqPh4() {
    Nysiis nysiis = new Nysiis();
    String str = "M";
    assertEquals("N", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test6_indR5_fid2() {
    Nysiis nysiis = new Nysiis();
    String str = "KN";
    assertEquals("NN", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test8_xRyj7_fid2() {
    Nysiis nysiis = new Nysiis();
    String str = "SCH";
    assertEquals("SSS", nysiis.nysiis(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test9_xBXa8_fid2() {
    Nysiis nysiis = new Nysiis();
    String str = "PH";
    assertEquals("FF", nysiis.nysiis(str));
}
}