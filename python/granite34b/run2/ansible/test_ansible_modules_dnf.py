import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_private_method(self):
        from dnf.module import Module
        result = instance._private_method()
        self.assertEqual(result, expected_result)

    def test_protected_method(self):
        from dnf.module import Module
        result = instance._protected_method()
        self.assertEqual(result, expected_result)

    def test_magic_method(self):
        from dnf.module import DnfModule
        result = instance.__magic_method()
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()