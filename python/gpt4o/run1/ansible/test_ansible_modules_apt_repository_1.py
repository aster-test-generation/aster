import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.apt_repository import install_python_apt, get_add_ppa_signing_key_callback, revert_sources_list
from ansible.modules.apt_repository import *


class TestAptRepositoryModule(unittest.TestCase):

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_install_python_apt_success(self, MockAnsibleModule):
        module = MockAnsibleModule()
        module.check_mode = False
        module.get_bin_path.return_value = '/usr/bin/apt-get'
        module.run_command.side_effect = [(0, '', ''), (0, '', '')]

        install_python_apt(module, 'python-apt')
        module.run_command.assert_any_call(['/usr/bin/apt-get', 'update'])
        module.run_command.assert_any_call(['/usr/bin/apt-get', 'install', 'python-apt', '-y', '-q'])

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_install_python_apt_fail_update(self, MockAnsibleModule):
        module = MockAnsibleModule()
        module.check_mode = False
        module.get_bin_path.return_value = '/usr/bin/apt-get'
        module.run_command.side_effect = [(1, '', 'error')]

        with self.assertRaises(SystemExit):
            install_python_apt(module, 'python-apt')
        module.fail_json.assert_called_with(msg="Failed to auto-install python-apt. Error was: 'error'")

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_install_python_apt_fail_install(self, MockAnsibleModule):
        module = MockAnsibleModule()
        module.check_mode = False
        module.get_bin_path.return_value = '/usr/bin/apt-get'
        module.run_command.side_effect = [(0, '', ''), (1, '', 'error')]

        with self.assertRaises(SystemExit):
            install_python_apt(module, 'python-apt')
        module.fail_json.assert_called_with(msg="Failed to auto-install python-apt. Error was: 'error'")

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_install_python_apt_check_mode(self, MockAnsibleModule):
        module = MockAnsibleModule()
        module.check_mode = True

        with self.assertRaises(SystemExit):
            install_python_apt(module, 'python-apt')
        module.fail_json.assert_called_with(msg='python-apt must be installed to use check mode')

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_get_add_ppa_signing_key_callback_check_mode(self, MockAnsibleModule):
        module = MockAnsibleModule()
        module.check_mode = True

        callback = get_add_ppa_signing_key_callback(module)
        self.assertIsNone(callback)

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_get_add_ppa_signing_key_callback_run_command(self, MockAnsibleModule):
        module = MockAnsibleModule()
        module.check_mode = False

        callback = get_add_ppa_signing_key_callback(module)
        self.assertIsNotNone(callback)
        module.run_command = MagicMock()
        callback(['command'])
        module.run_command.assert_called_with(['command'], check_rc=True)

    @patch('ansible.modules.apt_repository.os')
    @patch('ansible.modules.apt_repository.sourceslist_before')
    def test_revert_sources_list(self, mock_sourceslist_before, mock_os):
        sources_before = {'file1': 'content1'}
        sources_after = {'file1': 'content1', 'file2': 'content2'}
        mock_os.path.exists.return_value = True

        revert_sources_list(sources_before, sources_after, mock_sourceslist_before)
        mock_os.remove.assert_called_with('file2')
        mock_sourceslist_before.save.assert_called_once()

class TestAptRepositoryModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
        self.module.check_mode = False

    @patch('ansible.modules.apt_repository.os.path.exists')
    @patch('ansible.modules.apt_repository.os.remove')
    def test_revert_sources_list(self, mock_remove, mock_exists):
        sources_before = {'/etc/apt/sources.list.d/old.list': 'content'}
        sources_after = {'/etc/apt/sources.list.d/new.list': 'content'}
        sourceslist_before = MagicMock()

        mock_exists.return_value = True

        revert_sources_list(sources_before, sources_after, sourceslist_before)

        mock_remove.assert_called_once_with('/etc/apt/sources.list.d/new.list')
        sourceslist_before.save.assert_called_once()

    @patch('ansible.modules.apt_repository.AnsibleModule.get_bin_path')
    @patch('ansible.modules.apt_repository.AnsibleModule.run_command')
    def test_install_python_apt(self, mock_run_command, mock_get_bin_path):
        mock_get_bin_path.return_value = '/usr/bin/apt-get'
        mock_run_command.side_effect = [(0, '', ''), (0, '', '')]

        install_python_apt(self.module, 'python-apt')

        mock_run_command.assert_any_call(['/usr/bin/apt-get', 'update'])
        mock_run_command.assert_any_call(['/usr/bin/apt-get', 'install', 'python-apt', '-y', '-q'])

    @patch('ansible.modules.apt_repository.AnsibleModule.get_bin_path')
    @patch('ansible.modules.apt_repository.AnsibleModule.run_command')
    def test_install_python_apt_fail_update(self, mock_run_command, mock_get_bin_path):
        mock_get_bin_path.return_value = '/usr/bin/apt-get'
        mock_run_command.side_effect = [(1, '', 'error')]

        with self.assertRaises(SystemExit):
            install_python_apt(self.module, 'python-apt')

        self.module.fail_json.assert_called_once_with(msg="Failed to auto-install python-apt. Error was: 'error'")

    @patch('ansible.modules.apt_repository.AnsibleModule.get_bin_path')
    @patch('ansible.modules.apt_repository.AnsibleModule.run_command')
    def test_install_python_apt_fail_install(self, mock_run_command, mock_get_bin_path):
        mock_get_bin_path.return_value = '/usr/bin/apt-get'
        mock_run_command.side_effect = [(0, '', ''), (1, '', 'error')]

        with self.assertRaises(SystemExit):
            install_python_apt(self.module, 'python-apt')

        self.module.fail_json.assert_called_once_with(msg="Failed to auto-install python-apt. Error was: 'error'")

    def test_install_python_apt_check_mode(self):
        self.module.check_mode = True

        with self.assertRaises(SystemExit):
            install_python_apt(self.module, 'python-apt')

        self.module.fail_json.assert_called_once_with(msg='python-apt must be installed to use check mode')

    def test_get_add_ppa_signing_key_callback_check_mode(self):
        self.module.check_mode = True
        callback = get_add_ppa_signing_key_callback(self.module)
        self.assertIsNone(callback)

    def test_get_add_ppa_signing_key_callback(self):
        self.module.check_mode = False
        callback = get_add_ppa_signing_key_callback(self.module)
        self.assertIsNotNone(callback)
        self.assertTrue(callable(callback))

    def test__run_command(self):
        self.module.run_command = MagicMock()
        callback = get_add_ppa_signing_key_callback(self.module)
        callback(['echo', 'test'])
        self.module.run_command.assert_called_once_with(['echo', 'test'], check_rc=True)

if __name__ == '__main__':
    unittest.main()