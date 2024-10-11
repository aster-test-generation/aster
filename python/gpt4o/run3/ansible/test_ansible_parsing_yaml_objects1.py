import unittest
from ansible.parsing.yaml.objects import *

class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_get_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj._data_source = "source"
        obj._line_number = 10
        obj._column_number = 20
        self.assertEqual(obj._get_ansible_position(), ("source", 10, 20))

    def test_set_ansible_position_valid(self):
        obj = AnsibleBaseYAMLObject()
        obj._set_ansible_position(("source", 10, 20))
        self.assertEqual(obj._get_ansible_position(), ("source", 10, 20))

    def test_set_ansible_position_invalid(self):
        obj = AnsibleBaseYAMLObject()
        with self.assertRaises(AssertionError):
            obj._set_ansible_position(("source", 10))

class TestAnsibleVaultEncryptedUnicode(unittest.TestCase):
    def setUp(self):
        self.vault = type('Vault', (object,), {
            'encrypt': lambda self, seq, secret: b'encrypted_' + seq.encode(),
            'decrypt': lambda self, ciphertext, obj=None: ciphertext.replace(b'encrypted_', b'').decode(),
            'is_encrypted': lambda self, ciphertext: b'encrypted_' in ciphertext,
            'AnsibleVaultError': Exception
        })()
        self.secret = 'secret'
        self.ciphertext = 'encrypted_text'
        self.avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        self.avu.vault = self.vault

    def test_from_plaintext(self):
        avu = AnsibleVaultEncryptedUnicode.from_plaintext('plaintext', self.vault, self.secret)
        self.assertEqual(avu.data, 'plaintext')

    def test_data_property_get(self):
        self.assertEqual(self.avu.data, 'text')

    def test_data_property_set(self):
        self.avu.data = 'new_text'
        self.assertEqual(self.avu.data, 'new_text')

    def test_is_encrypted(self):
        self.assertTrue(self.avu.is_encrypted())

    def test_eq(self):
        self.assertTrue(self.avu == 'text')

    def test_ne(self):
        self.assertTrue(self.avu != 'other_text')

    def test_reversed(self):
        self.assertEqual(self.avu.__reversed__(), 'txet')

    def test_str(self):
        self.assertEqual(str(self.avu), 'text')

    def test_unicode(self):
        self.assertEqual(self.avu.__unicode__(), 'text')

    def test_encode(self):
        self.assertEqual(self.avu.encode(), b'text')

    def test_repr(self):
        self.assertEqual(repr(self.avu), "'text'")

    def test_int(self):
        avu = AnsibleVaultEncryptedUnicode('123')
        avu.vault = self.vault
        self.assertEqual(int(avu), 123)

    def test_float(self):
        avu = AnsibleVaultEncryptedUnicode('123.45')
        avu.vault = self.vault
        self.assertEqual(float(avu), 123.45)

    def test_complex(self):
        avu = AnsibleVaultEncryptedUnicode('1+2j')
        avu.vault = self.vault
        self.assertEqual(complex(avu), complex(1, 2))

    def test_hash(self):
        self.assertEqual(hash(self.avu), hash('text'))

    def test_lt(self):
        self.assertTrue(self.avu < 'ztext')

    def test_le(self):
        self.assertTrue(self.avu <= 'text')

    def test_gt(self):
        self.assertTrue(self.avu > 'atext')

    def test_ge(self):
        self.assertTrue(self.avu >= 'text')

    def test_contains(self):
        self.assertTrue('t' in self.avu)

    def test_len(self):
        self.assertEqual(len(self.avu), 4)

    def test_getitem(self):
        self.assertEqual(self.avu[1], 'e')

    def test_getslice(self):
        self.assertEqual(self.avu.__getslice__(1, 3), 'ex')

    def test_add(self):
        self.assertEqual(self.avu + '123', 'text123')

    def test_radd(self):
        self.assertEqual('123' + self.avu, '123text')

    def test_mul(self):
        self.assertEqual(self.avu * 2, 'texttext')

    def test_mod(self):
        self.assertEqual(self.avu % 'text', 'text')

    def test_rmod(self):
        self.assertEqual('%s' % self.avu, 'text')

    def test_capitalize(self):
        self.assertEqual(self.avu.capitalize(), 'Text')

    def test_casefold(self):
        self.assertEqual(self.avu.casefold(), 'text')

    def test_center(self):
        self.assertEqual(self.avu.center(10), '   text   ')

    def test_count(self):
        self.assertEqual(self.avu.count('t'), 2)

    def test_endswith(self):
        self.assertTrue(self.avu.endswith('text'))

    def test_expandtabs(self):
        avu = AnsibleVaultEncryptedUnicode('text\ttext')
        avu.vault = self.vault
        self.assertEqual(avu.expandtabs(), 'text    text')

    def test_find(self):
        self.assertEqual(self.avu.find('t'), 0)

    def test_format(self):
        avu = AnsibleVaultEncryptedUnicode('Hello {}')
        avu.vault = self.vault
        self.assertEqual(avu.format('World'), 'Hello World')

    def test_format_map(self):
        avu = AnsibleVaultEncryptedUnicode('Hello {name}')
        avu.vault = self.vault
        self.assertEqual(avu.format_map({'name': 'World'}), 'Hello World')

    def test_index(self):
        self.assertEqual(self.avu.index('t'), 0)

    def test_isalpha(self):
        self.assertFalse(self.avu.isalpha())

    def test_isalnum(self):
        self.assertFalse(self.avu.isalnum())

    def test_isascii(self):
        self.assertTrue(self.avu.isascii())

    def test_isdecimal(self):
        self.assertFalse(self.avu.isdecimal())

    def test_isdigit(self):
        self.assertFalse(self.avu.isdigit())

    def test_isidentifier(self):
        self.assertFalse(self.avu.isidentifier())

    def test_islower(self):
        self.assertTrue(self.avu.islower())

    def test_isnumeric(self):
        self.assertFalse(self.avu.isnumeric())

    def test_isprintable(self):
        self.assertTrue(self.avu.isprintable())

    def test_isspace(self):
        self.assertFalse(self.avu.isspace())

    def test_istitle(self):
        self.assertFalse(self.avu.istitle())

    def test_isupper(self):
        self.assertFalse(self.avu.isupper())

    def test_join(self):
        self.assertEqual(self.avu.join(['a', 'b']), 'atextb')

    def test_ljust(self):
        self.assertEqual(self.avu.ljust(10), 'text      ')

    def test_lower(self):
        self.assertEqual(self.avu.lower(), 'text')

    def test_lstrip(self):
        avu = AnsibleVaultEncryptedUnicode('  text')
        avu.vault = self.vault
        self.assertEqual(avu.lstrip(), 'text')

    def test_partition(self):
        self.assertEqual(self.avu.partition('e'), ('t', 'e', 'xt'))

    def test_replace(self):
        self.assertEqual(self.avu.replace('t', 'T'), 'TexT')

    def test_rfind(self):
        self.assertEqual(self.avu.rfind('t'), 3)

    def test_rindex(self):
        self.assertEqual(self.avu.rindex('t'), 3)

    def test_rjust(self):
        self.assertEqual(self.avu.rjust(10), '      text')

    def test_rpartition(self):
        self.assertEqual(self.avu.rpartition('e'), ('t', 'e', 'xt'))

    def test_rstrip(self):
        avu = AnsibleVaultEncryptedUnicode('text  ')
        avu.vault = self.vault
        self.assertEqual(avu.rstrip(), 'text')

    def test_split(self):
        avu = AnsibleVaultEncryptedUnicode('text text')
        avu.vault = self.vault
        self.assertEqual(avu.split(), ['text', 'text'])

    def test_rsplit(self):
        avu = AnsibleVaultEncryptedUnicode('text text')
        avu.vault = self.vault
        self.assertEqual(avu.rsplit(), ['text', 'text'])

    def test_splitlines(self):
        avu = AnsibleVaultEncryptedUnicode('text\ntext')
        avu.vault = self.vault
        self.assertEqual(avu.splitlines(), ['text', 'text'])

    def test_startswith(self):
        self.assertTrue(self.avu.startswith('text'))

    def test_strip(self):
        avu = AnsibleVaultEncryptedUnicode('  text  ')
        avu.vault = self.vault
        self.assertEqual(avu.strip(), 'text')

    def test_swapcase(self):
        avu = AnsibleVaultEncryptedUnicode('Text')
        avu.vault = self.vault
        self.assertEqual(avu.swapcase(), 'tEXT')

    def test_title(self):
        avu = AnsibleVaultEncryptedUnicode('text text')
        avu.vault = self.vault
        self.assertEqual(avu.title(), 'Text Text')

    def test_translate(self):
        avu = AnsibleVaultEncryptedUnicode('text')
        avu.vault = self.vault
        self.assertEqual(avu.translate(str.maketrans('t', 'T')), 'TexT')

    def test_upper(self):
        self.assertEqual(self.avu.upper(), 'TEXT')

    def test_zfill(self):
        self.assertEqual(self.avu.zfill(10), '000000text')

if __name__ == '__main__':
    unittest.main()