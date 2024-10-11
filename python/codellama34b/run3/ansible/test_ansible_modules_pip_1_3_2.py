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

    def test_AnsibleModule_exit_json(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.exit_json()
        self.assertIsNone(result)

    def test_AnsibleModule_fail_json(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.fail_json()
        self.assertIsNone(result)

    def test_AnsibleModule_from_argspec(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.from_argspec()
        self.assertIsNone(result)

    def test_AnsibleModule_load_file_common_arguments(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.load_file_common_arguments()
        self.assertIsNone(result)

    def test_AnsibleModule_run_command_common_arguments(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.run_command_common_arguments()
        self.assertIsNone(result)

    def test_AnsibleModule_run_command(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.run_command()
        self.assertIsNone(result)

    def test_AnsibleModule_run_command_warnings(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.run_command_warnings()
        self.assertIsNone(result)

    def test_AnsibleModule_is_executable(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.is_executable()
        self.assertIsNone(result)

    def test_AnsibleModule_missing_required_lib(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.missing_required_lib()
        self.assertIsNone(result)

    def test_AnsibleModule_get_bin_path(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.get_bin_path()
        self.assertIsNone(result)

    def test_AnsibleModule_get_best_parsable_locale(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.get_best_parsable_locale()
        self.assertIsNone(result)

    def test_AnsibleModule_to_native(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.to_native()
        self.assertIsNone(result)

    def test_AnsibleModule_is_package_name(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.is_package_name()
        self.assertIsNone(result)

    def test_AnsibleModule_package_version_from_module(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.package_version_from_module()
        self.assertIsNone(result)

    def test_AnsibleModule_package_version_from_file(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.package_version_from_file()
        self.assertIsNone(result)

    def test_AnsibleModule_package_version_from_vcs(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.package_version_from_vcs()
        self.assertIsNone(result)

    def test_AnsibleModule_package_version_from_scm_archive(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.package_version_from_scm_archive()
        self.assertIsNone(result)



class TestPipModule(unittest.TestCase):
    def test_get_best_pip_version(self):
        result = get_best_pip_version()
        self.assertEqual(result, None)

    def test_get_pip_version(self):
        result = get_pip_version()
        self.assertEqual(result, None)

    def test_get_pip_executable(self):
        result = get_pip_executable()
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable(self):
        result = get_pip_executable(executable='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_version(self):
        result = get_pip_executable(version='1.0')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version(self):
        result = get_pip_executable(executable='pip', version='1.0')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask_and_virtualenv(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='', virtualenv='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask_and_virtualenv_and_virtualenv_site_packages(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='', virtualenv='', virtualenv_site_packages='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask_and_virtualenv_and_virtualenv_site_packages_and_virtualenv_command(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='', virtualenv='', virtualenv_site_packages='', virtualenv_command='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask_and_virtualenv_and_virtualenv_site_packages_and_virtualenv_command_and_virtualenv_python(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='', virtualenv='', virtualenv_site_packages='', virtualenv_command='', virtualenv_python='')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()