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
        self.dnf_module = ConcreteDnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('ansible.modules.dnf.dnf')
    def test_init_with_modules(self, mock_dnf):
        mock_dnf.base.WITH_MODULES = True
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf')
    def test_init_without_modules(self, mock_dnf):
        del mock_dnf.base.WITH_MODULES
        dnf_module = DnfModule(self.module)
        self.assertFalse(dnf_module.with_modules)

    @patch.object(DnfModule, '_packagename_dict')
    @patch.object(DnfModule, '_compare_evr')
    def test_is_newer_version_installed(self, mock_compare_evr, mock_packagename_dict):
        mock_packagename_dict.return_value = {
            'name': 'testpkg',
            'epoch': '1',
            'version': '1.0',
            'release': '1'
        }
        mock_compare_evr.return_value = 1

        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().installed().filter().run.return_value = [MagicMock(epoch='1', version='1.0', release='1')]

        result = self.dnf_module._is_newer_version_installed('testpkg')
        self.assertTrue(result)

    @patch.object(DnfModule, '_packagename_dict')
    @patch.object(DnfModule, '_compare_evr')
    def test_is_newer_version_installed_no_candidate(self, mock_compare_evr, mock_packagename_dict):
        mock_packagename_dict.return_value = None

        result = self.dnf_module._is_newer_version_installed('testpkg')
        self.assertFalse(result)

    @patch.object(DnfModule, '_packagename_dict')
    @patch.object(DnfModule, '_compare_evr')
    def test_is_newer_version_installed_no_installed_pkg(self, mock_compare_evr, mock_packagename_dict):
        mock_packagename_dict.return_value = {
            'name': 'testpkg',
            'epoch': '1',
            'version': '1.0',
            'release': '1'
        }

        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().installed().filter().run.return_value = []

        result = self.dnf_module._is_newer_version_installed('testpkg')
        self.assertFalse(result)

    @patch.object(DnfModule, '_packagename_dict')
    @patch.object(DnfModule, '_compare_evr')
    def test_is_newer_version_installed_older_version(self, mock_compare_evr, mock_packagename_dict):
        mock_packagename_dict.return_value = {
            'name': 'testpkg',
            'epoch': '1',
            'version': '1.0',
            'release': '1'
        }
        mock_compare_evr.return_value = -1

        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().installed().filter().run.return_value = [MagicMock(epoch='1', version='1.0', release='1')]

        result = self.dnf_module._is_newer_version_installed('testpkg')
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()