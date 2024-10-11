import unittest
from ansible.parsing.yaml.objects import AnsibleSequence, AnsibleUnicode, AnsibleVaultEncryptedUnicode



class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_ansible_pos(self):
        instance = AnsibleBaseYAMLObject()
        instance._set_ansible_position(("source", 1, 2))
        result = instance._get_ansible_position()
        self.assertEqual(result, ("source", 1, 2))

class TestAnsibleMapping(unittest.TestCase):
    def test_init(self):
        instance = AnsibleMapping()
        self.assertIsInstance(instance, dict)

class TestAnsibleUnicode(unittest.TestCase):
    def test_init(self):
        instance = AnsibleUnicode()
        self.assertIsInstance(instance, text_type)

class TestAnsibleSequence(unittest.TestCase):
    def test_init(self):
        instance = AnsibleSequence()
        self.assertIsInstance(instance, list)

class TestAnsibleVaultEncryptedUnicode(unittest.TestCase):
    def test_from_plaintext(self):
        instance = AnsibleVaultEncryptedUnicode.from_plaintext("test", None, None)
        self.assertIsInstance(instance, AnsibleVaultEncryptedUnicode)

    def test_init(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertIsInstance(instance, AnsibleVaultEncryptedUnicode)

    def test_data(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(instance.data, "test")

    def test_is_encrypted(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(instance.is_encrypted(), False)

    def test_eq(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(instance == "test", True)

    def test_ne(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(instance != "test", False)

    def test_reversed(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(reversed(instance), "tset")

    def test_str(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(str(instance), "test")

    def test_unicode(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(unicode(instance), "test")

    def test_encode(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(instance.encode(), "test")

    def test_repr(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(repr(instance), "test")

    def test_int(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(int(instance), 0)

    def test_float(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(float(instance), 0.0)

    def test_complex(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(complex(instance), 0j)

    def test_hash(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(hash(instance), 0)

    def test_lt(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(instance < "test", False)

    def test_le(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(instance <= "test", True)

    def test_gt(self):
        instance = AnsibleVaultEncryptedUnicode("test")
        self.assertEqual(instance > "test", False)

if __name__ == '__main__':
    unittest.main()