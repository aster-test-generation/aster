import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': True,
            'nobest': False
        }
        self.dnf_module = DnfModuleImplementation(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertTrue(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('ansible.modules.dnf.dnf')
    def test_with_modules(self, mock_dnf):
        mock_dnf.base.WITH_MODULES = True
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf')
    def test_with_modules_attribute_error(self, mock_dnf):
        del mock_dnf.base.WITH_MODULES
        dnf_module = DnfModule(self.module)
        self.assertFalse(dnf_module.with_modules)

    def test_package_dict(self):
        package = MagicMock()
        package.name = 'test_package'
        package.arch = 'x86_64'
        package.epoch = 0
        package.release = '1'
        package.version = '1.0'
        package.repoid = 'base'
        package.installtime = 0

        expected_result = {
            'name': 'test_package',
            'arch': 'x86_64',
            'epoch': '0',
            'release': '1',
            'version': '1.0',
            'repo': 'base',
            'envra': '0:test_package-1.0-1.x86_64',
            'nevra': '0:test_package-1.0-1.x86_64',
            'yumstate': 'available'
        }

        result = self.dnf_module._package_dict(package)
        self.assertEqual(result, expected_result)

    def test_package_dict_installed(self):
        package = MagicMock()
        package.name = 'test_package'
        package.arch = 'x86_64'
        package.epoch = 0
        package.release = '1'
        package.version = '1.0'
        package.repoid = 'base'
        package.installtime = 1

        expected_result = {
            'name': 'test_package',
            'arch': 'x86_64',
            'epoch': '0',
            'release': '1',
            'version': '1.0',
            'repo': 'base',
            'envra': '0:test_package-1.0-1.x86_64',
            'nevra': '0:test_package-1.0-1.x86_64',
            'yumstate': 'installed'
        }

        result = self.dnf_module._package_dict(package)
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()