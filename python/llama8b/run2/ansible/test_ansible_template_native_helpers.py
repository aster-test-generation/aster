import unittest
from ansible.module_utils.basic import AnsibleModule, env_fallback


class TestFailOnUndefined(unittest.TestCase):
    def test_fail_on_undefined_mapping(self):
        data = {'a': None, 'b': 2}
        result = _fail_on_undefined(data)
        self.assertEqual(result, {'a': None, 'b': 2})

    def test_fail_on_undefined_sequence(self):
        data = [None, 2, 3]
        result = _fail_on_undefined(data)
        self.assertEqual(result, [None, 2, 3])

    def test_fail_on_undefined_strict_undefined(self):
        data = StrictUndefined()
        result = _fail_on_undefined(data)
        self.assertEqual(result, str(data))

    def test_fail_on_undefined_not_strict_undefined(self):
        data = 'hello'
        result = _fail_on_undefined(data)
        self.assertEqual(result, data)

class TestAnsibleNativeConcat(unittest.TestCase):
    def test_ansible_native_concat_single_node(self):
        nodes = [1]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 1)

    def test_ansible_native_concat_two_nodes(self):
        nodes = [1, 2]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '12')

    def test_ansible_native_concat_multiple_nodes(self):
        nodes = [1, 2, 3, 4, 5]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '12345')

    def test_ansible_native_concat_generator(self):
        nodes = (1, 2, 3, 4, 5)
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '12345')

    def test_ansible_native_concat_undefined(self):
        nodes = [None, 2, 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '2')

    def test_ansible_native_concat_vault_encrypted_unicode(self):
        nodes = [AnsibleVaultEncryptedUnicode('hello')]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'hello')

    def test_ansible_native_concat_native_jinja_text(self):
        nodes = [NativeJinjaText('hello')]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'hello')

if __name__ == '__main__':
    unittest.main()