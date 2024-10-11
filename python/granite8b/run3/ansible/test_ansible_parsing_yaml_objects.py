import unittest
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping, AnsibleUnicode, AnsibleSequence, AnsibleVaultEncryptedUnicode


class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_ansible_pos(self):
        obj = AnsibleBaseYAMLObject()
        obj.ansible_pos = (1, 2, 3)
        self.assertEqual(obj._get_ansible_position(), (1, 2, 3))

class TestAnsibleMapping(unittest.TestCase):
    def test_init(self):
        obj = AnsibleMapping()
        self.assertIsInstance(obj, dict)
        self.assertIsInstance(obj, AnsibleBaseYAMLObject)

class TestAnsibleUnicode(unittest.TestCase):
    def test_init(self):
        obj = AnsibleUnicode()
        self.assertIsInstance(obj, text_type)
        self.assertIsInstance(obj, AnsibleBaseYAMLObject)

class TestAnsibleSequence(unittest.TestCase):
    def test_init(self):
        obj = AnsibleSequence()
        self.assertIsInstance(obj, list)
        self.assertIsInstance(obj, AnsibleBaseYAMLObject)

class TestAnsibleVaultEncryptedUnicode(unittest.TestCase):
    def test_init(self):
        obj = AnsibleVaultEncryptedUnicode(b'abc')
        self.assertIsInstance(obj, AnsibleBaseYAMLObject)
        self.assertEqual(obj._ciphertext, b'abc')
        self.assertIsNone(obj.vault)

    def test_from_plaintext(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertIsInstance(obj, AnsibleBaseYAMLObject)
        self.assertEqual(obj._ciphertext, b'abc')
        self.assertIsNone(obj.vault)

    def test_data(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertEqual(obj.data, 'abc')

    def test_is_encrypted(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertTrue(obj.is_encrypted())

    def test_eq(self):
        obj1 = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        obj2 = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertEqual(obj1, obj2)

    def test_ne(self):
        obj1 = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        obj2 = AnsibleVaultEncryptedUnicode.from_plaintext('def', None, None)
        self.assertNotEqual(obj1, obj2)

    def test_reversed(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertEqual(obj[::-1], 'cba')

    def test_str(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertEqual(str(obj), 'abc')

    def test_unicode(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertEqual(unicode(obj), 'abc')

    def test_encode(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertEqual(obj.encode(), b'abc')

    def test_repr(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertEqual(repr(obj), "'abc'")

    def test_int(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('123', None, None)
        self.assertEqual(int(obj), 123)

    def test_float(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('123.456', None, None)
        self.assertEqual(float(obj), 123.456)

    def test_complex(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('123+456j', None, None)
        self.assertEqual(complex(obj), complex(123, 456))

    def test_hash(self):
        obj = AnsibleVaultEncryptedUnicode.from_plaintext('abc', None, None)
        self.assertEqual(hash(obj), hash('abc'))

if __name__ == '__main__':
    unittest.main()