import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text


class TestAnsibleUnsafe(unittest.TestCase):
    def test_ansible_unsafe(self):
        unsafe_obj = AnsibleUnsafe()
        self.assertTrue(unsafe_obj.__UNSAFE__)

class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_ansible_unsafe_bytes(self):
        unsafe_bytes = AnsibleUnsafeBytes(b'bytes')
        self.assertEqual(unsafe_bytes.decode(), 'bytes')

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_ansible_unsafe_text(self):
        unsafe_text = AnsibleUnsafeText('text')
        self.assertEqual(unsafe_text.encode(), b'text')

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_native_jinja_unsafe_text(self):
        unsafe_text = NativeJinjaUnsafeText('text')
        self.assertEqual(str(unsafe_text), 'text')

class TestUnsafeProxy(unittest.TestCase):
    def test_unsafe_proxy(self):
        unsafe_obj = UnsafeProxy('unsafe')
        self.assertEqual(unsafe_obj, 'unsafe')

class TestWrapVar(unittest.TestCase):
    def test_wrap_var_dict(self):
        wrapped_dict = wrap_var({'key': 'value'})
        self.assertEqual(wrapped_dict, {'key': 'value'})

    def test_wrap_var_set(self):
        wrapped_set = wrap_var({'item1', 'item2'})
        self.assertEqual(wrapped_set, {'item1', 'item2'})

    def test_wrap_var_sequence(self):
        wrapped_sequence = wrap_var(['item1', 'item2'])
        self.assertEqual(wrapped_sequence, ['item1', 'item2'])

    def test_wrap_var_native_jinja_text(self):
        from jinja2 import Template
        wrapped_text = wrap_var(native_jinja_text)
        self.assertEqual(str(wrapped_text), 'text')

    def test_wrap_var_binary(self):
        binary_data = b'binary'
        wrapped_binary = wrap_var(binary_data)
        self.assertEqual(wrapped_binary, binary_data)

    def test_wrap_var_text(self):
        text_data = 'text'
        wrapped_text = wrap_var(text_data)
        self.assertEqual(wrapped_text, text_data)

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        unsafe_bytes = to_unsafe_bytes('bytes')
        self.assertEqual(unsafe_bytes, b'bytes')

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        unsafe_text = to_unsafe_text(b'text')
        self.assertEqual(unsafe_text, 'text')

if __name__ == '__main__':
    unittest.main()