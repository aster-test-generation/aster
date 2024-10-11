import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import AnsibleModul


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        self.assertEqual(module._name, None)
        self.assertEqual(module._state, None)
        self.assertEqual(module._enablerepo, None)
        self.assertEqual(module._disablerepo, None)
        self.assertEqual(module._conf_file, None)
        self.assertEqual(module._disable_gpg_check, None)
        self.assertEqual(module._installroot, None)
        self.assertEqual(module._releasever, None)
        self.assertEqual(module._autoremove, None)
        self.assertEqual(module._exclude, None)
        self.assertEqual(module._skip_broken, None)
        self.assertEqual(module._update_cache, None)
        self.assertEqual(module._update_only, None)
        self.assertEqual(module._security, None)
        self.assertEqual(module._bugfix, None)
        self.assertEqual(module._enable_plugin, None)
        self.assertEqual(module._disable_plugin, None)
        self.assertEqual(module._disable_excludes, None)
        self.assertEqual(module._validate_certs, None)
        self.assertEqual(module._allow_downgrade, None)
        self.assertEqual(module._install_repoquery, None)
        self.assertEqual(module._download_only, None)
        self.assertEqual(module._lock_timeout, None)
        self.assertEqual(module._install_weak_deps, None)
        self.assertEqual(module._download_dir, None)
        self.assertEqual(module._allowerasing, None)
        self.assertEqual(module._nobest, None)
        self.assertEqual(module._cacheonly, None)

    def test_name(self):
        module = AnsibleModule()
        module._name = 'httpd'
        self.assertEqual(module.name, 'httpd')

    def test_state(self):
        module = AnsibleModule()
        module._state = 'present'
        self.assertEqual(module.state, 'present')

    def test_enablerepo(self):
        module = AnsibleModule()
        module._enablerepo = 'testing'
        self.assertEqual(module.enablerepo, 'testing')

    def test_disablerepo(self):
        module = AnsibleModule()
        module._disablerepo = 'main'
        self.assertEqual(module.disablerepo, 'main')

    def test_conf_file(self):
        module = AnsibleModule()
        module._conf_file = '/path/to/conf/file'
        self.assertEqual(module.conf_file, '/path/to/conf/file')

    def test_disable_gpg_check(self):
        module = AnsibleModule()
        module._disable_gpg_check = True
        self.assertEqual(module.disable_gpg_check, True)

    def test_installroot(self):
        module = AnsibleModule()
        module._installroot = '/path/to/installroot'
        self.assertEqual(module.installroot, '/path/to/installroot')

    def test_releasever(self):
        module = AnsibleModule()
        module._releasever = '6'
        self.assertEqual(module.releasever, '6')

    def test_autoremove(self):
        module = AnsibleModule()
        module._autoremove = True
        self.assertEqual(module.autoremove, True)

    def test_exclude(self):
        module = AnsibleModule()
        module._exclude = 'httpd'
        self.assertEqual(module.exclude, 'httpd')

    def test_skip_broken(self):
        module = AnsibleModule()
        module._skip_broken = True
        self.assertEqual(module.skip_broken, True)

    def test_update_cache(self):
        module = AnsibleModule()
        module._update_cache = True
        self.assertEqual(module.update_cache, True)

    def test_update_only(self):
        module = AnsibleModule()
        module._update_only = True
        self.assertEqual(module.update_only, True)

    def test_security(self):
        module = AnsibleModule()
        module._security = True
        self.assertEqual(module.security, True)

    def test_bugfix(self):
        module = AnsibleModule()
        module._bugfix = True
        self.assertEqual(module.bugfix, True)

    def test_enable_plugin(self):
        module = AnsibleModule()
        module._enable_plugin = 'plugin'
        self.assertEqual(module.enable_plugin, 'plugin')

    def test_disable_plugin(self):
        module = AnsibleModule()
        module._disable_plugin = 'plugin'
        self.assertEqual(module.disable_plugin, 'plugin')

if __name__ == '__main__':
    unittest.main()