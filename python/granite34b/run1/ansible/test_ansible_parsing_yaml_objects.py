import unittest
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping, AnsibleUnicode, AnsibleSequence, AnsibleVaultEncryptedUnicode


class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_get_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj._data_source = 'example.yaml'
        obj._line_number = 10
        obj._column_number = 20
        self.assertEqual(obj._get_ansible_position(), ('example.yaml', 10, 20))

    def test_set_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj._set_ansible_position(('example.yaml', 10, 20))
        self.assertEqual(obj._data_source, 'example.yaml')
        self.assertEqual(obj._line_number, 10)
        self.assertEqual(obj._column_number, 20)

class TestAnsibleMapping(unittest.TestCase):
    def test_ansible_mapping(self):
        mapping = AnsibleMapping()
        mapping['key'] = 'value'
        self.assertEqual(mapping['key'], 'value')

class TestAnsibleUnicode(unittest.TestCase):
    def test_ansible_unicode(self):
        unicode_obj = AnsibleUnicode('example')
        self.assertEqual(unicode_obj, 'example')

class TestAnsibleSequence(unittest.TestCase):
    def test_ansible_sequence(self):
        sequence = AnsibleSequence()
        sequence.append('item')
        self.assertEqual(sequence[0], 'item')

class TestAnsibleVaultEncryptedUnicode(unittest.TestCase):
    def test_from_plaintext(self):
        vault = 'example_vault'
        secret = 'example_secret'
        seq = 'example_sequence'
        avu = AnsibleVaultEncryptedUnicode.from_plaintext(seq, vault, secret)
        self.assertEqual(avu.data, 'decrypted_example_sequence')

    def test_init(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        self.assertEqual(avu._ciphertext, 'example_ciphertext')

    def test_data(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'example_vault'
        self.assertEqual(avu.data, 'decrypted_example_sequence')

    def test_is_encrypted(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'example_vault'
        self.assertTrue(avu.is_encrypted())

    def test_eq(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'example_vault'
        self.assertEqual(avu, 'decrypted_example_sequence')

    def test_ne(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'example_vault'
        self.assertNotEqual(avu, 'decrypted_example_sequence')

    def test_reversed(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'example_vault'
        self.assertEqual(avu[::-1], 'decrypted_example_sequence')

    def test_str(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'example_vault'
        self.assertEqual(str(avu), 'decrypted_example_sequence')

    def test_unicode(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'example_vault'
        self.assertEqual(unicode(avu), 'decrypted_example_sequence')

    def test_encode(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'example_vault'
        self.assertEqual(avu.encode(), 'decrypted_example_sequence')

    def test_repr(self):
        ciphertext = 'example_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'example_vault'
        self.assertEqual(repr(avu), 'decrypted_example_sequence')

if __name__ == '__main__':
    unittest.main()