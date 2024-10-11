import unittest
from ansible.modules.pip import *


class TestPip(unittest.TestCase):
    def test_get_pip(self):
        module = AnsibleModule(argument_spec=dict())
        env = None
        executable = None
        result = _get_pip(module, env, executable)
        self.assertIsNotNone(result)

    def test_get_pip_with_env(self):
        module = AnsibleModule(argument_spec={})
        env = "test"
        executable = None
        result = _get_pip(module, env, executable)
        self.assertIsNotNone(result)

    def test_get_pip_with_executable(self):
        module = AnsibleModule(argument_spec=dict())
        env = None
        executable = "test"
        result = _get_pip(module, env, executable)
        self.assertIsNotNone(result)

    def test_get_pip_with_env_and_executable(self):
        module = AnsibleModule(argument_spec={})
        env = "test"
        executable = "test"
        result = _get_pip(module, env, executable)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()