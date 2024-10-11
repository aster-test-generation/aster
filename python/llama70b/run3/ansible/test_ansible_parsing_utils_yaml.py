import unittest
from ansible.parsing.utils.yaml import _handle_error, _safe_load, from_yaml, AnsibleLoader, AnsibleBaseYAMLObject


class TestAnsibleLoader(unittest.TestCase):
    def test_init(self):
        loader = AnsibleLoader('stream', 'file_name', 'vault_secrets')
        self.assertIsNotNone(loader)

    def test_get_single_data(self):
        loader = AnsibleLoader('stream', 'file_name', 'vault_secrets')
        result = loader.get_single_data()
        self.assertIsNotNone(result)

    def test_dispose(self):
        loader = AnsibleLoader('stream', 'file_name', 'vault_secrets')
        loader.dispose()
        self.assertIsNone(loader.stream)

class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_init(self):
        obj = AnsibleBaseYAMLObject()
        self.assertIsNotNone(obj)

    def test_ansible_pos(self):
        obj = AnsibleBaseYAMLObject()
        obj.ansible_pos = ('file_name', 1, 1)
        self.assertEqual(obj.ansible_pos, ('file_name', 1, 1))

class TestHandleError(unittest.TestCase):
    def test_handle_error(self):
        yaml_exc = YAMLError('problem')
        json_exc = Exception('json error')
        file_name = 'file_name'
        show_content = True
        with self.assertRaises(AnsibleParserError):
            _handle_error(json_exc, yaml_exc, file_name, show_content)

class TestSafeLoad(unittest.TestCase):
    def test_safe_load(self):
        stream = 'yaml stream'
        file_name = 'file_name'
        vault_secrets = 'vault_secrets'
        result = _safe_load(stream, file_name, vault_secrets)
        self.assertIsNotNone(result)

class TestFromYAML(unittest.TestCase):
    def test_from_yaml_json(self):
        data = '{"key": "value"}'
        file_name = 'file_name'
        show_content = True
        vault_secrets = 'vault_secrets'
        result = from_yaml(data, file_name, show_content, vault_secrets)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_yaml(self):
        data = 'key: value'
        file_name = 'file_name'
        show_content = True
        vault_secrets = 'vault_secrets'
        result = from_yaml(data, file_name, show_content, vault_secrets)
        self.assertEqual(result, {'key': 'value'})

    def test_from_yaml_error(self):
        data = 'invalid yaml'
        file_name = 'file_name'
        show_content = True
        vault_secrets = 'vault_secrets'
        with self.assertRaises(AnsibleParserError):
            from_yaml(data, file_name, show_content, vault_secrets)

if __name__ == '__main__':
    unittest.main()