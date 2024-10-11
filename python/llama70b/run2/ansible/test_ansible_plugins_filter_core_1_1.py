import unittest
from ansible.plugins.filter import cor


class TestFilters(unittest.TestCase):
    def test_to_yaml(self):
        result = to_yaml({'a': 1, 'b': 2})
        self.assertEqual(result, 'a: 1\nb: 2\n')

    def test_to_nice_yaml(self):
        result = to_nice_yaml({'a': 1, 'b': 2}, indent=2)
        self.assertEqual(result, '  a: 1\n  b: 2\n')

    def test_to_json(self):
        result = to_json({'a': 1, 'b': 2})
        self.assertEqual(result, '{"a": 1, "b": 2}')

    def test_to_nice_json(self):
        result = to_nice_json({'a': 1, 'b': 2}, indent=2)
        self.assertEqual(result, '{\n  "a": 1,\n  "b": 2\n}')

    def test_to_bool(self):
        self.assertTrue(to_bool(True))
        self.assertTrue(to_bool('yes'))
        self.assertFalse(to_bool(False))
        self.assertFalse(to_bool('no'))

    def test_to_datetime(self):
        result = to_datetime('2022-01-01 12:00:00')
        self.assertEqual(result, datetime.datetime(2022, 1, 1, 12, 0, 0))

    def test_strftime(self):
        result = strftime('%Y-%m-%d %H:%M:%S', '2022-01-01 12:00:00')
        self.assertEqual(result, '2022-01-01 12:00:00')

    def test_regex_escape(self):
        result = regex_escape('hello.world')
        self.assertEqual(result, 'hello\\.world')

    def test_from_yaml(self):
        result = from_yaml('a: 1\nb: 2')
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_from_yaml_all(self):
        result = from_yaml_all('a: 1\nb: 2\n---\nc: 3\nd: 4')
        self.assertEqual(result, [{'a': 1, 'b': 2}, {'c': 3, 'd': 4}])

    def test_rand(self):
        result = rand(1, 10)
        self.assertIsInstance(result, int)
        self.assertGreaterEqual(result, 1)
        self.assertLessEqual(result, 10)

    def test_randomize_list(self):
        result = randomize_list([1, 2, 3, 4, 5])
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 5)

    def test_get_hash(self):
        result = get_hash('hello world')
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 40)  # sha1 hash length

    def test_get_encrypted_password(self):
        result = get_encrypted_password('mypassword')
        self.assertIsInstance(result, str)

    def test_to_uuid(self):
        result = to_uuid('hello world')
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 36)  # uuid length

if __name__ == '__main__':
    unittest.main()