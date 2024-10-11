
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


package org.apache.commons.compress.changes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.compress.changes.ChangeSetResults;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ChangeSetResults_ESTest extends ChangeSetResults_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChangeSetResults changeSetResults0 = new ChangeSetResults();
      changeSetResults0.addedFromStream("716eHF{CG>D.R%h");
      List<String> list0 = changeSetResults0.getAddedFromStream();
      assertTrue(list0.contains("716eHF{CG>D.R%h"));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChangeSetResults changeSetResults0 = new ChangeSetResults();
      changeSetResults0.addedFromChangeSet("716eHF{CG>D.R%h");
      List<String> list0 = changeSetResults0.getAddedFromChangeSet();
      assertTrue(list0.contains("716eHF{CG>D.R%h"));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChangeSetResults changeSetResults0 = new ChangeSetResults();
      boolean boolean0 = changeSetResults0.hasBeenAdded("716eHF{CG>D.R%h");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChangeSetResults changeSetResults0 = new ChangeSetResults();
      changeSetResults0.addedFromChangeSet("716eHF{CG>D.R%h");
      boolean boolean0 = changeSetResults0.hasBeenAdded("716eHF{CG>D.R%h");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChangeSetResults changeSetResults0 = new ChangeSetResults();
      List<String> list0 = changeSetResults0.getAddedFromChangeSet();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChangeSetResults changeSetResults0 = new ChangeSetResults();
      changeSetResults0.deleted("716eHF{CG>D.R%h");
      List<String> list0 = changeSetResults0.getDeleted();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ChangeSetResults changeSetResults0 = new ChangeSetResults();
      List<String> list0 = changeSetResults0.getDeleted();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ChangeSetResults changeSetResults0 = new ChangeSetResults();
      List<String> list0 = changeSetResults0.getAddedFromStream();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ChangeSetResults changeSetResults0 = new ChangeSetResults();
      changeSetResults0.addedFromStream("716eHF{CG>D.R%h");
      boolean boolean0 = changeSetResults0.hasBeenAdded("716eHF{CG>D.R%h");
      assertTrue(boolean0);
  }
}
