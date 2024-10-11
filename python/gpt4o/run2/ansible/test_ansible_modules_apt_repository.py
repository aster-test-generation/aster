import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.apt_repository import main, revert_sources_list, UbuntuSourcesList, InvalidSource
from ansible.module_utils.basic import AnsibleModule


class TestAptRepositoryModule(unittest.TestCase):

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_main_no_repo(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': None}
        with self.assertRaises(SystemExit):
            main()
        mock_module.fail_json.assert_called_with(msg="Please set argument 'repo' to a non-empty value")

    @patch('ansible.modules.apt_repository.AnsibleModule')
    @patch('ansible.modules.apt_repository.has_respawned', return_value=False)
    @patch('ansible.modules.apt_repository.probe_interpreters_for_module', return_value=None)
    def test_main_no_python_apt(self, MockProbe, MockHasRespawned, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': 'some_repo', 'install_python_apt': False}
        with self.assertRaises(SystemExit):
            main()
        mock_module.fail_json.assert_called_with(msg='python-apt is not installed, and install_python_apt is False')

    @patch('ansible.modules.apt_repository.AnsibleModule')
    @patch('ansible.modules.apt_repository.has_respawned', return_value=True)
    def test_main_has_respawned(self, MockHasRespawned, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': 'some_repo'}
        with self.assertRaises(SystemExit):
            main()
        mock_module.fail_json.assert_called_with(msg='python-apt must be installed and visible from /usr/bin/python.')

    @patch('ansible.modules.apt_repository.AnsibleModule')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList')
    @patch('ansible.modules.apt_repository.copy.deepcopy')
    def test_main_add_source(self, MockDeepcopy, MockUbuntuSourcesList, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': 'some_repo', 'state': 'present', 'update_cache': False}
        mock_sourceslist = MockUbuntuSourcesList.return_value
        mock_sourceslist.dump.return_value = {}
        MockDeepcopy.return_value = mock_sourceslist

        main()
        mock_sourceslist.add_source.assert_called_with('some_repo')
        mock_module.exit_json.assert_called_with(changed=True, repo='some_repo', state='present', diff={})

    @patch('ansible.modules.apt_repository.AnsibleModule')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList')
    @patch('ansible.modules.apt_repository.copy.deepcopy')
    def test_main_remove_source(self, MockDeepcopy, MockUbuntuSourcesList, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': 'some_repo', 'state': 'absent', 'update_cache': False}
        mock_sourceslist = MockUbuntuSourcesList.return_value
        mock_sourceslist.dump.return_value = {}
        MockDeepcopy.return_value = mock_sourceslist

        main()
        mock_sourceslist.remove_source.assert_called_with('some_repo')
        mock_module.exit_json.assert_called_with(changed=True, repo='some_repo', state='absent', diff={})

    @patch('ansible.modules.apt_repository.AnsibleModule')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList')
    @patch('ansible.modules.apt_repository.copy.deepcopy')
    def test_main_invalid_source(self, MockDeepcopy, MockUbuntuSourcesList, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': 'some_repo', 'state': 'present', 'update_cache': False}
        mock_sourceslist = MockUbuntuSourcesList.return_value
        mock_sourceslist.add_source.side_effect = InvalidSource('Invalid repo')
        MockDeepcopy.return_value = mock_sourceslist

        with self.assertRaises(SystemExit):
            main()
        mock_module.fail_json.assert_called_with(msg='Invalid repository string: Invalid repo')

    @patch('ansible.modules.apt_repository.AnsibleModule')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList')
    @patch('ansible.modules.apt_repository.copy.deepcopy')
    @patch('ansible.modules.apt_repository.apt.Cache')
    def test_main_update_cache(self, MockCache, MockDeepcopy, MockUbuntuSourcesList, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': 'some_repo', 'state': 'present', 'update_cache': True, 'update_cache_retries': 1, 'update_cache_retry_max_delay': 1}
        mock_sourceslist = MockUbuntuSourcesList.return_value
        mock_sourceslist.dump.return_value = {}
        MockDeepcopy.return_value = mock_sourceslist
        mock_cache = MockCache.return_value

        main()
        mock_cache.update.assert_called_once()
        mock_module.exit_json.assert_called_with(changed=True, repo='some_repo', state='present', diff={})

    @patch('ansible.modules.apt_repository.AnsibleModule')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList')
    @patch('ansible.modules.apt_repository.copy.deepcopy')
    @patch('ansible.modules.apt_repository.apt.Cache')
    def test_main_update_cache_fail(self, MockCache, MockDeepcopy, MockUbuntuSourcesList, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': 'some_repo', 'state': 'present', 'update_cache': True, 'update_cache_retries': 1, 'update_cache_retry_max_delay': 1}
        mock_sourceslist = MockUbuntuSourcesList.return_value
        mock_sourceslist.dump.return_value = {}
        MockDeepcopy.return_value = mock_sourceslist
        mock_cache = MockCache.return_value
        mock_cache.update.side_effect = Exception('Update failed')

        with self.assertRaises(SystemExit):
            main()
        mock_module.fail_json.assert_called_with(msg='Failed to update apt cache: Update failed')

    @patch('ansible.modules.apt_repository.AnsibleModule')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList')
    @patch('ansible.modules.apt_repository.copy.deepcopy')
    @patch('ansible.modules.apt_repository.apt.Cache')
    def test_main_save_fail(self, MockCache, MockDeepcopy, MockUbuntuSourcesList, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': 'some_repo', 'state': 'present', 'update_cache': False}
        mock_sourceslist = MockUbuntuSourcesList.return_value
        mock_sourceslist.dump.return_value = {}
        mock_sourceslist.save.side_effect = OSError('Save failed')
        MockDeepcopy.return_value = mock_sourceslist

        with self.assertRaises(SystemExit):
            main()
        mock_module.fail_json.assert_called_with(msg='Save failed')

    @patch('ansible.modules.apt_repository.AnsibleModule')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList')
    @patch('ansible.modules.apt_repository.copy.deepcopy')
    @patch('ansible.modules.apt_repository.apt.Cache')
    def test_main_check_mode(self, MockCache, MockDeepcopy, MockUbuntuSourcesList, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {'repo': 'some_repo', 'state': 'present', 'update_cache': False}
        mock_module.check_mode = True
        mock_sourceslist = MockUbuntuSourcesList.return_value
        mock_sourceslist.dump.return_value = {}
        MockDeepcopy.return_value = mock_sourceslist

        main()
        mock_sourceslist.add_source.assert_called_with('some_repo')
        mock_module.exit_json.assert_called_with(changed=True, repo='some_repo', state='present', diff={})

if __name__ == '__main__':
    unittest.main()