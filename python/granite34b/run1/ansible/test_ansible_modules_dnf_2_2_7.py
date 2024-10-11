import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_compare_evr(self):
        dnf_module = DnfModule(AnsibleModule)
        e1, v1, r1, e2, v2, r2 = '1', '2', '3', '4', '5', '6'
        result = dnf_module._compare_evr(e1, v1, r1, e2, v2, r2)
        self.assertEqual(result, -1)

    def test_get_best_parsable_locale(self):
        dnf_module = DnfModule(AnsibleModule)
        result = dnf_module.get_best_parsable_locale()
        self.assertIsInstance(result, text_type)

    def test_has_respawned(self):
        dnf_module = DnfModule(AnsibleModule)
        result = dnf_module.has_respawned()
        self.assertIsInstance(result, bool)

    def test_probe_interpreters_for_module(self):
        dnf_module = DnfModule(AnsibleModule)
        result = dnf_module.probe_interpreters_for_module()
        self.assertIsInstance(result, list)

    def test_respawn_module(self):
        dnf_module = DnfModule(AnsibleModule)
        result = dnf_module.respawn_module()
        self.assertIsInstance(result, int)

    def test_yumdnf_argument_spec(self):
        dnf_module = DnfModule(AnsibleModule)
        result = dnf_module.yumdnf_argument_spec()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()