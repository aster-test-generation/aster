import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text

class TestAnsibleUnsafe(unittest.TestCase):
    def test_ansible_unsafe(self):
        unsafe_obj = AnsibleUnsafe()
        self.assertTrue(unsafe_obj.__UNSAFE__)

class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_ansible_unsafe_bytes(self):
        unsafe_bytes = AnsibleUnsafeBytes(b'bytes')
        self.assertTrue(isinstance(unsafe_bytes, AnsibleUnsafe))
        self.assertTrue(isinstance(unsafe_bytes, binary_type))
        self.assertEqual(unsafe_bytes.decode(), 'bytes')

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_ansible_unsafe_text(self):
        unsafe_text = AnsibleUnsafeText('text')
        self.assertTrue(isinstance(unsafe_text, AnsibleUnsafe))
        self.assertTrue(isinstance(unsafe_text, text_type))
        self.assertEqual(unsafe_text.encode(), b'text')

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_native_jinja_unsafe_text(self):
        unsafe_text = NativeJinjaUnsafeText('text')
        self.assertTrue(isinstance(unsafe_text, NativeJinjaText))
        self.assertTrue(isinstance(unsafe_text, AnsibleUnsafeText))
        self.assertEqual(unsafe_text.encode(), b'text')

class TestUnsafeProxy(unittest.TestCase):
    def test_unsafe_proxy(self):
        unsafe_obj = UnsafeProxy('obj')
        self.assertTrue(isinstance(unsafe_obj, AnsibleUnsafeText))
        self.assertEqual(unsafe_obj.encode(), b'obj')

class TestWrapVar(unittest.TestCase):
    def test_wrap_var_dict(self):
        unsafe_dict = wrap_var({'key': 'value'})
        self.assertTrue(isinstance(unsafe_dict, dict))
        self.assertTrue(isinstance(unsafe_dict['key'], AnsibleUnsafeText))
        self.assertEqual(unsafe_dict['key'].encode(), b'value')

    def test_wrap_var_set(self):
        unsafe_set = wrap_var({'value1', 'value2'})
        self.assertTrue(isinstance(unsafe_set, set))
        self.assertTrue(isinstance(list(unsafe_set)[0], AnsibleUnsafeText))
        self.assertEqual(list(unsafe_set)[0].encode(), b'value1')

    def test_wrap_var_sequence(self):
        unsafe_list = wrap_var(['value1', 'value2'])
        self.assertTrue(isinstance(unsafe_list, list))
        self.assertTrue(isinstance(unsafe_list[0], AnsibleUnsafeText))
        self.assertEqual(unsafe_list[0].encode(), b'value1')

    def test_wrap_var_native_jinja_text(self):
        unsafe_text = wrap_var(NativeJinjaText('text'))
        self.assertTrue(isinstance(unsafe_text, NativeJinjaUnsafeText))
        self.assertEqual(unsafe_text.encode(), b'text')

    def test_wrap_var_binary(self):
        unsafe_bytes = wrap_var(b'bytes')
        self.assertTrue(isinstance(unsafe_bytes, AnsibleUnsafeBytes))
        self.assertEqual(unsafe_bytes.decode(), 'bytes')

    def test_wrap_var_text(self):
        unsafe_text = wrap_var('text')
        self.assertTrue(isinstance(unsafe_text, AnsibleUnsafeText))
        self.assertEqual(unsafe_text.encode(), b'text')

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        unsafe_bytes = to_unsafe_bytes('bytes')
        self.assertTrue(isinstance(unsafe_bytes, AnsibleUnsafeBytes))
        self.assertEqual(unsafe_bytes.decode(), 'bytes')

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        unsafe_text = to_unsafe_text(b'text')
        self.assertTrue(isinstance(unsafe_text, AnsibleUnsafeText))
        self.assertEqual(unsafe_text.encode(), b'text')

if __name__ == '__main__':
    unittest.main()