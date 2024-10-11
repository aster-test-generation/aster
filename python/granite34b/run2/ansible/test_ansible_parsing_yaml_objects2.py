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
        vault = object()
        secret = object()
        avu = AnsibleVaultEncryptedUnicode.from_plaintext('plaintext', vault, secret)
        self.assertEqual(avu.data, 'plaintext')

    def test_is_encrypted(self):
        vault = object()
        avu = AnsibleVaultEncryptedUnicode('ciphertext')
        avu.vault = vault
        self.assertTrue(avu.is_encrypted())

    def test_eq(self):
        avu = AnsibleVaultEncryptedUnicode('ciphertext')
        avu.vault = object()
        self.assertEqual(avu, 'plaintext')

    def test_ne(self):
        avu = AnsibleVaultEncryptedUnicode('ciphertext')
        avu.vault = object()
        self.assertNotEqual(avu, 'plaintext')

    def test_reversed(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertEqual(avu[::-1], 'tnirp')

    def test_str(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertEqual(str(avu), 'plaintext')

    def test_unicode(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertEqual(unicode(avu), 'plaintext')

    def test_encode(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertEqual(avu.encode(), 'plaintext')

    def test_repr(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertEqual(repr(avu), 'plaintext')

    def test_int(self):
        avu = AnsibleVaultEncryptedUnicode('123')
        self.assertEqual(int(avu), 123)

    def test_float(self):
        avu = AnsibleVaultEncryptedUnicode('123.45')
        self.assertEqual(float(avu), 123.45)

    def test_complex(self):
        avu = AnsibleVaultEncryptedUnicode('1+2j')
        self.assertEqual(complex(avu), 1+2j)

    def test_hash(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertEqual(hash(avu), hash('plaintext'))

    def test_lt(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertTrue(avu < 'plaintext2')

    def test_le(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertTrue(avu <= 'plaintext')

    def test_gt(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertTrue(avu > 'plaintext1')

    def test_ge(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertTrue(avu >= 'plaintext')

    def test_contains(self):
        avu = AnsibleVaultEncryptedUnicode('plaintext')
        self.assertTrue('pl' in avu)

if __name__ == '__main__':
    unittest.main()