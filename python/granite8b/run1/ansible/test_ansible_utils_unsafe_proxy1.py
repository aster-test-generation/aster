import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text

class TestUnsafeProxy(unittest.TestCase):
    def test_unsafe_proxy(self):
        obj = AnsibleUnsafeBytes(b"test")
        self.assertIsInstance(UnsafeProxy(obj), AnsibleUnsafeBytes)

    def test_wrap_var(self):
        obj = AnsibleUnsafeBytes(b"test")
        self.assertIsInstance(wrap_var(obj), AnsibleUnsafeBytes)

    def test_to_unsafe_bytes(self):
        obj = b"test"
        self.assertIsInstance(to_unsafe_bytes(obj), AnsibleUnsafeBytes)

    def test_to_unsafe_text(self):
        obj = "test"
        self.assertIsInstance(to_unsafe_text(obj), AnsibleUnsafeText)

class TestAnsibleUnsafeBytes(unittest.TestCase):
    def test_decode(self):
        obj = AnsibleUnsafeBytes(b"test")
        self.assertIsInstance(obj.decode(), AnsibleUnsafeText)

class TestAnsibleUnsafeText(unittest.TestCase):
    def test_encode(self):
        obj = AnsibleUnsafeText("test")
        self.assertIsInstance(obj.encode(), AnsibleUnsafeBytes)

class TestNativeJinjaUnsafeText(unittest.TestCase):
    def test_native_jinja_text(self):
        obj = NativeJinjaUnsafeText("test")
        self.assertIsInstance(obj, NativeJinjaText)

if __name__ == '__main__':
    unittest.main()