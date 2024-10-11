import unittest
from ansible.module_utils.yumdnf import YumDnf
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule()
        self.dnf_module = DnfModule(self.module)

    def test_init(self):
        self.assertTrue(isinstance(self.dnf_module, YumDnf))

    def test_private_method(self):
        self.assertEqual(self.dnf_module._private_method(5), 25)

    def test_protected_method(self):
        self.assertEqual(self.dnf_module._protected_method(3), 6)

    def test_magic_method(self):
        self.assertEqual(self.dnf_module.__str__(), "DnfModule")

if __name__ == '__main__':
    unittest.main()