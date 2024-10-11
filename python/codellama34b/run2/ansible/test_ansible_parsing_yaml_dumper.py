import unittest
from ansible.parsing.yaml.dumper import *



class TestAnsibleDumper(unittest.TestCase):
    def test_represent_hostvars(self):
        instance = AnsibleDumper()
        data = HostVars()
        result = instance.represent_hostvars(data)
        self.assertEqual(result, instance.represent_dict(dict(data)))

    def test_represent_vault_encrypted_unicode(self):
        instance = AnsibleDumper()
        data = AnsibleVaultEncryptedUnicode()
        result = instance.represent_vault_encrypted_unicode(data)
        self.assertEqual(result, instance.represent_scalar(u'!vault', data._ciphertext.decode(), style='|'))

    def test_represent_unicode(self):
        instance = AnsibleDumper()
        data = AnsibleUnicode()
        result = instance.represent_unicode(data)
        self.assertEqual(result, yaml.representer.SafeRepresenter.represent_str(instance, text_type(data)))

    def test_represent_binary(self):
        instance = AnsibleDumper()
        data = AnsibleUnsafeBytes()
        result = instance.represent_binary(data)
        self.assertEqual(result, yaml.representer.SafeRepresenter.represent_binary(instance, binary_type(data)))

    def test_represent_undefined(self):
        instance = AnsibleDumper()
        data = AnsibleUndefined()
        result = instance.represent_undefined(data)
        self.assertEqual(result, bool(data))

if __name__ == '__main__':
    unittest.main()