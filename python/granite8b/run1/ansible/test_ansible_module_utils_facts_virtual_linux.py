import unittest
from ansible.module_utils.facts.virtual import LinuxVirtual


class TestLinuxVirtual(unittest.TestCase):
    def test_linux_virtual_init(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

    def test_linux_virtual_get_virtual(self):
        instance = LinuxVirtual()
        result = instance.get_virtual()
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_args(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(args='args')
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_command(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(command='command')
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_command_and_args(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(command='command', args='args')
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_command_and_args_and_data(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(command='command', args='args', data='data')
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_command_and_args_and_data_and_force(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(command='command', args='args', data='data', force=True)
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_command_and_args_and_data_and_force_and_timeout(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(command='command', args='args', data='data', force=True, timeout=10)
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_command_and_args_and_data_and_force_and_timeout_and_executable(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(command='command', args='args', data='data', force=True, timeout=10, executable='/bin/bash')
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_command_and_args_and_data_and_force_and_timeout_and_executable_and_shell(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(command='command', args='args', data='data', force=True, timeout=10, executable='/bin/bash', shell=True)
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_command_and_args_and_data_and_force_and_timeout_and_executable_and_shell_and_executable_args(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(command='command', args='args', data='data', force=True, timeout=10, executable='/bin/bash', shell=True, executable_args='--login')
        self.assertIsNotNone(result)

    def test_linux_virtual_get_virtual_with_command_and_args_and_data_and_force_and_timeout_and_executable_and_shell_and_executable_args_and_executable_env(self):
        instance = LinuxVirtual()
        result = instance.get_virtual(command='command', args='args', data='data', force=True, timeout=10, executable='/bin/bash', shell=True, executable_args='--login', executable_env={'VAR': 'value'})
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()