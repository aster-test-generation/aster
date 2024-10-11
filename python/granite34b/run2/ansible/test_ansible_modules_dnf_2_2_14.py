import unittest
from ansible.module_utils.dnf_base import DnfBase


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, dnf.base.WITH_MODULES)
        self.assertEqual(dnf_module.allowerasing, module.params['allowerasing'])
        self.assertEqual(dnf_module.nobest, module.params['nobest'])

    def test_is_newer_version_installed(self):
        module = MagicMock()
        dnf_module = DnfModule(module)
        candidate_pkg = {'name': 'example_package', 'epoch': '1', 'version': '1.0', 'release': '1'}
        installed_pkg = {'name': 'example_package', 'epoch': '1', 'version': '0.9', 'release': '1'}
        installed = MagicMock()
        installed.filter.return_value.run.return_value = [installed_pkg]
        dnf_module.base.sack.query.return_value.installed.return_value = installed
        self.assertTrue(dnf_module._is_newer_version_installed(candidate_pkg))

if __name__ == '__main__':
    unittest.main()