import unittest
from ansible.parsing.yaml.objects import AnsibleUndefined


class TestNativeHelpers(unittest.TestCase):
    def test_fail_on_undefined_mapping(self):
        data = {'a': 1, 'b': 2}
        result = _fail_on_undefined(data)
        self.assertEqual(result, data)

    def test_fail_on_undefined_sequence(self):
        data = [1, 2, 3]
        result = _fail_on_undefined(data)
        self.assertEqual(result, data)

    def test_fail_on_undefined_strict_undefined(self):
        data = StrictUndefined()
        with self.assertRaises(TypeError):
            _fail_on_undefined(data)

    def test_ansible_native_concat_single_node(self):
        nodes = [1]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 1)

    def test_ansible_native_concat_multiple_nodes(self):
        nodes = [1, 2, 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '123')

    def test_ansible_native_concat_undefined_node(self):
        nodes = [StrictUndefined()]
        with self.assertRaises(TypeError):
            ansible_native_concat(nodes)

    def test_ansible_native_concat_ansible_vault_encrypted_unicode(self):
        nodes = [AnsibleVaultEncryptedUnicode('encrypted_data')]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'encrypted_data')

    def test_ansible_native_concat_native_jinja_text(self):
        nodes = [NativeJinjaText('native_jinja_text')]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'native_jinja_text')

if __name__ == '__main__':
    unittest.main()