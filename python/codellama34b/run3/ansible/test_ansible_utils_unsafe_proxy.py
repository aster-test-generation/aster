import unittest
from ansible.utils.unsafe_proxy import *


class TestAnsibleUnsafe(unittest.TestCase):
    def test_AnsibleUnsafe(self):
        result = AnsibleUnsafe()
        self.assertTrue(result.__UNSAFE__)

    def test_AnsibleUnsafeBytes(self):
        result = AnsibleUnsafeText()
        self.assertTrue(result.__UNSAFE__)

    def test_AnsibleUnsafeText(self):
        from ansible.utils.unsafe_proxy import AnsibleUnsafeText
        self.assertTrue(result.__UNSAFE__)

    def test_NativeJinjaUnsafeText(self):
        result = NativeJinjaUnsafeText
        self.assertTrue(result.__UNSAFE__)

    def test_UnsafeProxy(self):
        result = UnsafeProxy
        self.assertTrue(result.__UNSAFE__)

    def test_wrap_var(self):
        result = wrap_var(10)
        self.assertTrue(result.__UNSAFE__)

    def test_to_unsafe_bytes(self):
        result = to_unsafe_bytes(10)
        self.assertTrue(result.__UNSAFE__)

    def test_to_unsafe_text(self):
        result = to_unsafe_text
        self.assertTrue(result.__UNSAFE__)

if __name__ == '__main__':
    unittest.main()