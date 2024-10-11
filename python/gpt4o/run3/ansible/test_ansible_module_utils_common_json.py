import unittest
from ansible.module_utils.common.json import *
from ansible.module_utils._text import to_text
from ansible.module_utils.common._collections_compat import Mapping
from ansible.module_utils.common.collections import is_sequence
import datetime
from ansible.module_utils.common.json import AnsibleJSONEncoder, _is_unsafe, _is_vault, _preprocess_unsafe_encode


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_init(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True, vault_to_text=True)
        self.assertTrue(encoder._preprocess_unsafe)
        self.assertTrue(encoder._vault_to_text)

    def test_default_encrypted(self):
        class Encrypted:
            __ENCRYPTED__ = True
            _ciphertext = b'secret'

        encoder = AnsibleJSONEncoder(vault_to_text=False)
        result = encoder.default(Encrypted())
        self.assertEqual(result, {'__ansible_vault': to_text(b'secret', errors='surrogate_or_strict', nonstring='strict')})

    def test_default_unsafe(self):
        class Unsafe:
            __UNSAFE__ = True

        encoder = AnsibleJSONEncoder()
        result = encoder.default(Unsafe())
        self.assertEqual(result, {'__ansible_unsafe': to_text(Unsafe(), errors='surrogate_or_strict', nonstring='strict')})

    def test_default_mapping(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default({'key': 'value'})
        self.assertEqual(result, {'key': 'value'})

    def test_default_date(self):
        encoder = AnsibleJSONEncoder()
        date = datetime.date(2023, 1, 1)
        result = encoder.default(date)
        self.assertEqual(result, '2023-01-01')

    def test_default_datetime(self):
        encoder = AnsibleJSONEncoder()
        dt = datetime.datetime(2023, 1, 1, 12, 0, 0)
        result = encoder.default(dt)
        self.assertEqual(result, '2023-01-01T12:00:00')

    def test_default_other(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default(42)
        self.assertEqual(result, 42)

    def test_iterencode(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = list(encoder.iterencode({'key': 'value'}))
        self.assertTrue(any('"key": "value"' in s for s in result))

class TestUtilityFunctions(unittest.TestCase):
    def test_is_unsafe(self):
        class Unsafe:
            __UNSAFE__ = True
            __ENCRYPTED__ = False

        result = _is_unsafe(Unsafe())
        self.assertTrue(result)

    def test_is_vault(self):
        class Vault:
            __ENCRYPTED__ = True

        result = _is_vault(Vault())
        self.assertTrue(result)

    def test_preprocess_unsafe_encode(self):
        class Unsafe:
            __UNSAFE__ = True
            __ENCRYPTED__ = False

        result = _preprocess_unsafe_encode(Unsafe())
        self.assertEqual(result, {'__ansible_unsafe': to_text(Unsafe(), errors='surrogate_or_strict', nonstring='strict')})

    def test_preprocess_unsafe_encode_sequence(self):
        result = _preprocess_unsafe_encode([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_preprocess_unsafe_encode_mapping(self):
        result = _preprocess_unsafe_encode({'key': 'value'})
        self.assertEqual(result, {'key': 'value'})

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