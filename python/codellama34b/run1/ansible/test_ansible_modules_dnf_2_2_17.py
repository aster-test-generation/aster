import unittest
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_parse_spec_group_file(self):
        instance = DnfModule(None)
        instance.names = []
        pkg_specs, grp_specs, module_specs, filenames = instance._parse_spec_group_file()
        self.assertIsNotNone(pkg_specs)
        self.assertIsNotNone(grp_specs)
        self.assertIsNotNone(module_specs)
        self.assertIsNotNone(filenames)

if __name__ == '__main__':
    unittest.main()