import unittest
from ansible.template.native_helpers import *


class TestNativeHelpers(unittest.TestCase):
    def test_ansible_native_concat(self):
        nodes = [1, 2, 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 123)

    def test_ansible_native_concat_with_generator(self):
        nodes = (i for i in range(1, 4))
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 123)

    def test_ansible_native_concat_with_unicode(self):
        nodes = [u'1', u'2', u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'123')

    def test_ansible_native_concat_with_vault_encrypted_unicode(self):
        nodes = [AnsibleVaultEncryptedUnicode(u'1'), u'2', u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'123')

    def test_ansible_native_concat_with_native_jinja_text(self):
        nodes = [NativeJinjaText(u'1'), u'2', u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'123')

    def test_ansible_native_concat_with_undefined(self):
        nodes = [StrictUndefined(), u'2', u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'23')

    def test_ansible_native_concat_with_undefined_and_vault_encrypted_unicode(self):
        nodes = [StrictUndefined(), AnsibleVaultEncryptedUnicode(u'2'), u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'23')

    def test_ansible_native_concat_with_undefined_and_native_jinja_text(self):
        nodes = [StrictUndefined(), NativeJinjaText(u'2'), u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'23')

    def test_ansible_native_concat_with_undefined_and_generator(self):
        nodes = [StrictUndefined(), (i for i in range(1, 4))]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 123)

    def test_ansible_native_concat_with_undefined_and_unicode(self):
        nodes = [StrictUndefined(), u'2', u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'23')

    def test_ansible_native_concat_with_undefined_and_vault_encrypted_unicode(self):
        nodes = [StrictUndefined(), AnsibleVaultEncryptedUnicode(u'2'), u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'23')

    def test_ansible_native_concat_with_undefined_and_native_jinja_text(self):
        nodes = [StrictUndefined(), NativeJinjaText(u'2'), u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'23')

    def test_ansible_native_concat_with_undefined_and_generator(self):
        nodes = [StrictUndefined(), (i for i in range(1, 4))]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 123)

    def test_ansible_native_concat_with_undefined_and_unicode(self):
        nodes = [StrictUndefined(), u'2', u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'23')

    def test_ansible_native_concat_with_undefined_and_vault_encrypted_unicode(self):
        nodes = [StrictUndefined(), AnsibleVaultEncryptedUnicode(u'2'), u'3']
        result = ansible_native_concat(nodes)
        self.assertEqual(result, u'23')

if __name__ == '__main__':
    unittest.main()