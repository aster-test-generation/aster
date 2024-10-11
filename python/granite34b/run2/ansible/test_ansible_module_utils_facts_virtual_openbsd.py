import unittest
from ansible.module_utils.facts.virtual.openbsd import OpenBSDVirtual, OpenBSDVirtualCollector
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin
from ansible.module_utils.facts.utils import get_file_content


class TestOpenBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual_facts = {}
        host_tech = set()
        guest_tech = set()
        virtual_facts['virtualization_type'] = ''
        virtual_facts['virtualization_role'] = ''
        virtual_product_facts = VirtualSysctlDetectionMixin.detect_virt_product(key='hw.product')
        guest_tech.update(virtual_product_facts['virtualization_tech_guest'])
        host_tech.update(virtual_product_facts['virtualization_tech_host'])
        virtual_facts.update(virtual_product_facts)
        virtual_vendor_facts = VirtualSysctlDetectionMixin.detect_virt_vendor('hw.vendor')
        guest_tech.update(virtual_vendor_facts['virtualization_tech_guest'])
        host_tech.update(virtual_vendor_facts['virtualization_tech_host'])
        if virtual_facts['virtualization_type'] == '':
            virtual_facts.update(virtual_vendor_facts)
        dmesg_boot = get_file_content(OpenBSDVirtual.DMESG_BOOT)
        for line in dmesg_boot.splitlines():
            match = re.match('^vmm0 at mainbus0: (SVM/RVI|VMX/EPT)$', line)
            if match:
                host_tech.add('vmm')
                virtual_facts['virtualization_type'] = 'vmm'
                virtual_facts['virtualization_role'] = 'host'
        virtual_facts['virtualization_tech_guest'] = guest_tech
        virtual_facts['virtualization_tech_host'] = host_tech
        self.assertEqual(virtual_facts['virtualization_type'], 'vmm')
        self.assertEqual(virtual_facts['virtualization_role'], 'host')
        self.assertEqual(virtual_facts['virtualization_tech_guest'], {'vmm'})
        self.assertEqual(virtual_facts['virtualization_tech_host'], {'vmm'})

class TestOpenBSDVirtualCollector(unittest.TestCase):
    def test_collect_facts(self):
        collector = OpenBSDVirtualCollector()
        facts = collector.collect()
        self.assertEqual(facts['virtualization_type'], 'parallels')
        self.assertEqual(facts['virtualization_role'], 'host')
        self.assertEqual(facts['virtualization_tech_guest'], {'vmm'})
        self.assertEqual(facts['virtualization_tech_host'], {'vmm'})

if __name__ == '__main__':
    unittest.main()