import unittest
from ansible.config.data import ConfigData


class TestConfigData(unittest.TestCase):
    def test_get_setting(self):
        config = ConfigData()
        config._global_settings['key'] = 'value'
        self.assertEqual(config.get_setting('key'), 'value')

    def test_get_settings(self):
        config = ConfigData()
        config._global_settings['key'] = 'value'
        self.assertEqual(config.get_settings(), ['value'])

    def test_update_setting(self):
        config = ConfigData()
        config.update_setting('key', 'value')
        self.assertEqual(config._global_settings['key'], 'value')

class TestConfigData(unittest.TestCase):
    def test_get_setting(self):
        config = ConfigData()
        config._global_settings = {'name': 'value'}
        self.assertEqual(config.get_setting('name'), 'value')

    def test_get_settings(self):
        config = ConfigData()
        config._global_settings = {'name': 'value'}
        self.assertEqual(config.get_settings(), [{'name': 'value'}])

    def test_update_setting(self):
        config = ConfigData()
        config.update_setting({'name': 'value'})
        self.assertEqual(config._global_settings, {'name': 'value'})

if __name__ == '__main__':
    unittest.main()