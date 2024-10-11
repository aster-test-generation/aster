import unittest
from ansible.parsing.ajson import AnsibleJSONDecoder
from ansible.parsing.vault import VaultLib
from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
from ansible.utils.unsafe_proxy import wrap_var

class TestAnsibleJSONDecoder(unittest.TestCase):
    def test_set_secrets(self):
        AnsibleJSONDecoder.set_secrets(['my_secret'])
        self.assertEqual(AnsibleJSONDecoder._vaults['default']._secrets, ['my_secret'])

    def test_object_hook(self):
        pairs = {'__ansible_vault': 'my_vault_value'}
        result = AnsibleJSONDecoder().object_hook(pairs)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)
        self.assertEqual(result. vault, AnsibleJSONDecoder._vaults['default'])
        pairs = {'__ansible_unsafe': 'my_unsafe_value'}
        result = AnsibleJSONDecoder().object_hook(pairs)
        self.assertEqual(result, wrap_var('my_unsafe_value'))

if __name__ == '__main__':
    unittest.main()