import unittest
from ansible.utils.unsafe_proxy import *


class TestAnsibleUnsafe(unittest.TestCase):
    def test_AnsibleUnsafe(self):
        instance = AnsibleUnsafe()
        self.assertTrue(instance.__UNSAFE__)

class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_AnsibleUnsafeBytes(self):
        instance = AnsibleUnsafe()
        self.assertTrue(instance.__UNSAFE__)

    def test_decode(self):
        from ansible.module_utils.basic import AnsibleUnsafeBytes
        result = instance.decode()
        self.assertTrue(result.__UNSAFE__)

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_AnsibleUnsafeText(self):
        from ansible.parsing.yaml.objects import AnsibleUnsafeText
        self.assertTrue(instance.__UNSAFE__)

    def test_encode(self):
        from ansible.parsing.yaml.objects import AnsibleUnsafeText
        result = instance.encode()
        self.assertTrue(result.__UNSAFE__)

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_NativeJinjaUnsafeText(self):
        instance = NativeJinjaUnsafeText
        self.assertTrue(instance.__UNSAFE__)

class TestUnsafeProxy(unittest.TestCase):
    def test_UnsafeProxy(self):
        instance = Unsafe()
        self.assertTrue(instance.__UNSAFE__)

    def test_wrap_dict(self):
        instance = UnsafeProxy(10)
        result = instance._wrap_dict()
        self.assertTrue(result.__UNSAFE__)

    def test_wrap_sequence(self):
        instance = UnsafeProxy
        result = instance._wrap_sequence()
        self.assertTrue(result.__UNSAFE__)

    def test_wrap_set(self):
        instance = UnsafeProxy(10)
        result = instance._wrap_set()
        self.assertTrue(result.__UNSAFE__)

    def test_wrap_var(self):
        instance = Unsafe()
        result = instance.wrap_var()
        self.assertTrue(result.__UNSAFE__)

    def test_to_unsafe_bytes(self):
        instance = Unsafe()
        result = instance.to_unsafe_bytes()
        self.assertTrue(result.__UNSAFE__)

    def test_to_unsafe_text(self):
        instance = Unsafe()
        result = instance.to_unsafe_text()
        self.assertTrue(result.__UNSAFE__)

if __name__ == '__main__':
    unittest.main()