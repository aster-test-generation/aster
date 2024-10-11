import unittest
from ansible.parsing.utils.yaml import from_yaml


class TestYamlUtils(unittest.TestCase):
    def test_from_yaml_json_only(self):
        data = '{"key": "value"}'
        result = from_yaml(data, json_only=True)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_yaml_only(self):
        data = 'key: value'
        result = from_yaml(data, json_only=False)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_json_and_yaml(self):
        data = '{"key": "value"}'
        result = from_yaml(data, json_only=False)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_private_method(self):
        data = '{"key": "value"}'
        result = from_yaml._safe_load(data)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_protected_method(self):
        data = '{"key": "value"}'
        result = from_yaml._handle_error(Exception(), Exception(), 'file_name', True)
        self.assertEqual(result, None)

    def test_from_yaml_magic_method(self):
        data = '{"key": "value"}'
        result = from_yaml.__str__()
        self.assertEqual(result, 'from_yaml')

if __name__ == '__main__':
    unittest.main()