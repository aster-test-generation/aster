import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_to_yaml(self):
        data = {'key': 'value'}
        result = to_yaml(data)
        self.assertTrue(isinstance(result, str))

    def test_to_nice_yaml(self):
        data = {'key': 'value'}
        result = to_nice_yaml(data)
        self.assertTrue(isinstance(result, str))

    def test_to_json(self):
        data = {'key': 'value'}
        result = to_json(data)
        self.assertTrue(isinstance(result, str))

    def test_to_nice_json(self):
        data = {'key': 'value'}
        result = to_nice_json(data)
        self.assertTrue(isinstance(result, str))

    def test_to_bool(self):
        self.assertTrue(to_bool('yes'))
        self.assertFalse(to_bool('no'))

    def test_to_datetime(self):
        date_str = '2023-01-01 00:00:00'
        result = to_datetime(date_str)
        self.assertTrue(isinstance(result, datetime.datetime))

    def test_regex_escape(self):
        string = 'a.b*c'
        result = regex_escape(string)
        self.assertEqual(result, 'a\\.b\\*c')

    def test_from_yaml(self):
        yaml_str = 'key: value'
        result = from_yaml(yaml_str)
        self.assertTrue(isinstance(result, dict))

    def test_from_yaml_all(self):
        yaml_str = 'key: value\n---\nkey2: value2'
        result = list(from_yaml_all(yaml_str))
        self.assertTrue(isinstance(result, list))

    def test_rand(self):
        result = rand(None, 10)
        self.assertTrue(0 <= result < 10)

    def test_randomize_list(self):
        mylist = [1, 2, 3, 4, 5]
        result = randomize_list(mylist)
        self.assertTrue(isinstance(result, list))

    def test_get_hash(self):
        data = 'test'
        result = get_hash(data)
        self.assertTrue(isinstance(result, str))

    def test_get_encrypted_password(self):
        password = 'password'
        result = get_encrypted_password(password)
        self.assertTrue(isinstance(result, str))

    def test_to_uuid(self):
        string = 'test'
        result = to_uuid(string)
        self.assertTrue(isinstance(result, str))

if __name__ == '__main__':
    unittest.main()