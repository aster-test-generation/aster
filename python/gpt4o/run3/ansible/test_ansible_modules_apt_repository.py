import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.apt_repository import *


class TestAptRepositoryModule(unittest.TestCase):

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_main(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'repo': 'deb http://archive.canonical.com/ubuntu hardy partner',
            'state': 'present',
            'update_cache': True,
            'install_python_apt': True
        }
        mock_module.check_mode = False

        with patch('ansible.module_utils.apt_repository.HAVE_PYTHON_APT', True):
            with patch('ansible.modules.apt_repository.UbuntuSourcesList') as MockUbuntuSourcesList:
                mock_sourceslist = MockUbuntuSourcesList.return_value
                mock_sourceslist.dump.return_value = {}
                main()
                mock_sourceslist.add_source.assert_called_once_with('deb http://archive.canonical.com/ubuntu hardy partner')
                mock_module.exit_json.assert_called_once_with(changed=True, repo='deb http://archive.canonical.com/ubuntu hardy partner', state='present', diff={})

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_main_no_repo(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'repo': '',
            'state': 'present',
            'update_cache': True,
            'install_python_apt': True
        }
        mock_module.check_mode = False

        with patch('ansible.module_utils.apt_repository.HAVE_PYTHON_APT', True):
            main()
            mock_module.fail_json.assert_called_once_with(msg="Please set argument 'repo' to a non-empty value")

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_main_invalid_source(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'repo': 'invalid_repo_string',
            'state': 'present',
            'update_cache': True,
            'install_python_apt': True
        }
        mock_module.check_mode = False

        with patch('ansible.module_utils.apt_repository.HAVE_PYTHON_APT', True):
            with patch('ansible.modules.apt_repository.UbuntuSourcesList') as MockUbuntuSourcesList:
                mock_sourceslist = MockUbuntuSourcesList.return_value
                mock_sourceslist.add_source.side_effect = InvalidSource('Invalid repository string')
                main()
                mock_module.fail_json.assert_called_once_with(msg='Invalid repository string: Invalid repository string')

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_main_update_cache_fail(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'repo': 'deb http://archive.canonical.com/ubuntu hardy partner',
            'state': 'present',
            'update_cache': True,
            'install_python_apt': True,
            'update_cache_retries': 1,
            'update_cache_retry_max_delay': 1
        }
        mock_module.check_mode = False

        with patch('ansible.modules.apt_repository.sys.modules', {'apt': True}):
            with patch('ansible.modules.apt_repository.UbuntuSourcesList') as MockUbuntuSourcesList:
                mock_sourceslist = MockUbuntuSourcesList.return_value
                mock_sourceslist.dump.return_value = {}
                with patch('ansible.modules.apt_repository.apt.Cache') as MockCache:
                    mock_cache = MockCache.return_value
                    mock_cache.update.side_effect = apt.cache.FetchFailedException('Fetch failed')
                    main()
                    mock_module.fail_json.assert_called_once_with(msg='Failed to update apt cache: Fetch failed')

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_main_os_error(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'repo': 'deb http://archive.canonical.com/ubuntu hardy partner',
            'state': 'present',
            'update_cache': True,
            'install_python_apt': True
        }
        mock_module.check_mode = False

        with patch('ansible.module_utils.apt.HAVE_PYTHON_APT', True):
            with patch('ansible.modules.apt_repository.UbuntuSourcesList') as MockUbuntuSourcesList:
                mock_sourceslist = MockUbuntuSourcesList.return_value
                mock_sourceslist.dump.return_value = {}
                mock_sourceslist.save.side_effect = OSError('OS error')
                main()
                mock_module.fail_json.assert_called_once_with(msg='OS error')

if __name__ == '__main__':
    unittest.main()