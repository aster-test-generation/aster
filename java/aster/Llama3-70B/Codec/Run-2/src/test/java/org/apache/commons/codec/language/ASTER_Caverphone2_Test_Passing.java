/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Caverphone2_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_EmptyString_ReturnsTEN_1_uWSB0() {
    Caverphone2 caverphone2 = new Caverphone2();
    String result = caverphone2.encode("");
    assert result.equals("1111111111");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_NonEmptyString_ReturnsEncodedString_VuNN1() {
    Caverphone2 caverphone2 = new Caverphone2();
    String result = caverphone2.encode("hello");
    assert result.length() == 10;
}
}