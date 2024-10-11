import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, NativeJinjaText, UnsafeProxy, _wrap_dict, _wrap_sequence, _wrap_set, wrap_var, to_unsafe_bytes, to_unsafe_text


class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_decode(self):
        instance = AnsibleUnsafeBytes(b'test')
        result = instance.decode()
        self.assertIsInstance(result, AnsibleUnsafeText)
        self.assertEqual(result, 'test')

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_encode(self):
        instance = AnsibleUnsafeText('test')
        result = instance.encode()
        self.assertIsInstance(result, AnsibleUnsafeBytes)
        self.assertEqual(result, b'test')

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_inheritance(self):
        instance = NativeJinjaUnsafeText('test')
        self.assertIsInstance(instance, NativeJinjaText)
        self.assertIsInstance(instance, AnsibleUnsafeText)

class TestUnsafeProxy(unittest.TestCase):
    def test_new_with_ansible_unsafe(self):
        obj = AnsibleUnsafeText('test')
        result = UnsafeProxy(obj)
        self.assertIs(result, obj)

    def test_new_with_string(self):
        obj = 'test'
        result = UnsafeProxy(obj)
        self.assertIsInstance(result, AnsibleUnsafeText)
        self.assertEqual(result, 'test')

    def test_new_with_other(self):
        obj = 123
        result = UnsafeProxy(obj)
        self.assertEqual(result, 123)

class TestWrapFunctions(unittest.TestCase):
    def test_wrap_dict(self):
        v = {'key': 'value'}
        result = _wrap_dict(v)
        self.assertIsInstance(result, dict)
        self.assertIsInstance(result['key'], AnsibleUnsafeText)

    def test_wrap_sequence(self):
        v = ['value1', 'value2']
        result = _wrap_sequence(v)
        self.assertIsInstance(result, list)
        self.assertIsInstance(result[0], AnsibleUnsafeText)

    def test_wrap_set(self):
        v = {'value1', 'value2'}
        result = _wrap_set(v)
        self.assertIsInstance(result, set)
        for item in result:
            self.assertIsInstance(item, AnsibleUnsafeText)

    def test_wrap_var_with_none(self):
        result = wrap_var(None)
        self.assertIsNone(result)

    def test_wrap_var_with_ansible_unsafe(self):
        obj = AnsibleUnsafeText('test')
        result = wrap_var(obj)
        self.assertIs(result, obj)

    def test_wrap_var_with_mapping(self):
        v = {'key': 'value'}
        result = wrap_var(v)
        self.assertIsInstance(result, dict)
        self.assertIsInstance(result['key'], AnsibleUnsafeText)

    def test_wrap_var_with_set(self):
        v = {'value1', 'value2'}
        result = wrap_var(v)
        self.assertIsInstance(result, set)
        for item in result:
            self.assertIsInstance(item, AnsibleUnsafeText)

    def test_wrap_var_with_sequence(self):
        v = ['value1', 'value2']
        result = wrap_var(v)
        self.assertIsInstance(result, list)
        self.assertIsInstance(result[0], AnsibleUnsafeText)

    def test_wrap_var_with_native_jinja_text(self):
        v = NativeJinjaText('test')
        result = wrap_var(v)
        self.assertIsInstance(result, NativeJinjaUnsafeText)

    def test_wrap_var_with_binary_type(self):
        v = b'test'
        result = wrap_var(v)
        self.assertIsInstance(result, AnsibleUnsafeBytes)

    def test_wrap_var_with_text_type(self):
        v = 'test'
        result = wrap_var(v)
        self.assertIsInstance(result, AnsibleUnsafeText)

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        result = to_unsafe_bytes('test')
        self.assertIsInstance(result, AnsibleUnsafeBytes)
        self.assertEqual(result, b'test')

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        result = to_unsafe_text(b'test')
        self.assertIsInstance(result, AnsibleUnsafeText)
        self.assertEqual(result, 'test')

if __name__ == '__main__':
    unittest.main()