import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var

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
    def test_wrap_var(self):
        unsafe_obj = wrap_var('obj')
        self.assertTrue(isinstance(unsafe_obj, AnsibleUnsafeText))
        self.assertEqual(unsafe_obj.encode(), b'obj')

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        unsafe_bytes = to_unsafe_bytes('bytes')
        self.assertTrue(isinstance(unsafe_bytes, AnsibleUnsafeBytes))
        self.assertEqual(unsafe_bytes.decode(), 'bytes')

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        unsafe_text = to_unsafe_text('text')
        self.assertTrue(isinstance(unsafe_text, AnsibleUnsafeText))
        self.assertEqual(unsafe_text.encode(), b'text')

if __name__ == '__main__':
    unittest.main()