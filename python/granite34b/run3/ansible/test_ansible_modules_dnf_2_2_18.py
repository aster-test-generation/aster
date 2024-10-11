import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_dnf_module_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(dnf_module.with_modules)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

    def test_dnf_module_update_only(self):
        module = None
        dnf_module = DnfModule(module)
        pkgs = ['pkg1', 'pkg2', 'pkg3']
        not_installed = dnf_module._update_only(pkgs)
        self.assertEqual(not_installed, ['pkg1', 'pkg2', 'pkg3'])

if __name__ == '__main__':
    unittest.main()