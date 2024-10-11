import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.apt_repository import SourcesList


class TestUbuntuSourcesList(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {'codename': 'focal'}
        self.ubuntu_sources_list = UbuntuSourcesList(self.module)

    def test_init(self):
        self.assertEqual(self.ubuntu_sources_list.codename, 'focal')

    def test_deepcopy(self):
        copy_instance = self.ubuntu_sources_list.__deepcopy__()
        self.assertIsInstance(copy_instance, UbuntuSourcesList)

    @patch('ansible.modules.apt_repository.fetch_url')
    def test_get_ppa_info(self, mock_fetch_url):
        mock_response = MagicMock()
        mock_response.read.return_value = '{"signing_key_fingerprint": "ABC123"}'
        mock_fetch_url.return_value = (mock_response, {'status': 200})
        result = self.ubuntu_sources_list._get_ppa_info('owner', 'ppa_name')
        self.assertEqual(result, {"signing_key_fingerprint": "ABC123"})

    def test_expand_ppa(self):
        result = self.ubuntu_sources_list._expand_ppa('ppa:owner/ppa_name')
        self.assertEqual(result, ('deb http://ppa.launchpad.net/owner/ppa_name/ubuntu focal main', 'owner', 'ppa_name'))

    @patch('ansible.modules.apt_repository.UbuntuSourcesList._key_already_exists')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList._get_ppa_info')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList._expand_ppa')
    def test_add_source(self, mock_expand_ppa, mock_get_ppa_info, mock_key_already_exists):
        mock_expand_ppa.return_value = ('deb http://ppa.launchpad.net/owner/ppa_name/ubuntu focal main', 'owner', 'ppa_name')
        mock_get_ppa_info.return_value = {'signing_key_fingerprint': 'ABC123'}
        mock_key_already_exists.return_value = False
        self.ubuntu_sources_list.add_ppa_signing_keys_callback = MagicMock()
        self.ubuntu_sources_list.add_source('ppa:owner/ppa_name')
        self.ubuntu_sources_list.add_ppa_signing_keys_callback.assert_called_once()

    @patch('ansible.modules.apt_repository.UbuntuSourcesList._parse')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList._add_valid_source')
    def test_add_source_non_ppa(self, mock_add_valid_source, mock_parse):
        mock_parse.return_value = (None, None, 'deb http://example.com/ubuntu focal main')
        self.ubuntu_sources_list.add_source('deb http://example.com/ubuntu focal main')
        mock_add_valid_source.assert_called_once()

    @patch('ansible.modules.apt_repository.UbuntuSourcesList._parse')
    @patch('ansible.modules.apt_repository.UbuntuSourcesList._remove_valid_source')
    def test_remove_source(self, mock_remove_valid_source, mock_parse):
        mock_parse.return_value = (None, None, 'deb http://example.com/ubuntu focal main')
        self.ubuntu_sources_list.remove_source('deb http://example.com/ubuntu focal main')
        mock_remove_valid_source.assert_called_once()

    @patch('ansible.modules.apt_repository.UbuntuSourcesList._expand_ppa')
    def test_remove_source_ppa(self, mock_expand_ppa):
        mock_expand_ppa.return_value = ('deb http://ppa.launchpad.net/owner/ppa_name/ubuntu focal main', 'owner', 'ppa_name')
        self.ubuntu_sources_list._remove_valid_source = MagicMock()
        self.ubuntu_sources_list.remove_source('ppa:owner/ppa_name')
        self.ubuntu_sources_list._remove_valid_source.assert_called_once()

    def test_repos_urls(self):
        self.ubuntu_sources_list.files = {
            'file1': [
                (None, True, True, 'deb http://example.com/ubuntu focal main'),
                (None, True, True, 'ppa:owner/ppa_name')
            ]
        }
        result = self.ubuntu_sources_list.repos_urls
        self.assertEqual(result, [
            'deb http://example.com/ubuntu focal main',
            'deb http://ppa.launchpad.net/owner/ppa_name/ubuntu focal main'
        ])

if __name__ == '__main__':
    unittest.main()