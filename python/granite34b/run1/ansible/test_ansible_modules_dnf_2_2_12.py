import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


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

    def test_list_items(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        dnf._ensure_dnf()
        dnf.list_items('installed')

if __name__ == '__main__':
    unittest.main()