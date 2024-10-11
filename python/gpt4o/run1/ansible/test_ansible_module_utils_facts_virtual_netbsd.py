import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.virtual.netbsd import NetBSDVirtual, NetBSDVirtualCollector


class TestNetBSDVirtual(unittest.TestCase):
    def setUp(self):
        self.instance = NetBSDVirtual(module=MagicMock())

    @patch('ansible.module_utils.facts.virtual.netbsd.os.path.exists')
    @patch.object(NetBSDVirtual, 'detect_virt_product')
    @patch.object(NetBSDVirtual, 'detect_virt_vendor')
    def test_get_virtual_facts(self, mock_detect_virt_vendor, mock_detect_virt_product, mock_path_exists):
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
        mock_path_exists.return_value = False

        result = self.instance.get_virtual_facts()
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

    @patch('ansible.module_utils.facts.virtual.netbsd.os.path.exists')
    @patch.object(NetBSDVirtual, 'detect_virt_product')
    @patch.object(NetBSDVirtual, 'detect_virt_vendor')
    def test_get_virtual_facts_with_xen(self, mock_detect_virt_vendor, mock_detect_virt_product, mock_path_exists):
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
        mock_path_exists.return_value = True

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'xen')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('xen', result['virtualization_tech_guest'])

class TestNetBSDVirtualCollector(unittest.TestCase):
    def setUp(self):
        self.instance = NetBSDVirtualCollector(mod=MagicMock())

    def test_fact_class(self):
        self.assertEqual(self.instance._fact_class, NetBSDVirtual)

    def test_platform(self):
        self.assertEqual(self.instance._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()