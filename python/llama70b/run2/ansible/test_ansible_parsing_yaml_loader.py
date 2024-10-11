import unittest
from ansible.parsing.yaml.loader import AnsibleLoader


class TestAnsibleLoader(unittest.TestCase):
    def test___init__(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        self.assertIsNotNone(loader)

    def test___repr__(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        repr_str = loader.__repr__()
        self.assertIsInstance(repr_str, str)

    def test___str__(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        str_str = loader.__str__()
        self.assertIsInstance(str_str, str)

    def test___eq__(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader1 = AnsibleLoader(stream, file_name, vault_secrets)
        loader2 = AnsibleLoader(stream, file_name, vault_secrets)
        self.assertTrue(loader1 == loader2)

    def test_Parser___init__(self):
        stream = "some_stream"
        loader = AnsibleLoader(stream)
        self.assertIsNotNone(loader)

    def test_AnsibleConstructor___init__(self):
        stream = "some_stream"
        file_name = "some_file_name"
        vault_secrets = "some_vault_secrets"
        loader = AnsibleLoader(stream, file_name, vault_secrets)
        self.assertIsNotNone(loader)

    def test_Resolver___init__(self):
        stream = "some_stream"
        loader = AnsibleLoader(stream)
        self.assertIsNotNone(loader)

    def test_Reader___init__(self):
        stream = "some_stream"
        loader = AnsibleLoader(stream)
        self.assertIsNotNone(loader)

    def test_Scanner___init__(self):
        stream = "some_stream"
        loader = AnsibleLoader(stream)
        self.assertIsNotNone(loader)

    def test_Parser___init__(self):
        stream = "some_stream"
        loader = AnsibleLoader(stream)
        self.assertIsNotNone(loader)

    def test_Composer___init__(self):
        stream = "some_stream"
        loader = AnsibleLoader(stream)
        self.assertIsNotNone(loader)

if __name__ == '__main__':
    unittest.main()