import unittest
from ansible.modules.apt_repository import SourcesList


class TestUbuntuSourcesList(unittest.TestCase):
    def test_get_ppa_info(self):
        sources_list = UbuntuSourcesList(None)
        info = sources_list._get_ppa_info('owner_name', 'ppa_name')
        self.assertEqual(info, {'key_id': 'some_key_id', 'key_server': 'some_key_server'})

    def test_key_already_exists(self):
        sources_list = UbuntuSourcesList(None)
        key_fingerprint = 'some_key_fingerprint'
        self.assertTrue(sources_list._key_already_exists(key_fingerprint))

    def test_add_source(self):
        sources_list = UbuntuSourcesList(None)
        line = 'ppa:some_owner/some_ppa'
        sources_list.add_source(line)
        self.assertIn(line, sources_list.repos_urls)

    def test_remove_source(self):
        sources_list = UbuntuSourcesList(None)
        line = 'ppa:some_owner/some_ppa'
        sources_list.remove_source(line)
        self.assertNotIn(line, sources_list.repos_urls)

if __name__ == '__main__':
    unittest.main()