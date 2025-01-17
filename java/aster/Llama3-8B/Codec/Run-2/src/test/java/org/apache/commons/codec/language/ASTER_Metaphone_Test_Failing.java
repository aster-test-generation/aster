/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Metaphone_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ulbi0() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.encode("hello");
        assert result.equals("hll");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone21_LRNz20_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("Q");
        Assertions.assertEquals("K", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone1_IFdN0_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("MTH", metaphone.metaphone("Math"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_WqLT1() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("The"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone15_qpna14() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("This"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone16_clCP15() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("That"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone17_mMap16() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("These"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone18_Pvmp17() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("Those"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone23_UCET22() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("Th"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_YsgZ1_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("FND", metaphone.metaphone("Find"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_qEYB2_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("FND", metaphone.metaphone("Fined"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone4_CkiE3_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("KND", metaphone.metaphone("Kind"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone5_vhVm4_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("KND", metaphone.metaphone("Kined"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone7_zHYV6_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("PNT", metaphone.metaphone("Pented"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone8_VAOT7_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TCH", metaphone.metaphone("Tatch"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone9_Sqax8_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TCH", metaphone.metaphone("Tetched"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone11_cZgU10() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("Their"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone12_WmKv11() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("Them"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone14_satc13() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("They"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone15_LhDg14() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("Then"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone16_ANnC15() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TH", metaphone.metaphone("There"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_PooE1_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("PHN", metaphone.metaphone("Phon"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_ffoh2_fid2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("THN", metaphone.metaphone("Thon"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeString_NLLW0_lBoN0() {
    Metaphone metaphone = new Metaphone();
    try {
        String result = metaphone.metaphone("test");
        assertEquals("test", result);
    } catch (Exception e) {
        fail("No exception should be thrown");
    }
}
}