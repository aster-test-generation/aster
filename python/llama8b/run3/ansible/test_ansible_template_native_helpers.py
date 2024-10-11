import unittest
from ansible.module_utils._text import to_text
from ansible.module_utils.common.text.converters import container_to_text
from ansible.module_utils.common.collections import is_sequence, Mapping
from ansible.module_utils.six import text_type, string_types
from ansible.parsing.yaml.module_utils.yaml import AnsibleVaultEncryptedUnicod
from ansible.utils.native_jinja import NativeJinjaText
from ansible.module_utils._text import StrictUndefined


class TestAnsibleNativeConcat(unittest.TestCase):
    def test_ansible_native_concat(self):
        nodes = ['Hello', 'World']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'HelloWorld')

    def test_ansible_native_concat_with_generator(self):
        nodes = (str(i) for i in range(5))
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '01234')

    def test_ansible_native_concat_with_mapping(self):
        nodes = {'a': 'Hello', 'b': 'World'}
        result = ansible_native_concat(nodes.values())
        self.assertEqual(result, 'HelloWorld')

    def test_ansible_native_concat_with_sequence(self):
        nodes = ['Hello', 'World', 'Ansible']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'HelloWorldAnsible')

    def test_ansible_native_concat_with_undefined(self):
        nodes = [StrictUndefined()]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '')

    def test_ansible_native_concat_with_vault_encrypted_unicode(self):
        nodes = [AnsibleVaultEncryptedUnicode('Hello')]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'Hello')

    def test_ansible_native_concat_with_native_jinja_text(self):
        nodes = [NativeJinjaText('Hello')]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'Hello')

    def test_ansible_native_concat_with_non_string_types(self):
        nodes = [1, 2, 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '123')

    def test_ansible_native_concat_with_empty_nodes(self):
        nodes = []
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '')

    def test_ansible_native_concat_with_single_node(self):
        nodes = ['Hello']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'Hello')

    def test_ansible_native_concat_with_literal_eval(self):
        nodes = ['Hello', 'World']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'HelloWorld')

if __name__ == '__main__':
    unittest.main()