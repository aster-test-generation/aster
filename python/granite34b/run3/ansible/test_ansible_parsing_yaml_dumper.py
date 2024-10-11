import unittest
from ansible.parsing.yaml.dumper import AnsibleDumper, AnsibleUnicode, AnsibleUnsafeText, AnsibleUnsafeBytes, HostVars, HostVarsVars, VarsWithSources, AnsibleSequence, AnsibleMapping, AnsibleVaultEncryptedUnicode, AnsibleUndefined


class TestAnsibleDumper(unittest.TestCase):
    def test_represent_hostvars(self):
        dumper = AnsibleDumper(stream=None)
        data = HostVars()
        result = dumper.represent_hostvars(data)
        self.assertEqual(result, {'!hostvars': {}})

    def test_represent_vault_encrypted_unicode(self):
        dumper = AnsibleDumper(stream=None)
        data = AnsibleVaultEncryptedUnicode('ciphertext')
        result = dumper.represent_vault_encrypted_unicode(data)
        self.assertEqual(result, {'!vault': 'ciphertext'})

    def test_represent_unicode(self):
        dumper = AnsibleDumper(stream=None)
        data = AnsibleUnicode('string')
        result = dumper.represent_unicode(data)
        self.assertEqual(result, 'string')

    def test_represent_binary(self):
        dumper = AnsibleDumper(stream=None)
        data = AnsibleUnsafeBytes(b'bytes')
        result = dumper.represent_binary(data)
        self.assertEqual(result, b'bytes')

    def test_represent_undefined(self):
        dumper = AnsibleDumper(stream=None)
        data = AnsibleUndefined()
        result = dumper.represent_undefined(data)
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()