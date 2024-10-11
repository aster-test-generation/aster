import unittest
from ansible.config.manager import ConfigManager


class TestConfigManager(unittest.TestCase):
    def test_get_config_type(self):
        self.assertEqual(ConfigManager.get_config_type('config.ini'), 'ini')
        self.assertEqual(ConfigManager.get_config_type('config.yaml'), 'yaml')
        self.assertEqual(ConfigManager.get_config_type('config.txt'), None)

    def test_get_ini_config_value(self):
        config = ConfigManager(cfile='config.ini')
        self.assertEqual(config.get_ini_config_value('section', 'key'), 'value')
        self.assertEqual(config.get_ini_config_value('section', 'key2'), None)

if __name__ == '__main__':
    unittest.main()