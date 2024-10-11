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

    def test_default_encrypted(self):
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
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        o = [1, 2, 3]
        result = list(encoder.iterencode(o))
        self.assertEqual(result, ['[1, 2, 3]'])

    def test_iterencode_unsafe(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        o = object()
        o.__UNSAFE__ = True
        result = list(encoder.iterencode([o]))
        self.assertEqual(result, ['[{"__ansible_unsafe": "%s"}]' % str(o)])

    def test_str_method(self):
        encoder = AnsibleJSONEncoder()
        result = str(encoder)
        self.assertEqual(result, 'AnsibleJSONEncoder()')

    def test_repr_method(self):
        encoder = AnsibleJSONEncoder()
        result = repr(encoder)
        self.assertEqual(result, 'AnsibleJSONEncoder()')

class TestPrivateMethods(unittest.TestCase):
    def test__init__(self):
        encoder = AnsibleJSONEncoder()
        result = encoder._AnsibleJSONEncoder__init__()
        self.assertIsNone(result)

class TestProtectedMethods(unittest.TestCase):
    def test__preprocess_unsafe_encode(self):
        result = _preprocess_unsafe_encode([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test__preprocess_unsafe_encode_unsafe(self):
        o = object()
        o.__UNSAFE__ = True
        result = _preprocess_unsafe_encode([o])
        self.assertEqual(result, [{'__ansible_unsafe': str(o)}])

class TestFunctions(unittest.TestCase):
    def test_is_unsafe(self):
        o = object()
        o.__UNSAFE__ = True
        result = _is_unsafe(o)
        self.assertTrue(result)

    def test_is_vault(self):
        o = object()
        o.__ENCRYPTED__ = True
        result = _is_vault(o)
        self.assertTrue(result)

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
        result = encoder.default(datetime.datetime(2022, 1, 1))
        self.assertEqual(result, '2022-01-01T00:00:00')

    def test_iterencode(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = encoder.iterencode({'a': 1, 'b': 2})
        self.assertEqual(list(result), ['{"a": 1, "b": 2}'])

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

if __name__ == '__main__':
    unittest.main()