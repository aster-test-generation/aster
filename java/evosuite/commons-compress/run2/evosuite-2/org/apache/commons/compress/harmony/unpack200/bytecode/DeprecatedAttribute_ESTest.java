
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


package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.DataOutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DeprecatedAttribute_ESTest extends DeprecatedAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      int int0 = deprecatedAttribute0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeprecatedAttribute.setAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      String string0 = deprecatedAttribute0.toString();
      assertEquals("Deprecated Attribute", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      deprecatedAttribute0.writeBody(dataOutputStream0);
      assertFalse(deprecatedAttribute0.isSourceFileAttribute());
  }
}
