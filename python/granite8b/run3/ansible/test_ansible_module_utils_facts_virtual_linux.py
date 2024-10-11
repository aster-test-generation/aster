import unittest
from ansible.module_utils.facts.virtual import LinuxVirtual


class TestLinuxVirtual(unittest.TestCase):
    def test_init(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

    def test_get_virtual(self):
        instance = LinuxVirtual()
        result = instance.get_virtual()
        self.assertEqual(result, {'virtual': 'Linux'})

    def test_get_virtual_with_id(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(id='test_id')
        self.assertEqual(result, {'virtual': 'Linux', 'virtual_subtype': 'test_id'})

    def test_get_virtual_with_id_and_version(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(id='test_id', version='test_version')
        self.assertEqual(result, {'virtual': 'Linux', 'virtual_subtype': 'test_id', 'virtual_version': 'test_version'})

if __name__ == '__main__':
    unittest.main()