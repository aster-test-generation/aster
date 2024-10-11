import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var


class TestAnsibleUnsafe(unittest.TestCase):
    def test_ansible_unsafe(self):
        self.assertTrue(AnsibleUnsafe.__UNSAFE__)

class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_ansible_unsafe_bytes(self):
        obj = AnsibleUnsafeBytes()
        self.assertTrue(isinstance(obj, AnsibleUnsafe))
        self.assertTrue(isinstance(obj, bytes))
        self.assertEqual(obj.decode(), AnsibleUnsafeText())

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_ansible_unsafe_text(self):
        obj = AnsibleUnsafeText()
        self.assertTrue(isinstance(obj, AnsibleUnsafe))
        self.assertTrue(isinstance(obj, str))
        self.assertEqual(obj.encode(), AnsibleUnsafeBytes())

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_native_jinja_unsafe_text(self):
        obj = NativeJinjaUnsafeText()
        self.assertTrue(isinstance(obj, six.text_type))
        self.assertTrue(isinstance(obj, AnsibleUnsafeText))

class TestUnsafeProxy(unittest.TestCase):
    def test_unsafe_proxy(self):
        obj = UnsafeProxy(0)
        self.assertTrue(isinstance(obj, object))

class TestWrapVar(unittest.TestCase):
    def test_wrap_var(self):
        v = None
        self.assertEqual(wrap_var(v), v)
        v = AnsibleUnsafe()
        self.assertEqual(wrap_var(v), v)
        v = {}
        self.assertEqual(wrap_var(v), v)
        v = set()
        self.assertEqual(wrap_var(v), v)
        v = []
        self.assertEqual(wrap_var(v), v)
        v = NativeJinjaText('a')
        self.assertEqual(wrap_var(v), NativeJinjaUnsafeText())
        v = b''
        self.assertEqual(wrap_var(v), AnsibleUnsafeBytes())
        v = ''
        self.assertEqual(wrap_var(v), AnsibleUnsafeText())

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        self.assertEqual(to_unsafe_bytes("test"), AnsibleUnsafeBytes(b"test"))

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        self.assertEqual(to_unsafe_text("abc"), AnsibleUnsafeText("abc"))

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