import unittest
from unittest.mock import patch, MagicMock
from ansible.parsing.utils.yaml import _handle_error, _safe_load, from_yaml
from ansible.errors import AnsibleParserError
from yaml import YAMLError


class TestHandleError(unittest.TestCase):
    def test_handle_error_with_problem_mark(self):
        json_exc = Exception("JSON error")
        yaml_exc = MagicMock()
        yaml_exc.problem_mark = MagicMock(line=1, column=2)
        yaml_exc.problem = "YAML problem"
        file_name = "test_file.yml"
        show_content = True

        with self.assertRaises(AnsibleParserError) as context:
            _handle_error(json_exc, yaml_exc, file_name, show_content)

        self.assertIn("We were unable to read either as JSON nor YAML", str(context.exception))

    def test_handle_error_without_problem_mark(self):
        json_exc = Exception("JSON error")
        yaml_exc = MagicMock()
        yaml_exc.problem_mark = None
        yaml_exc.problem = "YAML problem"
        file_name = "test_file.yml"
        show_content = True

        with self.assertRaises(AnsibleParserError) as context:
            _handle_error(json_exc, yaml_exc, file_name, show_content, line)

        self.assertIn("We were unable to read either as JSON nor YAML", str(context.exception))

class TestSafeLoad(unittest.TestCase):
    @patch('ansible.parsing.utils.yaml.AnsibleLoader')
    def test_safe_load(self, MockLoader):
        stream = "test_stream"
        file_name = "test_file.yml"
        vault_secrets = None

        mock_loader_instance = MockLoader.return_value
        mock_loader_instance.get_single_data.return_value = "parsed_data"

        result = _safe_load(stream, file_name, vault_secrets)
        self.assertEqual(result, "parsed_data")

    @patch('ansible.parsing.utils.yaml.AnsibleLoader')
    def test_safe_load_with_dispose(self, MockLoader):
        stream = "test_stream"
        file_name = "test_file.yml"
        vault_secrets = None

        mock_loader_instance = MockLoader.return_value
        mock_loader_instance.get_single_data.return_value = "parsed_data"
        mock_loader_instance.dispose.side_effect = AttributeError

        result = _safe_load(stream, file_name, vault_secrets)
        self.assertEqual(result, "parsed_data")

class TestFromYaml(unittest.TestCase):
    @patch('ansible.parsing.utils.yaml.json.loads')
    @patch('ansible.parsing.utils.yaml.AnsibleJSONDecoder')
    def test_from_yaml_json(self, MockDecoder, mock_json_loads):
        data = '{"key": "value"}'
        file_name = "test_file.yml"
        show_content = True
        vault_secrets = None
        json_only = False

        mock_json_loads.return_value = {"key": "value"}

        result = from_yaml(data, file_name, show_content, vault_secrets, json_only)
        self.assertEqual(result, {"key": "value"})

    @patch('ansible.parsing.utils.yaml._safe_load')
    @patch('ansible.parsing.utils.yaml.json.loads', side_effect=Exception("JSON error"))
    @patch('ansible.parsing.utils.yaml.AnsibleJSONDecoder')
    def test_from_yaml_yaml(self, MockDecoder, mock_json_loads, mock_safe_load):
        data = "key: value"
        file_name = "test_file.yml"
        show_content = True
        vault_secrets = None
        json_only = False

        mock_safe_load.return_value = {"key": "value"}

        result = from_yaml(data, file_name, show_content, vault_secrets, json_only)
        self.assertEqual(result, {"key": "value"})

    @patch('ansible.parsing.utils.yaml._handle_error')
    @patch('ansible.parsing.utils.yaml._safe_load', side_effect=YAMLError("YAML error"))
    @patch('ansible.parsing.utils.yaml.json.loads', side_effect=Exception("JSON error"))
    @patch('ansible.parsing.utils.yaml.AnsibleJSONDecoder')
    def test_from_yaml_error(self, MockDecoder, mock_json_loads, mock_safe_load, mock_handle_error):
        data = "invalid data"
        file_name = "test_file.yml"
        show_content = True
        vault_secrets = None
        json_only = False

        with self.assertRaises(AnsibleParserError):
            from_yaml(data, file_name, show_content, vault_secrets, json_only)

if __name__ == '__main__':
    unittest.main()