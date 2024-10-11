import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder, _is_unsafe, _is_vault, _preprocess_unsafe_encode
from ansible.module_utils._text import to_text
from ansible.module_utils.common._collections_compat import Mapping
from ansible.module_utils.common.collections import is_sequence
import datetime

class TestIsUnsafe(unittest.TestCase):
    def test_is_unsafe_true(self):
        class UnsafeObject:
            __UNSAFE__ = True
            __ENCRYPTED__ = False
        obj = UnsafeObject()
        result = _is_unsafe(obj)
        self.assertTrue(result)

    def test_is_unsafe_false(self):
        class SafeObject:
            __UNSAFE__ = False
        obj = SafeObject()
        result = _is_unsafe(obj)
        self.assertFalse(result)

class TestIsVault(unittest.TestCase):
    def test_is_vault_true(self):
        class VaultObject:
            __ENCRYPTED__ = True
        obj = VaultObject()
        result = _is_vault(obj)
        self.assertTrue(result)

    def test_is_vault_false(self):
        class NonVaultObject:
            __ENCRYPTED__ = False
        obj = NonVaultObject()
        result = _is_vault(obj)
        self.assertFalse(result)

class TestPreprocessUnsafeEncode(unittest.TestCase):
    def test_preprocess_unsafe_encode_unsafe(self):
        class UnsafeObject:
            __UNSAFE__ = True
            __ENCRYPTED__ = False
        obj = UnsafeObject()
        result = _preprocess_unsafe_encode(obj)
        self.assertEqual(result, {'__ansible_unsafe': to_text(obj, errors='surrogate_or_strict', nonstring='strict')})

    def test_preprocess_unsafe_encode_sequence(self):
        obj = [1, 2, 3]
        result = _preprocess_unsafe_encode(obj)
        self.assertEqual(result, [1, 2, 3])

    def test_preprocess_unsafe_encode_mapping(self):
        obj = {'key': 'value'}
        result = _preprocess_unsafe_encode(obj)
        self.assertEqual(result, {'key': 'value'})

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default_encrypted(self):
        class EncryptedObject:
            __ENCRYPTED__ = True
            _ciphertext = 'ciphertext'
        obj = EncryptedObject()
        encoder = AnsibleJSONEncoder(vault_to_text=False)
        result = encoder.default(obj)
        self.assertEqual(result, {'__ansible_vault': to_text(obj._ciphertext, errors='surrogate_or_strict', nonstring='strict')})

    def test_default_unsafe(self):
        class UnsafeObject:
            __UNSAFE__ = True
        obj = UnsafeObject()
        encoder = AnsibleJSONEncoder()
        result = encoder.default(obj)
        self.assertEqual(result, {'__ansible_unsafe': to_text(obj, errors='surrogate_or_strict', nonstring='strict')})

    def test_default_mapping(self):
        obj = {'key': 'value'}
        encoder = AnsibleJSONEncoder()
        result = encoder.default(obj)
        self.assertEqual(result, {'key': 'value'})

    def test_default_datetime(self):
        obj = datetime.datetime(2023, 10, 1, 12, 0, 0)
        encoder = AnsibleJSONEncoder()
        result = encoder.default(obj)
        self.assertEqual(result, '2023-10-01T12:00:00')

    def test_default_other(self):
        obj = 123
        encoder = AnsibleJSONEncoder()
        result = encoder.default(obj)
        self.assertEqual(result, 123)

    def test_iterencode_preprocess_unsafe(self):
        obj = {'key': 'value'}
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = list(encoder.iterencode(obj))
        self.assertEqual(result, ['{"key": "value"}'])

if __name__ == '__main__':
    unittest.main()