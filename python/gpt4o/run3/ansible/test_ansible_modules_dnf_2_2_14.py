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
        self.dnf_module = DnfModuleImpl(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('ansible.modules.dnf.dnf')
    def test_init_with_modules(self, mock_dnf):
        mock_dnf.base.WITH_MODULES = True
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    def test_is_newer_version_installed_no_candidate_pkg(self):
        self.dnf_module._packagename_dict = MagicMock(return_value=None)
        result = self.dnf_module._is_newer_version_installed('test_pkg')
        self.assertFalse(result)

    @patch('ansible.modules.dnf.DnfModule._packagename_dict')
    @patch('ansible.modules.dnf.DnfModule._compare_evr')
    def test_is_newer_version_installed_no_installed_pkg(self, mock_compare_evr, mock_packagename_dict):
        mock_packagename_dict.return_value = {'name': 'test_pkg'}
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().installed().filter().run.return_value = []
        result = self.dnf_module._is_newer_version_installed('test_pkg')
        self.assertFalse(result)

    @patch('ansible.modules.dnf.DnfModule._packagename_dict')
    @patch('ansible.modules.dnf.DnfModule._compare_evr')
    def test_is_newer_version_installed_evr_cmp_1(self, mock_compare_evr, mock_packagename_dict):
        mock_packagename_dict.return_value = {'name': 'test_pkg', 'epoch': 0, 'version': '1.0', 'release': '1'}
        self.dnf_module.base = MagicMock()
        installed_pkg = MagicMock()
        installed_pkg.epoch = 0
        installed_pkg.version = '1.0'
        installed_pkg.release = '1'
        self.dnf_module.base.sack.query().installed().filter().run.return_value = [installed_pkg]
        mock_compare_evr.return_value = 1
        result = self.dnf_module._is_newer_version_installed('test_pkg')
        self.assertTrue(result)

    @patch('ansible.modules.dnf.DnfModule._packagename_dict')
    @patch('ansible.modules.dnf.DnfModule._compare_evr')
    def test_is_newer_version_installed_evr_cmp_not_1(self, mock_compare_evr, mock_packagename_dict):
        mock_packagename_dict.return_value = {'name': 'test_pkg', 'epoch': 0, 'version': '1.0', 'release': '1'}
        self.dnf_module.base = MagicMock()
        installed_pkg = MagicMock()
        installed_pkg.epoch = 0
        installed_pkg.version = '1.0'
        installed_pkg.release = '1'
        self.dnf_module.base.sack.query().installed().filter().run.return_value = [installed_pkg]
        mock_compare_evr.return_value = 0
        result = self.dnf_module._is_newer_version_installed('test_pkg')
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()