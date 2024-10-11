import unittest
from ansible.parsing.yaml.dumper import AnsibleDumper, AnsibleUnicode, AnsibleUnsafeText, AnsibleUnsafeBytes, HostVars, HostVarsVars, VarsWithSources, AnsibleSequence, AnsibleMapping, AnsibleVaultEncryptedUnicode, AnsibleUndefined


class TestAnsibleDumper(unittest.TestCase):
    def test_represent_hostvars(self):
        dumper = AnsibleDumper()
        data = HostVars()
        result = dumper.represent_hostvars(data)
        self.assertEqual(result, dumper.represent_dict(dict(data)))

    def test_represent_vault_encrypted_unicode(self):
        dumper = AnsibleDumper()
        data = AnsibleVaultEncryptedUnicode()
        result = dumper.represent_vault_encrypted_unicode(data)
        self.assertEqual(result, dumper.represent_scalar(u'!vault', data._ciphertext.decode(), style='|'))

    def test_represent_unicode(self):
        dumper = AnsibleDumper()
        data = AnsibleUnicode()
        result = dumper.represent_unicode(data)
        self.assertEqual(result, yaml.representer.SafeRepresenter.represent_str(dumper, text_type(data)))

    def test_represent_binary(self):
        dumper = AnsibleDumper()
        data = AnsibleUnsafeBytes()
        result = dumper.represent_binary(data)
        self.assertEqual(result, yaml.representer.SafeRepresenter.represent_binary(dumper, binary_type(data)))

    def test_represent_undefined(self):
        dumper = AnsibleDumper()
        data = AnsibleUndefined()
        result = dumper.represent_undefined(data)
        self.assertEqual(result, bool(data))

if __name__ == '__main__':
    unittest.main()