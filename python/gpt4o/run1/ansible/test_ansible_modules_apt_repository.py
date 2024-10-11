import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.apt_repository import main, revert_sources_list, get_add_ppa_signing_key_callback, UbuntuSourcesList, InvalidSource, AnsibleModule, to_native, apt, aptsources_distro, distro, copy, random, time


class TestAptRepository(unittest.TestCase):

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

        with patch('ansible.modules.apt_repository.HAVE_PYTHON_APT', True):
            with patch('ansible.modules.apt_repository.UbuntuSourcesList') as MockUbuntuSourcesList:
                mock_sourceslist = MockUbuntuSourcesList.return_value
                mock_sourceslist.dump.return_value = {}
                main()
                mock_sourceslist.add_source.assert_called_once_with('deb http://archive.canonical.com/ubuntu hardy partner')
                mock_module.exit_json.assert_called_once_with(changed=False, repo='deb http://archive.canonical.com/ubuntu hardy partner', state='present', diff={})

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_main_fail_no_repo(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'repo': '',
            'state': 'present',
            'update_cache': True,
            'install_python_apt': True
        }
        mock_module.check_mode = False

        with patch('ansible.modules.apt_repository.HAVE_PYTHON_APT', True):
            main()
            mock_module.fail_json.assert_called_once_with(msg="Please set argument 'repo' to a non-empty value")

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_main_fail_invalid_source(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'repo': 'invalid_repo',
            'state': 'present',
            'update_cache': True,
            'install_python_apt': True
        }
        mock_module.check_mode = False

        with patch('ansible.modules.apt_repository.HAVE_PYTHON_APT', True):
            with patch('ansible.modules.apt_repository.UbuntuSourcesList') as MockUbuntuSourcesList:
                mock_sourceslist = MockUbuntuSourcesList.return_value
                mock_sourceslist.add_source.side_effect = InvalidSource('Invalid repository string')
                main()
                mock_module.fail_json.assert_called_once_with(msg='Invalid repository string: Invalid repository string')

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_install_python_apt(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.run_command.return_value = (0, '', '')

        install_python_apt(mock_module, 'python-apt')
        mock_module.run_command.assert_called_once_with('apt-get install python-apt', check_rc=True)

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_revert_sources_list(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        sources_before = {'file1': 'content1'}
        sources_after = {'file2': 'content2'}
        sourceslist_before = MagicMock()

        revert_sources_list(sources_before, sources_after, sourceslist_before)
        sourceslist_before.save.assert_called_once()

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_get_add_ppa_signing_key_callback(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        callback = get_add_ppa_signing_key_callback(mock_module)
        self.assertTrue(callable(callback))

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_UbuntuSourcesList(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        sourceslist = UbuntuSourcesList(mock_module)
        self.assertIsInstance(sourceslist, UbuntuSourcesList)

    @patch('ansible.modules.apt_repository.AnsibleModule')
    def test_InvalidSource(self, MockAnsibleModule):
        with self.assertRaises(InvalidSource):
            raise InvalidSource('Invalid repository string')

if __name__ == '__main__':
    unittest.main()