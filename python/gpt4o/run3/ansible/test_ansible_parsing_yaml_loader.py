import unittest
from ansible.parsing.yaml.loader import AnsibleLoader
from ansible.module_utils.common.yaml import HAS_LIBYAML
from yaml.resolver import Resolver
from ansible.parsing.yaml.constructor import AnsibleConstructor


class TestAnsibleLoader(unittest.TestCase):
    def setUp(self):
        self.stream = "test_stream"
        self.file_name = "test_file"
        self.vault_secrets = "test_secrets"
        if HAS_LIBYAML:
            self.loader = AnsibleLoader(self.stream, self.file_name, self.vault_secrets)
        else:
            self.loader = AnsibleLoader(self.stream, self.file_name, self.vault_secrets)

    def test_init(self):
        self.assertIsInstance(self.loader, AnsibleLoader)

    def test_parser_init(self):
        if HAS_LIBYAML:
            self.assertTrue(hasattr(self.loader, 'token'))
        else:
            self.assertTrue(hasattr(self.loader, 'tokens'))

    def test_ansible_constructor_init(self):
        self.assertEqual(self.loader.get_file_name(), self.file_name)
        self.assertEqual(self.loader._vault_secrets, self.vault_secrets)

    def test_resolver_init(self):
        self.assertTrue(hasattr(self.loader, 'yaml_implicit_resolvers'))

if __name__ == '__main__':
    unittest.main()