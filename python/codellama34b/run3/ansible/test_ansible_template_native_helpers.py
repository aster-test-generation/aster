from ansible.template.native_helpers import _fail_on_undefined
import unittest
from ansible.template.native_helpers import *


class TestAnsibleNativeConcat(unittest.TestCase):
    def test_ansible_native_concat(self):
        nodes = [1, 2, 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 6)

    def test_ansible_native_concat_with_generator(self):
        nodes = (1, 2, 3)
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 6)

    def test_ansible_native_concat_with_string(self):
        nodes = ['a', 'b', 'c']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'abc')

    def test_ansible_native_concat_with_mixed_types(self):
        nodes = [1, 'b', 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '1b3')

    def test_ansible_native_concat_with_empty_list(self):
        nodes = []
        result = ansible_native_concat(nodes)
        self.assertEqual(result, None)

    def test_ansible_native_concat_with_single_element(self):
        nodes = [1]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 1)

    def test_ansible_native_concat_with_invalid_type(self):
        nodes = 1
        with self.assertRaises(TypeError):
            ansible_native_concat(nodes)

class TestFailOnUndefined(unittest.TestCase):
    def test_fail_on_undefined(self):
        data = 1
        result = _fail_on_undefined(data)
        self.assertEqual(result, 1)

    def test_fail_on_undefined_with_mapping(self):
        data = {'a': 1, 'b': 2}
        result = _fail_on_undefined(data)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_fail_on_undefined_with_sequence(self):
        data = [1, 2, 3]
        result = _fail_on_undefined(data)
        self.assertEqual(result, [1, 2, 3])

    def test_fail_on_undefined_with_undefined(self):
        data = StrictUndefined()
        with self.assertRaises(TypeError):
            _fail_on_undefined(data)

    def test_fail_on_undefined_with_invalid_type(self):
        data = 1.0
        with self.assertRaises(TypeError):
            _fail_on_undefined(data)

if __name__ == '__main__':
    unittest.main()