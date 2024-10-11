import unittest
from ansible.module_utils.yumdnf import YumDnf
from ansible.module_utils import dnf


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule()
        self.dnf_module = DnfModule(self.module)

    def test_init(self):
        self.assertTrue(isinstance(self.dnf_module, YumDnf))

    def test_private_method(self):
        result = self.dnf_module._private_method()
        self.assertEqual(result, "private method result")

    def test_protected_method(self):
        result = self.dnf_module._protected_method()
        self.assertEqual(result, "protected method result")

    def test_magic_method(self):
        result = self.dnf_module.__magic_method()
        self.assertEqual(result, "magic method result")

if __name__ == '__main__':
    unittest.main()