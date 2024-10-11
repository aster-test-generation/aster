import unittest
from unittest.mock import patch, mock_open
from ansible.module_utils.facts.virtual.openbsd import OpenBSDVirtual, OpenBSDVirtualCollector
from ansible.module_utils.facts.utils import get_file_content

class TestOpenBSDVirtual(unittest.TestCase):
    def setUp(self):
        self.instance = OpenBSDVirtual(module=None)

    @patch('ansible.module_utils.facts.virtual.openbsd.get_file_content', return_value='vmm0 at mainbus0: VMX/EPT\n')
    @patch.object(OpenBSDVirtual, 'detect_virt_product', return_value={
        'virtualization_tech_guest': set(),
        'virtualization_tech_host': set(),
        'virtualization_type': '',
        'virtualization_role': ''
    })
    @patch.object(OpenBSDVirtual, 'detect_virt_vendor', return_value={
        'virtualization_tech_guest': set(),
        'virtualization_tech_host': set(),
        'virtualization_type': '',
        'virtualization_role': ''
    })
    def test_get_virtual_facts(self, mock_detect_virt_vendor, mock_detect_virt_product, mock_get_file_content):
        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'vmm')
        self.assertEqual(result['virtualization_role'], 'host')
        self.assertIn('vmm', result['virtualization_tech_host'])

    def test_platform(self):
        self.assertEqual(self.instance.platform, 'OpenBSD')

    def test_dmesg_boot(self):
        self.assertEqual(self.instance.DMESG_BOOT, '/var/run/dmesg.boot')

class TestOpenBSDVirtualCollector(unittest.TestCase):
    def setUp(self):
        self.collector = OpenBSDVirtualCollector()

    def test_fact_class(self):
        self.assertEqual(self.collector._fact_class, OpenBSDVirtual)

    def test_platform(self):
        self.assertEqual(self.collector._platform, 'OpenBSD')

if __name__ == '__main__':
    unittest.main()