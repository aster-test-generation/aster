from ansible.parsing.yaml.objects import AnsibleUnicode
import unittest
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping, AnsibleUnicode, AnsibleSequence, AnsibleVaultEncryptedUnicode


class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj.ansible_pos = (1, 2, 3)
        self.assertEqual(obj._get_ansible_position(), (1, 2, 3))

class TestAnsibleMapping(unittest.TestCase):
    def test_init(self):
        obj = AnsibleMapping()
        self.assertIsInstance(obj, dict)

class TestAnsibleUnicode(unittest.TestCase):
    def test_init(self):
        obj = AnsibleUnicode()
        self.assertIsInstance(obj, text_type)

class TestAnsibleSequence(unittest.TestCase):
    def test_init(self):
        obj = AnsibleSequence()
        self.assertIsInstance(obj, list)

class TestAnsibleVaultEncryptedUnicode(unittest.TestCase):
    def test_init(self):
        obj = AnsibleVaultEncryptedUnicode(b'abc')
        self.assertIsInstance(obj, AnsibleVaultEncryptedUnicode)

if __name__ == '__main__':
    unittest.main()