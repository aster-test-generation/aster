import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def test_get_plugin_options(self):
        cm = ConfigManager()
        options = cm.get_plugin_options('connection', 'paramiko')
        self.assertEqual(options, {'pipelining': False, 'scp_if_ssh': False, 'ssh_args': '', 'ssh_common_args': '', 'ssh_executable': None, 'ssh_extra_args': '', 'ssh_pipelining': False, 'ssh_port': 22, 'ssh_private_key_file': None, 'ssh_user': 'ansible', 'ssh_warn': True})

    def test_get_plugin_vars(self):
        cm = ConfigManager()
        vars = cm.get_plugin_vars('connection', 'paramiko')
        self.assertEqual(vars, ['ssh_common_args', 'ssh_executable', 'ssh_extra_args', 'ssh_pipelining', 'ssh_port', 'ssh_private_key_file', 'ssh_user', 'ssh_warn'])

    def test_get_configuration_definition(self):
        cm = ConfigManager()
        definition = cm.get_configuration_definition('ssh_executable')
        self.assertEqual(definition, {'default': '/usr/bin/ssh', 'env': ['ANSIBLE_SSH_EXECUTABLE'], 'ini': ['ssh_executable'], 'type': 'path'})

if __name__ == '__main__':
    unittest.main()