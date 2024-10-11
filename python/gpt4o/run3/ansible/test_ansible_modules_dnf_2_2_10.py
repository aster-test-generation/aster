import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule, AnsibleModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
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

    def test_specify_repositories(self):
        base = MagicMock()
        base.repos.get_matching = MagicMock(return_value=[MagicMock(), MagicMock()])
        disablerepo = ['repo1', 'repo2']
        enablerepo = ['repo3', 'repo4']

        self.dnf_module._specify_repositories(base, disablerepo, enablerepo)

        for repo in base.repos.get_matching.return_value:
            repo.disable.assert_called()
            repo.enable.assert_called()

    def test_specify_repositories_no_patterns(self):
        base = MagicMock()
        base.repos.get_matching = MagicMock(return_value=[MagicMock(), MagicMock()])
        disablerepo = [None, '']
        enablerepo = [None, '']

        self.dnf_module._specify_repositories(base, disablerepo, enablerepo)

        for repo in base.repos.get_matching.return_value:
            repo.disable.assert_not_called()
            repo.enable.assert_not_called()

if __name__ == '__main__':
    unittest.main()