from ansible.parsing.utils.yaml import AnsibleParserError
import unittest
from ansible.parsing.utils.yaml import from_yaml


class TestFromYaml(unittest.TestCase):
    def test_from_yaml_json_only(self):
        data = '{"key": "value"}'
        result = from_yaml(data, json_only=True)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_yaml_only(self):
        data = 'key: value'
        result = from_yaml(data, json_only=False)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_mixed(self):
        data = '{"key": "value"}'
        result = from_yaml(data, json_only=False)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_invalid_json(self):
        data = '{"key": "value}'
        with self.assertRaises(AnsibleParserError):
            from_yaml(data, json_only=True)

    def test_from_yaml_invalid_yaml(self):
        data = 'key: value}'
        with self.assertRaises(AnsibleParserError):
            from_yaml(data, json_only=False)

if __name__ == '__main__':
    unittest.main()