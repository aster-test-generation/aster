import unittest
from ansible.modules.apt_repository import SourcesList



class TestAptRepository(unittest.TestCase):
    def test_apt_repository(self):
        self.assertEqual(apt_repository.__module__, "ansible.modules.apt_repository")

    def test_apt_repository_main(self):
        self.assertEqual(apt_repository.main.__module__, "ansible.modules.apt_repository")

    def test_apt_repository_main_run_module(self):
        self.assertEqual(apt_repository.main.run_module.__module__, "ansible.modules.apt_repository")

    def test_apt_repository_main_run_module_run_command(self):
        self.assertEqual(apt_repository.main.run_module.run_command.__module__, "ansible.module_utils.basic")

    def test_apt_repository_main_run_module_run_command_module_common_argument_spec(self):
        self.assertEqual(apt_repository.main.run_module.run_command.module_common_argument_spec.__module__, "ansible.module_utils.basic")

    def test_apt_repository_main_run_module_run_command_module_common_argument_spec_module_common_argument_spec(self):
        self.assertEqual(apt_repository.main.run_module.run_command.module_common_argument_spec.module_common_argument_spec.__module__, "ansible.module_utils.basic")

    def test_apt_repository_main_run_module_run_command_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec(self):
        self.assertEqual(apt_repository.main.run_module.run_command.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.__module__, "ansible.module_utils.basic")

    def test_apt_repository_main_run_module_run_command_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec(self):
        self.assertEqual(apt_repository.main.run_module.run_command.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.__module__, "ansible.module_utils.basic")

    def test_apt_repository_main_run_module_run_command_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec(self):
        self.assertEqual(apt_repository.main.run_module.run_command.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.__module__, "ansible.module_utils.basic")

    def test_apt_repository_main_run_module_run_command_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec_module_common_argument_spec(self):
        self.assertEqual(apt_repository.main.run_module.run_command.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.module_common_argument_spec.__module__, "ansible.module_utils.basic")

if __name__ == '__main__':
    unittest.main()