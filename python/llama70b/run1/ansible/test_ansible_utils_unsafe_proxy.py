import unittest
from ansible.utils.unsafe_proxy import *
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, _wrap_dict, _wrap_sequence, _wrap_set, to_unsafe_bytes, to_unsafe_text


class TestAnsibleUnsafe(unittest.TestCase):
    def test_init(self):
        instance = AnsibleUnsafe()
        self.assertTrue(instance.__UNSAFE__)

class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_init(self):
        from ansible.parsing.dataloader import AnsibleUnsafeBytes
        self.assertIsInstance(instance, binary_type)
        self.assertIsInstance(instance, AnsibleUnsafe)

    def test_decode(self):
        from ansible.parsing.dataloader import AnsibleUnsafeBytes
        result = instance.decode()
        self.assertIsInstance(result, AnsibleUnsafeText)

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_init(self):
        from ansible.parsing.vault import AnsibleUnsafeText
        self.assertIsInstance(instance, text_type)
        self.assertIsInstance(instance, AnsibleUnsafe)

    def test_encode(self):
        from ansible.parsing.vault import AnsibleUnsafeText
        result = instance.encode()
        self.assertIsInstance(result, AnsibleUnsafeBytes)

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_init(self):
        from jinja2 import NativeJinjaUnsafeText
        self.assertIsInstance(instance, NativeJinjaText)
        self.assertIsInstance(instance, AnsibleUnsafeText)

class TestUnsafeProxy(unittest.TestCase):
    def test_new(self):
        from sqlalchemy.proxy import UnsafeProxy
        self.assertIsInstance(instance, AnsibleUnsafeText)

    def test_new_deprecated(self):
        with self.assertWarns(DeprecationWarning):
            from urllib.request import ProxyHandler, build_opener, install_opener, AbstractBasicAuthHandler

class TestWrapVar(unittest.TestCase):
    def test_wrap_var_none(self):
        result = wrap_var(None)
        self.assertIsNone(result)

    def test_wrap_var_ansible_unsafe(self):
        from ansible.parsing.vault import AnsibleUnsafeText
        result = wrap_var(instance)
        self.assertIs(result, instance)

    def test_wrap_var_mapping(self):
        v = {'a': 'b'}
        result = wrap_var(v)
        self.assertIsInstance(result, dict)
        from ansible.parsing.vault import AnsibleUnsafeText
        self.assertIsInstance(list(result.values())[0], AnsibleUnsafeText)

    def test_wrap_var_sequence(self):
        v = ['a', 'b']
        result = wrap_var(v)
        self.assertIsInstance(result, list)
        from ansible.parsing.vault import AnsibleUnsafeText

    def test_wrap_var_set(self):
        v = {'a', 'b'}
        result = wrap_var(v)
        self.assertIsInstance(result, set)
        from ansible.parsing.vault import AnsibleUnsafeText

    def test_wrap_var_native_jinja_text(self):
        from jinja2.nodes import NativeJinjaText
        result = wrap_var(v)
        self.assertIsInstance(result, NativeJinjaUnsafeText)

    def test_wrap_var_binary_type(self):
        v = b'test'
        result = wrap_var(v)
        from ansible.parsing.dataloader import AnsibleUnsafeBytes

    def test_wrap_var_text_type(self):
        v = 'test'
        result = wrap_var(v)
        from ansible.parsing.vault import AnsibleUnsafeText

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        from cryptography.hazmat.primitives import serialization
        self.assertIsInstance(result, AnsibleUnsafeBytes)

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        from markupsafe import Markup
        self.assertIsInstance(result, AnsibleUnsafeText)

class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_decode(self):
        instance = AnsibleUnsafeBytes(b'test')
        result = instance.decode('utf-8')
        self.assertIsInstance(result, AnsibleUnsafeText)

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_encode(self):
        instance = AnsibleUnsafeText('test')
        result = instance.encode('utf-8')
        self.assertIsInstance(result, AnsibleUnsafeBytes)

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_init(self):
        instance = NativeJinjaUnsafeText('test')
        self.assertIsInstance(instance, NativeJinjaText)
        self.assertIsInstance(instance, AnsibleUnsafeText)

class TestUnsafeProxy(unittest.TestCase):
    def test_new(self):
        instance = UnsafeProxy('test')
        self.assertIsInstance(instance, AnsibleUnsafeText)

    def test_new_deprecated(self):
        with self.assertWarns(DeprecationWarning):
            instance = UnsafeProxy('test')

class TestWrapVar(unittest.TestCase):
    def test_wrap_var_none(self):
        result = wrap_var(None)
        self.assertIsNone(result)

    def test_wrap_var_ansible_unsafe(self):
        instance = AnsibleUnsafe()
        result = wrap_var(instance)
        self.assertIs(result, instance)

    def test_wrap_var_mapping(self):
        v = {'a': 1, 'b': 2}
        result = wrap_var(v)
        self.assertIsInstance(result, dict)
        self.assertIsInstance(list(result.keys())[0], AnsibleUnsafeText)

    def test_wrap_var_sequence(self):
        v = [1, 2, 3]
        result = wrap_var(v)
        self.assertIsInstance(result, list)
        self.assertIsInstance(result[0], AnsibleUnsafeText)

    def test_wrap_var_set(self):
        v = {1, 2, 3}
        result = wrap_var(v)
        self.assertIsInstance(result, set)
        self.assertIsInstance(list(result)[0], AnsibleUnsafeText)

    def test_wrap_var_native_jinja_text(self):
        v = NativeJinjaText('test')
        result = wrap_var(v)
        self.assertIsInstance(result, NativeJinjaUnsafeText)

    def test_wrap_var_binary_type(self):
        v = b'test'
        result = wrap_var(v)
        self.assertIsInstance(result, AnsibleUnsafeBytes)

    def test_wrap_var_text_type(self):
        v = 'test'
        result = wrap_var(v)
        self.assertIsInstance(result, AnsibleUnsafeText)

class TestPrivateMethods(unittest.TestCase):
    def test__wrap_dict(self):
        v = {'a': 1, 'b': 2}
        result = _wrap_dict(v)
        self.assertIsInstance(result, dict)
        self.assertIsInstance(list(result.keys())[0], AnsibleUnsafeText)

    def test__wrap_sequence(self):
        v = [1, 2, 3]
        result = _wrap_sequence(v)
        self.assertIsInstance(result, list)
        self.assertIsInstance(result[0], AnsibleUnsafeText)

    def test__wrap_set(self):
        v = {1, 2, 3}
        result = _wrap_set(v)
        self.assertIsInstance(result, set)
        self.assertIsInstance(list(result)[0], AnsibleUnsafeText)

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        result = to_unsafe_bytes('test', 'utf-8')
        self.assertIsInstance(result, AnsibleUnsafeBytes)

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        result = to_unsafe_text('test', 'utf-8')
        self.assertIsInstance(result, AnsibleUnsafeText)

if __name__ == '__main__':
    unittest.main()