import unittest
from ansible.module_utils.basic import AnsibleModul
from ansible.module_utils._text import to_text
from ansible.module_utils.common._collections_compat import MutableSequence
from io import StringIO
from configparser import ConfigParser
from ansible.module_utils.six.moves import configparser
from ansible.module_utils._text import to_native


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.module = LookupModule()

    def test_get_value(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key', 'value')
        result = self.module.get_value('key', 'section', 'default', False)
        self.assertEqual(result, 'value')

    def test_get_value_no_section(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key', 'value')
        with self.assertRaises(configparser.NoSectionError):
            self.module.get_value('key', 'non_existent_section', 'default', False)

    def test_get_value_no_key(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key', 'value')
        result = self.module.get_value('non_existent_key', 'section', 'default', False)
        self.assertEqual(result, 'default')

    def test_get_value_is_regexp(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key1', 'value1')
        self.module.cp.set('section', 'key2', 'value2')
        result = self.module.get_value('key.*', 'section', 'default', True)
        self.assertEqual(result, ['value1', 'value2'])

    def test_run(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key', 'value')
        result = self.module.run(['key'], None)
        self.assertEqual(result, ['value'])

    def test_run_inline_kv(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key', 'value')
        result = self.module.run(['key=value'], None)
        self.assertEqual(result, ['value'])

    def test_run_multiple_terms(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key1', 'value1')
        self.module.cp.set('section', 'key2', 'value2')
        result = self.module.run(['key1', 'key2'], None)
        self.assertEqual(result, ['value1', 'value2'])

    def test_run_multiple_terms_inline_kv(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key1', 'value1')
        self.module.cp.set('section', 'key2', 'value2')
        result = self.module.run(['key1=value1', 'key2=value2'], None)
        self.assertEqual(result, ['value1', 'value2'])

    def test_deprecate_inline_kv(self):
        self.module._deprecate_inline_kv()
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key', 'value')
        result = self.module.run(['key=value'], None)
        self.assertEqual(result, ['value'])

    def test_parse_params(self):
        params = _parse_params('key=value', {'key': 'value'})
        self.assertEqual(params, ['key=value'])

    def test_parse_params_multiple_params(self):
        params = _parse_params('key1=value1 key2=value2', {'key1': 'value1', 'key2': 'value2'})
        self.assertEqual(params, ['key1=value1', 'key2=value2'])

    def test_parse_params_no_key(self):
        with self.assertRaises(ValueError):
            _parse_params('key=value', {'key': 'value'})

    def test_parse_params_no_value(self):
        with self.assertRaises(ValueError):
            _parse_params('key', {'key': 'value'})

    def test_parse_params_no_params(self):
        with self.assertRaises(ValueError):
            _parse_params('', {})

if __name__ == '__main__':
    unittest.main()