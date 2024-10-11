import unittest
from ansible.template.native_helpers import _fail_on_undefined, ansible_native_concat


class TestNativeHelpers(unittest.TestCase):
    def test_fail_on_undefined_with_mapping(self):
        data = {'key': StrictUndefined}
        result = _fail_on_undefined(data)
        self.assertEqual(result, {'key': 'REPLACE_ME'})

    def test_fail_on_undefined_with_sequence(self):
        data = [StrictUndefined, StrictUndefined]
        result = _fail_on_undefined(data)
        self.assertEqual(result, ['REPLACE_ME', 'REPLACE_ME'])

    def test_fail_on_undefined_with_string(self):
        data = StrictUndefined
        result = _fail_on_undefined(data)
        self.assertEqual(result, 'REPLACE_ME')

    def test_ansible_native_concat_with_one_node(self):
        nodes = [1]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 1)

    def test_ansible_native_concat_with_two_nodes(self):
        nodes = [1, 2]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 12)

    def test_ansible_native_concat_with_vault_encrypted_unicode(self):
        nodes = ['abc']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'abc')

    def test_ansible_native_concat_with_native_jinja_text(self):
        nodes = [NativeJinjaText('abc')]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'abc')

    def test_ansible_native_concat_with_string_types(self):
        nodes = ['abc', 'def']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'abcdef')

    def test_ansible_native_concat_with_generator_type(self):
        nodes = (i for i in range(3))
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '012')

    def test_ansible_native_concat_with_literal_eval(self):
        nodes = ['1 + 2']
        result = ansible_native_concat(nodes)
        self.assertEqual(add(1+2), 3)

    def test_ansible_native_concat_with_value_error(self):
        nodes = ['invalid syntax']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'invalid syntax')

if __name__ == '__main__':
    unittest.main()