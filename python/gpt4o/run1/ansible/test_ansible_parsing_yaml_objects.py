import unittest
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping, AnsibleUnicode, AnsibleSequence, AnsibleVaultEncryptedUnicode
from ansible.module_utils.six import text_type
from ansible.module_utils._text import to_bytes, to_text, to_native


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

    def test_init(self):
        self.assertEqual(self.obj._ciphertext, b'encrypted')

    def test_data_getter(self):
        self.assertEqual(self.obj.data, 'decrypted')

    def test_data_setter(self):
        self.obj.data = 'new data'
        self.assertEqual(self.obj._ciphertext, b'new data')

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
        self.assertEqual(self.obj + 'test', 'decryptedtest')

    def test_radd(self):
        self.assertEqual('test' + self.obj, 'testdecrypted')

    def test_mul(self):
        self.assertEqual(self.obj * 2, 'decrypteddecrypted')

    def test_mod(self):
        self.assertEqual(self.obj % 'test', 'decrypted')

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
        self.assertEqual(self.obj.join(['a', 'b']), 'adecryptedb')

    def test_ljust(self):
        self.assertEqual(self.obj.ljust(20), 'decrypted           ')

    def test_lower(self):
        self.assertEqual(self.obj.lower(), 'decrypted')

    def test_lstrip(self):
        self.obj.data = '  decrypted'
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
        self.obj.data = 'decrypted  '
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
        self.assertTrue(self.obj.startswith('dec'))

    def test_strip(self):
        self.obj.data = '  decrypted  '
        self.assertEqual(self.obj.strip(), 'decrypted')

    def test_swapcase(self):
        self.obj.data = 'Decrypted'
        self.assertEqual(self.obj.swapcase(), 'dECYPTED')

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

class TestAnsibleVaultEncryptedUnicode(unittest.TestCase):
    def setUp(self):
        self.vault = type('Vault', (object,), {
            'encrypt': lambda self, seq, secret: to_bytes(seq[::-1]),
            'decrypt': lambda self, ciphertext, obj=None: to_text(ciphertext[::-1]),
            'is_encrypted': lambda self, ciphertext: True,
            'AnsibleVaultError': ValueError
        })()
        self.secret = "secret"
        self.ciphertext = to_bytes("encrypted")

    def test_from_plaintext(self):
        avu = AnsibleVaultEncryptedUnicode.from_plaintext("plaintext", self.vault, self.secret)
        self.assertEqual(avu.data, "plaintext")

    def test_from_plaintext_invalid_vault(self):
        with self.assertRaises(ValueError):
            AnsibleVaultEncryptedUnicode.from_plaintext("plaintext", None, self.secret)

    def test_init(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        self.assertEqual(avu._ciphertext, self.ciphertext)

    def test_data_property(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertEqual(avu.data, "detpyrcne")

    def test_data_setter(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.data = "newdata"
        self.assertEqual(avu._ciphertext, to_bytes("newdata"))

    def test_is_encrypted(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertTrue(avu.is_encrypted())

    def test_eq(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertTrue(avu == "detpyrcne")

    def test_ne(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertTrue(avu != "plaintext")

    def test_reversed(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertEqual(avu.__reversed__(), "encrypted")

    def test_str(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertEqual(str(avu), "detpyrcne")

    def test_unicode(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertEqual(avu.__unicode__(), "detpyrcne")

    def test_encode(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertEqual(avu.encode(), to_bytes("detpyrcne"))

    def test_repr(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertEqual(repr(avu), "'detpyrcne'")

    def test_int(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("123"))
        avu.vault = self.vault
        self.assertEqual(int(avu), 123)

    def test_float(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("123.45"))
        avu.vault = self.vault
        self.assertEqual(float(avu), 123.45)

    def test_complex(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("1+2j"))
        avu.vault = self.vault
        self.assertEqual(complex(avu), complex("1+2j"))

    def test_hash(self):
        avu = AnsibleVaultEncryptedUnicode(self.ciphertext)
        avu.vault = self.vault
        self.assertEqual(hash(avu), hash("detpyrcne"))

    def test_lt(self):
        avu1 = AnsibleVaultEncryptedUnicode(to_bytes("abc"))
        avu2 = AnsibleVaultEncryptedUnicode(to_bytes("def"))
        avu1.vault = self.vault
        avu2.vault = self.vault
        self.assertTrue(avu1 < avu2)

    def test_le(self):
        avu1 = AnsibleVaultEncryptedUnicode(to_bytes("abc"))
        avu2 = AnsibleVaultEncryptedUnicode(to_bytes("abc"))
        avu1.vault = self.vault
        avu2.vault = self.vault
        self.assertTrue(avu1 <= avu2)

    def test_gt(self):
        avu1 = AnsibleVaultEncryptedUnicode(to_bytes("def"))
        avu2 = AnsibleVaultEncryptedUnicode(to_bytes("abc"))
        avu1.vault = self.vault
        avu2.vault = self.vault
        self.assertTrue(avu1 > avu2)

    def test_ge(self):
        avu1 = AnsibleVaultEncryptedUnicode(to_bytes("def"))
        avu2 = AnsibleVaultEncryptedUnicode(to_bytes("def"))
        avu1.vault = self.vault
        avu2.vault = self.vault
        self.assertTrue(avu1 >= avu2)

    def test_contains(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("abcdef"))
        avu.vault = self.vault
        self.assertTrue("cde" in avu)

    def test_len(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("abcdef"))
        avu.vault = self.vault
        self.assertEqual(len(avu), 6)

    def test_getitem(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("abcdef"))
        avu.vault = self.vault
        self.assertEqual(avu[2], "c")

    def test_getslice(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("abcdef"))
        avu.vault = self.vault
        self.assertEqual(avu.__getslice__(1, 4), "bcd")

    def test_add(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("abc"))
        avu.vault = self.vault
        self.assertEqual(avu + "def", "abcdef")

    def test_radd(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("abc"))
        avu.vault = self.vault
        self.assertEqual("def" + avu, "defabc")

    def test_mul(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("abc"))
        avu.vault = self.vault
        self.assertEqual(avu * 3, "abcabcabc")

    def test_mod(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("Hello %s"))
        avu.vault = self.vault
        self.assertEqual(avu % "World", "Hello World")

    def test_rmod(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("World"))
        avu.vault = self.vault
        self.assertEqual("Hello %s" % avu, "Hello World")

    def test_capitalize(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertEqual(avu.capitalize(), "Hello")

    def test_casefold(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("HELLO"))
        avu.vault = self.vault
        self.assertEqual(avu.casefold(), "hello")

    def test_center(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertEqual(avu.center(10), "  hello   ")

    def test_count(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hellohello"))
        avu.vault = self.vault
        self.assertEqual(avu.count("l"), 4)

    def test_endswith(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertTrue(avu.endswith("lo"))

    def test_expandtabs(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello\tworld"))
        avu.vault = self.vault
        self.assertEqual(avu.expandtabs(), "hello   world")

    def test_find(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertEqual(avu.find("l"), 2)

    def test_format(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("Hello {}"))
        avu.vault = self.vault
        self.assertEqual(avu.format("World"), "Hello World")

    def test_format_map(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("Hello {name}"))
        avu.vault = self.vault
        self.assertEqual(avu.format_map({"name": "World"}), "Hello World")

    def test_index(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertEqual(avu.index("l"), 2)

    def test_isalpha(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertTrue(avu.isalpha())

    def test_isalnum(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello123"))
        avu.vault = self.vault
        self.assertTrue(avu.isalnum())

    def test_isascii(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertTrue(avu.isascii())

    def test_isdecimal(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("123"))
        avu.vault = self.vault
        self.assertTrue(avu.isdecimal())

    def test_isdigit(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("123"))
        avu.vault = self.vault
        self.assertTrue(avu.isdigit())

    def test_isidentifier(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertTrue(avu.isidentifier())

    def test_islower(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertTrue(avu.islower())

    def test_isnumeric(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("123"))
        avu.vault = self.vault
        self.assertTrue(avu.isnumeric())

    def test_isprintable(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertTrue(avu.isprintable())

    def test_isspace(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("   "))
        avu.vault = self.vault
        self.assertTrue(avu.isspace())

    def test_istitle(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("Hello World"))
        avu.vault = self.vault
        self.assertTrue(avu.istitle())

    def test_isupper(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("HELLO"))
        avu.vault = self.vault
        self.assertTrue(avu.isupper())

    def test_join(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes(" "))
        avu.vault = self.vault
        self.assertEqual(avu.join(["hello", "world"]), "hello world")

    def test_ljust(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello"))
        avu.vault = self.vault
        self.assertEqual(avu.ljust(10), "hello     ")

    def test_lower(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("HELLO"))
        avu.vault = self.vault
        self.assertEqual(avu.lower(), "hello")

    def test_lstrip(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("  hello"))
        avu.vault = self.vault
        self.assertEqual(avu.lstrip(), "hello")

    def test_partition(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello world"))
        avu.vault = self.vault
        self.assertEqual(avu.partition(" "), ("hello", " ", "world"))

    def test_replace(self):
        avu = AnsibleVaultEncryptedUnicode(to_bytes("hello world"))
        avu.vault = self.vault
        self.assertEqual(avu.replace("world", "there"), "hello there")

if __name__ == '__main__':
    unittest.main()