import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_to_yaml(self):
        data = {'key': 'value'}
        result = to_yaml(data)
        self.assertEqual(result, "key: value\n")

    def test_to_nice_yaml(self):
        data = {'key': 'value'}
        result = to_nice_yaml(data)
        self.assertEqual(result, "key: value\n")

    def test_to_json(self):
        data = {'key': 'value'}
        result = to_json(data)
        self.assertEqual(result, '{"key": "value"}')

    def test_to_nice_json(self):
        data = {'key': 'value'}
        result = to_nice_json(data)
        self.assertEqual(result, '{\n    "key": "value"\n}')

    def test_to_bool(self):
        self.assertTrue(to_bool('yes'))
        self.assertFalse(to_bool('no'))
        self.assertTrue(to_bool(True))
        self.assertFalse(to_bool(False))
        self.assertIsNone(to_bool(None))

    def test_to_datetime(self):
        date_str = '2023-10-01 12:00:00'
        result = to_datetime(date_str)
        self.assertEqual(result, datetime.datetime(2023, 10, 1, 12, 0))

    def test_regex_escape(self):
        string = 'a.b*c'
        result = regex_escape(string)
        self.assertEqual(result, 'a\\.b\\*c')

    def test_from_yaml(self):
        yaml_str = 'key: value\n'
        result = from_yaml(yaml_str)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_all(self):
        yaml_str = 'key: value\n---\nkey2: value2\n'
        result = list(from_yaml_all(yaml_str))
        self.assertEqual(result, [{'key': 'value'}, {'key2': 'value2'}])

    def test_rand(self):
        result = rand(None, 10, seed=1)
        self.assertTrue(0 <= result < 10)

    def test_randomize_list(self):
        mylist = [1, 2, 3, 4, 5]
        result = randomize_list(mylist, seed=1)
        self.assertNotEqual(result, mylist)

    def test_get_hash(self):
        data = 'test'
        result = get_hash(data)
        self.assertEqual(result, hashlib.sha1(to_bytes(data)).hexdigest())

    def test_get_encrypted_password(self):
        password = 'password'
        result = get_encrypted_password(password)
        self.assertTrue(result.startswith('$6$'))

    def test_to_uuid(self):
        string = 'test'
        result = to_uuid(string)
        self.assertEqual(result, 'f2ca1bb6-c7e6-5a8e-9a7e-0e3b0e8d6d7d')

if __name__ == '__main__':
    unittest.main()