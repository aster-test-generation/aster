/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_HbHx0() {
    ZipMethod method = ZipMethod.getMethodByCode(0);
    Assertions.assertEquals(ZipMethod.STORED, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode_Zejz0_yKbk0() {
    ZipMethod zipMethod = ZipMethod.STORED;
    int code = zipMethod.getCode();
    assert code == 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode1_efbR1_uyGD0() {
    ZipMethod zipMethod = ZipMethod.UNSHRINKING;
    int code = zipMethod.getCode();
    assert code == 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode2_rGGF2_zAMW0() {
    org.apache.commons.compress.archivers.zip.ZipMethod zipMethod = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_1;
    int code = zipMethod.getCode();
    assert code == 8;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode3_oJct3_JxEA0() {
    ZipMethod zipMethod = ZipMethod.EXPANDING_LEVEL_2;
    int code = zipMethod.getCode();
    assert code == 9;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode4_NhmA4_UmlQ0() {
    ZipMethod zipMethod = ZipMethod.EXPANDING_LEVEL_3;
    int code = zipMethod.getCode();
    assert code == 9;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode5_dNPh5_HsTT0() {
    ZipMethod zipMethod = ZipMethod.EXPANDING_LEVEL_4;
    int code = zipMethod.getCode();
    assert code == 11;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode6_BDwN6_MeMN0() {
    ZipMethod zipMethod = ZipMethod.IMPLODING;
    int code = zipMethod.getCode();
    assert code == 12;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode7_ggil7_TrEu0() {
    ZipMethod zipMethod = ZipMethod.TOKENIZATION;
    int code = zipMethod.getCode();
    assert code == 13;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode8_iEbc8_LwXQ0() {
    ZipMethod zipMethod = ZipMethod.DEFLATED;
    int code = zipMethod.getCode();
    assert code == 8;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode9_aDKZ9_CcgV0() {
    ZipMethod zipMethod = ZipMethod.ENHANCED_DEFLATED;
    int code = zipMethod.getCode();
    assert code == 8;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode10_lWtW10_UljB0() {
    ZipMethod zipMethod = ZipMethod.PKWARE_IMPLODING;
    int code = zipMethod.getCode();
    assert code == 12;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode11_TBQT11_bTeg0() {
    ZipMethod zipMethod = ZipMethod.BZIP2;
    int code = zipMethod.getCode();
    assert code == 9;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode12_tLLf12_eGlC0() {
    ZipMethod zipMethod = ZipMethod.LZMA;
    int code = zipMethod.getCode();
    assert code == 8;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode13_wgtg13_WUYF0() {
    ZipMethod zipMethod = ZipMethod.XZ;
    int code = zipMethod.getCode();
    assert code == 11;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode14_YQGG14_dQeA0() {
    ZipMethod zipMethod = ZipMethod.JPEG;
    int code = zipMethod.getCode();
    assert code == 17;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode15_iidq15_saBs0() {
    ZipMethod zipMethod = ZipMethod.WAVPACK;
    int code = zipMethod.getCode();
    assert code == 17;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode16_uGHK16_ZpaF0() {
    ZipMethod zipMethod = ZipMethod.PPMD;
    int code = zipMethod.getCode();
    assert code == 16;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode17_DHIx17_JLOK0() {
    ZipMethod zipMethod = ZipMethod.AES_ENCRYPTED;
    int code = zipMethod.getCode();
    assert code == 16;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode18_Owiv18_OrBG0() {
    ZipMethod zipMethod = ZipMethod.UNKNOWN;
    int code = zipMethod.getCode();
    assert code == 0;
}
}