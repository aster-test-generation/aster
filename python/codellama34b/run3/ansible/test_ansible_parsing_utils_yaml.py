import unittest
from ansible.parsing.utils.yaml import *


class TestFromYAML(unittest.TestCase):
    def test_from_yaml(self):
        data = "data"
        file_name = "file_name"
        show_content = True
        vault_secrets = None
        json_only = False
        result = from_yaml(data, file_name, show_content, vault_secrets, json_only)
        self.assertEqual(result, None)

    def test_safe_load(self):
        stream = "stream"
        file_name = "file_name"
        vault_secrets = None
        result = _safe_load(stream, file_name, vault_secrets)
        self.assertEqual(result, None)

    def test_handle_error(self):
        json_exc = "json_exc"
        yaml_exc = "yaml_exc"
        file_name = "file_name"
        show_content = True
        result = _handle_error(json_exc, yaml_exc, file_name, show_content)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()