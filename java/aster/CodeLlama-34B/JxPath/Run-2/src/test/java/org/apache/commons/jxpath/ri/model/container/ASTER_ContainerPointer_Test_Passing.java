/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointer_Test_Passing {
    private Container container;
    private NodePointer valuePointer;
    ContainerPointer containerpointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithParentAndLocaleAndIdAndNodeAndParentNodeAndParentNodeLocale_FRou6() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainerWithNullInput_tJtb2_orve0() {
        ContainerPointer containerPointer = new ContainerPointer(null, Locale.getDefault());
        assertTrue(containerPointer.isContainer());
    }
}