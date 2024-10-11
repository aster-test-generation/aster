from ansible.template.native_helpers import StrictUndefined
import unittest
import ast
import types
from ansible.module_utils._text import to_text
from ansible.module_utils.common.collections import is_sequence, Mapping
from ansible.module_utils.common.text.converters import container_to_text
from ansible.module_utils.six import text_type, string_types
from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
from ansible.utils.native_jinja import NativeJinjaText
from ansible.template.native_helpers import _fail_on_undefined, ansible_native_concat


class TestNativeHelpers(unittest.TestCase):
    def test_fail_on_undefined(self):
        data = {"key": StrictUndefined()}
        result = _fail_on_undefined(data)
        self.assertEqual(result, {"key": "The undefined value"})

    def test_ansible_native_concat(self):
        nodes = [1, 2, 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(str(result), "123")

if __name__ == '__main__':
    unittest.main()