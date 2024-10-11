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

    @patch('ansible.modules.dnf.dnf.subject.Subject')
    def test_list_items_installed(self, mock_subject):
        mock_query = MagicMock()
        mock_query.installed.return_value = ['pkg1', 'pkg2']
        self.dnf_module.base.sack.query.return_value = mock_query
        self.dnf_module._package_dict = MagicMock(side_effect=lambda x: {'name': x})

        self.dnf_module.list_items('installed')
        self.dnf_module.module.exit_json.assert_called_once_with(msg='', results=[{'name': 'pkg1'}, {'name': 'pkg2'}])

    @patch('ansible.modules.dnf.dnf.subject.Subject')
    def test_list_items_upgrades(self, mock_subject):
        mock_query = MagicMock()
        mock_query.upgrades.return_value = ['pkg1', 'pkg2']
        self.dnf_module.base.sack.query.return_value = mock_query
        self.dnf_module._package_dict = MagicMock(side_effect=lambda x: {'name': x})

        self.dnf_module.list_items('updates')
        self.dnf_module.module.exit_json.assert_called_once_with(msg='', results=[{'name': 'pkg1'}, {'name': 'pkg2'}])

    @patch('ansible.modules.dnf.dnf.subject.Subject')
    def test_list_items_available(self, mock_subject):
        mock_query = MagicMock()
        mock_query.available.return_value = ['pkg1', 'pkg2']
        self.dnf_module.base.sack.query.return_value = mock_query
        self.dnf_module._package_dict = MagicMock(side_effect=lambda x: {'name': x})

        self.dnf_module.list_items('available')
        self.dnf_module.module.exit_json.assert_called_once_with(msg='', results=[{'name': 'pkg1'}, {'name': 'pkg2'}])

    def test_list_items_repos(self):
        mock_repo = MagicMock()
        mock_repo.id = 'repo1'
        self.dnf_module.base.repos.iter_enabled.return_value = [mock_repo]

        self.dnf_module.list_items('repos')
        self.dnf_module.module.exit_json.assert_called_once_with(msg='', results=[{'repoid': 'repo1', 'state': 'enabled'}])

    @patch('ansible.modules.dnf.dnf.subject.Subject')
    def test_list_items_command(self, mock_subject):
        mock_package = MagicMock()
        mock_subject.return_value.get_best_query.return_value = [mock_package]
        self.dnf_module._package_dict = MagicMock(side_effect=lambda x: {'name': 'pkg1'})

        self.dnf_module.list_items('some_command')
        self.dnf_module.module.exit_json.assert_called_once_with(msg='', results=[{'name': 'pkg1'}])

    def test_package_dict(self):
        package = MagicMock()
        package.name = 'pkg1'
        package.version = '1.0'
        package.release = '1'
        package.arch = 'x86_64'
        result = self.dnf_module._package_dict(package)
        self.assertEqual(result, {
            'name': 'pkg1',
            'version': '1.0',
            'release': '1',
            'arch': 'x86_64'
        })

if __name__ == '__main__':
    unittest.main()