import unittest
from ansible.module_utils.dnf import DnfModule
from ansible.module_utils.dnf import YumDnf
from ansible.module_utils.dnf import yumdnf_argument_spec
from ansible.module_utils.dnf import dnf



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance, DnfModule)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_with_modules(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.with_modules, bool)

    def test_allowerasing(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.allowerasing, bool)

    def test_nobest(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.nobest, bool)

if __name__ == '__main__':
    unittest.main()