
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Set;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpArchiveEntry_ESTest extends DumpArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("IN", "IN", (-44236554), dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals(0L, dumpArchiveEntry1.getOffset());
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
      assertFalse(boolean0);
      assertEquals("IN", dumpArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(2);
      assertEquals(DumpArchiveEntry.TYPE.CHRDEV, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[24];
      // Undeclared exception!
      try { 
        DumpArchiveEntry.parse(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("mB5SoJ", "mB5SoJ");
      String string0 = dumpArchiveEntry0.toString();
      assertEquals("mB5SoJ", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 636, dumpArchiveEntry_TYPE0);
      String string0 = dumpArchiveEntry0.toString();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("_,Ck5rN/cE2%zP]T4", "_,Ck5rN/cE2%zP]T4");
      dumpArchiveEntry0.setDeleted(true);
      boolean boolean0 = dumpArchiveEntry0.isDeleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("eLU0OFv]YTm*Q){#ffq", "DIRECTORY");
      dumpArchiveEntry0.setVolume(2745);
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals(2745, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setUserId(816);
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals(816, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("KZL3/$BqZ,", "KZL3/$BqZ,");
      dumpArchiveEntry0.setUserId((-1044));
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals((-1044), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "FIFO");
      dumpArchiveEntry0.setSize(335L);
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals(335L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "+9mr'nKUzQ^]P>KR");
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals("+9mr'nKUzQ^]P>KR", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getOriginalName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 636, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getOriginalName();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setOffset(896);
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(896L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("BITS", "BITS", 0, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setNlink(1131);
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals(1131, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("r(yUp", "r(yUp");
      dumpArchiveEntry0.setNlink((byte) (-103));
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals((-103), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, (String) null);
      String string0 = dumpArchiveEntry0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(" 7", "Kg e[rxT$Vg%7(V");
      String string0 = dumpArchiveEntry0.getName();
      assertEquals(" 7", string0);
      assertEquals("Kg e[rxT$Vg%7(V", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      String string0 = dumpArchiveEntry0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("r(yUp", "r(yUp");
      dumpArchiveEntry0.setMode((-1059));
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals(3037, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGroupId(64);
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGroupId((-200169157));
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals((-200169157), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGeneration(1507);
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals(1507, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, (String) null);
      dumpArchiveEntry0.setGeneration((-1634));
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals((-1634), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("UV\"vw|h!X", "USER_READ");
      dumpArchiveEntry0.setSize(618L);
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(618L, dumpArchiveEntry0.getSize());
      assertEquals(618L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(" 7", "Kg e[rxT$Vg%7(V");
      dumpArchiveEntry0.setSize((-1186L));
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals((-1186L), dumpArchiveEntry0.getSize());
      assertEquals((-1186L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.update((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("PG&", "PG&", (-334), dumpArchiveEntry_TYPE0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.update(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "./oz}@`", 164, dumpArchiveEntry_TYPE0);
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.setLastModifiedDate((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("N^6Ls&#6]z;_x@FD", (String) null);
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.setCreationTime((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("PTS%7<j9O9ryt", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.setAccessTime((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        DumpArchiveEntry.parse((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.isSparseRecord(939);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 939
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setName("./USER_READ");
      assertEquals("USER_READ", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("FILE", "", (-2372), dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setName("FIFO");
      assertEquals("FIFO/", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      assertEquals("", dumpArchiveEntry0.getName());
      
      dumpArchiveEntry0.setName((String) null);
      assertFalse(dumpArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("EhfUt_k@U>Y/j+", "");
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertEquals("", dumpArchiveEntry0.getSimpleName());
      assertEquals("EhfUt_k@U>Y/j+", dumpArchiveEntry0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("GROUP_EXEC", "GROUP_EXEC", (-68), dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("GROUP_EXEC/", dumpArchiveEntry0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find((-1046));
      assertEquals(8, set0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCdata(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      dumpArchiveEntry_TapeSegmentHeader0.getType();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("r(yUp", "r(yUp");
      assertEquals(0L, dumpArchiveEntry0.getSize());
      
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      assertEquals("r(yUp", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getHoles();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("END", "END", 249, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertTrue(boolean0);
      assertEquals("END", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "FIFO");
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertEquals("FIFO", dumpArchiveEntry0.getSimpleName());
      assertEquals("", dumpArchiveEntry0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      boolean boolean0 = dumpArchiveEntry0.isFile();
      assertEquals("", dumpArchiveEntry0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=M-7mS w!;#V", "2=M-7mS w!;#V", 0, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("2=M-7mS w!;#V", dumpArchiveEntry0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 892, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("L.vyFt7Oo.h*4", "a,n~", (-9), dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertTrue(boolean0);
      assertEquals("a,n~", dumpArchiveEntry0.getSimpleName());
      assertEquals("L.vyFt7Oo.h*4", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "*r*|{gL*rO@$d", 1655, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isBlkDev();
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      boolean boolean0 = dumpArchiveEntry0.isBlkDev();
      assertFalse(boolean0);
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "FIFO");
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals("", dumpArchiveEntry0.toString());
      assertEquals("FIFO", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("2=", "", 849, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals("", dumpArchiveEntry1.getSimpleName());
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
      assertEquals(0L, dumpArchiveEntry1.getOffset());
      assertFalse(boolean0);
      assertEquals("2=/", dumpArchiveEntry1.toString());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "FIFO");
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals("", dumpArchiveEntry0.toString());
      assertTrue(boolean0);
      assertEquals("FIFO", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "-guyk&");
      boolean boolean0 = dumpArchiveEntry0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "-guyk&");
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(12);
      assertEquals(DumpArchiveEntry.TYPE.SOCKET, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(0);
      assertEquals(DumpArchiveEntry.TYPE.UNKNOWN, dumpArchiveEntry_TYPE0);
      
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry_TYPE0);
      assertFalse(boolean0);
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      dumpArchiveEntry_TapeSegmentHeader0.setIno(2);
      assertEquals(2, dumpArchiveEntry_TapeSegmentHeader0.getIno());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isSparseRecord(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getVolume();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Date date0 = dumpArchiveEntry0.getLastModifiedDate();
      dumpArchiveEntry0.setCreationTime(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(":~ig#", ":~ig#");
      dumpArchiveEntry0.getHeaderType();
      assertEquals(":~ig#", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./2=/", "{h'Bv/", 148, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getHeaderCount();
      assertEquals("2=/", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("{h'Bv/", dumpArchiveEntry0.getSimpleName());
      assertEquals(0, int0);
      assertEquals((-1L), dumpArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Date date0 = dumpArchiveEntry0.getCreationTime();
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=M-7mS w!;#V", "2=M-7mS w!;#V", 0, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals(0, int0);
      assertEquals("2=M-7mS w!;#V", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("FILE", "", (-2372), dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(0L, long0);
      assertEquals("", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("FILE/", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=M-7mS w!;#V", "2=M-7mS w!;#V", 0, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.hashCode();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("2=M-7mS w!;#V", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./2=/", "{h'Bv/", 148, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals(0, int0);
      assertEquals("{h'Bv/", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("2=/", dumpArchiveEntry0.toString());
      assertTrue(dumpArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./2=/", "{h'Bv/", 148, dumpArchiveEntry_TYPE0);
      Date date0 = dumpArchiveEntry0.getAccessTime();
      dumpArchiveEntry0.setAccessTime(date0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("2=/", dumpArchiveEntry0.toString());
      assertTrue(dumpArchiveEntry0.isDirectory());
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertEquals("{h'Bv/", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "FIFO");
      int int0 = dumpArchiveEntry0.getHeaderHoles();
      assertEquals("", dumpArchiveEntry0.toString());
      assertEquals(0, int0);
      assertEquals("FIFO", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setSimpleName("");
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(":~ig#", ":~ig#");
      dumpArchiveEntry0.isDeleted();
      assertEquals(":~ig#", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(":~ig#", ":~ig#");
      Date date0 = dumpArchiveEntry0.getLastModifiedDate();
      dumpArchiveEntry0.setLastModifiedDate(date0);
      assertEquals(":~ig#", dumpArchiveEntry0.getName());
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Set<DumpArchiveEntry.PERMISSION> set0 = dumpArchiveEntry0.getPermissions();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=M-7mS w!;#V", "2=M-7mS w!;#V", 0, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getType();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("2=M-7mS w!;#V", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=", "", 849, dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals("2=/", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals((-1L), long0);
      assertEquals("", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(":~ig#", ":~ig#");
      dumpArchiveEntry0.getOriginalName();
      assertEquals(":~ig#", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals(0, int0);
      assertEquals("", dumpArchiveEntry0.getName());
  }
}
