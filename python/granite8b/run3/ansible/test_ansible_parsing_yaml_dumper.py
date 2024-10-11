import unittest
from ansible.parsing.yaml.dumper import AnsibleDumper


class TestAnsibleDumper(unittest.TestCase):
    def test_represent_hostvars(self):
        data = HostVars()
        result = AnsibleDumper().represent_hostvars(data)
        self.assertEqual(result, {})

    def test_represent_vault_encrypted_unicode(self):
        data = AnsibleVaultEncryptedUnicode()
        result = AnsibleDumper().represent_vault_encrypted_unicode(data)
        self.assertEqual(result, '!vault ""')

    def test_represent_unicode(self):
        data = AnsibleUnicode()
        result = AnsibleDumper().represent_unicode(data)
        self.assertEqual(result, '""')

    def test_represent_binary(self):
        data = AnsibleUnsafeBytes()
        result = AnsibleDumper().represent_binary(data)
        self.assertEqual(result, '!!binary ""')

    def test_represent_undefined(self):
        data = AnsibleUndefined()
        result = AnsibleDumper().represent_undefined(data)
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()