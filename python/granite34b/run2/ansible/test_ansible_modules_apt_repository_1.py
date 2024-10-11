import unittest
from ansible.modules.apt_repository import *


class TestAptRepository(unittest.TestCase):
    def test_install_python_apt(self):
        module = AnsibleModule()
        apt_pkg_name = "python-apt"
        install_python_apt(module, apt_pkg_name)

    def test_get_add_ppa_signing_key_callback(self):
        module = AnsibleModule()
        callback = get_add_ppa_signing_key_callback(module)
        if callback is not None:
            callback(["command"])

    def test_revert_sources_list(self):
        sources_before = {}
        sources_after = {"file1": "content1", "file2": "content2"}
        sourceslist_before = SourcesList()
        revert_sources_list(sources_before, sources_after, sourceslist_before)

if __name__ == '__main__':
    unittest.main()