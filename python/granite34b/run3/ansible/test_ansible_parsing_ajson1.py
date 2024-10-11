import unittest
from ansible.parsing.ajson import AnsibleJSONDecoder

class TestAnsibleJSONDecoder(unittest.TestCase):
    def test_set_secrets(self):
        AnsibleJSONDecoder.set_secrets(['secret1', 'secret2'])
        self.assertEqual(AnsibleJSONDecoder._vaults['default'].secrets, ['secret1', 'secret2'])

    def test_object_hook(self):
        pairs = {'__ansible_vault': 'encrypted_value'}
        result = AnsibleJSONDecoder().object_hook(pairs)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)
        self.assertEqual(result. vault, AnsibleJSONDecoder._vaults['default'])

        pairs = {'__ansible_unsafe': 'unsafe_value'}
        result = AnsibleJSONDecoder().object_hook(pairs)
        self.assertEqual(result, 'unsafe_value')

if __name__ == '__main__':
    unittest.main()