import unittest
from ansible.parsing.yaml.loader import AnsibleLoader
from ansible.module_utils.common.yaml import HAS_LIBYAML
from yaml.reader import Reader
from yaml.scanner import Scanner
from yaml.parser import Parser
from yaml.composer import Composer
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
        if HAS_LIBYAML:
            self.assertIsInstance(self.loader, (Parser, AnsibleConstructor, Resolver))
        else:
            self.assertIsInstance(self.loader, (Reader, Scanner, Parser, Composer, AnsibleConstructor, Resolver))

    def test_parser_init(self):
        if HAS_LIBYAML:
            self.assertEqual(self.loader.get_stream(), self.stream)
        else:
            self.assertEqual(self.loader.stream, self.stream)

    def test_ansible_constructor_init(self):
        self.assertEqual(self.loader.name, self.file_name)
        self.assertEqual(self.loader.vault_secrets, self.vault_secrets)

    def test_resolver_init(self):
        self.assertTrue(hasattr(self.loader, 'yaml_implicit_resolvers'))

if __name__ == '__main__':
    unittest.main()