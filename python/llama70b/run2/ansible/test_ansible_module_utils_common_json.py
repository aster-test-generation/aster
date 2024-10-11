import json
import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder, _is_unsafe, _is_vault, _preprocess_unsafe_encode


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_init(self):
        encoder = AnsibleJSONEncoder()
        self.assertIsInstance(encoder, json.JSONEncoder)

    def test_default(self):
        encoder = AnsibleJSONEncoder()
        obj = object()
        result = encoder.default(obj)
        self.assertEqual(result, obj)

    def test_default_vault(self):
        encoder = AnsibleJSONEncoder(vault_to_text=True)
        obj = object()
        obj.__ENCRYPTED__ = True
        obj._ciphertext = 'encrypted_text'
        result = encoder.default(obj)
        self.assertEqual(result, {'__ansible_vault': 'encrypted_text'})

    def test_default_unsafe(self):
        encoder = AnsibleJSONEncoder()
        obj = object()
        obj.__UNSAFE__ = True
        result = encoder.default(obj)
        self.assertEqual(result, {'__ansible_unsafe': str(obj)})

    def test_iterencode(self):
        encoder = AnsibleJSONEncoder()
        obj = {'key': 'value'}
        result = encoder.iterencode(obj)
        self.assertEqual(next(result), '{"key": "value"}')

    def test_iterencode_preprocess_unsafe(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        obj = {'key': object()}
        obj['key'].__UNSAFE__ = True
        result = encoder.iterencode(obj)
        self.assertEqual(next(result), '{"key": {"__ansible_unsafe": "' + str(obj['key']) + '"}}')

    def test_str_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.__str__()
        self.assertEqual(result, 'AnsibleJSONEncoder()')

    def test_repr_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.__repr__()
        self.assertEqual(result, 'AnsibleJSONEncoder()')

class TestPrivateMethods(unittest.TestCase):
    def test_is_unsafe(self):
        obj = object()
        obj.__UNSAFE__ = True
        result = _is_unsafe(obj)
        self.assertTrue(result)

    def test_is_vault(self):
        obj = object()
        obj.__ENCRYPTED__ = True
        result = _is_vault(obj)
        self.assertTrue(result)

    def test_preprocess_unsafe_encode(self):
        obj = {'key': object()}
        obj['key'].__UNSAFE__ = True
        result = _preprocess_unsafe_encode(obj)
        self.assertEqual(result, {'key': {'__ansible_unsafe': str(obj['key'])}})

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_init(self):
        encoder = AnsibleJSONEncoder()
        self.assertIsInstance(encoder, json.JSONEncoder)

    def test_default_vault(self):
        class VaultObject:
            __ENCRYPTED__ = True
            _ciphertext = 'encrypted_text'
        encoder = AnsibleJSONEncoder(vault_to_text=True)
        result = encoder.default(VaultObject())
        self.assertEqual(result, 'encrypted_text')

    def test_default_unsafe(self):
        class UnsafeObject:
            __UNSAFE__ = True
        encoder = AnsibleJSONEncoder()
        result = encoder.default(UnsafeObject())
        self.assertEqual(result, {'__ansible_unsafe': '<object object at ...>'})

    def test_default_mapping(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default({'a': 1, 'b': 2})
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_default_date(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default(datetime.date(2022, 1, 1))
        self.assertEqual(result, '2022-01-01')

    def test_iterencode(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = encoder.iterencode({'a': 1, 'b': 2})
        self.assertEqual(next(result), '{"a": 1, "b": 2}')

    def test_preprocess_unsafe_encode(self):
        result = _preprocess_unsafe_encode({'a': 1, 'b': 2})
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_is_unsafe(self):
        class UnsafeObject:
            __UNSAFE__ = True
        self.assertTrue(_is_unsafe(UnsafeObject()))

    def test_is_vault(self):
        class VaultObject:
            __ENCRYPTED__ = True
        self.assertTrue(_is_vault(VaultObject()))

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_init(self):
        encoder = AnsibleJSONEncoder()
        self.assertIsInstance(encoder, json.JSONEncoder)

    def test_default_vault(self):
        class VaultObject:
            __ENCRYPTED__ = True
            _ciphertext = 'encrypted_text'
        encoder = AnsibleJSONEncoder(vault_to_text=True)
        result = encoder.default(VaultObject())
        self.assertEqual(result, 'encrypted_text')

    def test_default_unsafe(self):
        class UnsafeObject:
            __UNSAFE__ = True
        encoder = AnsibleJSONEncoder()
        result = encoder.default(UnsafeObject())
        self.assertEqual(result, {'__ansible_unsafe': '<object object at ...>'})

    def test_default_mapping(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default({'a': 1, 'b': 2})
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_default_date(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default(datetime.date(2022, 1, 1))
        self.assertEqual(result, '2022-01-01')

    def test_iterencode(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = encoder.iterencode([1, 2, 3])
        self.assertEqual(list(result), ['[1, 2, 3]'])

    def test_preprocess_unsafe_encode(self):
        result = _preprocess_unsafe_encode([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_is_unsafe(self):
        class UnsafeObject:
            __UNSAFE__ = True
        self.assertTrue(_is_unsafe(UnsafeObject()))

    def test_is_vault(self):
        class VaultObject:
            __ENCRYPTED__ = True
        self.assertTrue(_is_vault(VaultObject()))

if __name__ == '__main__':
    unittest.main()