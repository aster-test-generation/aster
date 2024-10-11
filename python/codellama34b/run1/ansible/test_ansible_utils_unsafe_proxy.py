import unittest
from ansible.utils.unsafe_proxy import *


class TestAnsibleUnsafe(unittest.TestCase):
    def test_AnsibleUnsafe(self):
        instance = AnsibleUnsafe()
        self.assertTrue(instance.__UNSAFE__)

class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_AnsibleUnsafeBytes(self):
        from ansible.module_utils.basic import AnsibleUnsafeBytes
        self.assertTrue(instance.__UNSAFE__)

    def test_decode(self):
        from ansible.module_utils.basic import AnsibleUnsafeBytes
        result = instance.decode()
        self.assertTrue(result.__UNSAFE__)

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_AnsibleUnsafeText(self):
        from ansible.plugins.filter.core import AnsibleUnsafeText
        self.assertTrue(instance.__UNSAFE__)

    def test_encode(self):
        from ansible.parsing.yaml.objects import AnsibleUnsafeText
        result = instance.encode()
        self.assertTrue(result.__UNSAFE__)

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_NativeJinjaUnsafeText(self):
        instance = NativeJinjaUnsafeText()
        self.assertTrue(instance.__UNSAFE__)

class TestUnsafeProxy(unittest.TestCase):
    def test_UnsafeProxy(self):
        instance = UnsafeProxy
        self.assertTrue(instance.__UNSAFE__)

    def test__wrap_dict(self):
        instance = Unsafe()
        result = instance._wrap_dict()
        self.assertTrue(result.__UNSAFE__)

    def test__wrap_sequence(self):
        instance = UnsafeProxy
        result = instance._wrap_sequence()
        self.assertTrue(result.__UNSAFE__)

    def test__wrap_set(self):
        instance = UnsafeProxy
        result = instance._wrap_set()
        self.assertTrue(result.__UNSAFE__)

    def test_wrap_var(self):
        instance = UnsafeProxy
        result = instance.wrap_var()
        self.assertTrue(result.__UNSAFE__)

    def test_to_unsafe_bytes(self):
        instance = UnsafeProxy
        result = instance.to_unsafe_bytes()
        self.assertTrue(result.__UNSAFE__)

    def test_to_unsafe_text(self):
        instance = UnsafeProxy
        result = instance.to_unsafe_text()
        self.assertTrue(result.__UNSAFE__)

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