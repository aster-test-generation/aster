import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_to_yaml(self):
        a = {'key': 'value'}
        result = to_yaml(a)
        self.assertEqual(result, "{key: value}\n")

    def test_to_nice_yaml(self):
        a = {'key': 'value'}
        result = to_nice_yaml(a)
        self.assertEqual(result, "key: value\n")

    def test_to_json(self):
        a = {'key': 'value'}
        result = to_json(a)
        self.assertEqual(result, '{"key": "value"}')

    def test_to_nice_json(self):
        a = {'key': 'value'}
        result = to_nice_json(a)
        self.assertEqual(result, "{\n    \"key\": \"value\"\n}")

    def test_to_bool(self):
        a = 'yes'
        result = to_bool(a)
        self.assertEqual(result, True)

    def test_to_datetime(self):
        string = '2023-01-01 12:00:00'
        result = to_datetime(string)
        self.assertEqual(result, datetime.datetime(2023, 1, 1, 12, 0, 0))

    def test_strftime(self):
        string_format = '%Y-%m-%d %H:%M:%S'
        result = strftime(string_format)
        self.assertEqual(result, datetime.datetime.now().strftime(string_format))

    def test_regex_escape(self):
        string = '.^$*+?{}[]()'
        result = regex_escape(string)
        self.assertEqual(result, '\\.\\^\\$\\*\\+\\?\\{\\}\\[\\(\\)')

    def test_from_yaml(self):
        data = "key: value"
        result = from_yaml(data)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_all(self):
        data = "---\nkey: value\n...\n---\nkey2: value2"
        result = from_yaml_all(data)
        self.assertEqual(list(result), [{'key': 'value'}, {'key2': 'value2'}])

    def test_rand(self):
        end = 10
        result = rand(None, end)
        self.assertTrue(result >= 0 and result < end)

    def test_randomize_list(self):
        mylist = [1, 2, 3, 4, 5]
        result = randomize_list(mylist)
        self.assertEqual(len(result), len(mylist))
        self.assertNotEqual(result, mylist)

    def test_get_hash(self):
        data = 'test'
        result = get_hash(data)
        self.assertEqual(result, 'a94a8fe5ccb19ba61c4c0873d391e987982fbbd3')

    def test_get_encrypted_password(self):
        password = 'password'
        result = get_encrypted_password(password)
        self.assertTrue(result.startswith('$6$'))

    def test_to_uuid(self):
        string = 'test'
        result = to_uuid(string)
        self.assertEqual(result, 'f4fb6740-9e00-5ac4-9581-f24b6ecfe71e')

if __name__ == '__main__':
    unittest.main()