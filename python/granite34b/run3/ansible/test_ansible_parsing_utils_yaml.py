import unittest
from ansible.parsing.utils.yaml import from_yaml


class TestFromYAML(unittest.TestCase):
    def test_from_yaml_json(self):
        data = '{"key": "value"}'
        result = from_yaml(data, json_only=True)
        self.assertEqual(result, {"key": "value"})

    def test_from_yaml_yaml(self):
        data = "key: value"
        result = from_yaml(data)
        self.assertEqual(result, {"key": "value"})

    def test_from_yaml_invalid(self):
        data = "key: value: extra"
        with self.assertRaises(AnsibleParserError):
            from_yaml(data)

    def test_from_yaml_private_method(self):
        data = "key: value"
        result = from_yaml(data)
        self.assertEqual(result, {"key": "value", "_private_method_param": True})

    def test_from_yaml_protected_method(self):
        data = "key: value"
        result = from_yaml(data)
        self.assertEqual(result, {"key": "value", "_protected_method_param": True})

    def test_from_yaml_magic_method(self):
        data = "key: value"
        result = from_yaml(data)
        self.assertEqual(result, {"key": "value", "__magic_method_param": True})

if __name__ == '__main__':
    unittest.main()