import unittest
from ansible.parsing.yaml.loader import AnsibleLoader



class TestAnsibleLoader(unittest.TestCase):
    def test_init(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        self.assertIsInstance(instance, AnsibleLoader)

    def test_get_single_data(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.get_single_data()
        self.assertEqual(result, None)

    def test_check_node(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.check_node()
        self.assertEqual(result, None)

    def test_compose_node(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.compose_node(None, None)
        self.assertEqual(result, None)

    def test_construct_document(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_document(None)
        self.assertEqual(result, None)

    def test_construct_mapping(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_mapping(None, None)
        self.assertEqual(result, None)

    def test_construct_sequence(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_sequence(None, None)
        self.assertEqual(result, None)

    def test_construct_scalar(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_scalar(None)
        self.assertEqual(result, None)

    def test_construct_yaml_omap(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_omap(None)
        self.assertEqual(result, None)

    def test_construct_yaml_pairs(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_pairs(None)
        self.assertEqual(result, None)

    def test_construct_yaml_set(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_set(None)
        self.assertEqual(result, None)

    def test_construct_yaml_str(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_str(None)
        self.assertEqual(result, None)

    def test_construct_yaml_seq(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_seq(None)
        self.assertEqual(result, None)

    def test_construct_yaml_map(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_yaml_map(None)
        self.assertEqual(result, None)

    def test_construct_undefined(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.construct_undefined(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()