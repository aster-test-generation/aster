import unittest
from ansible.modules.apt_repository import *


class TestAptRepository(unittest.TestCase):
    def test_install_python_apt(self):
        module = AnsibleModule()
        apt_pkg_name = "apt"
        install_python_apt(module, apt_pkg_name)

    def test_get_add_ppa_signing_key_callback(self):
        module = AnsibleModule()
        result = get_add_ppa_signing_key_callback(module)
        self.assertIsNone(result)

    def test_revert_sources_list(self):
        sources_before = {}
        sources_after = {}
        sourceslist_before = {}
        revert_sources_list(sources_before, sources_after, sourceslist_before)

class TestAptRepository(unittest.TestCase):
    def test_install_python_apt(self):
        module = None
        apt_pkg_name = None
        install_python_apt(module, apt_pkg_name)

    def test_get_add_ppa_signing_key_callback(self):
        module = None
        result = get_add_ppa_signing_key_callback(module)

    def test_revert_sources_list(self):
        sources_before = None
        sources_after = None
        sourceslist_before = None
        revert_sources_list(sources_before, sources_after, sourceslist_before)

if __name__ == '__main__':
    unittest.main()