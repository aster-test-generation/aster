
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
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry", 1362, dumpArchiveEntry_TYPE0);
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry(")bp$UK=DEX)NZ", "WORLD_EXEC", 3800, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals(0L, dumpArchiveEntry1.getOffset());
      assertEquals(")bp$UK=DEX)NZ", dumpArchiveEntry1.getName());
      assertFalse(boolean0);
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
      assertEquals("WORLD_EXEC", dumpArchiveEntry1.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(8);
      assertEquals(DumpArchiveEntry.TYPE.FILE, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCdata(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", (String) null, 1368, dumpArchiveEntry_TYPE0);
      byte[] byteArray0 = new byte[20];
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.update(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 160
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[28];
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
  public void test05()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("SOCKET", "SOCKET");
      String string0 = dumpArchiveEntry0.toString();
      assertEquals("SOCKET", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("#8Yq/0M8!V$b%iT", "");
      assertEquals("#8Yq/0M8!V$b%iT", dumpArchiveEntry0.getName());
      
      dumpArchiveEntry0.setName("");
      String string0 = dumpArchiveEntry0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setDeleted(true);
      boolean boolean0 = dumpArchiveEntry0.isDeleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("sZgdK$[=1t#Px", "sZgdK$[=1t#Px");
      dumpArchiveEntry0.setVolume(3);
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.WHITEOUT;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 676, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setVolume((-153));
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals((-153), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./Zip slip '%s' + '%s' -> '%s'", "./Zip slip '%s' + '%s' -> '%s'");
      dumpArchiveEntry0.setUserId(4);
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setUserId((-7));
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals((-7), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./(A!_a^UxEw#M6{ )}j", "5L3", 892, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setSize(892);
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals(892L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("4cgE", "~Ez`@q/|B1xrZS\"F");
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertEquals("4cgE", dumpArchiveEntry0.toString());
      assertEquals("~Ez`@q/|B1xrZS\"F", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.WHITEOUT;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 676, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getSimpleName();
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "BITS", 0, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setName("Q)[bWCjR`^6Z");
      dumpArchiveEntry0.getOriginalName();
      assertEquals("Q)[bWCjR`^6Z", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 676, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getOriginalName();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("END", "END");
      dumpArchiveEntry0.setOffset(890L);
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(890L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./Zip slip '%s' + '%s' -> '%s'", "./Zip slip '%s' + '%s' -> '%s'");
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      
      dumpArchiveEntry0.setOffset((-1L));
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setNlink(3550);
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals(3550, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setNlink((-1060));
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals((-1060), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setMode((-1060));
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals(3036, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "NE");
      dumpArchiveEntry0.setGroupId(1130);
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals(1130, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.WHITEOUT;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, (String) null, 1285, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setGroupId((-3275));
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals((-3275), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveConstants", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants");
      dumpArchiveEntry0.setGeneration(34);
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 676, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setSize(676);
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(676L, dumpArchiveEntry0.getSize());
      assertEquals(676L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setSize((-269));
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals((-269L), dumpArchiveEntry0.getSize());
      assertEquals((-269L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
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
  public void test29()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("i`%IUbs|", "i`%IUbs|");
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
  public void test30()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
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
  public void test31()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_WRITE", "USER_WRITE");
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.isSparseRecord(84446);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 84446
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setName("././Nr&FeL7od;5/");
      assertFalse(dumpArchiveEntry0.isDirectory());
      assertEquals("./Nr&FeL7od;5/", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "'w'&[;qRn2}76d");
      assertEquals("", dumpArchiveEntry0.toString());
      
      dumpArchiveEntry0.setName("'w'&[;qRn2}76d");
      String string0 = dumpArchiveEntry0.getName();
      assertEquals("'w'&[;qRn2}76d", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, ")\"y*sB!6", 529, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setName((String) null);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("sZgdK$[=1t#Px", "sZgdK$[=1t#Px");
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertEquals("sZgdK$[=1t#Px", dumpArchiveEntry0.toString());
      assertEquals((-1L), dumpArchiveEntry0.getSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(1);
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      dumpArchiveEntry_TapeSegmentHeader0.getType();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "'w'&[;qRn2}76d");
      String string0 = dumpArchiveEntry0.getName();
      assertEquals("'w'&[;qRn2}76d", dumpArchiveEntry0.getSimpleName());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getHoles();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./`\"<8Uk=1PPUH2/", (String) null, 56, dumpArchiveEntry_TYPE0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertTrue(dumpArchiveEntry0.isDirectory());
      assertEquals("`\"<8Uk=1PPUH2/", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("sZgdK$[=1t#Px", "sZgdK$[=1t#Px");
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setName("8+LLZOpQNfoAt\f.&");
      assertEquals("8+LLZOpQNfoAt\f.&/", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("/", "./P5%@+Hif%Z>f[8.2bj", 967, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("./P5%@+Hif%Z>f[8.2bj", dumpArchiveEntry0.getSimpleName());
      assertFalse(dumpArchiveEntry0.isDirectory());
      assertEquals("/", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFile();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 676, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFile();
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("R)u", "Zip slip '%s' + '%s' -> '%s'", (-3188), dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("R)u", dumpArchiveEntry0.toString());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "NE");
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./Zip slip '%s' + '%s' -> '%s'", "./Zip slip '%s' + '%s' -> '%s'");
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 676, dumpArchiveEntry_TYPE0);
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE1 = DumpArchiveEntry.TYPE.BLKDEV;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE1);
      boolean boolean0 = dumpArchiveEntry0.isBlkDev();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isBlkDev();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("sZgdK$[=1t#Px", "sZgdK$[=1t#Px");
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getSize();
      assertTrue(dumpArchiveEntry0.isDirectory());
      assertEquals("sZgdK$[=1t#Px", dumpArchiveEntry0.toString());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "NE");
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress%archivers.dump.DumpOrchiveEntry", "org.apache.commons.compress%archivers.dump.DumpOrchiveEntry", 1362, dumpArchiveEntry_TYPE0);
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertFalse(boolean0);
      assertEquals("org.apache.commons.compress%archivers.dump.DumpOrchiveEntry", dumpArchiveEntry0.getName());
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry(";8@t=6O<P<@(J*_oYo", "./R)u");
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals("./R)u", dumpArchiveEntry1.getSimpleName());
      assertTrue(boolean0);
      assertEquals(";8@t=6O<P<@(J*_oYo", dumpArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(1);
      assertEquals(DumpArchiveEntry.TYPE.FIFO, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(0);
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.equals(set0);
      assertFalse(boolean0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      dumpArchiveEntry_TapeSegmentHeader0.setIno(995);
      assertEquals(995, dumpArchiveEntry_TapeSegmentHeader0.getIno());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./Zip slip '%s' + '%s' -> '%s'", "./Zip slip '%s' + '%s' -> '%s'");
      boolean boolean0 = dumpArchiveEntry0.isSparseRecord(131);
      assertTrue(boolean0);
      assertEquals("Zip slip '%s' + '%s' -> '%s'", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getVolume();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.getHeaderType();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getHeaderCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./INODE", "");
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals(0, int0);
      assertEquals("INODE", dumpArchiveEntry0.getName());
      assertEquals("", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, ")\"y*sB!6", 529, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals(0, int0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, ")\"y*sB!6", 529, dumpArchiveEntry_TYPE0);
      Date date0 = dumpArchiveEntry0.getCreationTime();
      dumpArchiveEntry0.setAccessTime(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Date date0 = dumpArchiveEntry0.getLastModifiedDate();
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Date date0 = dumpArchiveEntry0.getAccessTime();
      dumpArchiveEntry0.setCreationTime(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getHeaderHoles();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 676, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals(0, int0);
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, ")\"y*sB!6", 529, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setSimpleName("q;3rjoHYj8V%l#x");
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./Zip slip '%s' + '%s' -> '%s'", "./Zip slip '%s' + '%s' -> '%s'");
      dumpArchiveEntry0.isDeleted();
      assertEquals("Zip slip '%s' + '%s' -> '%s'", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGeneration((-3380));
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals((-3380), int0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./INODE", "");
      Date date0 = dumpArchiveEntry0.getCreationTime();
      dumpArchiveEntry0.setLastModifiedDate(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertEquals("INODE", dumpArchiveEntry0.getName());
      assertEquals("", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./INODE", "");
      dumpArchiveEntry0.getPermissions();
      assertEquals("INODE", dumpArchiveEntry0.toString());
      assertEquals("", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 676, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getType();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress%archivers.dump.DumpOrchiveEntry", "org.apache.commons.compress%archivers.dump.DumpOrchiveEntry", 1362, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.hashCode();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("org.apache.commons.compress%archivers.dump.DumpOrchiveEntry", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getOriginalName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./INODE", "");
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals("", dumpArchiveEntry0.getSimpleName());
      assertEquals(0, int0);
      assertEquals("INODE", dumpArchiveEntry0.toString());
  }
}
