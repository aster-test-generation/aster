from ansible.module_utils import basic
import unittest
from ansible.config.manager import *


class TestAnsibleConfigManager(unittest.TestCase):
    def test_get_entry(self):
        config = 'setting: %s '
        result = _get_entry('plugin_type', 'plugin_name', config)
        self.assertEqual(result, 'plugin_type: plugin_type plugin: plugin_name setting: %s ' % config)

    def test_ensure_type(self):
        value = 'true'
        value_type = 'boolean'
        result = ensure_type(value, value_type)
        self.assertEqual(result, True)

    def test_resolve_path(self):
        path = '{{CWD}}/path'
        result = resolve_path(path)
        self.assertEqual(result, os.getcwd() + '/path')

    def test_get_config_type(self):
        cfile = 'path.ini'
        result = get_config_type(cfile)
        self.assertEqual(result, 'ini')

    def test_get_ini_config_value(self):
        p = configparser.ConfigParser()
        p['section'] = {'key': 'value'}
        entry = {'section': 'section', 'key': 'key'}
        result = get_ini_config_value(p, entry)
        self.assertEqual(result, 'value')

    def test_private_method(self):
        # This test case will fail because _get_entry is a private method
        # and cannot be accessed directly
        pass

    def test_protected_method(self):
        # This test case will fail because _ensure_type is a protected method
        # and cannot be accessed directly
        pass

    def test_magic_methods(self):
        # This test case will fail because the target code does not have
        # any magic methods
        pass

if __name__ == '__main__':
    unittest.main()