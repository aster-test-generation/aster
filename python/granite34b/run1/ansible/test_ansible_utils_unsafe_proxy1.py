import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text

class TestAnsibleUnsafe(unittest.TestCase):
    def test_ansible_unsafe(self):
        self.assertTrue(AnsibleUnsafe.__UNSAFE__)

class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_ansible_unsafe_bytes(self):
        obj = b'bytes'
        self.assertIsInstance(obj, AnsibleUnsafeBytes)
        self.assertEqual(obj.decode(), 'bytes')

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_ansible_unsafe_text(self):
        obj = 'text'
        self.assertIsInstance(obj, AnsibleUnsafeText)
        self.assertEqual(obj.encode(), b'text')

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_native_jinja_unsafe_text(self):
        obj = NativeJinjaUnsafeText('text')
        self.assertIsInstance(obj, NativeJinjaUnsafeText)
        self.assertEqual(str(obj), 'text')

class TestUnsafeProxy(unittest.TestCase):
    def test_unsafe_proxy(self):
        obj = UnsafeProxy('unsafe')
        self.assertEqual(obj, 'unsafe')

class TestWrapVar(unittest.TestCase):
    def test_wrap_var(self):
        obj = wrap_var('var')
        self.assertEqual(obj, 'var')

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        obj = to_unsafe_bytes('bytes')
        self.assertIsInstance(obj, AnsibleUnsafeBytes)
        self.assertEqual(obj.decode(), 'bytes')

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        obj = to_unsafe_text('text')
        self.assertIsInstance(obj, AnsibleUnsafeText)
        self.assertEqual(obj.encode(), b'text')

if __name__ == '__main__':
    unittest.main()