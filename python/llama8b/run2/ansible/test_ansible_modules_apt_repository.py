import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils._text import to_native
from ansible.module_utils.six import PY3
from ansible.module_utils.urls import fetch_url
from ansible.module_utils.basic import
from ansible.module_utils.apt_repository import main, install_python_apt, get_add_ppa_signing_key_callback
from unittest.mock import patch, Mock
import os
import random
import time


class TestAptRepository(unittest.TestCase):
    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_main(self, mock_module):
        module = mock_module.return_value
        module.params = {'repo': 'deb http://archive.canonical.com/ubuntu hardy partner', 'state': 'present'}
        main()
        self.assertTrue(module.fail_json.called)

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_install_python_apt(self, mock_module):
        module = mock_module.return_value
        install_python_apt(module, 'python3-apt')
        self.assertTrue(module.fail_json.called)

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_get_add_ppa_signing_key_callback(self, mock_module):
        module = mock_module.return_value
        callback = get_add_ppa_signing_key_callback(module)
        self.assertTrue(callback.called)

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_ubuntu_sources_list(self, mock_module):
        module = mock_module.return_value
        sourceslist = UbuntuSourcesList(module, add_ppa_signing_keys_callback=get_add_ppa_signing_key_callback(module))
        self.assertTrue(sourceslist.dump.called)

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_add_source(self, mock_module):
        module = mock_module.return_value
        sourceslist = UbuntuSourcesList(module, add_ppa_signing_keys_callback=get_add_ppa_signing_key_callback(module))
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertTrue(sourceslist.add_source.called)

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_remove_source(self, mock_module):
        module = mock_module.return_value
        sourceslist = UbuntuSourcesList(module, add_ppa_signing_keys_callback=get_add_ppa_signing_key_callback(module))
        sourceslist.remove_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertTrue(sourceslist.remove_source.called)

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_save(self, mock_module):
        module = mock_module.return_value
        sourceslist = UbuntuSourcesList(module, add_ppa_signing_keys_callback=get_add_ppa_signing_key_callback(module))
        sourceslist.save()
        self.assertTrue(sourceslist.save.called)

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_update_cache(self, mock_module):
        module = mock_module.return_value
        sourceslist = UbuntuSourcesList(module, add_ppa_signing_keys_callback=get_add_ppa_signing_key_callback(module))
        sourceslist.update_cache()
        self.assertTrue(sourceslist.update_cache.called)

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_revert_sources_list(self, mock_module):
        module = mock_module.return_value
        sourceslist = UbuntuSourcesList(module, add_ppa_signing_keys_callback=get_add_ppa_signing_key_callback(module))
        sourceslist.revert_sources_list()
        self.assertTrue(sourceslist.revert_sources_list.called)

if __name__ == '__main__':
    unittest.main()