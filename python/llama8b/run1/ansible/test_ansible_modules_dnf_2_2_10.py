import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.basic import AnsibleModule, missing_required_li


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

    def test_specify_repositories(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        base = YumDnf(module)
        disablerepo = ['repo1', 'repo2']
        enablerepo = ['repo3', 'repo4']
        dnf_module._specify_repositories(base, disablerepo, enablerepo)
        self.assertEqual(len(base.repos), 4)

    def test__ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'base'))

    def test__init__(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module._ensure_dnf(), None)

    def test__str__(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test__repr__(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule(module)')

    def test__eq__(self):
        module = AnsibleModule()
        dnf_module1 = DnfModule(module)
        dnf_module2 = DnfModule(module)
        self.assertEqual(dnf_module1, dnf_module2)

    def test_lockfile(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

    def test_with_modules(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.with_modules, False)

    def test_allowerasing(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.allowerasing)

    def test_nobest(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.nobest)

if __name__ == '__main__':
    unittest.main()