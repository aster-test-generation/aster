import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.virtual.freebsd import FreeBSDVirtual, FreeBSDVirtualCollector


class TestFreeBSDVirtual(unittest.TestCase):
    def setUp(self):
        self.instance = FreeBSDVirtual(module=None)

    @patch('os.path.exists')
    @patch.object(FreeBSDVirtual, 'detect_virt_product')
    @patch.object(FreeBSDVirtual, 'detect_virt_vendor')
    def test_get_virtual_facts(self, mock_detect_virt_vendor, mock_detect_virt_product, mock_path_exists):
        mock_path_exists.return_value = False
        mock_detect_virt_product.return_value = {
            'virtualization_tech_guest': set(),
            'virtualization_tech_host': set()
        }
        mock_detect_virt_vendor.return_value = {
            'virtualization_tech_guest': set(),
            'virtualization_tech_host': set()
        }
        
        result = self.instance.get_virtual_facts()
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

    @patch('os.path.exists')
    @patch.object(FreeBSDVirtual, 'detect_virt_product')
    @patch.object(FreeBSDVirtual, 'detect_virt_vendor')
    def test_get_virtual_facts_with_xen(self, mock_detect_virt_vendor, mock_detect_virt_product, mock_path_exists):
        mock_path_exists.return_value = True
        mock_detect_virt_product.return_value = {
            'virtualization_tech_guest': set(),
            'virtualization_tech_host': set()
        }
        mock_detect_virt_vendor.return_value = {
            'virtualization_tech_guest': set(),
            'virtualization_tech_host': set()
        }
        
        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'xen')
        self.assertEqual(result['virtualization_role'], 'guest')

class TestFreeBSDVirtualCollector(unittest.TestCase):
    def setUp(self):
        self.instance = FreeBSDVirtualCollector()

    def test_fact_class(self):
        self.assertEqual(self.instance._fact_class, FreeBSDVirtual)

    def test_platform(self):
        self.assertEqual(self.instance._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()