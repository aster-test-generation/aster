import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder, _is_unsafe, _is_vault, _preprocess_unsafe_encode

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