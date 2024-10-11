import unittest
from ansible.parsing.yaml.dumper import *


class TestAnsibleDumper(unittest.TestCase):
    def test_represent_hostvars(self):
        instance = AnsibleDumper()
        result = instance.represent_hostvars(HostVars())
        self.assertEqual(result, None)

    def test_represent_vault_encrypted_unicode(self):
        instance = AnsibleDumper()
        result = instance.represent_vault_encrypted_unicode(AnsibleVaultEncryptedUnicode())
        self.assertEqual(result, None)

    def test_represent_unicode(self):
        instance = AnsibleDumper()
        result = instance.represent_unicode(AnsibleUnicode())
        self.assertEqual(result, None)

    def test_represent_binary(self):
        instance = AnsibleDumper()
        result = instance.represent_binary(AnsibleUnsafeBytes())
        self.assertEqual(result, None)

    def test_represent_undefined(self):
        instance = AnsibleDumper()
        result = instance.represent_undefined(AnsibleUndefined())
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(AnsibleUnicode, represent_unicode)
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(AnsibleUnsafeText, represent_unicode)
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(AnsibleUnsafeBytes, represent_binary)
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(HostVars, represent_hostvars)
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(HostVarsVars, represent_hostvars)
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(VarsWithSources, represent_hostvars)
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(AnsibleSequence, yaml.representer.SafeRepresenter.represent_list)
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(AnsibleMapping, yaml.representer.SafeRepresenter.represent_dict)
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(AnsibleVaultEncryptedUnicode, represent_vault_encrypted_unicode)
        self.assertEqual(result, None)

    def test_add_representer(self):
        instance = AnsibleDumper()
        result = instance.add_representer(AnsibleUndefined, represent_undefined)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()