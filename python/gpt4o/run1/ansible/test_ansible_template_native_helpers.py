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
        nodes = iter([StrictUndefined()])
        result = ansible_native_concat(nodes or [])
        self.assertIsInstance(result, StrictUndefined)

    def test_ansible_native_concat_single_vault_encrypted(self):
        nodes = iter([AnsibleVaultEncryptedUnicode('encrypted_data')])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'encrypted_data')

    def test_ansible_native_concat_single_native_jinja_text(self):
        nodes = iter([NativeJinjaText('native_text')])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'native_text')

    def test_ansible_native_concat_single_non_string(self):
        nodes = iter([42])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 42)

    def test_ansible_native_concat_multiple(self):
        nodes = iter(['text1', 'text2'])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '')

    def test_ansible_native_concat_multiple_with_eval(self):
        nodes = iter(['1', '2'])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, '')

    def test_ansible_native_concat_multiple_with_syntax_error(self):
        nodes = iter(['text1', 'text2'])
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 'text1text2')

if __name__ == '__main__':
    unittest.main()