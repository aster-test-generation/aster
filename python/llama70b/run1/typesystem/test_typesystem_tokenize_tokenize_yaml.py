import unittest
from typesystem.tokenize import tokenize_yaml, validate_yaml, _get_position, CustomSafeLoader, construct_mapping, construct_sequence, construct_scalar, construct_int, construct_float, construct_bool, construct_nul


class TestTokenizeYaml(unittest.TestCase):
    def test_tokenize_yaml(self):
        content = "key: value"
        result = tokenize_yaml(content)
        self.assertIsInstance(result, Token)

    def test_tokenize_yaml_empty(self):
        content = ""
        with self.assertRaises(ParseError):
            tokenize_yaml(content)

    def test_tokenize_yaml_bytes(self):
        content = b"key: value"
        result = tokenize_yaml(content)
        self.assertIsInstance(result, Token)

class TestValidateYaml(unittest.TestCase):
    def test_validate_yaml(self):
        content = "key: value"
        validator = Field()
        result = validate_yaml(content, validator)
        self.assertIsNotNone(result)

    def test_validate_yaml_invalid(self):
        content = "invalid yaml"
        validator = Field()
        with self.assertRaises(ParseError):
            validate_yaml(content, validator)

class TestGetPosition(unittest.TestCase):
    def test_get_position(self):
        content = "hello\nworld"
        index = 7
        result = _get_position(content, index)
        self.assertIsInstance(result, Position)
        self.assertEqual(result.line_no, 2)
        self.assertEqual(result.column_no, 1)
        self.assertEqual(result.char_index, 7)

class TestCustomSafeLoader(unittest.TestCase):
    def test_construct_mapping(self):
        loader = CustomSafeLoader()
        node = yaml.nodes.MappingNode()
        result = construct_mapping(loader, node)
        self.assertIsInstance(result, DictToken)

    def test_construct_sequence(self):
        loader = CustomSafeLoader()
        node = yaml.nodes.SequenceNode()
        result = construct_sequence(loader, node)
        self.assertIsInstance(result, ListToken)

    def test_construct_scalar(self):
        loader = CustomSafeLoader()
        node = yaml.nodes.ScalarNode()
        result = construct_scalar(loader, node)
        self.assertIsInstance(result, ScalarToken)

    def test_construct_int(self):
        loader = CustomSafeLoader()
        node = yaml.nodes.ScalarNode()
        result = construct_int(loader, node)
        self.assertIsInstance(result, ScalarToken)

    def test_construct_float(self):
        loader = CustomSafeLoader()
        node = yaml.nodes.ScalarNode()
        result = construct_float(loader, node)
        self.assertIsInstance(result, ScalarToken)

    def test_construct_bool(self):
        loader = CustomSafeLoader()
        node = yaml.nodes.ScalarNode()
        result = construct_bool(loader, node)
        self.assertIsInstance(result, ScalarToken)

    def test_construct_null(self):
        loader = CustomSafeLoader()
        node = yaml.nodes.ScalarNode()
        result = construct_null(loader, node)
        self.assertIsInstance(result, ScalarToken)

if __name__ == '__main__':
    unittest.main()