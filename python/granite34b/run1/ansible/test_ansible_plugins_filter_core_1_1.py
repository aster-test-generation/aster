import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_to_yaml(self):
        result = to_yaml({'a': 1, 'b': 2})
        self.assertEqual(result, "{'a': 1, 'b': 2}")

    def test_to_nice_yaml(self):
        result = to_nice_yaml({'a': 1, 'b': 2})
        self.assertEqual(result, "a: 1\nb: 2\n")

    def test_to_json(self):
        result = to_json({'a': 1, 'b': 2})
        self.assertEqual(result, '{"a": 1, "b": 2}')

    def test_to_nice_json(self):
        result = to_nice_json({'a': 1, 'b': 2})
        self.assertEqual(result, "{\n    \"a\": 1,\n    \"b\": 2\n}")

    def test_to_bool(self):
        result = to_bool('yes')
        self.assertTrue(result)

    def test_to_datetime(self):
        result = to_datetime('2023-01-01 12:00:00')
        self.assertEqual(result, datetime.datetime(2023, 1, 1, 12, 0, 0))

    def test_strftime(self):
        result = strftime('%Y-%m-%d', datetime.datetime(2023, 1, 1, 0, 0, 0))
        self.assertEqual(result, '2023-01-01')

    def test_regex_escape(self):
        result = regex_escape('abc*')
        self.assertEqual(result, 'abc\\*')

    def test_from_yaml(self):
        result = from_yaml("a: 1\nb: 2")
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_from_yaml_all(self):
        result = from_yaml_all("---\na: 1\n---\nb: 2")
        self.assertEqual(list(result), [{'a': 1}, {'b': 2}])

    def test_rand(self):
        result = rand(10, start=1, step=2)
        self.assertTrue(result in [1, 3, 5, 7, 9])

    def test_randomize_list(self):
        result = randomize_list([1, 2, 3, 4, 5])
        self.assertTrue(result != [1, 2, 3, 4, 5])

    def test_get_hash(self):
        result = get_hash('hello')
        self.assertEqual(result, 'aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d')

    def test_get_encrypted_password(self):
        result = get_encrypted_password('password', hashtype='sha512')
        self.assertTrue(result.startswith('$6$'))

    def test_to_uuid(self):
        result = to_uuid('hello')
        self.assertEqual(result, '9518e9b7-3af9-5e6c-b924-2eac65ffcd8e')

if __name__ == '__main__':
    unittest.main()