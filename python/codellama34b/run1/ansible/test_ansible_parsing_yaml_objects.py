import unittest
from ansible.parsing.yaml.objects import AnsibleSequence, AnsibleUnicode



class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_ansible_pos(self):
        instance = AnsibleBaseYAMLObject()
        instance._set_ansible_position(('source', 1, 2))
        result = instance._get_ansible_position()
        self.assertEqual(result, ('source', 1, 2))

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
        instance = AnsibleVaultEncryptedUnicode.from_plaintext('plaintext', 'vault', 'secret')
        self.assertIsInstance(instance, AnsibleVaultEncryptedUnicode)

    def test_init(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        self.assertIsInstance(instance, AnsibleVaultEncryptedUnicode)

    def test_data(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = instance.data
        self.assertIsInstance(result, text_type)

    def test_is_encrypted(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = instance.is_encrypted()
        self.assertIsInstance(result, bool)

    def test_eq(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = instance == 'string'
        self.assertIsInstance(result, bool)

    def test_ne(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = instance != 'string'
        self.assertIsInstance(result, bool)

    def test_reversed(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = reversed(instance)
        self.assertIsInstance(result, str)

    def test_str(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = str(instance)
        self.assertIsInstance(result, str)

    def test_unicode(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = unicode(instance)
        self.assertIsInstance(result, text_type)

    def test_encode(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = instance.encode('encoding', 'errors')
        self.assertIsInstance(result, bytes)

    def test_repr(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test_int(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = int(instance)
        self.assertIsInstance(result, int)

    def test_float(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = float(instance)
        self.assertIsInstance(result, float)

    def test_complex(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = complex(instance)
        self.assertIsInstance(result, complex)

    def test_hash(self):
        instance = AnsibleVaultEncryptedUnicode('ciphertext')
        result = hash(instance)
        self.assertIsInstance(result, int)

if __name__ == '__main__':
    unittest.main()