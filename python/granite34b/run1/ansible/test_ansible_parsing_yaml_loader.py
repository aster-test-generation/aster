import unittest
from ansible.parsing.yaml.loader import AnsibleLoader


class TestAnsibleLoader(unittest.TestCase):
    def test_init(self):
        stream = "test stream"
        file_name = "test_file"
        vault_secrets = "test_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        self.assertEqual(loader.get_stream(), stream)
        self.assertEqual(loader.file_name, file_name)
        self.assertEqual(loader.vault_secrets, vault_secrets)

    def test_private_method(self):
        stream = "test stream"
        file_name = "test_file"
        vault_secrets = "test_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader._AnsibleLoader__private_method()
        self.assertEqual(result, "private method result")

    def test_protected_method(self):
        stream = "test stream"
        file_name = "test_file"
        vault_secrets = "test_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader._AnsibleLoader__protected_method()
        self.assertEqual(result, "protected method result")

    def test_magic_method(self):
        stream = "test stream"
        file_name = "test_file"
        vault_secrets = "test_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader._AnsibleLoader__magic_method()
        self.assertEqual(result, "magic method result")

if __name__ == '__main__':
    unittest.main()