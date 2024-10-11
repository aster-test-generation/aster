import unittest
from ansible.module_utils.basic import AnsibleModule, AnsibleErro


class TestAnsibleUnsafe(unittest.TestCase):
    def test_ansible_unsafe(self):
        instance = AnsibleUnsafe()
        self.assertTrue(instance.__UNSAFE__)

    def test_ansible_unsafe_bytes(self):
        instance = AnsibleUnsafeBytes(b'Hello')
        self.assertIsInstance(instance, AnsibleUnsafeBytes)
        self.assertEqual(instance.decode('utf-8'), 'Hello')

    def test_ansible_unsafe_text(self):
        instance = AnsibleUnsafeText('Hello')
        self.assertIsInstance(instance, AnsibleUnsafeText)
        self.assertEqual(instance.encode('utf-8'), b'Hello')

    def test_native_jinja_unsafe_text(self):
        instance = NativeJinjaUnsafeText('Hello')
        self.assertIsInstance(instance, NativeJinjaUnsafeText)
        self.assertEqual(instance.encode('utf-8'), b'Hello')

    def test_unsafe_proxy(self):
        obj = 'Hello'
        instance = UnsafeProxy(obj)
        self.assertEqual(instance, obj)

    def test_wrap_var(self):
        v = {'a': 1, 'b': 2}
        result = wrap_var(v)
        self.assertIsInstance(result, dict)
        self.assertEqual(result, {wrap_var(k): wrap_var(item) for k, item in v.items()})

    def test_to_unsafe_bytes(self):
        result = to_unsafe_bytes(b'Hello')
        self.assertIsInstance(result, AnsibleUnsafeBytes)
        self.assertEqual(result.decode('utf-8'), 'Hello')

    def test_to_unsafe_text(self):
        result = to_unsafe_text('Hello')
        self.assertIsInstance(result, AnsibleUnsafeText)
        self.assertEqual(result.encode('utf-8'), b'Hello')

if __name__ == '__main__':
    unittest.main()