/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lists_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayList_ggdG0_1() throws Exception {
        ArrayList<Object> list = Lists.newArrayList();
        assertNotNull(list);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayList_ggdG0_2() throws Exception {
        ArrayList<Object> list = Lists.newArrayList();
        assertTrue(list.isEmpty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithEmptyIterator_fVPc0() throws Exception {
        Iterator<String> emptyIterator = new ArrayList<String>().iterator();
        List<String> list = Lists.newArrayList(emptyIterator);
        assertTrue(list.isEmpty());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithNullIterator_auJS3() throws Exception {
        Iterator<String> nullIterator = null;
        List<String> list = Lists.newArrayList(nullIterator);
        assertTrue(list.isEmpty());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithEmptyList_RENC6() throws Exception {
        List<String> emptyList = new ArrayList<String>();
        List<String> list = Lists.newArrayList(emptyList.iterator());
        assertTrue(list.isEmpty());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithNullList_gNHy9() throws Exception {
        List<String> nullList = null;
        List<String> list = Lists.newArrayList(nullList.iterator());
        assertTrue(list.isEmpty());
    }
}