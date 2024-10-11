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
        self.dnf_module = ConcreteDnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertTrue(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    def test_package_dict(self):
        package = MagicMock()
        package.name = 'testpkg'
        package.arch = 'x86_64'
        package.epoch = 0
        package.release = '1'
        package.version = '1.0'
        package.repoid = 'base'
        package.installtime = 0

        result = self.dnf_module._package_dict(package)
        expected = {
            'name': 'testpkg',
            'arch': 'x86_64',
            'epoch': '0',
            'release': '1',
            'version': '1.0',
            'repo': 'base',
            'envra': '0:testpkg-1.0-1.x86_64',
            'nevra': '0:testpkg-1.0-1.x86_64',
            'yumstate': 'available'
        }
        self.assertEqual(result, expected)

    def test_package_dict_installed(self):
        package = MagicMock()
        package.name = 'testpkg'
        package.arch = 'x86_64'
        package.epoch = 0
        package.release = '1'
        package.version = '1.0'
        package.repoid = 'base'
        package.installtime = 1

        result = self.dnf_module._package_dict(package)
        expected = {
            'name': 'testpkg',
            'arch': 'x86_64',
            'epoch': '0',
            'release': '1',
            'version': '1.0',
            'repo': 'base',
            'envra': '0:testpkg-1.0-1.x86_64',
            'nevra': '0:testpkg-1.0-1.x86_64',
            'yumstate': 'installed'
        }
        self.assertEqual(result, expected)

    def test_private_ensure_dnf(self):
        with patch('ansible.modules.dnf.dnf') as mock_dnf:
            self.dnf_module._DnfModule__ensure_dnf()
            mock_dnf.base.WITH_MODULES.assert_called_once()

if __name__ == '__main__':
    unittest.main()