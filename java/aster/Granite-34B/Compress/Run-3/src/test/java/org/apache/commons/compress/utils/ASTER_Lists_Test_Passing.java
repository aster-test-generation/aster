/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.util.ArrayList;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lists_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayList_QvUt0() throws Exception {
        ArrayList<Object> actual = Lists.newArrayList();
        ArrayList<Object> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithIterator_OugC0() throws Exception {
        Iterator<String> iterator = new ArrayList<String>().iterator();
        ArrayList<String> actual = Lists.newArrayList(iterator);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithNullIterator_VGML2() throws Exception {
        Iterator<String> iterator = null;
        ArrayList<String> actual = Lists.newArrayList(iterator);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithOneElementIterator_bIpO3() throws Exception {
        Iterator<String> iterator = new ArrayList<String>(java.util.Arrays.asList("a")).iterator();
        ArrayList<String> actual = Lists.newArrayList(iterator);
        ArrayList<String> expected = new ArrayList<String>(java.util.Arrays.asList("a"));
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithTwoElementsIterator_nnHJ4() throws Exception {
        Iterator<String> iterator = new ArrayList<String>(java.util.Arrays.asList("a", "b")).iterator();
        ArrayList<String> actual = Lists.newArrayList(iterator);
        ArrayList<String> expected = new ArrayList<String>(java.util.Arrays.asList("a", "b"));
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithThreeElementsIterator_yaOE5() throws Exception {
        Iterator<String> iterator = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c")).iterator();
        ArrayList<String> actual = Lists.newArrayList(iterator);
        ArrayList<String> expected = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c"));
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithFourElementsIterator_HByr6() throws Exception {
        Iterator<String> iterator = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c", "d")).iterator();
        ArrayList<String> actual = Lists.newArrayList(iterator);
        ArrayList<String> expected = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c", "d"));
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithFiveElementsIterator_RMVK7() throws Exception {
        Iterator<String> iterator = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c", "d", "e")).iterator();
        ArrayList<String> actual = Lists.newArrayList(iterator);
        ArrayList<String> expected = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c", "d", "e"));
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithSixElementsIterator_kjEC8() throws Exception {
        Iterator<String> iterator = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c", "d", "e", "f")).iterator();
        ArrayList<String> actual = Lists.newArrayList(iterator);
        ArrayList<String> expected = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c", "d", "e", "f"));
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithSevenElementsIterator_WNWl9() throws Exception {
        Iterator<String> iterator = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c", "d", "e", "f", "g")).iterator();
        ArrayList<String> actual = Lists.newArrayList(iterator);
        ArrayList<String> expected = new ArrayList<String>(java.util.Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        assertEquals(expected, actual);
    }
}