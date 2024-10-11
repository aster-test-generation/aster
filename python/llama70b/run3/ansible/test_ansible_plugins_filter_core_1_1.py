import unittest
from ansible.module_utils._text import to_native


class TestToYAML(unittest.TestCase):
    def test_to_yaml(self):
        result = to_yaml({'a': 1, 'b': 2})
        self.assertEqual(result, 'a: 1\nb: 2\n')

class TestToNiceYAML(unittest.TestCase):
    def test_to_nice_yaml(self):
        result = to_nice_yaml({'a': 1, 'b': 2}, indent=2)
        self.assertEqual(result, 'a: 1\n  b: 2\n')

class TestToJSON(unittest.TestCase):
    def test_to_json(self):
        result = to_json({'a': 1, 'b': 2})
        self.assertEqual(result, '{"a": 1, "b": 2}')

class TestToNiceJSON(unittest.TestCase):
    def test_to_nice_json(self):
        result = to_nice_json({'a': 1, 'b': 2}, indent=2)
        self.assertEqual(result, '{\n  "a": 1,\n  "b": 2\n}')

class TestToBool(unittest.TestCase):
    def test_to_bool_true(self):
        result = to_bool('yes')
        self.assertTrue(result)

    def test_to_bool_false(self):
        result = to_bool('no')
        self.assertFalse(result)

class TestToDateTime(unittest.TestCase):
    def test_to_datetime(self):
        result = to_datetime('2022-01-01 12:00:00')
        self.assertEqual(result, datetime.datetime(2022, 1, 1, 12, 0, 0))

class TestStrftime(unittest.TestCase):
    def test_strftime(self):
        result = strftime('%Y-%m-%d %H:%M:%S', '2022-01-01 12:00:00')
        self.assertEqual(result, '2022-01-01 12:00:00')

class TestRegexEscape(unittest.TestCase):
    def test_regex_escape_python(self):
        result = regex_escape('hello.world', re_type='python')
        self.assertEqual(result, 'hello\\.world')

    def test_regex_escape_posix_basic(self):
        result = regex_escape('hello.world', re_type='posix_basic')
        self.assertEqual(result, 'hello\\.world')

class TestFromYAML(unittest.TestCase):
    def test_from_yaml(self):
        result = from_yaml('a: 1\nb: 2\n')
        self.assertEqual(result, {'a': 1, 'b': 2})

class TestFromYAMLAll(unittest.TestCase):
    def test_from_yaml_all(self):
        result = from_yaml_all('a: 1\nb: 2\n---\nc: 3\nd: 4\n')
        self.assertEqual(result, [{'a': 1, 'b': 2}, {'c': 3, 'd': 4}])

class TestRand(unittest.TestCase):
    def test_rand(self):
        result = rand(None, 10)
        self.assertIsInstance(result, int)

class TestRandomizeList(unittest.TestCase):
    def test_randomize_list(self):
        result = randomize_list([1, 2, 3, 4, 5])
        self.assertEqual(len(result), 5)

class TestGetHash(unittest.TestCase):
    def test_get_hash(self):
        result = get_hash('hello world')
        self.assertEqual(len(result), 40)

class TestGetEncryptedPassword(unittest.TestCase):
    def test_get_encrypted_password(self):
        result = get_encrypted_password('password')
        self.assertIsInstance(result, str)

class TestToUUID(unittest.TestCase):
    def test_to_uuid(self):
        result = to_uuid('hello world')
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()