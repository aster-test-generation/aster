import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertTrue(dnf)

    def test_ensure_dnf(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        dnf._ensure_dnf()
        self.assertTrue(dnf.dnf)

    def test_lockfile(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertEqual(dnf.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        module = AnsibleModule( yumdnf_argument_spec )
        dnf = DnfModule(module)
        self.assertEqual(dnf.pkg_mgr_name, 'dnf')

    def test_with_modules(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        try:
            self.assertTrue(dnf.with_modules)
        except AttributeError:
            self.assertFalse(dnf.with_modules)

    def test_allowerasing(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertFalse(dnf.allowerasing)

    def test_nobest(self):
        module = AnsibleModule( yumdnf_argument_spec )
        dnf = DnfModule(module)
        self.assertFalse(dnf.nobest)

if __name__ == '__main__':
    unittest.main()