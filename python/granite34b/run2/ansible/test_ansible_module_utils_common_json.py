import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder
from ansible.module_utils.common.json import AnsibleJSONEncoder, _is_unsafe, _is_vault, _preprocess_unsafe_encode


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default(1.0)
        self.assertEqual(result, 1)

    def test_iterencode_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.iterencode(1)
        self.assertEqual(str(result), '1')

    def test_preprocess_unsafe_encode_method(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = encoder.iterencode(1)
        self.assertEqual(result, {"__ansible_unsafe": "1"})

    def test_vault_to_text_method(self):
        encoder = AnsibleJSONEncoder(vault_to_text=True)
        result = encoder.default(1.0)
        self.assertEqual(result, 1)

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_is_unsafe(self):
        self.assertFalse(_is_unsafe(1))
        self.assertFalse(_is_unsafe('string'))
        self.assertFalse(_is_unsafe([1, 2, 3]))
        self.assertFalse(_is_unsafe({'key': 'value'}))
        self.assertTrue(_is_unsafe({'__ansible_unsafe': 'unsafe_value'}))
        self.assertFalse(_is_unsafe({'__ansible_vault': 'encrypted_value'}))

    def test_is_vault(self):
        self.assertFalse(_is_vault(1))
        self.assertFalse(_is_vault('string'))
        self.assertFalse(_is_vault([1, 2, 3]))
        self.assertFalse(_is_vault({'key': 'value'}))
        self.assertFalse(_is_vault({'__ansible_unsafe': 'unsafe_value'}))
        self.assertTrue(_is_vault({'__ansible_vault': 'encrypted_value'}))

    def test_preprocess_unsafe_encode(self):
        self.assertEqual(_preprocess_unsafe_encode(1), 1)
        self.assertEqual(_preprocess_unsafe_encode('string'), 'string')
        self.assertEqual(_preprocess_unsafe_encode([1, 2, 3]), [1, 2, 3])
        self.assertEqual(_preprocess_unsafe_encode({'key': 'value'}), {'key': 'value'})
        self.assertEqual(_preprocess_unsafe_encode({'__ansible_unsafe': 'unsafe_value'}), {'__ansible_unsafe': 'unsafe_value'})
        self.assertEqual(_preprocess_unsafe_encode({'__ansible_vault': 'encrypted_value'}), {'__ansible_vault': 'encrypted_value'})
        self.assertEqual(_preprocess_unsafe_encode({'__ansible_unsafe': 'unsafe_value', '__ansible_vault': 'encrypted_value'}), {'__ansible_unsafe': 'unsafe_value', '__ansible_vault': 'encrypted_value'})
        self.assertEqual(_preprocess_unsafe_encode([1, {'__ansible_unsafe': 'unsafe_value'}, 2]), [1, {'__ansible_unsafe': 'unsafe_value'}, 2])
        self.assertEqual(_preprocess_unsafe_encode({'key': 'value', 'unsafe_key': {'__ansible_unsafe': 'unsafe_value'}}), {'key': 'value', 'unsafe_key': {'__ansible_unsafe': 'unsafe_value'}})

class TestAnsibleJSONEncoderMethods(unittest.TestCase):
    def test_default_method(self):
        encoder = AnsibleJSONEncoder()
        self.assertEqual(encoder.default(1), 1)
        self.assertEqual(encoder.default('string'), 'string')
        self.assertEqual(encoder.default([1, 2, 3]), [1, 2, 3])
        self.assertEqual(encoder.default({'key': 'value'}), {'key': 'value'})
        self.assertEqual(encoder.default({'__ansible_unsafe': 'unsafe_value'}), {'__ansible_unsafe': 'unsafe_value'})
        self.assertEqual(encoder.default({'__ansible_vault': 'encrypted_value'}), {'__ansible_vault': 'encrypted_value'})
        self.assertEqual(encoder.default(datetime.datetime.now()), datetime.datetime.now().isoformat())

if __name__ == '__main__':
    unittest.main()