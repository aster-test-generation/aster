from ansible.parsing.yaml.objects import AnsibleUndefined as StrictUndefine
import unittest
from ansible.template.native_helpers import _fail_on_undefined, ansible_native_concat


class TestNativeHelpers(unittest.TestCase):
    def test_fail_on_undefined_mapping(self):
        data = {'a': 1, 'b': 2}
        result = _fail_on_undefined(data)
        self.assertEqual(result, data)

    def test_fail_on_undefined_sequence(self):
        data = [1, 2, 3]
        result = _fail_on_undefined(data)
        self.assertEqual(result, data)

    def test_fail_on_undefined_undefined(self):
        data = StrictUndefined()
        with self.assertRaises(TypeError):
            _fail_on_undefined(data)

    def test_ansible_native_concat_single(self):
        nodes = [1]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 1)

    def test_ansible_native_concat_multiple(self):
        nodes = [1, 2, 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '123')

    def test_ansible_native_concat_generator(self):
        def gen():
            yield 1
            yield 2
            yield 3
        nodes = gen()
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '123')

    def test_ansible_native_concat_undefined(self):
        nodes = [StrictUndefined()]
        with self.assertRaises(TypeError):
            ansible_native_concat(nodes)

if __name__ == '__main__':
    unittest.main()