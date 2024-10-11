from ansible.module_utils import basi
import configparser
import unittest
from ansible.plugins.lookup.ini import LookupModule
from ansible.module_utils._text import to_text
from ansible.module_utils.common._collections_compat import MutableSequence
from io import StringIO
from configparser import ConfigParser
import os
import re


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
            self.module.get_value('key', 'non_section', 'default', False)

    def test_get_value_no_key(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        with self.assertRaises(configparser.NoOptionError):
            self.module.get_value('non_key', 'section', 'default', False)

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
        result = self.module.run(['key'], {}, file='file', section='section', default='default', re=False)
        self.assertEqual(result, ['value'])

    def test_run_no_key(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        with self.assertRaises(AnsibleOptionsError):
            self.module.run([''], {}, file='file', section='section', default='default', re=False)

    def test_run_inline_kv(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key', 'value')
        result = self.module.run(['key=value'], {}, file='file', section='section', default='default', re=False)
        self.assertEqual(result, ['value'])

    def test_run_inline_kv_no_key(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        with self.assertRaises(AnsibleOptionsError):
            self.module.run([''], {}, file='file', section='section', default='default', re=False)

    def test_run_inline_kv_multiple_params(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key1', 'value1')
        self.module.cp.set('section', 'key2', 'value2')
        result = self.module.run(['key1=value1, key2=value2'], {}, file='file', section='section', default='default', re=False)
        self.assertEqual(result, ['value1', 'value2'])

    def test_run_inline_kv_multiple_params_no_key(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        with self.assertRaises(AnsibleOptionsError):
            self.module.run([''], {}, file='file', section='section', default='default', re=False)

    def test_run_file(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        self.module.cp.set('section', 'key', 'value')
        file = StringIO()
        file.write('[section]\nkey=value')
        file.seek(0, os.SEEK_SET)
        result = self.module.run(['key'], {}, file=file, section='section', default='default', re=False)
        self.assertEqual(result, ['value'])

    def test_run_file_no_key(self):
        self.module.cp = ConfigParser()
        self.module.cp.add_section('section')
        file = StringIO()
        file.write('[section]\nkey=value')
        file.seek(0, os.SEEK_SET)
        with self.assertRaises(AnsibleOptionsError):
            self.module.run([''], {}, file=file, section='section', default='default', re=False)

if __name__ == '__main__':
    unittest.main()