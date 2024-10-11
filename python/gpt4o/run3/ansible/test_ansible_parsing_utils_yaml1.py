import unittest
from unittest.mock import patch, MagicMock
from ansible.parsing.utils.yaml import from_yaml, _safe_load, _handle_error
from ansible.errors import AnsibleParserError
from yaml import YAMLError

class TestFromYaml(unittest.TestCase):
    @patch('ansible.parsing.utils.yaml.json.loads')
    @patch('ansible.parsing.utils.yaml.AnsibleJSONDecoder')
    def test_from_yaml_json(self, mock_decoder, mock_json_loads):
        mock_json_loads.return_value = {'key': 'value'}
        data = '{"key": "value"}'
        result = from_yaml(data)
        self.assertEqual(result, {'key': 'value'})

    @patch('ansible.parsing.utils.yaml.json.loads', side_effect=Exception('JSON error'))
    @patch('ansible.parsing.utils.yaml._safe_load')
    def test_from_yaml_yaml(self, mock_safe_load, mock_json_loads):
        mock_safe_load.return_value = {'key': 'value'}
        data = 'key: value'
        result = from_yaml(data)
        self.assertEqual(result, {'key': 'value'})

    @patch('ansible.parsing.utils.yaml.json.loads', side_effect=Exception('JSON error'))
    @patch('ansible.parsing.utils.yaml._safe_load', side_effect=YAMLError('YAML error'))
    @patch('ansible.parsing.utils.yaml._handle_error')
    def test_from_yaml_error(self, mock_handle_error, mock_safe_load, mock_json_loads):
        data = 'invalid data'
        with self.assertRaises(AnsibleParserError):
            from_yaml(data)
        self.assertTrue(mock_handle_error.called)

    @patch('ansible.parsing.utils.yaml.json.loads', side_effect=Exception('JSON error'))
    def test_from_yaml_json_only(self, mock_json_loads):
        data = 'invalid data'
        with self.assertRaises(AnsibleParserError):
            from_yaml(data, json_only=True)

class TestSafeLoad(unittest.TestCase):
    @patch('ansible.parsing.utils.yaml.AnsibleLoader')
    def test_safe_load(self, mock_loader):
        mock_loader_instance = mock_loader.return_value
        mock_loader_instance.get_single_data.return_value = {'key': 'value'}
        stream = 'key: value'
        result = _safe_load(stream)
        self.assertEqual(result, {'key': 'value'})
        mock_loader_instance.dispose.assert_called_once()

    @patch('ansible.parsing.utils.yaml.AnsibleLoader')
    def test_safe_load_dispose_error(self, mock_loader):
        mock_loader_instance = mock_loader.return_value
        mock_loader_instance.get_single_data.return_value = {'key': 'value'}
        mock_loader_instance.dispose.side_effect = AttributeError
        stream = 'key: value'
        result = _safe_load(stream)
        self.assertEqual(result, {'key': 'value'})

class TestHandleError(unittest.TestCase):
    @patch('ansible.parsing.utils.yaml.AnsibleBaseYAMLObject')
    @patch('ansible.parsing.utils.yaml.to_native')
    def test_handle_error(self, mock_to_native, mock_ansible_base_yaml_object):
        mock_yaml_exc = MagicMock()
        mock_yaml_exc.problem_mark.line = 1
        mock_yaml_exc.problem_mark.column = 1
        mock_to_native.return_value = 'YAML error'
        mock_json_exc = Exception('JSON error')
        with self.assertRaises(AnsibleParserError):
            _handle_error(mock_json_exc, mock_yaml_exc, 'file_name', True)
        self.assertTrue(mock_ansible_base_yaml_object.called)

if __name__ == '__main__':
    unittest.main()