import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def test_get_plugin_options(self):
        cm = ConfigManager()
        options = cm.get_plugin_options('connection', 'local')
        self.assertEqual(options, {'become': None, 'become_method': None, 'become_user': None, 'delegate_to': None, 'executable': None, 'port': None, 'ssh_extra_args': None, 'sudo': None, 'sudo_exe': None, 'sudo_flags': None, 'sudo_prompt': None, 'sudo_user': None, 'transport': 'smart'})

    def test_get_plugin_vars(self):
        cm = ConfigManager()
        vars = cm.get_plugin_vars('connection', 'local')
        self.assertEqual(vars, ['become', 'become_method', 'become_user', 'delegate_to', 'executable', 'port', 'ssh_extra_args', 'sudo', 'sudo_exe', 'sudo_flags', 'sudo_prompt', 'sudo_user', 'transport'])

    def test_get_configuration_definition(self):
        cm = ConfigManager()
        definition = cm.get_configuration_definition('default_become')
        self.assertEqual(definition, {'default': False, 'description': 'whether to run operations with become (does not impact connection type)', 'env': ['ANSIBLE_BECOME'], 'ini': ['become'], 'type': 'bool'})

if __name__ == '__main__':
    unittest.main()