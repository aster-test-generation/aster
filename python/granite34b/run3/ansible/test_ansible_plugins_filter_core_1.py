import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_to_yaml(self):
        self.assertEqual(to_yaml({}), '{\n}')
        self.assertEqual(to_yaml({'a': 1}), 'a: 1')
        self.assertEqual(to_yaml({'a': 1}, default_flow_style=False), 'a: 1\n')

    def test_to_nice_yaml(self):
        self.assertEqual(to_nice_yaml({}), '{}\n')
        self.assertEqual(to_nice_yaml({'a': 1}), 'a: 1\n')
        self.assertEqual(to_nice_yaml({'a': 1}, indent=2), 'a: 1\n')

    def test_to_json(self):
        self.assertEqual(to_json({}), '{}')
        self.assertEqual(to_json({'a': 1}), '{"a": 1}')
        self.assertEqual(to_json({'a': 1}, indent=2), '{\n  "a": 1\n}')

    def test_to_nice_json(self):
        self.assertEqual(to_nice_json({}), '{}')
        self.assertEqual(to_nice_json({'a': 1}), '{\n  "a": 1\n}')
        self.assertEqual(to_nice_json({'a': 1}, indent=2), '{\n  "a": 1\n}')

    def test_to_bool(self):
        self.assertEqual(to_bool(True), True)
        self.assertEqual(to_bool(False), False)
        self.assertEqual(to_bool(1), True)
        self.assertEqual(to_bool(0), False)
        self.assertEqual(to_bool('yes'), True)
        self.assertEqual(to_bool('no'), False)
        self.assertEqual(to_bool('on'), True)
        self.assertEqual(to_bool('off'), False)
        self.assertEqual(to_bool('true'), True)
        self.assertEqual(to_bool('false'), False)
        self.assertEqual(to_bool('1'), True)
        self.assertEqual(to_bool('0'), False)

    def test_to_datetime(self):
        self.assertEqual(to_datetime('2023-01-01 12:00:00'), datetime.datetime(2023, 1, 1, 12, 0, 0))
        self.assertEqual(to_datetime('2023-01-01 12:00:00', '%Y-%m-%d %H:%M:%S'), datetime.datetime(2023, 1, 1, 12, 0, 0))

    def test_strftime(self):
        self.assertEqual(strftime('%Y-%m-%d'), datetime.datetime.now().strftime('%Y-%m-%d'))
        self.assertEqual(strftime('%Y-%m-%d', time.time()), time.strftime('%Y-%m-%d', time.localtime(time.time())))

    def test_regex_escape(self):
        self.assertEqual(regex_escape('abc'), 'abc')
        self.assertEqual(regex_escape('abc*'), 'abc\\*')
        self.assertEqual(regex_escape('abc['), 'abc\\[')
        self.assertEqual(regex_escape('abc]'), 'abc\\]')
        self.assertEqual(regex_escape('abc?'), 'abc\\?')
        self.assertEqual(regex_escape('abc+'), 'abc\\+')
        self.assertEqual(regex_escape('abc.'), 'abc\\.')
        self.assertEqual(regex_escape('abc^'), 'abc\\^')
        self.assertEqual(regex_escape('abc$'), 'abc\\$')
        self.assertEqual(regex_escape('abc('), 'abc\\(')
        self.assertEqual(regex_escape('abc)'), 'abc\\)')
        self.assertEqual(regex_escape('abc{'), 'abc\\{')
        self.assertEqual(regex_escape('abc}'), 'abc\\}')
        self.assertEqual(regex_escape('abc|'), 'abc\\|')
        self.assertEqual(regex_escape('abc\\'), 'abc\\\\')
        self.assertEqual(regex_escape('abc/'), 'abc\/')

if __name__ == '__main__':
    unittest.main()