import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder
from ansible.module_utils.common.json import AnsibleJSONEncoder, _is_unsafe, _is_vault, _preprocess_unsafe_encode


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default(1)
        self.assertEqual(result, 1)

    def test_iterencode_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.iterencode(1)
        self.assertEqual(list(result), ['1'])

    def test_preprocess_unsafe_encode_method(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = encoder.iterencode(1)
        self.assertEqual(result, '{"__ansible_unsafe": "1"}')

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default(1)
        self.assertEqual(result, 1)

    def test_iterencode_method(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = encoder.iterencode(1)
        self.assertEqual(result, b'1')

    def test_is_unsafe_method(self):
        result = _is_unsafe(1)
        self.assertFalse(result)

    def test_is_vault_method(self):
        result = _is_vault(1)
        self.assertFalse(result)

    def test_preprocess_unsafe_encode_method(self):
        result = _preprocess_unsafe_encode(1)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()