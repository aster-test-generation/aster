import unittest
from ansible.parsing.ajson import *


class TestAnsibleJSONDecoder(unittest.TestCase):
    def test_init(self):
        instance = AnsibleJSONDecoder()
        self.assertIsInstance(instance, AnsibleJSONDecoder)

    def test_set_secrets(self):
        instance = AnsibleJSONDecoder()
        instance.set_secrets(secrets=None)
        self.assertEqual(instance._vaults, {'default': VaultLib(secrets=None)})

    def test_object_hook(self):
        instance = AnsibleJSONDecoder()
        pairs = {'__ansible_vault': 'value'}
        result = instance.object_hook(pairs)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)

        pairs = {'__ansible_unsafe': 'value'}
        result = instance.object_hook(pairs)
        self.assertIsInstance(result, wrap_var)

        pairs = {'key': 'value'}
        result = instance.object_hook(pairs)
        self.assertEqual(result, {'key': 'value'})

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_init(self):
        instance = AnsibleJSONEncoder()
        self.assertIsInstance(instance, AnsibleJSONEncoder)

    def test_default(self):
        instance = AnsibleJSONEncoder()
        result = instance.default(obj=None)
        self.assertEqual(result, None)

    def test_encode(self):
        instance = AnsibleJSONEncoder()
        result = instance.encode(obj=None)
        self.assertEqual(result, None)

    def test_iterencode(self):
        instance = AnsibleJSONEncoder()
        result = instance.iterencode(obj=None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()