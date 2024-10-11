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
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('ansible.modules.dnf.dnf.base.WITH_MODULES', True)
    def test_with_modules_true(self):
        dnf_module = DnfModule(self.module)
        self.assertTrue(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf.base.WITH_MODULES', False)
    def test_with_modules_false(self):
        dnf_module = DnfModule(self.module)
        self.assertFalse(dnf_module.with_modules)

    @patch('ansible.modules.dnf.dnf.subject.Subject.get_best_query')
    @patch('ansible.modules.dnf.DnfModule._package_dict')
    def test_list_items_installed(self, mock_package_dict, mock_get_best_query):
        mock_package = MagicMock()
        mock_package_dict.return_value = {'name': 'test_package'}
        self.dnf_module.base.sack.query().installed.return_value = [mock_package]

        self.dnf_module.list_items('installed')
        self.module.exit_json.assert_called_once_with(msg='', results=[{'name': 'test_package'}])

    @patch('ansible.modules.dnf.dnf.subject.Subject.get_best_query')
    @patch('ansible.modules.dnf.DnfModule._package_dict')
    def test_list_items_upgrades(self, mock_package_dict, mock_get_best_query):
        mock_package = MagicMock()
        mock_package_dict.return_value = {'name': 'test_package'}
        self.dnf_module.base.sack.query().upgrades.return_value = [mock_package]

        self.dnf_module.list_items('updates')
        self.module.exit_json.assert_called_once_with(msg='', results=[{'name': 'test_package'}])

    @patch('ansible.modules.dnf.dnf.subject.Subject.get_best_query')
    @patch('ansible.modules.dnf.DnfModule._package_dict')
    def test_list_items_available(self, mock_package_dict, mock_get_best_query):
        mock_package = MagicMock()
        mock_package_dict.return_value = {'name': 'test_package'}
        self.dnf_module.base.sack.query().available.return_value = [mock_package]

        self.dnf_module.list_items('available')
        self.module.exit_json.assert_called_once_with(msg='', results=[{'name': 'test_package'}])

    @patch('ansible.modules.dnf.dnf.subject.Subject.get_best_query')
    @patch('ansible.modules.dnf.DnfModule._package_dict')
    def test_list_items_repos(self, mock_package_dict, mock_get_best_query):
        mock_repo = MagicMock()
        mock_repo.id = 'test_repo'
        self.dnf_module.base.repos.iter_enabled.return_value = [mock_repo]

        self.dnf_module.list_items('repos')
        self.module.exit_json.assert_called_once_with(msg='', results=[{'repoid': 'test_repo', 'state': 'enabled'}])

    @patch('ansible.modules.dnf.dnf.subject.Subject.get_best_query')
    @patch('ansible.modules.dnf.DnfModule._package_dict')
    def test_list_items_command(self, mock_package_dict, mock_get_best_query):
        mock_package = MagicMock()
        mock_package_dict.return_value = {'name': 'test_package'}
        mock_get_best_query.return_value = [mock_package]

        self.dnf_module.list_items('test_command')
        self.module.exit_json.assert_called_once_with(msg='', results=[{'name': 'test_package'}])

if __name__ == '__main__':
    unittest.main()