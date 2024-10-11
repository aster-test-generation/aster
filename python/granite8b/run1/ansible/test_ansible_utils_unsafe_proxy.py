from ansible.utils.unsafe_proxy import NativeJinjaText
import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafe, AnsibleUnsafeBytes, AnsibleUnsafeText, NativeJinjaUnsafeText, UnsafeProxy, wrap_var, to_unsafe_bytes, to_unsafe_text


class TestUnsafeProxy(unittest.TestCase):
    def test_wrap_var(self):
        self.assertIsInstance(wrap_var(1), int)
        self.assertIsInstance(wrap_var(b'1'), AnsibleUnsafeBytes)
        self.assertIsInstance(wrap_var('1'), AnsibleUnsafeText)
        self.assertIsInstance(wrap_var(NativeJinjaText('1')), NativeJinjaUnsafeText)
        self.assertIsInstance(wrap_var({1: 2}), dict)
        self.assertIsInstance(wrap_var({1: 2}), AnsibleUnsafe)
        self.assertIsInstance(wrap_var({1: 2}), dict)
        self.assertIsInstance(wrap_var({1: 2}), AnsibleUnsafe)
        self.assertIsInstance(wrap_var([1, 2]), list)
        self.assertIsInstance(wrap_var([1, 2]), AnsibleUnsafe)
        self.assertIsInstance(wrap_var({1, 2}), set)
        self.assertIsInstance(wrap_var({1, 2}), AnsibleUnsafe)

class TestToUnsafeBytes(unittest.TestCase):
    def test_to_unsafe_bytes(self):
        self.assertIsInstance(to_unsafe_bytes('1'), AnsibleUnsafeBytes)
        self.assertIsInstance(to_unsafe_bytes(b'1'), AnsibleUnsafeBytes)

class TestToUnsafeText(unittest.TestCase):
    def test_to_unsafe_text(self):
        self.assertIsInstance(to_unsafe_text('1'), AnsibleUnsafeText)
        self.assertIsInstance(to_unsafe_text(b'1'), AnsibleUnsafeText)

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