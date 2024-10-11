import unittest
from ansible.parsing.yaml.loader import *



class TestAnsibleLoader(unittest.TestCase):
    def test_init(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        self.assertIsInstance(instance, AnsibleLoader)

    def test_composer_init(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        self.assertIsInstance(instance, Composer)

    def test_parser_init(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        self.assertIsInstance(instance, Parser)

    def test_scanner_init(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        self.assertIsInstance(instance, Scanner)

    def test_reader_init(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        self.assertIsInstance(instance, Reader)

    def test_resolver_init(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        self.assertIsInstance(instance, Resolver)

    def test_ansible_constructor_init(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        self.assertIsInstance(instance, AnsibleConstructor)

    def test_get_data(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.get_data()
        self.assertEqual(result, None)

    def test_get_single_data(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.get_single_data()
        self.assertEqual(result, None)

    def test_check_node(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.check_node()
        self.assertEqual(result, None)

    def test_construct_document(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_document(node)
        self.assertEqual(result, None)

    def test_construct_yaml_omap(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_omap(node)
        self.assertEqual(result, None)

    def test_construct_yaml_pairs(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_pairs(node)
        self.assertEqual(result, None)

    def test_construct_yaml_set(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_set(node)
        self.assertEqual(result, None)

    def test_construct_yaml_seq(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_seq(node)
        self.assertEqual(result, None)

    def test_construct_yaml_map(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_map(node)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()