/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ParseException_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchStrCharAt0_hDon0() {
        ParseException token = new ParseException();
        String str = "0";
        String result = token.add_escapes(str);
        assertEquals("\0", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTokenImage_wamz2() {
        int[] tokenImage = new int[]{1, 2, 3};
        String[] tokenImageArray = new String[]{"a", "b", "c"};
        for (int i = 0; i < tokenImage.length; i++) {
            String expected = tokenImageArray[tokenImage[i]] + " ";
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchStrCharAt0_hDon0_fid1() {
        ParseException token = new ParseException();
        String str = "0";
        String result = token.add_escapes(str);
        assertEquals("\\0", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchStrCharAtLessThan20OrGreaterThan7E_bYdm9_fid1() {
        ParseException token = new ParseException();
        String str = (char) 0x1F + "";
        String result = token.add_escapes(str);
        assertEquals("\\u001F", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchStrCharAtLessThan20OrGreaterThan7E2_bdsV10_fid1() {
        ParseException token = new ParseException();
        String str = (char) 0x7F + "";
        String result = token.add_escapes(str);
        assertEquals("\\u007F", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchStrCharAtLessThan20OrGreaterThan7E4_MDwy12() {
        ParseException token = new ParseException();
        String str = (char) 0x7E + "";
        String result = token.add_escapes(str);
        assertEquals("\\u007E", result);
}
}