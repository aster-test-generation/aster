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

    @patch('ansible.modules.dnf.dnf')
    def test_list_items_updates(self, mock_dnf):
        mock_dnf.subject.Subject().get_best_query().return_value = []
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().upgrades.return_value = []
        self.dnf_module.list_items('updates')
        self.module.exit_json.assert_called_with(msg='', results=[])

    @patch('ansible.modules.dnf.dnf')
    def test_list_items_installed(self, mock_dnf):
        mock_dnf.subject.Subject().get_best_query().return_value = []
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().installed.return_value = []
        self.dnf_module.list_items('installed')
        self.module.exit_json.assert_called_with(msg='', results=[])

    @patch('ansible.modules.dnf.dnf')
    def test_list_items_available(self, mock_dnf):
        mock_dnf.subject.Subject().get_best_query().return_value = []
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.sack.query().available.return_value = []
        self.dnf_module.list_items('available')
        self.module.exit_json.assert_called_with(msg='', results=[])

    @patch('ansible.modules.dnf.dnf')
    def test_list_items_repos(self, mock_dnf):
        self.dnf_module.base = MagicMock()
        self.dnf_module.base.repos.iter_enabled.return_value = []
        self.dnf_module.list_items('repos')
        self.module.exit_json.assert_called_with(msg='', results=[])

    @patch('ansible.modules.dnf.dnf')
    def test_list_items_command(self, mock_dnf):
        mock_dnf.subject.Subject().get_best_query().return_value = []
        self.dnf_module.base = MagicMock()
        self.dnf_module.list_items('some_command')
        self.module.exit_json.assert_called_with(msg='', results=[])

if __name__ == '__main__':
    unittest.main()