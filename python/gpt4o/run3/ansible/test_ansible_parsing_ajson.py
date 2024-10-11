import unittest
from ansible.parsing.ajson import AnsibleJSONDecoder
from ansible.parsing.vault import VaultLib
from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
from ansible.utils.unsafe_proxy import wrap_var


class TestAnsibleJSONDecoder(unittest.TestCase):
    def test_init(self):
        decoder = AnsibleJSONDecoder()
        self.assertIsInstance(decoder, AnsibleJSONDecoder)

    def test_set_secrets(self):
        secrets = 'my_secret'
        AnsibleJSONDecoder.set_secrets(secrets)
        self.assertIn('default', AnsibleJSONDecoder._vaults)
        self.assertIsInstance(AnsibleJSONDecoder._vaults['default'], VaultLib)

    def test_object_hook_vault(self):
        decoder = AnsibleJSONDecoder()
        AnsibleJSONDecoder.set_secrets('my_secret')
        pairs = {'__ansible_vault': 'encrypted_value'}
        result = decoder.object_hook(pairs)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)
        self.assertEqual(result.vault, AnsibleJSONDecoder._vaults['default'])

    def test_object_hook_unsafe(self):
        decoder = AnsibleJSONDecoder()
        pairs = {'__ansible_unsafe': 'unsafe_value'}
        result = decoder.object_hook(pairs)
        self.assertEqual(result, wrap_var('unsafe_value'))

    def test_object_hook_normal(self):
        decoder = AnsibleJSONDecoder()
        pairs = {'normal_key': 'normal_value'}
        result = decoder.object_hook(pairs)
        self.assertEqual(result, pairs)

if __name__ == '__main__':
    unittest.main()