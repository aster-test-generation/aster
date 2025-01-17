/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.jxpath.ri.model.beans;

import org.apache.commons.jxpath.*;

/**
 * Test AbstractFactory.
 */
public class TestBeanFactory extends AbstractFactory {

    /**
     * Return <b>false</b> if this factory cannot create the requested object.
     */
    @Override
    public boolean createObject(
        final JXPathContext context,
        final Pointer pointer,
        final Object parent,
        final String name,
        final int index)
    {
        if (name.equals("nestedBean")) {
            ((TestBean) parent).setNestedBean(new NestedTestBean("newName"));
            return true;
        }
        else if (name.equals("beans")) {
            final TestBean bean = (TestBean) parent;
            if (bean.getBeans() == null || index >= bean.getBeans().length) {
                bean.setBeans(new NestedTestBean[index + 1]);
            }
            bean.getBeans()[index] = new NestedTestBean("newName");
            return true;
        }
        else if (name.equals("integers")) {
            // This will implicitly expand the collection
             ((TestBean) parent).setIntegers(index, 0);
            return true;
        }
        return false;
    }

    /**
     * Create a new object and set it on the specified variable
     */
    @Override
    public boolean declareVariable(final JXPathContext context, final String name) {
        return false;
    }
}
