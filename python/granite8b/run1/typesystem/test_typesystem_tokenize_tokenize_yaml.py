import unittest
from typesystem.tokenize.tokenize_yaml import tokenize_yaml, validate_yaml


class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml_with_dict(self):
        content = '{"a": 1, "b": 2}'
        token = tokenize_yaml(content)
        self.assertEqual(token.type, 'mapping')
        self.assertEqual(token.value, {'a': 1, 'b': 2})
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.content, content)

    def test_tokenize_yaml_with_list(self):
        content = '[1, 2, 3]'
        token = tokenize_yaml(content)
        self.assertEqual(token.type, 'sequence')
        self.assertEqual(token.value, [1, 2, 3])
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.content, content)

    def test_tokenize_yaml_with_scalar(self):
        content = 'hello'
        token = tokenize_yaml(content)
        self.assertEqual(token.type, 'scalar')
        self.assertEqual(token.value, 'hello')
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.content, content)

    def test_tokenize_yaml_with_int(self):
        content = '123'
        token = tokenize_yaml(content)
        self.assertEqual(token.type, 'scalar')
        self.assertEqual(token.value, 123)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.content, content)

    def test_tokenize_yaml_with_float(self):
        content = '123.456'
        token = tokenize_yaml(content)
        self.assertEqual(token.type, 'scalar')
        self.assertEqual(token.value, 123.456)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.content, content)

    def test_tokenize_yaml_with_bool(self):
        content = 'true'
        token = tokenize_yaml(content)
        self.assertEqual(token.type, 'scalar')
        self.assertEqual(token.value, True)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.content, content)

    def test_tokenize_yaml_with_null(self):
        content = 'null'
        token = tokenize_yaml(content)
        self.assertEqual(token.type, 'scalar')
        self.assertEqual(token.value, None)
        self.assertEqual(token.start, 0)
        self.assertEqual(token.end, len(content) - 1)
        self.assertEqual(token.content, content)

class TestValidateYaml(unittest.TestCase):
    def test_validate_yaml_with_dict(self):
        content = '{"a": 1, "b": 2}'
        validator = {'a': int, 'b': int}
        result = validate_yaml(content, validator)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_validate_yaml_with_list(self):
        content = '[1, 2, 3]'
        validator = [int]
        result = validate_yaml(content, validator)
        self.assertEqual(result, [1, 2, 3])

    def test_validate_yaml_with_scalar(self):
        content = 'hello'
        validator = str
        result = validate_yaml(content, validator)
        self.assertEqual(result, 'hello')

    def test_validate_yaml_with_int(self):
        content = '123'
        validator = int
        result = validate_yaml(content, validator)
        self.assertEqual(result, 123)

if __name__ == '__main__':
    unittest.main()