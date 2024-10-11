import unittest
from ansible.parsing.ajson import AnsibleJSONDecoder, AnsibleJSONEncoder
from ansible.module_utils.common.json import AnsibleJSONEncoder
from ansible.parsing.vault import VaultLib
from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
from ansible.utils.unsafe_proxy import wrap_var
from ansible.parsing.ajson import AnsibleJSONDecoder


class TestAnsibleJSONDecoder(unittest.TestCase):
    def test_set_secrets(self):
        AnsibleJSONDecoder.set_secrets(['secret1', 'secret2'])
        self.assertEqual(AnsibleJSONDecoder._vaults['default'].secrets, ['secret1', 'secret2'])

    def test_object_hook(self):
        pairs = {'__ansible_vault': 'encrypted_value'}
        result = AnsibleJSONDecoder().object_hook(pairs)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)
        pairs = {'__ansible_unsafe': 'unsafe_value'}
        result = AnsibleJSONDecoder().object_hook(pairs)
        self.assertEqual(result, wrap_var('unsafe_value'))

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default(self):
        obj = {'key': 'value'}
        result = AnsibleJSONEncoder().default(obj)
        self.assertEqual(result, {'key': 'value'})

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