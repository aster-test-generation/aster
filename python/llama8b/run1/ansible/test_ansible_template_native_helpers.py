import unittest
from ansible.module_utils.basic import


class TestNativeHelpers(unittest.TestCase):
    def test_fail_on_undefined(self):
        data = {'a': 1, 'b': StrictUndefined()}
        result = _fail_on_undefined(data)
        self.assertEqual(result, {'a': 1, 'b': 'StrictUndefined'})

    def test_fail_on_undefined_sequence(self):
        data = [{'a': 1, 'b': StrictUndefined()}, {'c': 2}]
        result = _fail_on_undefined(data)
        self.assertEqual(result, [{'a': 1, 'b': 'StrictUndefined'}, {'c': 2}])

    def test_concat_nodes(self):
        nodes = ['Hello', ' ', 'World']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'Hello World')

    def test_concat_nodes_with_generator(self):
        nodes = (str(i) for i in range(5))
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '01234')

    def test_concat_nodes_with_mixed_types(self):
        nodes = [1, '2', 3.0, {'a': 4}]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '123.0{"a": 4}')

    def test_concat_nodes_with_ansible_vault_encrypted_unicode(self):
        nodes = [AnsibleVaultEncryptedUnicode(b'Hello')]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'Hello')

    def test_concat_nodes_with_native_jinja_text(self):
        nodes = [NativeJinjaText('Hello')]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'Hello')

    def test_concat_nodes_with_invalid_input(self):
        nodes = [1, 2, 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '123')

if __name__ == '__main__':
    unittest.main()