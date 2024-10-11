import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.apt_repository import install_python_apt, get_add_ppa_signing_key_callback, revert_sources_list


class TestInstallPythonApt(unittest.TestCase):
    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_install_python_apt_success(self, MockModule):
        module = MockModule()
        module.check_mode = False
        module.get_bin_path.return_value = '/usr/bin/apt-get'
        module.run_command.side_effect = [(0, '', ''), (0, '', '')]

        install_python_apt(module, 'python-apt')
        module.run_command.assert_any_call(['/usr/bin/apt-get', 'update'])
        module.run_command.assert_any_call(['/usr/bin/apt-get', 'install', 'python-apt', '-y', '-q'])

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_install_python_apt_fail_update(self, MockModule):
        module = MockModule()
        module.check_mode = False
        module.get_bin_path.return_value = '/usr/bin/apt-get'
        module.run_command.side_effect = [(1, '', 'error')]

        with self.assertRaises(SystemExit):
            install_python_apt(module, 'python3-apt')
        module.fail_json.assert_called_with(msg="Failed to auto-install python-apt. Error was: 'error'")

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_install_python_apt_fail_install(self, MockModule):
        module = MockModule()
        module.check_mode = False
        module.get_bin_path.return_value = '/usr/bin/apt-get'
        module.run_command.side_effect = [(0, '', ''), (1, '', 'error')]

        with self.assertRaises(SystemExit):
            install_python_apt(module, 'python-apt')
        module.fail_json.assert_called_with(msg="Failed to auto-install python-apt. Error was: 'error'")

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_install_python_apt_check_mode(self, MockModule):
        module = MockModule()
        module.check_mode = True

        with self.assertRaises(SystemExit):
            install_python_apt(module, 'python-apt')
        module.fail_json.assert_called_with(msg='python-apt must be installed to use check mode')

class TestGetAddPpaSigningKeyCallback(unittest.TestCase):
    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_get_add_ppa_signing_key_callback_check_mode(self, MockModule):
        module = MockModule()
        module.check_mode = True

        callback = get_add_ppa_signing_key_callback(module)
        self.assertIsNone(callback)

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_get_add_ppa_signing_key_callback_run_command(self, MockModule):
        module = MockModule()
        module.check_mode = False

        callback = get_add_ppa_signing_key_callback(module)
        self.assertIsNotNone(callback)
        module.run_command = MagicMock()
        callback(['some', 'command'])
        module.run_command.assert_called_with(['some', 'command'], check_rc=True)

class TestRevertSourcesList(unittest.TestCase):
    @patch('ansible.modules.apt_repository.os.path.exists')
    @patch('ansible.modules.apt_repository.os.remove')
    def test_revert_sources_list(self, mock_remove, mock_exists):
        sources_before = {'/etc/apt/sources.list.d/old.list': 'content'}
        sources_after = {'/etc/apt/sources.list.d/new.list': 'content'}
        sourceslist_before = MagicMock()

        mock_exists.return_value = True

        revert_sources_list(sources_before, sources_after, sourceslist_before)
        mock_remove.assert_called_with('/etc/apt/sources.list.d/new.list')
        sourceslist_before.save.assert_called_once()

if __name__ == '__main__':
    unittest.main()