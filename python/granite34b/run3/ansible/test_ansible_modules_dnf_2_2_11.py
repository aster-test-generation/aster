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
        module = AnsibleModule( yumdnf_argument_spec )
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

if __name__ == '__main__':
    unittest.main()