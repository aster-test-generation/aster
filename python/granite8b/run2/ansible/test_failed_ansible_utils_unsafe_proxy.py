from ansible.utils.unsafe_proxy import NativeJinjaText
import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text

class TestUnsafeProxy(unittest.TestCase):
    def test_wrap_var(self):
        self.assertIsInstance(wrap_var(1), int)
        self.assertIsInstance(wrap_var(b'1'), AnsibleUnsafeBytes)
        self.assertIsInstance(wrap_var('1'), AnsibleUnsafeText)
        self.assertIsInstance(wrap_var(NativeJinjaText('1')), NativeJinjaUnsafeText)
        self.assertIsInstance(wrap_var({'1': 1}), dict)
        self.assertIsInstance(wrap_var([1]), list)
        self.assertIsInstance(wrap_var(set([1])), set)

    def test_to_unsafe_bytes(self):
        self.assertIsInstance(to_unsafe_bytes('1'), AnsibleUnsafeBytes)

    def test_to_unsafe_text(self):
        self.assertIsInstance(to_unsafe_text('1'), AnsibleUnsafeText)

if __name__ == '__main__':
    unittest.main()