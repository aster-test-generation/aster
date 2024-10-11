import unittest
from ansible.module_utils import _text, common, six
from ansible.module_utils._collections import Mapping, Se
from ansible.module_utils.six import string_types, binary_type, text_type
from ansible.utils import native_jinja, unsafe_proxy
from ansible.module_utils.common import collections


class TestAnsibleUnsafe(unittest.TestCase):
    def test_AnsibleUnsafeBytes(self):
        instance = unsafe_proxy.AnsibleUnsafeBytes(b'Hello')
        self.assertIsInstance(instance, binary_type)

    def test_AnsibleUnsafeText(self):
        instance = unsafe_proxy.AnsibleUnsafeText('Hello')
        self.assertIsInstance(instance, text_type)

    def test_NativeJinjaUnsafeText(self):
        instance = native_jinja.NativeJinjaUnsafeText('Hello')
        self.assertIsInstance(instance, text_type)

    def test_UnsafeProxy(self):
        instance = unsafe_proxy.UnsafeProxy('Hello', 'type')
        self.assertIsInstance(instance, text_type)

    def test_wrap_var(self):
        instance = unsafe_proxy.wrap_var('Hello')
        self.assertIsInstance(instance, text_type)

    def test_wrap_var_dict(self):
        instance = unsafe_proxy.wrap_var({'key': 'value'})
        self.assertIsInstance(instance, Mapping)

    def test_wrap_var_sequence(self):
        instance = unsafe_proxy.wrap_var(['a', 'b', 'c'])
        self.assertIsInstance(instance, list)

    def test_wrap_var_set(self):
        instance = unsafe_proxy.wrap_var({'a', 'b', 'c'})
        self.assertIsInstance(instance, Set)

    def test_to_unsafe_bytes(self):
        instance = _text.to_bytes('Hello')
        self.assertIsInstance(instance, binary_type)

    def test_to_unsafe_text(self):
        instance = _text.to_text('Hello')
        self.assertIsInstance(instance, text_type)

if __name__ == '__main__':
    unittest.main()