import unittest
from ansible.parsing.yaml.loader import AnsibleLoader


class TestAnsibleLoader(unittest.TestCase):
    def test___init__(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        self.assertIsNotNone(loader)

    def test___str__(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader.__repr__()
        self.assertIsInstance(result, str)

    def test_parse(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader.parse(stream)
        self.assertIsNotNone(result)

    def test_get_single_data(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader.get_single_data()
        self.assertIsNotNone(result)

    def test_get_single_node(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader.get_single_node()
        self.assertIsNotNone(result)

    def test___eq__(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader1 = AnsibleLoader(stream, file_name, vault_secrets)
        loader2 = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader1 == loader2
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()