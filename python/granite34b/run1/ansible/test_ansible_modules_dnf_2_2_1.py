import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_is_lockfile_pid_valid(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.is_lockfile_pid_valid())

if __name__ == '__main__':
    unittest.main()