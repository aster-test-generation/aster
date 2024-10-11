import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.virtual.netbsd import NetBSDVirtual, NetBSDVirtualCollector


class TestNetBSDVirtual(unittest.TestCase):
    def setUp(self):
        self.instance = NetBSDVirtual(module=MagicMock())

    @patch('ansible.module_utils.facts.virtual.netbsd.NetBSDVirtual.detect_virt_product')
    @patch('ansible.module_utils.facts.virtual.netbsd.NetBSDVirtual.detect_virt_vendor')
    @patch('os.path.exists')
    def test_get_virtual_facts(self, mock_exists, mock_detect_virt_vendor, mock_detect_virt_product):
        mock_exists.return_value = False
        mock_detect_virt_product.return_value = {
            'virtualization_tech_guest': set(),
            'virtualization_tech_host': set(),
            'virtualization_type': '',
            'virtualization_role': ''
        }
        mock_detect_virt_vendor.return_value = {
            'virtualization_tech_guest': set(),
            'virtualization_tech_host': set(),
            'virtualization_type': '',
            'virtualization_role': ''
        }
        result = self.instance.get_virtual_facts()
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

    @patch('ansible.module_utils.facts.virtual.netbsd.NetBSDVirtual.detect_virt_product')
    @patch('ansible.module_utils.facts.virtual.netbsd.NetBSDVirtual.detect_virt_vendor')
    @patch('os.path.exists')
    def test_get_virtual_facts_with_xen(self, mock_exists, mock_detect_virt_vendor, mock_detect_virt_product):
        mock_exists.return_value = True
        mock_detect_virt_product.return_value = {
            'virtualization_tech_guest': set(),
            'virtualization_tech_host': set(),
            'virtualization_type': '',
            'virtualization_role': ''
        }
        mock_detect_virt_vendor.return_value = {
            'virtualization_tech_guest': set(),
            'virtualization_tech_host': set(),
            'virtualization_type': '',
            'virtualization_role': ''
        }
        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'xen')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('xen', result['virtualization_tech_guest'])

class TestNetBSDVirtualCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = NetBSDVirtualCollector()
        self.assertEqual(collector._fact_class, NetBSDVirtual)

    def test_platform(self):
        collector = NetBSDVirtualCollector()
        self.assertEqual(collector._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()