import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestYumDnf(unittest.TestCase):
    def test_private_method(self):
        instance = YumDnfMocked()
        result = instance._private_method()
        self.assertEqual(result, expected_result)

    def test_protected_method(self):
        @patch('yumdnf.YumDnf.is_lockfile_pid_valid', MagicMock(return_value=True))
        result = instance._protected_method()
        self.assertEqual(result, expected_result)

    def test_magic_method(self):
        @patch('yumdnf.YumDnf.run')
        result = instance.__magic_method()
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()