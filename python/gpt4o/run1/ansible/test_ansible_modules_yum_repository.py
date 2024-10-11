import unittest
from ansible.modules.yum_repository import main
from ansible.module_utils.basic import AnsibleModule
import os


class TestYumRepository(unittest.TestCase):

    def setUp(self):
        self.argument_spec = dict(
            bandwidth=dict(), baseurl=dict(type='list', elements='str'), cost=dict(), deltarpm_metadata_percentage=dict(), deltarpm_percentage=dict(), description=dict(), enabled=dict(type='bool'), enablegroups=dict(type='bool'), exclude=dict(type='list', elements='str'), failovermethod=dict(choices=['roundrobin', 'priority']), file=dict(), gpgcakey=dict(no_log=False), gpgcheck=dict(type='bool'), gpgkey=dict(type='list', elements='str', no_log=False), module_hotfixes=dict(type='bool'), http_caching=dict(choices=['all', 'packages', 'none']), include=dict(), includepkgs=dict(type='list', elements='str'), ip_resolve=dict(choices=['4', '6', 'IPv4', 'IPv6', 'whatever']), keepalive=dict(type='bool'), keepcache=dict(choices=['0', '1']), metadata_expire=dict(), metadata_expire_filter=dict(choices=['never', 'read-only:past', 'read-only:present', 'read-only:future']), metalink=dict(), mirrorlist=dict(), mirrorlist_expire=dict(), name=dict(required=True), params=dict(type='dict'), password=dict(no_log=True), priority=dict(), protect=dict(type='bool'), proxy=dict(), proxy_password=dict(no_log=True), proxy_username=dict(), repo_gpgcheck=dict(type='bool'), reposdir=dict(default='/etc/yum.repos.d', type='path'), retries=dict(), s3_enabled=dict(type='bool'), skip_if_unavailable=dict(type='bool'), sslcacert=dict(aliases=['ca_cert']), ssl_check_cert_permissions=dict(type='bool'), sslclientcert=dict(aliases=['client_cert']), sslclientkey=dict(aliases=['client_key'], no_log=False), sslverify=dict(type='bool', aliases=['validate_certs']), state=dict(choices=['present', 'absent'], default='present'), throttle=dict(), timeout=dict(), ui_repoid_vars=dict(), username=dict()
        )
        self.argument_spec['async'] = dict(type='bool', default=True)
        self.module = AnsibleModule(argument_spec=self.argument_spec, add_file_common_args=True, supports_check_mode=True)
        self.module.params = {
            'name': 'test_repo',
            'state': 'present',
            'baseurl': ['http://example.com/repo'],
            'description': 'Test Repository'
        }
        self.yumrepo = YumRepo(self.module)

    def test_main(self):
        with self.assertRaises(SystemExit) as cm:
            main()
        self.assertEqual(cm.exception.code, 0)

    def test_add(self):
        self.yumrepo.add()
        self.assertTrue(self.yumrepo.added)

    def test_remove(self):
        self.yumrepo.remove()
        self.assertTrue(self.yumrepo.removed)

    def test_dump(self):
        result = self.yumrepo.dump()
        self.assertIsInstance(result, str)

    def test_save(self):
        self.yumrepo.save()
        self.assertTrue(os.path.isfile(self.yumrepo.params['dest']))

    def test_private_method(self):
        result = self.yumrepo._YumRepo__private_method()
        self.assertEqual(result, 'expected_result')

    def test_protected_method(self):
        result = self.yumrepo._protected_method()
        self.assertEqual(result, 'expected_result')

    def test_str_method(self):
        result = self.yumrepo.__str__()
        self.assertEqual(result, 'YumRepo(test_repo)')

    def test_repr_method(self):
        result = self.yumrepo.__repr__()
        self.assertEqual(result, 'YumRepo(test_repo)')

if __name__ == '__main__':
    unittest.main()