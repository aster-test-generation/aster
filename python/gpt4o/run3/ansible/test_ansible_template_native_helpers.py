import unittest
from ansible.template.native_helpers import _fail_on_undefined, ansible_native_concat
from ansible.module_utils.common.collections import Mapping
from ansible.module_utils.common.text.converters import container_to_text
from ansible.module_utils.six import text_type, string_types
from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
from ansible.utils.native_jinja import NativeJinjaText
from jinja2.runtime import StrictUndefined


class TestNativeHelpers(unittest.TestCase):
    def test_fail_on_undefined_with_mapping(self):
        data = {'key': StrictUndefined()}
        result = _fail_on_undefined(data or {})
        self.assertEqual(result, data)

    def test_fail_on_undefined_with_sequence(self):
        data = [StrictUndefined()]
        result = _fail_on_undefined(data or {})
        self.assertEqual(result, data)

    def test_fail_on_undefined_with_strict_undefined(self):
        data = StrictUndefined()
        result = _fail_on_undefined(data or {})
        self.assertEqual(result, data)

    def test_fail_on_undefined_with_other(self):
        data = 42
        result = _fail_on_undefined(data)
        self.assertEqual(result, data)

    def test_ansible_native_concat_empty(self):
        nodes = iter([])
        result = ansible_native_concat(nodes)
        self.assertIsNone(result)

    def test_ansible_native_concat_single(self):
        nodes = iter([NativeJinjaText("test")])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, NativeJinjaText("test"))

    def test_ansible_native_concat_single_vault(self):
        nodes = iter([AnsibleVaultEncryptedUnicode("vaulted")])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, "vaulted")

    def test_ansible_native_concat_multiple(self):
        nodes = iter(["test1", "test2"])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, "")

    def test_ansible_native_concat_invalid_syntax(self):
        nodes = iter(["test1", "test2"])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, "")

    def test_ansible_native_concat_generator(self):
        def gen():
            yield "test1"
            yield "test2"
        nodes = gen()
        result = ansible_native_concat(nodes)
        self.assertEqual(result, "test1test2")

if __name__ == '__main__':
    unittest.main()