/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Log_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObject_CrFW0() {
        Log.printObject(new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithString_pQaW2() {
        Log.printObject("test");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithInteger_NoVZ3() {
        Log.printObject(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithDouble_BOlZ4() {
        Log.printObject(1.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithBoolean_jjFR5() {
        Log.printObject(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithArray_eBDP6() {
        Log.printObject(new Object[]{new Object()});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithList_nPOZ7() {
        Log.printObject(Arrays.asList(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithMap_VKUL8() {
        Log.printObject(Collections.singletonMap("key", new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithSet_TnRa9() {
        Log.printObject(Collections.singleton(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithQueue_opNJ10() {
        Log.printObject(new LinkedList<>(Arrays.asList(new Object())));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithVector_IAXb12() {
        Log.printObject(new Vector<>(Arrays.asList(new Object())));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithTreeSet_qJNX13() {
        Log.printObject(new TreeSet<>(Arrays.asList(new Integer(1))));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintObjectWithTreeMap_hGwH14() {
        Log.printObject(new TreeMap<String, Object>() {
            {
                put("key", new Object());
            }
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStat_GVmM0() {
        Log.stat("test message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLog_mZsl0() {
        Log.log("msg1", "msg2");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testTraceWithMessageAndObject_hVsm0() {
        Log.trace("message", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testTraceWithMessageAndNullObject_KDNj1() {
        Log.trace("message", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testTraceWithEmptyMessageAndObject_byhp2() {
        Log.trace("", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testTraceWithEmptyMessageAndNullObject_Njit3() {
        Log.trace("", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_euPx0() {
        Collection<String> collection = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        Log.printCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_whenCollectionIsEmpty_ACHh1() {
        Collection<String> collection = new ArrayList<>();
        Log.printCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_Xrsv0() {
        Log.error("Test message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullMessage_QHsB1() {
        Log.error(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithEmptyMessage_ZheQ2() {
        Log.error("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_HCjd0() {
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoTraceWhenLoggable_AqbU0() {
        Log log = new Log();
        assertFalse(log.doTrace());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest1_QDdA0() {
        Log.trace("message", new Object(), new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest2_qbah1() {
        Log.trace("message", null, null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest3_lvUb2() {
        Log.trace("message", new Object(), null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest4_Ayom3() {
        Log.trace("message", null, new Object(), null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest5_sDZp4() {
        Log.trace("message", null, null, new Object(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest6_ovoy5() {
        Log.trace("message", null, null, null, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testTraceExit_lVUb0() {
        Log.traceExit("message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLog_ZjNA0() {
        Log.log("msg1", "msg2", "msg3");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLogWithNullParams_STXa1() {
        Log.log(null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLogWithEmptyParams_inFH2() {
        Log.log("", "", "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLogWithSingleParam_sJiF3() {
        Log.log("msg", "", "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testTraceEnter_Hyyr0() {
        Log.traceEnter("test message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarning_hJNk0() {
        Log.warning("This is a test warning message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarningWithNullMessage_WOla1() {
        Log.warning(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarningWithEmptyMessage_nRYu2() {
        Log.warning("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarningWithValidMessage_lXoS3() {
        Log.warning("This is a valid warning message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarningWithLongMessage_uEJb4() {
        Log.warning("This is a long warning message that is going to be truncated");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarningWithSpecialCharacters_qrWE5() {
        Log.warning("This warning message contains special characters like !@#$%^&*()_+");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarningWithUnicodeCharacters_fYsZ6() {
        Log.warning("This warning message contains unicode characters like ");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWarningWithMultipleMessages_mANR11() {
        Log.warning("This is the first warning message");
        Log.warning("This is the second warning message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest1_itvj0() {
        Log.trace("message", new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest2_jKCd1() {
        Log.trace("message", null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest3_OxHZ2() {
        Log.trace("message", new Object(), null, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest4_cDpU3() {
        Log.trace("message", null, new Object(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest5_npEb4() {
        Log.trace("message", new Object(), new Object(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest7_CPeS6() {
        Log.trace("message", null, new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrint26_qfwO26() {
        Log.print("message26");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_foOP0() {
        Log.error("msg1", "msg2", new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithEmptyStrings_YqHR2() {
        Log.error("", "", new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullStrings_iAiH3() {
        Log.error(null, null, new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLog_whAl0() {
        Log.log("test message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_zNhL0() {
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrace_CjqR0() {
        Log.trace("message", new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_BcZg0() {
        String msg1 = "Error message 1";
        String msg2 = "Error message 2";
        Log.error(new Exception(), msg1, msg2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithThrowable_WaIa1() {
        String msg1 = "Error message 1";
        String msg2 = "Error message 2";
        Throwable e = new Throwable();
        Log.error(e, msg1, msg2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDebug_uBQJ0() {
        assertTrue(Log.doDebug());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_fSBq0() {
        Log.error("msg1", "msg2", "msg3", new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithEmptyStrings_VcHB2() {
        Log.error("", "", "", new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullStrings_kQeE3() {
        Log.error(null, null, null, new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest1_TCYv0() {
        Log.trace("message", new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest2_LERt1() {
        Log.trace("message", null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest3_DuEG2() {
        Log.trace("message", new Object(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void traceTest4_dnqr3() {
        Log.trace("message", null, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testError_LqHw0() {
        Log.error("Test message", new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithEmptyMessage_Jcvh2() {
        Log.error("", new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithEmptyThrowable_WYpO3() {
        Log.error("Test message", new Throwable(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullMessageAndEmptyThrowable_iFKS5() {
        Log.error(null, new Throwable(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithEmptyMessageAndEmptyThrowable_MTkh7() {
        Log.error("", new Throwable(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithNullMessageAndValidThrowable_INFI8() {
        Log.error(null, new Throwable("Test Throwable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithValidMessageAndValidThrowable_nXEW10() {
        Log.error("Test message", new Throwable("Test Throwable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testErrorWithEmptyMessageAndValidThrowable_fSll12() {
        Log.error("", new Throwable("Test Throwable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_PfCq0() {
        Collection<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        collection.add("item3");
        Log.printCollection("Test message", collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_emptyCollection_lVDW1() {
        Collection<String> collection = new ArrayList<>();
        Log.printCollection("Test message", collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_nullMessage_syAi3() {
        Collection<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        collection.add("item3");
        Log.printCollection(null, collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_emptyMessage_OCNp4() {
        Collection<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        collection.add("item3");
        Log.printCollection("", collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_messageWithSpecialCharacters_mgko5() {
        Collection<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        collection.add("item3");
        Log.printCollection("!@#$%^&*()_+", collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_messageWithNumbers_lnAW6() {
        Collection<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        collection.add("item3");
        Log.printCollection("1234567890", collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintCollection_messageWithCombinations_iOwS8() {
        Collection<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        collection.add("item3");
        Log.printCollection("!@#$%^&*()_+  1234567890", collection);
    }
}