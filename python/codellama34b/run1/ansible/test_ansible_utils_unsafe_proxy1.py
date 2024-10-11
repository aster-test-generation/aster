import unittest
from ansible.utils.unsafe_proxy import *

class TestAnsibleUnsafe(unittest.TestCase):
    def test_AnsibleUnsafe(self):
        instance = AnsibleUnsafe()
        self.assertEqual(instance.__UNSAFE__, True)

    def test_AnsibleUnsafeBytes(self):
        instance = AnsibleUnsafeBytes()
        result = instance.decode()
        self.assertEqual(result, AnsibleUnsafeText())

    def test_AnsibleUnsafeText(self):
        instance = AnsibleUnsafeText()
        result = instance.encode()
        self.assertEqual(result, AnsibleUnsafeBytes())

    def test_NativeJinjaUnsafeText(self):
        instance = NativeJinjaUnsafeText()
        self.assertEqual(instance.__UNSAFE__, True)

    def test_UnsafeProxy(self):
        instance = UnsafeProxy()
        result = instance.__new__(None, None)
        self.assertEqual(result, None)

    def test_wrap_var(self):
        v = None
        result = wrap_var(v)
        self.assertEqual(result, None)

    def test_to_unsafe_bytes(self):
        result = to_unsafe_bytes()
        self.assertEqual(result, AnsibleUnsafeBytes())

    def test_to_unsafe_text(self):
        result = to_unsafe_text()
        self.assertEqual(result, AnsibleUnsafeText())

if __name__ == '__main__':
    unittest.main()