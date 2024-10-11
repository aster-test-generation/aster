import unittest
from unittest.mock import patch
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils._text import to_native
from ansible.module_utils.six import PY3
from ansible.module_utils.urls import fetch_url
import ansible.module_utils.apt_repository as apt_repositor


class TestAptRepository(unittest.TestCase):
    def test_install_python_apt(self):
        module = AnsibleModule()
        install_python_apt(module, 'python-apt')
        self.assertTrue(module.check_mode)

    def test_get_add_ppa_signing_key_callback(self):
        module = AnsibleModule()
        callback = get_add_ppa_signing_key_callback(module)
        self.assertEqual(callback, None)

    def test_revert_sources_list(self):
        sources_before = {'file1': 'content1', 'file2': 'content2'}
        sources_after = {'file1': 'newcontent1', 'file3': 'content3'}
        sourceslist_before = SourcesList()
        revert_sources_list(sources_before, sources_after, sourceslist_before)
        self.assertFalse(os.path.exists('file1'))
        self.assertFalse(os.path.exists('file2'))
        self.assertTrue(os.path.exists('file3'))

    def test__init__(self):
        apt = AptRepository()
        self.assertEqual(apt.apt, None)
        self.assertEqual(apt.apt_pkg, None)
        self.assertEqual(apt.aptsources_distro, None)
        self.assertEqual(apt.distro, None)

    def test__str__(self):
        apt = AptRepository()
        self.assertEqual(str(apt), 'AptRepository')

    def test__repr__(self):
        apt = AptRepository()
        self.assertEqual(repr(apt), 'AptRepository()')

    def test__eq__(self):
        apt1 = AptRepository()
        apt2 = AptRepository()
        self.assertEqual(apt1, apt2)

    def test_validate_certs(self):
        module = AnsibleModule()
        self.assertTrue(validate_certs(module, True))
        self.assertFalse(validate_certs(module, False))

    def test_update_cache(self):
        module = AnsibleModule()
        update_cache(module)

    def test_update_cache_retries(self):
        module = AnsibleModule()
        update_cache_retries(module, 5)

    def test_update_cache_retry_max_delay(self):
        module = AnsibleModule()
        update_cache_retry_max_delay(module, 12)

    def test_install_python_apt_check_mode(self):
        module = AnsibleModule(check_mode=True)
        install_python_apt(module, 'python-apt')
        self.assertTrue(module.check_mode)

    def test_install_python_apt_non_check_mode(self):
        module = AnsibleModule()
        install_python_apt(module, 'python-apt')
        self.assertFalse(module.check_mode)

if __name__ == '__main__':
    unittest.main()