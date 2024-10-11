import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.modules.apt_repository import UbuntuSourcesList


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present']), mode=dict(type='raw'), update_cache=dict(type='bool', default=True, aliases=['update-cache']), update_cache_retries=dict(type='int', default=5), update_cache_retry_max_delay=dict(type='int', default=12), filename=dict(type='str'), install_python_apt=dict(type='bool', default=True), validate_certs=dict(type='bool', default=True), codename=dict(type='str')), supports_check_mode=True)
        self.assertEqual(module.params['repo'], 'deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertEqual(module.params['state'], 'present')
        self.assertEqual(module.params['mode'], '0644')
        self.assertEqual(module.params['update_cache'], True)
        self.assertEqual(module.params['update_cache_retries'], 5)
        self.assertEqual(module.params['update_cache_retry_max_delay'], 12)
        self.assertEqual(module.params['filename'], 'google-chrome')
        self.assertEqual(module.params['install_python_apt'], True)
        self.assertEqual(module.params['validate_certs'], True)
        self.assertEqual(module.params['codename'], 'trusty')

class TestAptRepository(unittest.TestCase):
    def test_add_source(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertIn('deb http://archive.canonical.com/ubuntu hardy partner', sourceslist.sources)

    def test_remove_source(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        sourceslist.remove_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertNotIn('deb http://archive.canonical.com/ubuntu hardy partner', sourceslist.sources)

    def test_add_ppa_signing_key(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_ppa_signing_key('ppa:nginx/stable')
        self.assertIn('ppa:nginx/stable', sourceslist.sources)

    def test_remove_ppa_signing_key(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_ppa_signing_key('ppa:nginx/stable')
        sourceslist.remove_ppa_signing_key('ppa:nginx/stable')
        self.assertNotIn('ppa:nginx/stable', sourceslist.sources)

if __name__ == '__main__':
    unittest.main()