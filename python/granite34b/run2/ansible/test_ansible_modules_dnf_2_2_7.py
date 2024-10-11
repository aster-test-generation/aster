import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
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
        dnf = DnfModule(module)
        self.assertTrue(dnf)

    def test_compare_evr(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertEqual(dnf._compare_evr(None, '1.0', '1.el7', None, '1.0', '1.el7'), 0)
        self.assertEqual(dnf._compare_evr(None, '1.0', '1.el7', None, '1.0', '2.el7'), -1)
        self.assertEqual(dnf._compare_evr(None, '1.0', '1.el7', None, '1.0', '0.1.el7'), 1)
        self.assertEqual(dnf._compare_evr(None, '1.0', '1.el7', None, '1.1', '1.el7'), -1)
        self.assertEqual(dnf._compare_evr(None, '1.0', '1.el7', None, '0.1', '1.el7'), 1)
        self.assertEqual(dnf._compare_evr(None, '1.0', '1.el7', None, '1.0', '1.el8'), -1)
        self.assertEqual(dnf._compare_evr(None, '1.0', '1.el7', None, '1.0', '1.el6'), 1)

if __name__ == '__main__':
    unittest.main()