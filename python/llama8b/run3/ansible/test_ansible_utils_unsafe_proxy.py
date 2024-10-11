import unittest
from ansible.module_utils._text import to_bytes
from ansible.module_utils.six import string_types, binary_type, text_type
from ansible.module_utils.common import is_sequence
from ansible.module_utils._collections_compat import Mapping, Set
from ansible.utils import native_jinja, display
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaText, NativeJinjaUnsafeText, UnsafeProxy


class TestAnsibleUnsafe(unittest.TestCase):
    def test_AnsibleUnsafe(self):
        instance = AnsibleUnsafe()
        self.assertTrue(instance.__UNSAFE__)

    def test_AnsibleUnsafeBytes(self):
        instance = AnsibleUnsafeBytes(b'hello')
        self.assertIsInstance(instance, binary_type)
        self.assertTrue(instance.__UNSAFE__)

    def test_AnsibleUnsafeText(self):
        instance = AnsibleUnsafeText('hello')
        self.assertIsInstance(instance, text_type)
        self.assertTrue(instance.__UNSAFE__)

    def test_NativeJinjaText(self):
        instance = NativeJinjaText('hello')
        self.assertIsInstance(instance, NativeJinjaText)
        self.assertFalse(instance.__UNSAFE__)

    def test_NativeJinjaUnsafeText(self):
        instance = NativeJinjaUnsafeText('hello')
        self.assertIsInstance(instance, NativeJinjaText)
        self.assertTrue(instance.__UNSAFE__)

class TestUnsafeProxy(unittest.TestCase):
    def test_UnsafeProxy(self):
        obj = 'hello'
        instance = UnsafeProxy(obj)
        self.assertEqual(instance, obj)

    def test_UnsafeProxy_AnsibleUnsafe(self):
        obj = AnsibleUnsafe()
        instance = UnsafeProxy(obj)
        self.assertEqual(instance, obj)

    def test_UnsafeProxy_string(self):
        obj = 'hello'
        instance = UnsafeProxy(obj)
        self.assertEqual(instance, obj)

    def test_UnsafeProxy_binary_type(self):
        obj = b'hello'
        instance = UnsafeProxy(obj)
        self.assertEqual(instance, obj)

    def test_UnsafeProxy_text_type(self):
        obj = 'hello'
        instance = UnsafeProxy(obj)
        self.assertEqual(instance, obj)

class TestWrapVar(unittest.TestCase):
    def test_wrap_var_AnsibleUnsafe(self):
        obj = AnsibleUnsafe()
        result = wrap_var(obj)
        self.assertEqual(result, obj)

    def test_wrap_var_None(self):
        obj = None
        result = wrap_var(obj)
        self.assertEqual(result, obj)

    def test_wrap_var_Mapping(self):
        obj = {'a': 1, 'b': 2}
        result = wrap_var(obj)
        self.assertIsInstance(result, Mapping)

    def test_wrap_var_Set(self):
        obj = {1, 2, 3}
        result = wrap_var(obj)
        self.assertIsInstance(result, Set)

    def test_wrap_var_sequence(self):
        obj = [1, 2, 3]
        result = wrap_var(obj)
        self.assertIsInstance(result, list)

    def test_wrap_var_NativeJinjaText(self):
        obj = NativeJinjaText('hello')
        result = wrap_var(obj)
        self.assertIsInstance(result, NativeJinjaText)

    def test_wrap_var_binary_type(self):
        obj = b'hello'
        result = wrap_var(obj)
        self.assertIsInstance(result, AnsibleUnsafeBytes)

    def test_wrap_var_text_type(self):
        obj = 'hello'
        result = wrap_var(obj)
        self.assertIsInstance(result, AnsibleUnsafeText)

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        result = to_unsafe_bytes(b'hello')
        self.assertIsInstance(result, AnsibleUnsafeBytes)

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        result = to_unsafe_text('hello')
        self.assertIsInstance(result, AnsibleUnsafeText)

if __name__ == '__main__':
    unittest.main()