import unittest
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping, AnsibleUnicode, AnsibleSequence, AnsibleVaultEncryptedUnicode


class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_get_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj._data_source = 'test_source'
        obj._line_number = 10
        obj._column_number = 20
        self.assertEqual(obj._get_ansible_position(), ('test_source', 10, 20))

    def test_set_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj._set_ansible_position(('test_source', 10, 20))
        self.assertEqual(obj._data_source, 'test_source')
        self.assertEqual(obj._line_number, 10)
        self.assertEqual(obj._column_number, 20)

class TestAnsibleMapping(unittest.TestCase):
    def test_ansible_mapping(self):
        mapping = AnsibleMapping()
        mapping['key'] = 'value'
        self.assertEqual(mapping['key'], 'value')

class TestAnsibleUnicode(unittest.TestCase):
    def test_ansible_unicode(self):
        unicode_obj = AnsibleUnicode('test_string')
        self.assertEqual(unicode_obj, 'test_string')

class TestAnsibleSequence(unittest.TestCase):
    def test_ansible_sequence(self):
        sequence = AnsibleSequence()
        sequence.append('item')
        self.assertEqual(sequence[0], 'item')

class TestAnsibleVaultEncryptedUnicode(unittest.TestCase):
    def test_from_plaintext(self):
        vault = 'test_vault'
        secret = 'test_secret'
        seq = 'test_sequence'
        avu = AnsibleVaultEncryptedUnicode.from_plaintext(seq, vault, secret)
        self.assertEqual(avu.data, seq)

    def test_init(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        self.assertEqual(avu._ciphertext, ciphertext)

    def test_data_property(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'test_vault'
        self.assertEqual(avu.data, 'decrypted_test_ciphertext')

    def test_is_encrypted(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'test_vault'
        self.assertTrue(avu.is_encrypted())

    def test_eq(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'test_vault'
        self.assertEqual(avu, 'decrypted_test_ciphertext')

    def test_ne(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'test_vault'
        self.assertNotEqual(avu, 'decrypted_test_ciphertext')

    def test_reversed(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'test_vault'
        self.assertEqual(avu[::-1], 'decrypted_test_ciphertext[::-1]')

    def test_str(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'test_vault'
        self.assertEqual(str(avu), 'decrypted_test_ciphertext')

    def test_unicode(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'test_vault'
        self.assertEqual(unicode(avu), 'decrypted_test_ciphertext')

    def test_encode(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'test_vault'
        self.assertEqual(avu.encode(), 'decrypted_test_ciphertext')

    def test_repr(self):
        ciphertext = 'test_ciphertext'
        avu = AnsibleVaultEncryptedUnicode(ciphertext)
        avu.vault = 'test_vault'
        self.assertEqual(repr(avu), 'decrypted_test_ciphertext')

if __name__ == '__main__':
    unittest.main()