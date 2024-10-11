/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PackageFunctions_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_ZTBj0() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[0];
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_DvXy1() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[1];
        parameters[0] = new Object();
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_GWTE2() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[2];
        parameters[0] = new Object();
        parameters[1] = new Object();
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_yfiV3() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = null;
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
    }
}