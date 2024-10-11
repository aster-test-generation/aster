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

    def test_specify_repositories(self):
        base = MagicMock()
        base.repos.get_matching = MagicMock(return_value=[MagicMock()])
        disablerepo = ['repo1']
        enablerepo = ['repo2']

        self.dnf_module._specify_repositories(base, disablerepo, enablerepo)

        base.read_all_repos.assert_called_once()
        base.repos.get_matching.assert_any_call('repo1')
        base.repos.get_matching.assert_any_call('repo2')
        base.repos.get_matching.return_value[0].disable.assert_called_once()
        base.repos.get_matching.return_value[0].enable.assert_called_once()

if __name__ == '__main__':
    unittest.main()