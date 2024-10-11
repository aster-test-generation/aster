import unittest
from ansible.playbook.block import Block


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
        data = {}
        play = None
        parent_block = None
        role = None
        task_include = None
        use_handlers = False
        variable_manager = None
        loader = None
        result = Block.load(data, play, parent_block, role, task_include, use_handlers, variable_manager, loader)
        self.assertEqual(result, None)

    def test_is_block(self):
        ds = {}
        result = Block.is_block(ds)
        self.assertEqual(result, False)

    def test_preprocess_data(self):
        ds = {}
        instance = Block()
        result = instance.preprocess_data(ds)
        self.assertEqual(result, {})

    def test_load_block(self):
        attr = 'block'
        ds = {}
        instance = Block()
        result = instance._load_block(attr, ds)
        self.assertEqual(result, None)

    def test_load_rescue(self):
        attr = 'rescue'
        ds = {}
        instance = Block()
        result = instance._load_rescue(attr, ds)
        self.assertEqual(result, None)

    def test_load_always(self):
        attr = 'always'
        ds = {}
        instance = Block()
        result = instance._load_always(attr, ds)
        self.assertEqual(result, None)

    def test_validate_always(self):
        attr = 'always'
        name = 'always'
        value = None
        instance = Block()
        result = instance._validate_always(attr, name, value)
        self.assertEqual(result, None)

    def test_get_dep_chain(self):
        instance = Block()
        result = instance.get_dep_chain()
        self.assertEqual(result, None)

    def test_copy(self):
        exclude_parent = False
        exclude_tasks = False
        instance = Block()
        result = instance.copy(exclude_parent, exclude_tasks)
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = Block()
        result = instance.serialize()
        self.assertEqual(result, {})

    def test_deserialize(self):
        data = {}
        instance = Block()
        result = instance.deserialize(data)
        self.assertEqual(result, None)

    def test_set_loader(self):
        loader = None
        instance = Block()
        result = instance.set_loader(loader)
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()