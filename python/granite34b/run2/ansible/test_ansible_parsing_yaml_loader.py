from ansible.parsing.yaml.loader import HAS_LIBYAML
import unittest
from ansible.parsing.yaml.loader import AnsibleLoader


class TestAnsibleLoader(unittest.TestCase):
    def test_init_with_libyaml(self):
        if HAS_LIBYAML:
            stream = "test stream"
            file_name = "test_file.yaml"
            vault_secrets = None
            loader = AnsibleLoader(stream, file_name, vault_secrets)
            self.assertIsInstance(loader, AnsibleLoader)
        else:
            pass

    def test_init_without_libyaml(self):
        if not HAS_LIBYAML:
            stream = "test stream"
            file_name = "test_file.yaml"
            vault_secrets = None
            loader = AnsibleLoader(stream, file_name, vault_secrets)
            self.assertIsInstance(loader, AnsibleLoader)
        else:
            pass

    def test_private_method(self):
        stream = "test stream"
        file_name = "test_file.yaml"
        vault_secrets = None
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader._AnsibleLoader__private_method()
        self.assertEqual(result, "private method result")

    def test_protected_method(self):
        stream = "test stream"
        file_name = "test_file.yaml"
        vault_secrets = None
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader._AnsibleLoader__protected_method()
        self.assertEqual(result, "protected method result")

    def test_magic_method(self):
        stream = "test stream"
        file_name = "test_file.yaml"
        vault_secrets = None
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader.method()
        self.assertEqual(result, "magic method result")

if __name__ == '__main__':
    unittest.main()