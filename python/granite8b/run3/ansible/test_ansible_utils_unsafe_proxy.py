from ansible.utils.unsafe_proxy import NativeJinjaText
import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text


class TestUnsafeProxy(unittest.TestCase):
    def test_wrap_var(self):
        self.assertIsInstance(wrap_var('test'), AnsibleUnsafeText)
        self.assertIsInstance(wrap_var(b'test'), AnsibleUnsafeBytes)
        self.assertIsInstance(wrap_var(None), type(AnsibleUnsafe))
        self.assertIsInstance(wrap_var({'test': 'value'}), dict)
        self.assertIsInstance(wrap_var({'test': 'value'})['test'], AnsibleUnsafeText)
        self.assertIsInstance(wrap_var([1, 2, 3]), list)
        self.assertIsInstance(wrap_var([1, 2, 3])[0], AnsibleUnsafeText)
        self.assertIsInstance(wrap_var(set([1, 2, 3])), set)
        self.assertIsInstance(wrap_var(set([1, 2, 3]))[0], AnsibleUnsafeText)
        self.assertIsInstance(wrap_var(NativeJinjaText('test')), NativeJinjaUnsafeText)

    def test_to_unsafe_bytes(self):
        self.assertIsInstance(to_unsafe_bytes('test'), AnsibleUnsafeBytes)

    def test_to_unsafe_text(self):
        self.assertIsInstance(to_unsafe_text('test'), AnsibleUnsafeText)

class TestUnsafeProxy(unittest.TestCase):
    def test_unsafe_proxy(self):
        obj = AnsibleUnsafeBytes(b"test")
        self.assertIsInstance(UnsafeProxy(obj), AnsibleUnsafeBytes)

    def test_wrap_var(self):
        obj = AnsibleUnsafeBytes(b"test")
        self.assertIsInstance(wrap_var(obj), AnsibleUnsafeBytes)

    def test_to_unsafe_bytes(self):
        obj = b"test"
        self.assertIsInstance(to_unsafe_bytes(obj), AnsibleUnsafeBytes)

    def test_to_unsafe_text(self):
        obj = "test"
        self.assertIsInstance(to_unsafe_text(obj), AnsibleUnsafeText)

if __name__ == '__main__':
    unittest.main()