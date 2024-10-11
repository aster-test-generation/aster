import unittest
from ansible.parsing.yaml.loader import AnsibleLoader


class TestAnsibleLoader(unittest.TestCase):
    def test_init(self):
        stream = 'some_stream'
        file_name = 'some_file_name'
        vault_secrets = 'some_vault_secrets'
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        self.assertIsNotNone(loader)

    def test_private_method__init__(self):
        stream = 'some_stream'
        file_name = 'some_file_name'
        vault_secrets = 'some_vault_secrets'
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader._AnsibleLoader__init__(stream, file_name, vault_secrets)
        self.assertIsNone(result)

    def test_str_method(self):
        stream = 'some_stream'
        file_name = 'some_file_name'
        vault_secrets = 'some_vault_secrets'
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        stream = 'some_stream'
        file_name = 'some_file_name'
        vault_secrets = 'some_vault_secrets'
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        result = loader.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        stream1 = 'some_stream1'
        file_name1 = 'some_file_name1'
        vault_secrets1 = 'some_vault_secrets1'
        loader1 = AnsibleLoader(stream1, file_name1, vault_secrets1)

        stream2 = 'some_stream2'
        file_name2 = 'some_file_name2'
        vault_secrets2 = 'some_vault_secrets2'
        loader2 = AnsibleLoader(stream2, file_name2, vault_secrets2)

        self.assertNotEqual(loader1, loader2)

if __name__ == '__main__':
    unittest.main()