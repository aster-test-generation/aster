import unittest
from ansible.parsing.utils.yaml import from_yaml


class TestFromYaml(unittest.TestCase):
    def test_json(self):
        data = '{"key": "value"}'
        result = from_yaml(data)
        self.assertEqual(result, {'key': 'value'})

    def test_yaml(self):
        data = 'key: value'
        result = from_yaml(data)
        self.assertEqual(result, {'key': 'value'})

    def test_private_method(self):
        data = '{"key": "value"}'
        result = from_yaml(data, json_only=True)
        self.assertEqual(result, {'key': 'value'})

    def test_protected_method(self):
        data = 'key: value'
        result = from_yaml(data, show_content=False)
        self.assertEqual(result, {'key': 'value'})

    def test_magic_method(self):
        data = '{"key": "value"}'
        result = from_yaml(data, vault_secrets={})
        self.assertEqual(result, {'key': 'value'})

if __name__ == '__main__':
    unittest.main()