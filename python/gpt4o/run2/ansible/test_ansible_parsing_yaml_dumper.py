import unittest
import yaml
from ansible.parsing.yaml.dumper import AnsibleDumper, represent_hostvars, represent_vault_encrypted_unicode, represent_unicode, represent_binary, represent_undefined
from ansible.parsing.yaml.objects import AnsibleUnicode, AnsibleSequence, AnsibleMapping, AnsibleVaultEncryptedUnicode
from ansible.utils.unsafe_proxy import AnsibleUnsafeText, AnsibleUnsafeBytes
from ansible.vars.hostvars import HostVars, HostVarsVars
from ansible.vars.manager import VarsWithSources
from ansible.template import AnsibleUndefined


class TestAnsibleDumper(unittest.TestCase):
    def setUp(self):
        self.dumper = AnsibleDumper(stream=sys.stdout)

    def test_represent_hostvars(self):
        data = HostVars()
        result = represent_hostvars(self.dumper, data)
        self.assertIsInstance(result, yaml.nodes.MappingNode)

    def test_represent_vault_encrypted_unicode(self):
        class MockVaultEncryptedUnicode:
            _ciphertext = b'secret'
        data = MockVaultEncryptedUnicode()
        result = represent_vault_encrypted_unicode(self.dumper, data)
        self.assertIsInstance(result, yaml.nodes.ScalarNode)
        self.assertEqual(result.value, 'secret')

    def test_represent_unicode(self):
        data = AnsibleUnicode('test')
        result = represent_unicode(self.dumper, data)
        self.assertIsInstance(result, yaml.nodes.ScalarNode)
        self.assertEqual(result.value, 'test')

    def test_represent_binary(self):
        data = AnsibleUnsafeBytes(b'test')
        result = represent_binary(self.dumper, data)
        self.assertIsInstance(result, yaml.nodes.ScalarNode)
        self.assertEqual(result.value, 'test')

    def test_represent_undefined(self):
        data = AnsibleUndefined()
        result = represent_undefined(self.dumper, data)
        self.assertTrue(result)

    def test_add_representers(self):
        self.assertIn(AnsibleUnicode, self.dumper.yaml_representers)
        self.assertIn(AnsibleUnsafeText, self.dumper.yaml_representers)
        self.assertIn(AnsibleUnsafeBytes, self.dumper.yaml_representers)
        self.assertIn(HostVars, self.dumper.yaml_representers)
        self.assertIn(HostVarsVars, self.dumper.yaml_representers)
        self.assertIn(VarsWithSources, self.dumper.yaml_representers)
        self.assertIn(AnsibleSequence, self.dumper.yaml_representers)
        self.assertIn(AnsibleMapping, self.dumper.yaml_representers)
        self.assertIn(AnsibleVaultEncryptedUnicode, self.dumper.yaml_representers)
        self.assertIn(AnsibleUndefined, self.dumper.yaml_representers)

if __name__ == '__main__':
    unittest.main()