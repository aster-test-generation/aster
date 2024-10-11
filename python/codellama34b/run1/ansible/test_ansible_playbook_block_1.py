import unittest
from ansible.parsing.yaml.objects import AnsibleSequence, AnsibleUnicode, AnsibleVaultEncryptedUnicode


class TestBlock(unittest.TestCase):
    def test_init(self):
        instance = Block()
        self.assertEqual(instance._play, None)
        self.assertEqual(instance._role, None)
        self.assertEqual(instance._parent, None)
        self.assertEqual(instance._dep_chain, None)
        self.assertEqual(instance._use_handlers, False)
        self.assertEqual(instance._implicit, False)

    def test_repr(self):
        instance = Block()
        result = instance.__repr__()
        self.assertEqual(result, 'BLOCK(uuid=None)(id=None)(parent=None)')

    def test_eq(self):
        instance = Block()
        result = instance.__eq__(instance)
        self.assertEqual(result, True)

    def test_ne(self):
        instance = Block()
        result = instance.__ne__(instance)
        self.assertEqual(result, False)

    def test_get_vars(self):
        instance = Block()
        result = instance.get_vars()
        self.assertEqual(result, {})

    def test_load(self):
        instance = Block()
        result = instance.load(None)
        self.assertEqual(result, None)

    def test_is_block(self):
        instance = Block()
        result = instance.is_block(None)
        self.assertEqual(result, False)

    def test_preprocess_data(self):
        instance = Block()
        result = instance.preprocess_data(None)
        self.assertEqual(result, None)

    def test_load_block(self):
        instance = Block()
        result = instance._load_block(None, None)
        self.assertEqual(result, None)

    def test_load_rescue(self):
        instance = Block()
        result = instance._load_rescue(None, None)
        self.assertEqual(result, None)

    def test_load_always(self):
        instance = Block()
        result = instance._load_always(None, None)
        self.assertEqual(result, None)

    def test_validate_always(self):
        instance = Block()
        result = instance._validate_always(None, None, None)
        self.assertEqual(result, None)

    def test_get_dep_chain(self):
        instance = Block()
        result = instance.get_dep_chain()
        self.assertEqual(result, None)

    def test_copy(self):
        instance = Block()
        result = instance.copy()
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = Block()
        result = instance.serialize()
        self.assertEqual(result, None)

    def test_deserialize(self):
        instance = Block()
        result = instance.deserialize(None)
        self.assertEqual(result, None)

    def test_set_loader(self):
        instance = Block()
        result = instance.set_loader(None)
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()