import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text

class TestUnsafeProxy(unittest.TestCase):
    def test_wrap_var(self):
        self.assertEqual(wrap_var(None), None)
        self.assertIsInstance(wrap_var(None), AnsibleUnsafe)
        self.assertIsInstance(wrap_var(b'abc'), AnsibleUnsafeBytes)
        self.assertIsInstance(wrap_var('abc'), AnsibleUnsafeText)
        self.assertIsInstance(wrap_var(NativeJinjaText('abc')), NativeJinjaUnsafeText)
        self.assertIsInstance(wrap_var({'a': 1}), dict)
        self.assertIsInstance(wrap_var({'a': AnsibleUnsafeBytes(b'abc')}), dict)
        self.assertIsInstance(wrap_var({'a': AnsibleUnsafeText('abc')}), dict)
        self.assertIsInstance(wrap_var({'a': NativeJinjaUnsafeText('abc')}), dict)
        self.assertIsInstance(wrap_var([1, 2, 3]), list)
        self.assertIsInstance(wrap_var([AnsibleUnsafeBytes(b'abc')]), list)
        self.assertIsInstance(wrap_var([AnsibleUnsafeText('abc')]), list)
        self.assertIsInstance(wrap_var([NativeJinjaUnsafeText('abc')]), list)
        self.assertIsInstance(wrap_var(set([1, 2, 3])), set)
        self.assertIsInstance(wrap_var(set([AnsibleUnsafeBytes(b'abc')])), set)
        self.assertIsInstance(wrap_var(set([AnsibleUnsafeText('abc')])), set)
        self.assertIsInstance(wrap_var(set([NativeJinjaUnsafeText('abc')])), set)

    def test_to_unsafe_bytes(self):
        self.assertEqual(to_unsafe_bytes('abc'), AnsibleUnsafeBytes(b'abc'))
        self.assertEqual(to_unsafe_bytes(b'abc'), AnsibleUnsafeBytes(b'abc'))
        self.assertEqual(to_unsafe_bytes(NativeJinjaText('abc')), AnsibleUnsafeBytes(b'abc'))

    def test_to_unsafe_text(self):
        self.assertEqual(to_unsafe_text('abc'), AnsibleUnsafeText('abc'))
        self.assertEqual(to_unsafe_text(b'abc'), AnsibleUnsafeText('abc'))
        self.assertEqual(to_unsafe_text(NativeJinjaText('abc')), AnsibleUnsafeText('abc'))

if __name__ == '__main__':
    unittest.main()