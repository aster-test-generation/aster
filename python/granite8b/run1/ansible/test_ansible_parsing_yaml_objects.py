import unittest
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping, AnsibleUnicode, AnsibleSequence, AnsibleVaultEncryptedUnicode


class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj.ansible_pos = (None, 1, 2)
        self.assertEqual(obj._get_ansible_position(), (None, 1, 2))

class TestAnsibleMapping(unittest.TestCase):
    def test_sub_class_for_dictionaries(self):
        obj = AnsibleMapping()
        self.assertIsInstance(obj, dict)

class TestAnsibleUnicode(unittest.TestCase):
    def test_sub_class_for_unicode_objects(self):
        obj = AnsibleUnicode()
        self.assertIsInstance(obj, text_type)

class TestAnsibleSequence(unittest.TestCase):
    def test_sub_class_for_lists(self):
        obj = AnsibleSequence()
        self.assertIsInstance(obj, list)

class TestAnsibleVaultEncryptedUnicode(unittest.TestCase):
    def test_unicode_like_object_that_is_not_evaluated_until_it_needs_to_be(self):
        obj = AnsibleVaultEncryptedUnicode(b'abc')
        self.assertIsInstance(obj, AnsibleVaultEncryptedUnicode)
        self.assertEqual(obj.data, 'abc')
        self.assertEqual(obj.vault, None)
        self.assertEqual(obj.yaml_tag, u'!vault')
        obj = AnsibleVaultEncryptedUnicode(b'abc', vault='vault', secret='secret')
        self.assertIsInstance(obj, AnsibleVaultEncryptedUnicode)
        self.assertEqual(obj.data, 'abc')
        self.assertEqual(obj.vault, 'vault')
        self.assertEqual(obj.yaml_tag, u'!vault')

if __name__ == '__main__':
    unittest.main()