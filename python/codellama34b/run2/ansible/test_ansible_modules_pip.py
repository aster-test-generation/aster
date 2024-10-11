import unittest
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils._text import to_native
from ansible.module_utils.basic import AnsibleModule, is_executable, missing_required_lib
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.six import PY3
from ansible.modules.pip import *


__metaclass__ = type


class TestAnsibleModule(unittest.TestCase):
    def test_AnsibleModule(self):
        instance = AnsibleModule(argument_spec={})
        self.assertIsInstance(instance, AnsibleModule)

    def test_AnsibleModule_get_bin_path(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.get_bin_path('')
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_required(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.get_bin_path('', required=True)
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_opt_dirs(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.get_bin_path('', opt_dirs=[])
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_exec_path(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.get_bin_path('', exec_path=[])
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_required_opt_dirs(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.get_bin_path('', required=True, opt_dirs=[])
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_required_exec_path(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.get_bin_path('', required=True, exec_path=[])
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_opt_dirs_exec_path(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.get_bin_path('', opt_dirs=[], exec_path=[])
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_required_opt_dirs_exec_path(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.get_bin_path('', required=True, opt_dirs=[], exec_path=[])
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_required_opt_dirs_exec_path_path_limit(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.get_bin_path('', required=True, opt_dirs=[], exec_path=[], path_limit=0)
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_required_opt_dirs_exec_path_path_limit_env_blacklist(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.get_bin_path('', required=True, opt_dirs=[], exec_path=[], path_limit=0, env_blacklist=[])
        self.assertIsInstance(result, str)

    def test_AnsibleModule_get_bin_path_required_opt_dirs_exec_path_path_limit_env_whitelist(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.get_bin_path('', required=True, opt_dirs=[], exec_path=[], path_limit=0, env_whitelist=[])
        self.assertIsInstance(result, str)



class TestPip(unittest.TestCase):
    def test_is_package_name(self):
        result = _is_package_name("name")
        self.assertEqual(result, True)

    def test_is_package_name_with_operator(self):
        result = _is_package_name(">=")
        self.assertEqual(result, False)

    def test_is_package_name_with_version(self):
        result = _is_package_name("name==1.0")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_operator(self):
        result = _is_package_name("name>=1.0")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators(self):
        result = _is_package_name("name>=1.0,<=2.0")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces(self):
        result = _is_package_name("name >= 1.0, <= 2.0")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals_and_tilde(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6, ~= 1.7")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals_and_tilde_and_other_chars(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6, ~= 1.7, !@#$%^&*()_+")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals_and_tilde_and_other_chars_and_spaces(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6, ~= 1.7, !@#$%^&*()_+ ")
        self.assertEqual(result, True)

    def test_is_package_name_with_version_and_multiple_operators_and_spaces_and_commas_and_equals_and_tilde_and_other_chars_and_spaces_and_commas(self):
        result = _is_package_name("name >= 1.0, <= 2.0, != 1.5, == 1.6, ~= 1.7, !@#$%^&*()_+ ,")
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()