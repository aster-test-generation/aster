import unittest
from ansible.modules.apt_repository import UbuntuSourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestUbuntuSourcesList(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule()
        usl = UbuntuSourcesList(module)
        self.assertIsInstance(usl, UbuntuSourcesList)

    def test___deepcopy__(self):
        module = AnsibleModule()
        usl = UbuntuSourcesList(module)
        copied_usl = copy.deepcopy(usl)
        self.assertIsInstance(copied_usl, UbuntuSourcesList)

    def test__get_ppa_info(self):
        module = AnsibleModule()
        usl = UbuntuSourcesList(module)
        owner_name = 'nginx'
        ppa_name = 'stable'
        ppa_info = usl._get_ppa_info(owner_name, ppa_name)
        self.assertIsInstance(ppa_info, dict)

    def test__expand_ppa(self):
        module = AnsibleModule()
        usl = UbuntuSourcesList(module)
        path = 'ppa:nginx/stable'
        expanded_ppa = usl._expand_ppa(path)
        self.assertIsInstance(expanded_ppa, tuple)

    def test__key_already_exists(self):
        module = AnsibleModule()
        usl = UbuntuSourcesList(module)
        key_fingerprint = '1234567890'
        exists = usl._key_already_exists(key_fingerprint)
        self.assertIsInstance(exists, bool)

    def test_add_source(self):
        module = AnsibleModule()
        usl = UbuntuSourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        usl.add_source(line)
        self.assertIn(line, usl.repos_urls)

    def test_remove_source(self):
        module = AnsibleModule()
        usl = UbuntuSourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        usl.add_source(line)
        usl.remove_source(line)
        self.assertNotIn(line, usl.repos_urls)

    def test_repos_urls(self):
        module = AnsibleModule()
        usl = UbuntuSourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        usl.add_source(line)
        repos_urls = usl.repos_urls
        self.assertIsInstance(repos_urls, list)
        self.assertIn(line, repos_urls)

class TestDEFAULT_SOURCES_PERM(unittest.TestCase):
    def test_DEFAULT_SOURCES_PERM(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

class TestVALID_SOURCE_TYPES(unittest.TestCase):
    def test_VALID_SOURCE_TYPES(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()