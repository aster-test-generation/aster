from ansible.config.manager import _get_entry
import unittest
from ansible.config.manager import *


class TestPlugin(unittest.TestCase):
    def test_plugin(self):
        name = ''
        type = ''
        result = Plugin(name, type)
        self.assertEqual(result.name, name)
        self.assertEqual(result.type, type)

class TestSetting(unittest.TestCase):
    def test_setting(self):
        name = ''
        value = ''
        origin = ''
        type = ''
        result = Setting(name, value, origin, type)
        self.assertEqual(result.name, name)
        self.assertEqual(result.value, value)
        self.assertEqual(result.origin, origin)
        self.assertEqual(result.type, type)

class TestGetEntry(unittest.TestCase):
    def test_get_entry(self):
        plugin_type = ''
        plugin_name = ''
        config = ''
        result = _get_entry(plugin_type, plugin_name, config)
        self.assertEqual(result, '')

class TestEnsureType(unittest.TestCase):
    def test_ensure_type(self):
        value = ''
        value_type = ''
        origin = ''
        result = ensure_type(value, value_type, origin)
        self.assertEqual(result, '')

class TestGetConfigType(unittest.TestCase):
    def test_get_config_type(self):
        cfile = ''
        result = get_config_type(cfile)
        self.assertEqual(result, None)

class TestGetIniConfigValue(unittest.TestCase):
    def test_get_ini_config_value(self):
        p = ''
        entry = ''
        result = get_ini_config_value(p, entry)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()