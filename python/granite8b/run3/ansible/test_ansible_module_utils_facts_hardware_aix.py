import unittest
from ansible.module_utils.facts.hardware.aix import AIXHardware


class TestAIXHardware(unittest.TestCase):
    def test_populate(self):
        hardware = AIXHardware(module=None)
        result = hardware.populate()
        self.assertEqual(result['processor_count'], 1)
        self.assertEqual(result['processor'], 'powerpc')
        self.assertEqual(result['processor_cores'], 1)
        self.assertEqual(result['memtotal_mb'], 4096)
        self.assertEqual(result['memfree_mb'], 4096)
        self.assertEqual(result['swaptotal_mb'], 0)
        self.assertEqual(result['swapfree_mb'], 0)
        self.assertEqual(result['firmware_version'], '2.2.0.1')
        self.assertEqual(result['product_serial'], 'N1234567890')
        self.assertEqual(result['lpar_info'], 'LPAR1')
        self.assertEqual(result['product_name'], 'PowerVM')
        self.assertEqual(result['vgs'], {})
        self.assertEqual(result['mounts'], [])
        self.assertEqual(result['devices'], {})

if __name__ == '__main__':
    unittest.main()