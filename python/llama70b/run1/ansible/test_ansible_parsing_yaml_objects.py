import unittest
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping, AnsibleUnicode, AnsibleSequence, AnsibleVaultEncryptedUnicode


class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_init(self):
        obj = AnsibleBaseYAMLObject()
        self.assertIsNone(obj._data_source)
        self.assertEqual(obj._line_number, 0)
        self.assertEqual(obj._column_number, 0)

    def test_get_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        self.assertEqual(obj._get_ansible_position(), (None, 0, 0))

    def test_set_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj._set_ansible_position(("source", 1, 2))
        self.assertEqual(obj._data_source, "source")
        self.assertEqual(obj._line_number, 1)
        self.assertEqual(obj._column_number, 2)

    def test_ansible_pos_property(self):
        obj = AnsibleBaseYAMLObject()
        obj.ansible_pos = ("source", 1, 2)
        self.assertEqual(obj._data_source, "source")
        self.assertEqual(obj._line_number, 1)
        self.assertEqual(obj._column_number, 2)

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
        obj = AnsibleVaultEncryptedUnicode(b"encrypted_text")
        self.assertIsInstance(obj, Sequence)
        self.assertIsInstance(obj, AnsibleBaseYAMLObject)
        self.assertEqual(obj._ciphertext, b"encrypted_text")
        self.assertIsNone(obj.vault)

    def test_from_plaintext(self):
        vault = MockVault()
        seq = "plaintext"
        secret = "secret"
        obj = AnsibleVaultEncryptedUnicode.from_plaintext(seq, vault, secret)
        self.assertIsInstance(obj, AnsibleVaultEncryptedUnicode)
        self.assertEqual(obj.vault, vault)

    def test_data_property(self):
        obj = AnsibleVaultEncryptedUnicode(b"encrypted_text")
        self.assertEqual(obj.data, "encrypted_text")

    def test_data_setter(self):
        obj = AnsibleVaultEncryptedUnicode(b"encrypted_text")
        obj.data = "new_text"
        self.assertEqual(obj._ciphertext, b"new_text")

    def test_is_encrypted(self):
        obj = AnsibleVaultEncryptedUnicode(b"encrypted_text")
        self.assertFalse(obj.is_encrypted())
        obj.vault = MockVault()
        self.assertTrue(obj.is_encrypted())

    def test_eq(self):
        obj1 = AnsibleVaultEncryptedUnicode(b"encrypted_text")
        obj2 = AnsibleVaultEncryptedUnicode(b"encrypted_text")
        self.assertTrue(obj1 == obj2)

    def test_ne(self):
        obj1 = AnsibleVaultEncryptedUnicode(b"encrypted_text")
        obj2 = AnsibleVaultEncryptedUnicode(b"different_text")
        self.assertTrue(obj1 != obj2)

    def test_reversed(self):
        obj = AnsibleVaultEncryptedUnicode(b"hello")
        self.assertEqual(obj[::-1], "olleh")

    def test_str(self):
        obj = AnsibleVaultEncryptedUnicode(b"hello")
        self.assertEqual(str(obj), "hello")

    def test_unicode(self):
        obj = AnsibleVaultEncryptedUnicode(b"hello")
        self.assertEqual(unicode(obj), u"hello")

    def test_repr(self):
        obj = AnsibleVaultEncryptedUnicode(b"hello")
        self.assertEqual(repr(obj), repr("hello"))

    def test_int(self):
        obj = AnsibleVaultEncryptedUnicode(b"123")
        self.assertEqual(int(obj), 123)

    def test_float(self):
        obj = AnsibleVaultEncryptedUnicode(b"123.45")
        self.assertEqual(float(obj), 123.45)

    def test_complex(self):
        obj = AnsibleVaultEncryptedUnicode(b"123+45j")
        self.assertEqual(complex(obj), 123+45j)

    def test_hash(self):
        obj = AnsibleVaultEncryptedUnicode(b"hello")
        self.assertEqual(hash(obj), hash("hello"))

    def test_lt(self):
        obj1 = AnsibleVaultEncryptedUnicode(b"hello")
        obj2 = AnsibleVaultEncryptedUnicode(b"world")
        self.assertTrue(obj1 < obj2)

if __name__ == '__main__':
    unittest.main()