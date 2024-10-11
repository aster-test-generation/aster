import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import yu


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_base(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        base = dnf_module._base(None, False, [], [], '/')
        self.assertIsInstance(base, dnf.Base)

    def test_base_with_update_cache(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.update_cache = True
        base = dnf_module._base(None, False, [], [], '/')
        self.assertTrue(base.update_cache)

    def test_base_with_security_filters(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.security = True
        base = dnf_module._base(None, False, [], [], '/')
        self.assertTrue(base.add_security_filters)

    def test_base_with_bugfix_filters(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.bugfix = True
        base = dnf_module._base(None, False, [], [], '/')
        self.assertTrue(base.add_security_filters)

    def test_base_with_nobest(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.nobest = True
        base = dnf_module._base(None, False, [], [], '/')
        self.assertFalse(base.best)

    def test_base_with_allowerasing(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.allowerasing = True
        base = dnf_module._base(None, False, [], [], '/')
        self.assertTrue(base.allowerasing)

    def test_base_with_disable_gpg_check(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.disable_gpg_check = True
        base = dnf_module._base(None, True, [], [], '/')
        self.assertFalse(base.disable_gpg_check)

    def test_base_with_disablerepo(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.disablerepo = ['repo1', 'repo2']
        base = dnf_module._base(None, False, ['repo1', 'repo2'], [], '/')
        self.assertEqual(base.disabled_repos, ['repo1', 'repo2'])

    def test_base_with_enablerepo(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.enablerepo = ['repo1', 'repo2']
        base = dnf_module._base(None, False, [], ['repo1', 'repo2'], '/')
        self.assertEqual(base.enabled_repos, ['repo1', 'repo2'])

    def test_base_with_installroot(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.installroot = '/new/install/root'
        base = dnf_module._base(None, False, [], [], '/new/install/root')
        self.assertEqual(base.installroot, '/new/install/root')

    def test_base_with_update_only(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.update_only = True
        base = dnf_module._base(None, False, [], [], '/')
        self.assertTrue(base.update_only)

    def test_base_with_download_only(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.download_only = True
        base = dnf_module._base(None, False, [], [], '/')
        self.assertTrue(base.download_only)

if __name__ == '__main__':
    unittest.main()