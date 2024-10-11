import unittest
from ansible.modules.dnf import DnfModule
from ansible.module_utils.basic import AnsibleModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        argument_spec = dict(
            name=dict(type='list', elements='str', required=True),
            state=dict(type='str', choices=['absent', 'present', 'installed', 'removed', 'latest']),
            enablerepo=dict(type='list', elements='str'),
            disablerepo=dict(type='list', elements='str'),
            conf_file=dict(type='str'),
            disable_gpg_check=dict(type='bool', default='no'),
            installroot=dict(type='str', default='/'),
            releasever=dict(type='str'),
            autoremove=dict(type='bool', default='no'),
            exclude=dict(type='list', elements='str'),
            skip_broken=dict(type='bool', default='no'),
            update_cache=dict(type='bool', default='no', aliases=['expire-cache']),
            update_only=dict(type='bool', default='no'),
            security=dict(type='bool', default='no'),
            bugfix=dict(type='bool', default='no'),
            enable_plugin=dict(type='list', elements='str'),
            disable_plugin=dict(type='list', elements='str'),
            disable_excludes=dict(type='str'),
            validate_certs=dict(type='bool', default='yes'),
            allow_downgrade=dict(type='bool', default='no'),
            install_repoquery=dict(type='bool', default='yes'),
            download_only=dict(type='bool', default='no'),
            lock_timeout=dict(type='int', default=30),
            install_weak_deps=dict(type='bool', default='yes'),
            download_dir=dict(type='str'),
            allowerasing=dict(type='bool', default='no'),
            nobest=dict(type='bool', default='no'),
            cacheonly=dict(type='bool', default='no')
        )
        self.module = AnsibleModule(argument_spec=argument_spec, check_invalid_arguments=False)
        self.module.params.update({
            'name': ['httpd'],
            'state': 'present',
            'allowerasing': False,
            'nobest': False
        })
        self.dnf_module = DnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    def test_sanitize_dnf_error_msg_remove_no_package_matched(self):
        result = self.dnf_module._sanitize_dnf_error_msg_remove('httpd', 'no package matched')
        self.assertEqual(result, (False, 'httpd is not installed'))

    def test_sanitize_dnf_error_msg_remove_no_match_for_argument(self):
        result = self.dnf_module._sanitize_dnf_error_msg_remove('httpd', 'No match for argument: httpd')
        self.assertEqual(result, (False, 'httpd is not installed'))

    def test_sanitize_dnf_error_msg_remove_other_error(self):
        result = self.dnf_module._sanitize_dnf_error_msg_remove('httpd', 'Some other error')
        self.assertEqual(result, (True, 'Some other error'))

if __name__ == '__main__':
    unittest.main()