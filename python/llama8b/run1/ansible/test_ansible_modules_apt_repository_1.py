import unittest
from unittest.mock import patch, Mock
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native
from ansible.module_utils.urls import fetch_url
from ansible.module_utils.six import PY3
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils._text import DEFAULT_SOURCES_PER
from ansible.module_utils.apt_repository import install_python_apt, get_add_ppa_signing_key_callback, revert_sources_list


class TestAptRepository(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                repo=dict(required=True),
                state=dict(default='present', choices=['present', 'absent']),
                mode=dict(type='raw'),
                update_cache=dict(type='bool', default=True, aliases=['update-cache']),
                update_cache_retries=dict(type='int', default=5),
                update_cache_retry_max_delay=dict(type='int', default=12),
                validate_certs=dict(type='bool', default=True),
                filename=dict(type='str'),
                codename=dict(type='str'),
                install_python_apt=dict(type='bool', default=True)
            )
        )

    def test_install_python_apt(self):
        with patch('ansible.module_utils.basic.Module.run_command') as run_command:
            install_python_apt(self.module, 'python-apt')
            run_command.assert_called_once_with(['apt-get', 'install', 'python-apt', '-y', '-q'])

    def test_get_add_ppa_signing_key_callback(self):
        callback = get_add_ppa_signing_key_callback(self.module)
        self.assertIsInstance(callback, Mock)

    def test_revert_sources_list(self):
        sources_before = {'file1': 'content1', 'file2': 'content2'}
        sources_after = {'file1': 'new_content1', 'file3': 'content3'}
        sourceslist_before = Mock()
        revert_sources_list(sources_before, sources_after, sourceslist_before)
        self.assertEqual(sourceslist_before.save.call_count, 1)

    def test_install_python_apt_check_mode(self):
        with patch('ansible.module_utils.basic.Module.run_command') as run_command:
            install_python_apt(self.module, 'python-apt', check_mode=True)
            run_command.assert_not_called()

    def test_install_python_apt_check_mode_failure(self):
        with patch('ansible.module_utils.basic.Module.run_command') as run_command:
            run_command.side_effect = Exception('Error')
            with self.assertRaises(Exception):
                install_python_apt(self.module, 'python-apt', check_mode=True)

    def test_get_add_ppa_signing_key_callback_check_mode(self):
        callback = get_add_ppa_signing_key_callback(self.module)
        self.assertIsNone(callback())

    def test_revert_sources_list_check_mode(self):
        sources_before = {'file1': 'content1', 'file2': 'content2'}
        sources_after = {'file1': 'new_content1', 'file3': 'content3'}
        sourceslist_before = Mock()
        revert_sources_list(sources_before, sources_after, sourceslist_before, check_mode=True)
        self.assertEqual(sourceslist_before.save.call_count, 0)

if __name__ == '__main__':
    unittest.main()