import unittest
from ansible.parsing.utils.yaml import *


class TestAnsibleJSONDecoder(unittest.TestCase):
    def test_set_secrets(self):
        instance = AnsibleJSONDecoder()
        instance.set_secrets(vault_secrets=None)

class TestAnsibleLoader(unittest.TestCase):
    def test_dispose(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        instance.dispose()

    def test_get_data(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.get_data()

    def test_get_single_data(self):
        instance = AnsibleLoader(stream=None, file_name=None, vault_secrets=None)
        result = instance.get_single_data()

class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_ansible_pos(self):
        instance = AnsibleBaseYAMLObject()
        result = instance.ansible_pos

class TestFromYAML(unittest.TestCase):
    def test_from_yaml(self):
        result = from_yaml(data=None, file_name='<string>', show_content=True, vault_secrets=None, json_only=False)

if __name__ == '__main__':
    unittest.main()