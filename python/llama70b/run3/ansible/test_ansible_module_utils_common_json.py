import json
import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder, _is_unsafe, _is_vault, _preprocess_unsafe_encode


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_init(self):
        encoder = AnsibleJSONEncoder()
        self.assertIsInstance(encoder, json.JSONEncoder)

    def test_default(self):
        encoder = AnsibleJSONEncoder()
        o = object()
        result = encoder.default(o)
        self.assertEqual(result, o)

    def test_default_vault(self):
        encoder = AnsibleJSONEncoder(vault_to_text=True)
        o = object()
        o.__ENCRYPTED__ = True
        o._ciphertext = 'encrypted_text'
        result = encoder.default(o)
        self.assertEqual(result, {'__ansible_vault': 'encrypted_text'})

    def test_default_unsafe(self):
        encoder = AnsibleJSONEncoder()
        o = object()
        o.__UNSAFE__ = True
        result = encoder.default(o)
        self.assertEqual(result, {'__ansible_unsafe': str(o)})

    def test_iterencode(self):
        encoder = AnsibleJSONEncoder()
        o = {'a': 1, 'b': 2}
        result = encoder.iterencode(o)
        self.assertEqual(next(result), '{"a": 1, "b": 2}')

    def test_iterencode_preprocess_unsafe(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        o = {'a': 1, 'b': object()}
        o['b'].__UNSAFE__ = True
        result = encoder.iterencode(o)
        self.assertEqual(next(result), '{"a": 1, "b": {"__ansible_unsafe": "' + str(o['b']) + '"}}')

    def test_str_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.__str__()
        self.assertEqual(result, 'AnsibleJSONEncoder()')

    def test_repr_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.__repr__()
        self.assertEqual(result, 'AnsibleJSONEncoder()')

class TestPrivateMethods(unittest.TestCase):
    def test__is_unsafe(self):
        o = object()
        o.__UNSAFE__ = True
        result = _is_unsafe(o)
        self.assertTrue(result)

    def test__is_vault(self):
        o = object()
        o.__ENCRYPTED__ = True
        result = _is_vault(o)
        self.assertTrue(result)

    def test__preprocess_unsafe_encode(self):
        o = {'a': 1, 'b': object()}
        o['b'].__UNSAFE__ = True
        result = _preprocess_unsafe_encode(o)
        self.assertEqual(result, {'a': 1, 'b': {'__ansible_unsafe': str(o['b'])}})

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

    def test_default_datetime(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default(datetime.date(2022, 1, 1))
        self.assertEqual(result, '2022-01-01')

    def test_default_default(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default('hello')
        self.assertEqual(result, 'hello')

    def test_iterencode(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = encoder.iterencode({'a': 1, 'b': 2})
        self.assertIsInstance(result, json.JSONEncoder.iterencode)

    def test_iterencode_preprocess_unsafe(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = encoder.iterencode([{'__UNSAFE__': True}])
        self.assertIsInstance(result, json.JSONEncoder.iterencode)

class TestPrivateMethods(unittest.TestCase):
    def test__is_unsafe(self):
        class UnsafeObject:
            __UNSAFE__ = True
        self.assertTrue(_is_unsafe(UnsafeObject()))

    def test__is_vault(self):
        class VaultObject:
            __ENCRYPTED__ = True
        self.assertTrue(_is_vault(VaultObject()))

    def test__preprocess_unsafe_encode(self):
        result = _preprocess_unsafe_encode([{'__UNSAFE__': True}])
        self.assertEqual(result, [{'__ansible_unsafe': '<object object at ...>'}])

if __name__ == '__main__':
    unittest.main()