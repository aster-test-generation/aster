import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_preprocess_unsafe_encode(self):
        class UnsafeObject:
            __UNSAFE__ = True

        unsafe_object = UnsafeObject()
        encoded_object = AnsibleJSONEncoder()._preprocess_unsafe_encode(unsafe_object)
        self.assertEqual(encoded_object, {'__ansible_unsafe': str(unsafe_object)})

    def test_default_method(self):
        class VaultObject:
            __ENCRYPTED__ = True

        vault_object = VaultObject()
        encoded_object = AnsibleJSONEncoder().default(vault_object)
        self.assertEqual(encoded_object, {'__ansible_vault': vault_object._ciphertext})

    def test_iterencode_method(self):
        class UnsafeObject:
            __UNSAFE__ = True

        unsafe_object = UnsafeObject()
        encoded_object = AnsibleJSONEncoder(preprocess_unsafe=True).iterencode(unsafe_object)
        self.assertEqual(encoded_object, '{"__ansible_unsafe": "%s"}' % str(unsafe_object))

if __name__ == '__main__':
    unittest.main()