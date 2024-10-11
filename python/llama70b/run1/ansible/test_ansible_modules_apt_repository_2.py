import unittest
from ansible.modules.apt_repository import UbuntuSourcesList, DEFAULT_SOURCES_PERM, VALID_SOURCE_TYPES


class TestUbuntuSourcesList(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule({'codename': 'trusty'})
        usl = UbuntuSourcesList(module)
        self.assertEqual(usl.codename, 'trusty')

    def test___deepcopy__(self):
        module = AnsibleModule({'codename': 'trusty'})
        usl = UbuntuSourcesList(module)
        usl_copy = copy.deepcopy(usl)
        self.assertEqual(usl_copy.codename, 'trusty')

    def test__get_ppa_info(self):
        module = AnsibleModule({'codename': 'trusty'})
        usl = UbuntuSourcesList(module)
        owner_name = 'nginx'
        ppa_name = 'stable'
        lp_api = usl.LP_API % (owner_name, ppa_name)
        headers = dict(Accept='application/json')
        response, info = fetch_url(module, lp_api, headers=headers)
        self.assertEqual(info['status'], 200)

    def test__expand_ppa(self):
        module = AnsibleModule({'codename': 'trusty'})
        usl = UbuntuSourcesList(module)
        path = 'ppa:nginx/stable'
        line, ppa_owner, ppa_name = usl._expand_ppa(path)
        self.assertEqual(line, 'deb http://ppa.launchpad.net/nginx/stable/ubuntu trusty main')

    def test__key_already_exists(self):
        module = AnsibleModule({'codename': 'trusty'})
        usl = UbuntuSourcesList(module)
        key_fingerprint = '12345678'
        rc, out, err = module.run_command('apt-key export %s' % key_fingerprint, check_rc=True)
        self.assertTrue(len(err) == 0)

    def test_add_source(self):
        module = AnsibleModule({'codename': 'trusty'})
        usl = UbuntuSourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        usl.add_source(line)
        self.assertIn(line, usl.repos_urls)

    def test_remove_source(self):
        module = AnsibleModule({'codename': 'trusty'})
        usl = UbuntuSourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        usl.add_source(line)
        usl.remove_source(line)
        self.assertNotIn(line, usl.repos_urls)

    def test_repos_urls(self):
        module = AnsibleModule({'codename': 'trusty'})
        usl = UbuntuSourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        usl.add_source(line)
        self.assertIn(line, usl.repos_urls)

class TestDEFAULT_SOURCES_PERM(unittest.TestCase):
    def test_DEFAULT_SOURCES_PERM(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

class TestVALID_SOURCE_TYPES(unittest.TestCase):
    def test_VALID_SOURCE_TYPES(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()