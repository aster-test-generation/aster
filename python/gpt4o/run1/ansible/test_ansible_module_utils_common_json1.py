import unittest
from ansible.module_utils.common.json import (
    _is_unsafe, _is_vault, _preprocess_unsafe_encode, AnsibleJSONEncoder
)
from ansible.module_utils._text import to_text
from ansible.module_utils.common._collections_compat import Mapping
from ansible.module_utils.common.collections import is_sequence
import datetime
import json

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_is_unsafe(self):
        class UnsafeObject:
            __UNSAFE__ = True
            __ENCRYPTED__ = False

        self.assertTrue(_is_unsafe(UnsafeObject()))

    def test_is_vault(self):
        class VaultObject:
            __ENCRYPTED__ = True

        self.assertTrue(_is_vault(VaultObject()))

    def test_preprocess_unsafe_encode(self):
        class UnsafeObject:
            __UNSAFE__ = True
            __ENCRYPTED__ = False

        value = UnsafeObject()
        result = _preprocess_unsafe_encode(value)
        self.assertEqual(result, {'__ansible_unsafe': to_text(value, errors='surrogate_or_strict', nonstring='strict')})

    def test_preprocess_unsafe_encode_sequence(self):
        class UnsafeObject:
            __UNSAFE__ = True
            __ENCRYPTED__ = False

        value = [UnsafeObject(), UnsafeObject()]
        result = _preprocess_unsafe_encode(value)
        self.assertEqual(result, [
            {'__ansible_unsafe': to_text(value[0], errors='surrogate_or_strict', nonstring='strict')},
            {'__ansible_unsafe': to_text(value[1], errors='surrogate_or_strict', nonstring='strict')}
        ])

    def test_preprocess_unsafe_encode_mapping(self):
        class UnsafeObject:
            __UNSAFE__ = True
            __ENCRYPTED__ = False

        value = {'key': UnsafeObject()}
        result = _preprocess_unsafe_encode(value)
        self.assertEqual(result, {'key': {'__ansible_unsafe': to_text(value['key'], errors='surrogate_or_strict', nonstring='strict')}})

    def test_encoder_default_encrypted(self):
        class EncryptedObject:
            __ENCRYPTED__ = True
            _ciphertext = b'encrypted_data'

        encoder = AnsibleJSONEncoder()
        result = encoder.default(EncryptedObject())
        self.assertEqual(result, {'__ansible_vault': to_text(EncryptedObject._ciphertext, errors='surrogate_or_strict', nonstring='strict')})

    def test_encoder_default_unsafe(self):
        class UnsafeObject:
            __UNSAFE__ = True
            __ENCRYPTED__ = False

        encoder = AnsibleJSONEncoder()
        result = encoder.default(UnsafeObject())
        self.assertEqual(result, {'__ansible_unsafe': to_text(UnsafeObject(), errors='surrogate_or_strict', nonstring='strict')})

    def test_encoder_default_mapping(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default({'key': 'value'})
        self.assertEqual(result, {'key': 'value'})

    def test_encoder_default_datetime(self):
        encoder = AnsibleJSONEncoder()
        date = datetime.datetime(2023, 1, 1, 12, 0, 0)
        result = encoder.default(date)
        self.assertEqual(result, date.isoformat())

    def test_encoder_default_other(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default(42)
        self.assertEqual(result, 42)

    def test_encoder_iterencode(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        value = {'key': 'value'}
        result = list(encoder.iterencode(value))
        self.assertEqual(result, json.JSONEncoder().iterencode(value))

if __name__ == '__main__':
    unittest.main()