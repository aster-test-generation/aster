import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': False,
            'nobest': False
        }
        self.dnf_module = DnfModuleImplementation(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('ansible.modules.dnf.dnf.base.WITH_MODULES', True)
    def test_init_with_modules(self):
        self.dnf_module = DnfModule(self.module)
        self.assertTrue(self.dnf_module.with_modules)

    def test_whatprovides(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().available().filter().union().run.return_value = [MagicMock(name='test_package')]
        result = self.dnf_module._whatprovides('/usr/bin/test')
        self.assertEqual(result, 'test_package')

    def test_whatprovides_no_package(self):
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().available().filter().union().run.return_value = []
        result = self.dnf_module._whatprovides('/usr/bin/test')
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()