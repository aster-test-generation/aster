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
        disablerepo = ['repo1', 'repo2']
        enablerepo = ['repo3', 'repo4']
        repos = MagicMock()
        base.repos = repos

        self.dnf_module._specify_repositories(base, disablerepo, enablerepo)

        repos.get_matching.assert_any_call('repo1')
        repos.get_matching.assert_any_call('repo2')
        repos.get_matching.assert_any_call('repo3')
        repos.get_matching.assert_any_call('repo4')

if __name__ == '__main__':
    unittest.main()