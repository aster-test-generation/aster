import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text

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