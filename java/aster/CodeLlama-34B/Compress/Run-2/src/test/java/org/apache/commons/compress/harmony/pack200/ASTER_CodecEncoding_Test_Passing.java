/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CodecEncoding_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSpecifierForDefaultCodec_FOoV0() {
    BHSDCodec defaultCodec = new BHSDCodec(8, 16, 32, 64);
    int specifier = CodecEncoding.getSpecifierForDefaultCodec(defaultCodec);
    assertEquals(1, specifier);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSpecifierForDefaultCodec_NullDefaultCodec_snwU1() {
    int specifier = CodecEncoding.getSpecifierForDefaultCodec(null);
    assertEquals(0, specifier);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_0_xuwu0_1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(0);
    assertEquals(0, codec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_0_xuwu0_2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(0);
    assertEquals(0, codec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_0_xuwu0_3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(0);
    assertEquals(0, codec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_0_xuwu0_4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(0);
    assertEquals(0, codec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_0_xuwu0_5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(0);
    assertEquals(0, codec.getL());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_1_apmF1_1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(1);
    assertEquals(1, codec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_1_apmF1_2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(1);
    assertEquals(1, codec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_1_apmF1_3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(1);
    assertEquals(1, codec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_1_apmF1_4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(1);
    assertEquals(1, codec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_1_apmF1_5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(1);
    assertEquals(1, codec.getL());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_2_Enxw2_1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(2);
    assertEquals(2, codec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_2_Enxw2_2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(2);
    assertEquals(2, codec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_2_Enxw2_3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(2);
    assertEquals(2, codec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_2_Enxw2_4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(2);
    assertEquals(2, codec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_2_Enxw2_5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(2);
    assertEquals(2, codec.getL());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_3_fQls3_1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(3);
    assertEquals(3, codec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_3_fQls3_2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(3);
    assertEquals(3, codec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_3_fQls3_3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(3);
    assertEquals(3, codec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_3_fQls3_4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(3);
    assertEquals(3, codec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_3_fQls3_5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(3);
    assertEquals(3, codec.getL());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_4_zCGo4_1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(4);
    assertEquals(4, codec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_4_zCGo4_2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(4);
    assertEquals(4, codec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_4_zCGo4_3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(4);
    assertEquals(4, codec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_4_zCGo4_4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(4);
    assertEquals(4, codec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_4_zCGo4_5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(4);
    assertEquals(4, codec.getL());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_5_Ppgl5_1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(5);
    assertEquals(5, codec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_5_Ppgl5_2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(5);
    assertEquals(5, codec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_5_Ppgl5_3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(5);
    assertEquals(5, codec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_5_Ppgl5_4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(5);
    assertEquals(5, codec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_5_Ppgl5_5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(5);
    assertEquals(5, codec.getL());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_6_gfbL6_1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(6);
    assertEquals(6, codec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_6_gfbL6_2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(6);
    assertEquals(6, codec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_6_gfbL6_3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(6);
    assertEquals(6, codec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_6_gfbL6_4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(6);
    assertEquals(6, codec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_6_gfbL6_5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(6);
    assertEquals(6, codec.getL());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_7_LGdc7_1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(7);
    assertEquals(7, codec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_7_LGdc7_2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(7);
    assertEquals(7, codec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_7_LGdc7_3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(7);
    assertEquals(7, codec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_7_LGdc7_4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(7);
    assertEquals(7, codec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_7_LGdc7_5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(7);
    assertEquals(7, codec.getL());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_8_dCsO8_1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(8);
    assertEquals(8, codec.getB());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_8_dCsO8_2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(8);
    assertEquals(8, codec.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_8_dCsO8_3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(8);
    assertEquals(8, codec.getS());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_8_dCsO8_4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(8);
    assertEquals(8, codec.getH());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_8_dCsO8_5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(8);
    assertEquals(8, codec.getL());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSpecifier2_LeMW1_Xbwi0() {
    Codec codec = new BHSDCodec(1, 1, 1);
    Codec defaultForBand = null;
    int[] specifier = CodecEncoding.getSpecifier(codec, defaultForBand);
    assertArrayEquals(new int[] { 116, 1 }, specifier);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_0_xuwu0() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(0);
    assertEquals(0, codec.getB());
    assertEquals(0, codec.hashCode());
    assertEquals(0, codec.getS());
    assertEquals(0, codec.getH());
    assertEquals(0, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_1_apmF1() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(1);
    assertEquals(1, codec.getB());
    assertEquals(1, codec.hashCode());
    assertEquals(1, codec.getS());
    assertEquals(1, codec.getH());
    assertEquals(1, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_2_Enxw2() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(2);
    assertEquals(2, codec.getB());
    assertEquals(2, codec.hashCode());
    assertEquals(2, codec.getS());
    assertEquals(2, codec.getH());
    assertEquals(2, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_3_fQls3() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(3);
    assertEquals(3, codec.getB());
    assertEquals(3, codec.hashCode());
    assertEquals(3, codec.getS());
    assertEquals(3, codec.getH());
    assertEquals(3, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_4_zCGo4() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(4);
    assertEquals(4, codec.getB());
    assertEquals(4, codec.hashCode());
    assertEquals(4, codec.getS());
    assertEquals(4, codec.getH());
    assertEquals(4, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_5_Ppgl5() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(5);
    assertEquals(5, codec.getB());
    assertEquals(5, codec.hashCode());
    assertEquals(5, codec.getS());
    assertEquals(5, codec.getH());
    assertEquals(5, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_6_gfbL6() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(6);
    assertEquals(6, codec.getB());
    assertEquals(6, codec.hashCode());
    assertEquals(6, codec.getS());
    assertEquals(6, codec.getH());
    assertEquals(6, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_7_LGdc7() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(7);
    assertEquals(7, codec.getB());
    assertEquals(7, codec.hashCode());
    assertEquals(7, codec.getS());
    assertEquals(7, codec.getH());
    assertEquals(7, codec.getL());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCanonicalCodec_8_dCsO8() {
    BHSDCodec codec = CodecEncoding.getCanonicalCodec(8);
    assertEquals(8, codec.getB());
    assertEquals(8, codec.hashCode());
    assertEquals(8, codec.getS());
    assertEquals(8, codec.getH());
    assertEquals(8, codec.getL());
}
}