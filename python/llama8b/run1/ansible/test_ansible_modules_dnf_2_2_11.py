import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import dnf as dnf_module_utils


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_base(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        base = dnf_module._base(None, False, None, None, '/')
        self.assertIsInstance(base, dnf.Base)

    def test_configure_base(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        base = dnf_module._configure_base(None, None, False, '/')
        self.assertIsNone(base)

    def test_specify_repositories(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        base = dnf_module._base(None, False, None, None, '/')
        dnf_module._specify_repositories(base, ['repo1'], ['repo2'])
        self.assertEqual(len(base.repos), 2)

    def test_update_cache(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        base = dnf_module._base(None, False, None, None, '/')
        dnf_module.update_cache = True
        dnf_module._update_cache(base)
        self.assertTrue(base.update_cache)

    def test_add_security_filters(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        base = dnf_module._base(None, False, None, None, '/')
        dnf_module.add_security_filters(base, ['bugfix'], ['security'])
        self.assertEqual(len(base.security_filters), 2)

    def test_fill_sack(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        base = dnf_module._base(None, False, None, None, '/')
        dnf_module.fill_sack(base)
        self.assertEqual(len(base.sack), 1)

    def test_allowerasing(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.allowerasing, False)

    def test_nobest(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.nobest, False)

if __name__ == '__main__':
    unittest.main()