import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native
from ansible.module_utils.urls import fetch_url
from ansible.module_utils.six import PY3
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils._text import DEFAULT_SOURCES_PER
from ansible.module_utils.apt_repository import UbuntuSourcesList, VALID_SOURCE_TYPES
from unittest.mock import patch, Mock
import json


class TestUbuntuSourcesList(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule()
        self.module.params = {'codename': 'trusty'}
        self.sources_list = UbuntuSourcesList(self.module)

    def test_init(self):
        self.assertEqual(self.sources_list.codename, 'trusty')

    def test_get_ppa_info(self):
        with patch('ansible.module_utils.apt_repository.fetch_url') as mock_fetch_url:
            mock_fetch_url.return_value = (Mock(), {'status': 200})
            ppa_info = self.sources_list._get_ppa_info('owner_name', 'ppa_name')
            self.assertEqual(ppa_info, json.loads(to_native(mock_fetch_url.return_value[1]['response'].read())))

    def test_expand_ppa(self):
        ppa = 'ppa:owner/ppa_name'
        line, ppa_owner, ppa_name = self.sources_list._expand_ppa(ppa)
        self.assertEqual(line, 'deb http://ppa.launchpad.net/owner/ppa_name/ubuntu trusty main')
        self.assertEqual(ppa_owner, 'owner')
        self.assertEqual(ppa_name, 'ppa_name')

    def test_key_already_exists(self):
        key_fingerprint = 'key_fingerprint'
        self.assertTrue(self.sources_list._key_already_exists(key_fingerprint))

    def test_add_source(self):
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        self.sources_list.add_source(line)
        self.assertIn(line, self.sources_list.repos_urls)

    def test_remove_source(self):
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        self.sources_list.add_source(line)
        self.sources_list.remove_source(line)
        self.assertNotIn(line, self.sources_list.repos_urls)

    def test_str(self):
        self.assertEqual(str(self.sources_list), 'UbuntuSourcesList')

    def test_repr(self):
        self.assertEqual(repr(self.sources_list), 'UbuntuSourcesList(module=<ansible.module_utils.basic.AnsibleModule object at 0x...>)')

    def test_eq(self):
        other = UbuntuSourcesList(self.module)
        self.assertEqual(self.sources_list, other)

if __name__ == '__main__':
    unittest.main()