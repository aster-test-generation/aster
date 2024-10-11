import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.default(1.0)
        self.assertEqual(result, 1)

    def test_iterencode_method(self):
        encoder = AnsibleJSONEncoder()
        result = encoder.iterencode(1)
        self.assertEqual(list(result), ['1'])

    def test_preprocess_unsafe_encode_method(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        result = encoder.iterencode(1)
        self.assertEqual(result, '{"__ansible_unsafe": "1"}')

    def test_vault_to_text_method(self):
        encoder = AnsibleJSONEncoder(vault_to_text=True)
        result = encoder.iterencode(1)
        self.assertEqual(result, b'{"__ansible_vault": "1"}')

if __name__ == '__main__':
    unittest.main()