// {
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testOuterClassIndex_ZSzC0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertEquals(4, icTuple.outerClassIndex());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testOuterIsAnonymous_RdZQ0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     boolean result = icTuple.outerIsAnonymous();
//     Assertions.assertTrue(result);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testNestedExplicitFlagSet_true_vaes0() {
//     IcTuple icTuple = new IcTuple("C", 0x0001, "C2", "N", 1, 2, 3, 4);
//     assertTrue(icTuple.nestedExplicitFlagSet());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testNestedExplicitFlagSet_false_pelZ1() {
//     IcTuple icTuple = new IcTuple("C", 0x0000, "C2", "N", 1, 2, 3, 4);
//     assertFalse(icTuple.nestedExplicitFlagSet());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testSimpleClassNameIndex_iThn0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertEquals(4, icTuple.simpleClassNameIndex());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testHashCode_WhenAllFieldsAreNotNull_ThenReturnCorrectHashCode_SGNo0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     int result = icTuple.hashCode();
//     assertEquals(17 + "C".hashCode() + "C2".hashCode() + "N".hashCode(), result);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testHashCode_WhenAllFieldsAreNull_ThenReturn17_vUDf1() {
//     IcTuple icTuple = new IcTuple(null, 1, null, null, 1, 2, 3, 4);
//     int result = icTuple.hashCode();
//     assertEquals(17, result);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testIsAnonymous_saTk0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     boolean result = icTuple.isAnonymous();
//     assertTrue(result);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testNullSafeEqualsBothNull_UssV0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertTrue(icTuple.nullSafeEquals(null, null));
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testNullSafeEqualsOneNull_SHYw1() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertFalse(icTuple.nullSafeEquals("stringOne", null));
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testNullSafeEqualsBothNotNull_nkCH2() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertTrue(icTuple.nullSafeEquals("stringOne", "stringOne"));
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testGetC2_pudR0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertEquals("C2", icTuple.getC2());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testSimpleClassName_QOSI0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertEquals("expectedSimpleClassName", icTuple.simpleClassName());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testIsMember_jKZe0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     boolean result = icTuple.isMember();
//     assertTrue(result);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testGetC_JaNp0() {
//     IcTuple icTuple = new IcTuple("CValue", 1, "C2Value", "NValue", 1, 2, 3, 4);
//     assertEquals("CValue", icTuple.getC());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testEquals_SameObject_WrQL0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertTrue(icTuple.equals(icTuple));
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testEquals_DifferentClass_TePS1() {
//     Object object = new Object();
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertFalse(icTuple.equals(object));
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testEquals_Null_DCgp2() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertFalse(icTuple.equals(null));
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testEquals_SameValues_tbAg3() {
//     IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     IcTuple icTuple2 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertTrue(icTuple1.equals(icTuple2));
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testEquals_DifferentC_KOPn4() {
//     IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     IcTuple icTuple2 = new IcTuple("D", 1, "C2", "N", 1, 2, 3, 4);
//     assertFalse(icTuple1.equals(icTuple2));
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testEquals_DifferentC2_XTwk5() {
//     IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     IcTuple icTuple2 = new IcTuple("C", 1, "D2", "N", 1, 2, 3, 4);
//     assertFalse(icTuple1.equals(icTuple2));
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testToString_Dvxl0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertEquals("IcTuple (" + icTuple.getClass().getSimpleName() + " in " + icTuple.getClass().getEnclosingClass().getSimpleName() + ")", icTuple.toString());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testOuterClassString_hKWR0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertEquals("expectedString", icTuple.outerClassString());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testGetN_uTkx0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertEquals("N", icTuple.getN());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testThisClassIndex_PredictedTrue_opZX0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertTrue(icTuple.predicted()); // assuming predicted() returns true
//     assertEquals(1, icTuple.thisClassIndex());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testThisClassIndex_PredictedFalse_xkWS1() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertFalse(icTuple.predicted()); // assuming predicted() returns false
//     assertEquals(-1, icTuple.thisClassIndex());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testGetF_rWJv0() {
//     IcTuple icTuple = new IcTuple("C", 10, "C2", "N", 1, 2, 3, 4);
//     assertEquals(10, icTuple.getF());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testGetTupleIndex_iWTW0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertEquals(4, icTuple.getTupleIndex());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testThisClassString_PredictedTrue_HUGa0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     assertEquals("C", icTuple.thisClassString());
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testInnerBreakAtDollar1_rSaY0() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     String[] result = icTuple.innerBreakAtDollar("A$B$C");
//     assertArrayEquals(new String[]{"A", "B", "C"}, result);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testInnerBreakAtDollar2_ZUdF1() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     String[] result = icTuple.innerBreakAtDollar("ABC");
//     assertArrayEquals(new String[]{"ABC"}, result);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testInnerBreakAtDollar3_LdyJ2() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     String[] result = icTuple.innerBreakAtDollar("A$B");
//     assertArrayEquals(new String[]{"A", "B"}, result);
// }
// @Test
// @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
// public void testInnerBreakAtDollar4_apUO3() {
//     IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
//     String[] result = icTuple.innerBreakAtDollar("");
//     assertArrayEquals(new String[]{}, result);
// }
// }