import unittest
from ansible.parsing.ajson import AnsibleJSONDecoder


class TestAnsibleJSONDecoder(unittest.TestCase):
    def test_set_secrets(self):
        AnsibleJSONDecoder.set_secrets('my_secret')
        self.assertEqual(AnsibleJSONDecoder._vaults['default']._secrets, 'my_secret')

    def test_object_hook(self):
        pairs = {'__ansible_vault': 'my_vault_value'}
        result = AnsibleJSONDecoder().object_hook(pairs)
        self.assertEqual(result['__ansible_vault'].value, 'my_vault_value')

    def test_wrap_var(self):
        pairs = {'__ansible_unsafe': 'my_unsafe_value'}
        result = AnsibleJSONDecoder().object_hook(pairs)
        self.assertEqual(result['__ansible_unsafe'], 'my_unsafe_value')

if __name__ == '__main__':
    unittest.main()