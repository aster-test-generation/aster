import unittest
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping, AnsibleUnicode, AnsibleSequence, AnsibleVaultEncryptedUnicode
from ansible.module_utils.six import text_type

class TestAnsibleBaseYAMLObject(unittest.TestCase):
    def test_get_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj._data_source = "source"
        obj._line_number = 10
        obj._column_number = 20
        self.assertEqual(obj._get_ansible_position(), ("source", 10, 20))

    def test_set_ansible_position(self):
        obj = AnsibleBaseYAMLObject()
        obj._set_ansible_position(("source", 10, 20))
        self.assertEqual(obj._get_ansible_position(), ("source", 10, 20))

    def test_set_ansible_position_invalid(self):
        obj = AnsibleBaseYAMLObject()
        with self.assertRaises(AssertionError):
            obj._set_ansible_position(("source", 10))

class TestAnsibleMapping(unittest.TestCase):
    def test_ansible_mapping(self):
        obj = AnsibleMapping()
        self.assertIsInstance(obj, dict)

class TestAnsibleUnicode(unittest.TestCase):
    def test_ansible_unicode(self):
        obj = AnsibleUnicode("test")
        self.assertIsInstance(obj, text_type)

class TestAnsibleSequence(unittest.TestCase):
    def test_ansible_sequence(self):
        obj = AnsibleSequence()
        self.assertIsInstance(obj, list)

class TestAnsibleVaultEncryptedUnicode(unittest.TestCase):
    def setUp(self):
        self.vault = type('Vault', (object,), {
            'encrypt': lambda self, seq, secret: b'encrypted',
            'decrypt': lambda self, ciphertext, obj=None: 'decrypted',
            'is_encrypted': lambda self, ciphertext: True,
            'AnsibleVaultError': Exception
        })()
        self.secret = 'secret'
        self.ciphertext = b'encrypted'
        self.obj = AnsibleVaultEncryptedUnicode(self.ciphertext)
        self.obj.vault = self.vault

    def test_from_plaintext(self):
        avu = AnsibleVaultEncryptedUnicode.from_plaintext('plaintext', self.vault, self.secret)
        self.assertEqual(avu.data, 'decrypted')

    def test_from_plaintext_no_vault(self):
        with self.assertRaises(self.vault.AnsibleVaultError):
            AnsibleVaultEncryptedUnicode.from_plaintext('plaintext', None, self.secret)

    def test_data_property(self):
        self.assertEqual(self.obj.data, 'decrypted')

    def test_data_setter(self):
        self.obj.data = 'new data'
        self.assertEqual(self.obj.data, 'new data')

    def test_is_encrypted(self):
        self.assertTrue(self.obj.is_encrypted())

    def test_eq(self):
        self.assertTrue(self.obj == 'decrypted')

    def test_ne(self):
        self.assertTrue(self.obj != 'not decrypted')

    def test_reversed(self):
        self.assertEqual(self.obj.__reversed__(), 'detpyrcne')

    def test_str(self):
        self.assertEqual(str(self.obj), 'decrypted')

    def test_unicode(self):
        self.assertEqual(self.obj.__unicode__(), 'decrypted')

    def test_encode(self):
        self.assertEqual(self.obj.encode(), b'decrypted')

    def test_repr(self):
        self.assertEqual(repr(self.obj), "'decrypted'")

    def test_int(self):
        self.obj.data = '123'
        self.assertEqual(int(self.obj), 123)

    def test_float(self):
        self.obj.data = '123.45'
        self.assertEqual(float(self.obj), 123.45)

    def test_complex(self):
        self.obj.data = '1+2j'
        self.assertEqual(complex(self.obj), complex('1+2j'))

    def test_hash(self):
        self.assertEqual(hash(self.obj), hash('decrypted'))

    def test_lt(self):
        self.assertTrue(self.obj < 'z')

    def test_le(self):
        self.assertTrue(self.obj <= 'decrypted')

    def test_gt(self):
        self.assertTrue(self.obj > 'a')

    def test_ge(self):
        self.assertTrue(self.obj >= 'decrypted')

    def test_contains(self):
        self.assertTrue('crypt' in self.obj)

    def test_len(self):
        self.assertEqual(len(self.obj), len('decrypted'))

    def test_getitem(self):
        self.assertEqual(self.obj[0], 'd')

    def test_getslice(self):
        self.assertEqual(self.obj.__getslice__(0, 3), 'dec')

    def test_add(self):
        self.assertEqual(self.obj + ' added', 'decrypted added')

    def test_radd(self):
        self.assertEqual('added ' + self.obj, 'added decrypted')

    def test_mul(self):
        self.assertEqual(self.obj * 2, 'decrypteddecrypted')

    def test_mod(self):
        self.assertEqual(self.obj % 'crypted', 'decrypted')

    def test_rmod(self):
        self.assertEqual('%s' % self.obj, 'decrypted')

    def test_capitalize(self):
        self.assertEqual(self.obj.capitalize(), 'Decrypted')

    def test_casefold(self):
        self.assertEqual(self.obj.casefold(), 'decrypted')

    def test_center(self):
        self.assertEqual(self.obj.center(20), '    decrypted     ')

    def test_count(self):
        self.assertEqual(self.obj.count('e'), 3)

    def test_endswith(self):
        self.assertTrue(self.obj.endswith('ted'))

    def test_expandtabs(self):
        self.obj.data = 'de\tcrypted'
        self.assertEqual(self.obj.expandtabs(), 'de      crypted')

    def test_find(self):
        self.assertEqual(self.obj.find('crypt'), 2)

    def test_format(self):
        self.obj.data = 'Hello {}'
        self.assertEqual(self.obj.format('World'), 'Hello World')

    def test_format_map(self):
        self.obj.data = 'Hello {name}'
        self.assertEqual(self.obj.format_map({'name': 'World'}), 'Hello World')

    def test_index(self):
        self.assertEqual(self.obj.index('crypt'), 2)

    def test_isalpha(self):
        self.assertFalse(self.obj.isalpha())

    def test_isalnum(self):
        self.assertFalse(self.obj.isalnum())

    def test_isascii(self):
        self.assertTrue(self.obj.isascii())

    def test_isdecimal(self):
        self.assertFalse(self.obj.isdecimal())

    def test_isdigit(self):
        self.assertFalse(self.obj.isdigit())

    def test_isidentifier(self):
        self.assertFalse(self.obj.isidentifier())

    def test_islower(self):
        self.assertTrue(self.obj.islower())

    def test_isnumeric(self):
        self.assertFalse(self.obj.isnumeric())

    def test_isprintable(self):
        self.assertTrue(self.obj.isprintable())

    def test_isspace(self):
        self.assertFalse(self.obj.isspace())

    def test_istitle(self):
        self.assertFalse(self.obj.istitle())

    def test_isupper(self):
        self.assertFalse(self.obj.isupper())

    def test_join(self):
        self.assertEqual(self.obj.join(['a', 'b', 'c']), 'adecryptedbdecryptedc')

    def test_ljust(self):
        self.assertEqual(self.obj.ljust(20), 'decrypted           ')

    def test_lower(self):
        self.assertEqual(self.obj.lower(), 'decrypted')

    def test_lstrip(self):
        self.obj.data = '   decrypted'
        self.assertEqual(self.obj.lstrip(), 'decrypted')

    def test_partition(self):
        self.assertEqual(self.obj.partition('crypt'), ('de', 'crypt', 'ed'))

    def test_replace(self):
        self.assertEqual(self.obj.replace('crypt', 'CRYPT'), 'deCRYPTed')

    def test_rfind(self):
        self.assertEqual(self.obj.rfind('crypt'), 2)

    def test_rindex(self):
        self.assertEqual(self.obj.rindex('crypt'), 2)

    def test_rjust(self):
        self.assertEqual(self.obj.rjust(20), '           decrypted')

    def test_rpartition(self):
        self.assertEqual(self.obj.rpartition('crypt'), ('de', 'crypt', 'ed'))

    def test_rstrip(self):
        self.obj.data = 'decrypted   '
        self.assertEqual(self.obj.rstrip(), 'decrypted')

    def test_split(self):
        self.obj.data = 'decrypted data'
        self.assertEqual(self.obj.split(), ['decrypted', 'data'])

    def test_rsplit(self):
        self.obj.data = 'decrypted data'
        self.assertEqual(self.obj.rsplit(), ['decrypted', 'data'])

    def test_splitlines(self):
        self.obj.data = 'decrypted\ndata'
        self.assertEqual(self.obj.splitlines(), ['decrypted', 'data'])

    def test_startswith(self):
        self.assertTrue(self.obj.startswith('de'))

    def test_strip(self):
        self.obj.data = '   decrypted   '
        self.assertEqual(self.obj.strip(), 'decrypted')

    def test_swapcase(self):
        self.obj.data = 'DeCrYpTeD'
        self.assertEqual(self.obj.swapcase(), 'dEcRyPtEd')

    def test_title(self):
        self.obj.data = 'decrypted data'
        self.assertEqual(self.obj.title(), 'Decrypted Data')

    def test_translate(self):
        self.obj.data = 'decrypted'
        self.assertEqual(self.obj.translate(str.maketrans('d', 'D')), 'DecrypteD')

    def test_upper(self):
        self.assertEqual(self.obj.upper(), 'DECRYPTED')

    def test_zfill(self):
        self.assertEqual(self.obj.zfill(20), '0000000000decrypted')

if __name__ == '__main__':
    unittest.main()