/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.HashMap;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicVariables_Coverage_Test_Passing {
        private HashMap<String, String> vars = new HashMap<>();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
        public void declareVariable(String varName, String value) {
            vars.put(varName, value);
        }
}