import unittest
from ansible.modules.yum_repository import main
from ansible.module_utils.basic import AnsibleModule
import os


class TestYumRepository(unittest.TestCase):

    def setUp(self):
        self.argument_spec = dict(
            bandwidth=dict(), baseurl=dict(type='list', elements='str'), cost=dict(), deltarpm_metadata_percentage=dict(),
            deltarpm_percentage=dict(), description=dict(), enabled=dict(type='bool'), enablegroups=dict(type='bool'),
            exclude=dict(type='list', elements='str'), failovermethod=dict(choices=['roundrobin', 'priority']), file=dict(),
            gpgcakey=dict(no_log=False), gpgcheck=dict(type='bool'), gpgkey=dict(type='list', elements='str', no_log=False),
            module_hotfixes=dict(type='bool'), http_caching=dict(choices=['all', 'packages', 'none']), include=dict(),
            includepkgs=dict(type='list', elements='str'), ip_resolve=dict(choices=['4', '6', 'IPv4', 'IPv6', 'whatever']),
            keepalive=dict(type='bool'), keepcache=dict(choices=['0', '1']), metadata_expire=dict(),
            metadata_expire_filter=dict(choices=['never', 'read-only:past', 'read-only:present', 'read-only:future']),
            metalink=dict(), mirrorlist=dict(), mirrorlist_expire=dict(), name=dict(required=True), params=dict(type='dict'),
            password=dict(no_log=True), priority=dict(), protect=dict(type='bool'), proxy=dict(), proxy_password=dict(no_log=True),
            proxy_username=dict(), repo_gpgcheck=dict(type='bool'), reposdir=dict(default='/etc/yum.repos.d', type='path'),
            retries=dict(), s3_enabled=dict(type='bool'), skip_if_unavailable=dict(type='bool'), sslcacert=dict(aliases=['ca_cert']),
            ssl_check_cert_permissions=dict(type='bool'), sslclientcert=dict(aliases=['client_cert']),
            sslclientkey=dict(aliases=['client_key'], no_log=False), sslverify=dict(type='bool', aliases=['validate_certs']),
            state=dict(choices=['present', 'absent'], default='present'), throttle=dict(), timeout=dict(), ui_repoid_vars=dict(),
            username=dict()
        )
        self.argument_spec['async'] = dict(type='bool', default=True)
        self.module = AnsibleModule(argument_spec=self.argument_spec, add_file_common_args=True, supports_check_mode=True)

    def test_main(self):
        with self.assertRaises(SystemExit) as cm:
            main()
        self.assertEqual(cm.exception.code, 0)

    def test_fail_json(self):
        self.module.params['params'] = True
        with self.assertRaises(SystemExit) as cm:
            main()
        self.assertEqual(cm.exception.code, 1)

    def test_missing_baseurl_metalink_mirrorlist(self):
        self.module.params['state'] = 'present'
        self.module.params['baseurl'] = None
        self.module.params['metalink'] = None
        self.module.params['mirrorlist'] = None
        with self.assertRaises(SystemExit) as cm:
            main()
        self.assertEqual(cm.exception.code, 1)

    def test_missing_description(self):
        self.module.params['state'] = 'present'
        self.module.params['baseurl'] = ['http://example.com']
        self.module.params['description'] = None
        with self.assertRaises(SystemExit) as cm:
            main()
        self.assertEqual(cm.exception.code, 1)

    def test_yumrepo_add(self):
        self.module.params['state'] = 'present'
        self.module.params['baseurl'] = ['http://example.com']
        self.module.params['description'] = 'Test Repo'
        yumrepo = YumRepo(self.module)
        yumrepo.add()
        self.assertTrue(yumrepo.added)

    def test_yumrepo_remove(self):
        self.module.params['state'] = 'absent'
        yumrepo = YumRepo(self.module)
        yumrepo.remove()
        self.assertTrue(yumrepo.removed)

    def test_yumrepo_save(self):
        self.module.params['state'] = 'present'
        self.module.params['baseurl'] = ['http://example.com']
        self.module.params['description'] = 'Test Repo'
        yumrepo = YumRepo(self.module)
        yumrepo.add()
        yumrepo.save()
        self.assertTrue(os.path.isfile(yumrepo.params['dest']))

    def test_private_method(self):
        self.module.params['state'] = 'present'
        self.module.params['baseurl'] = ['http://example.com']
        self.module.params['description'] = 'Test Repo'
        yumrepo = YumRepo(self.module)
        result = yumrepo._YumRepo__private_method()
        self.assertEqual(result, 'expected result')

    def test_protected_method(self):
        self.module.params['state'] = 'present'
        self.module.params['baseurl'] = ['http://example.com']
        self.module.params['description'] = 'Test Repo'
        yumrepo = YumRepo(self.module)
        result = yumrepo._protected_method()
        self.assertEqual(result, 'expected result')

    def test_magic_methods(self):
        self.module.params['state'] = 'present'
        self.module.params['baseurl'] = ['http://example.com']
        self.module.params['description'] = 'Test Repo'
        yumrepo = YumRepo(self.module)
        self.assertEqual(str(yumrepo), 'YumRepo')
        self.assertEqual(repr(yumrepo), 'YumRepo()')
        self.assertTrue(yumrepo == yumrepo)

if __name__ == '__main__':
    unittest.main()