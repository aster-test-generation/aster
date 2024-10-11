import unittest
from blib2to3.pytree import Base, Leaf


class TestBase(unittest.TestCase):
    def test_init(self):
        base = Base()
        self.assertEqual(base.children, [])
        self.assertEqual(base.parent, None)
        self.assertEqual(base.prefix, '')
        self.assertEqual(base.was_changed, False)

    def test_new(self):
        class CustomBase(Base):
            pass
        custom_base = CustomBase()
        self.assertEqual(custom_base.children, [])
        self.assertEqual(custom_base.parent, None)
        self.assertEqual(custom_base.prefix, '')
        self.assertEqual(custom_base.was_changed, False)

    def test_eq(self):
        base1 = Base()
        base2 = Base()
        self.assertEqual(base1, base2)

    def test_clone(self):
        base = Base()
        cloned_base = base.clone()
        self.assertEqual(cloned_base.children, [])
        self.assertEqual(cloned_base.parent, None)
        self.assertEqual(cloned_base.prefix, '')
        self.assertEqual(cloned_base.was_changed, False)

    def test_post_order(self):
        base = Base()
        self.assertEqual(list(base.post_order()), [])

    def test_pre_order(self):
        base = Base()
        self.assertEqual(list(base.pre_order()), [])

    def test_replace(self):
        base = Base()
        new_node = Leaf(0, 'new_node')
        base.replace(new_node)
        self.assertEqual(base.children, [new_node])
        self.assertEqual(new_node.parent, base)

    def test_get_lineno(self):
        leaf = Leaf(0, 'leaf', context=(None, (1, 2)))
        self.assertEqual(leaf.get_lineno(), 1)

    def test_changed(self):
        base = Base()
        base.changed()
        self.assertEqual(base.was_changed, True)

    def test_remove(self):
        base = Base()
        self.assertEqual(base.remove(), None)

    def test_next_sibling(self):
        base = Base()
        self.assertEqual(base.next_sibling, None)

    def test_prev_sibling(self):
        base = Base()
        self.assertEqual(base.prev_sibling, None)

    def test_leaves(self):
        base = Base()
        self.assertEqual(list(base.leaves()), [])

    def test_depth(self):
        base = Base()
        self.assertEqual(base.depth(), 0)

    def test_get_suffix(self):
        base = Base()
        self.assertEqual(base.get_suffix(), '')

class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(0, 'leaf', context=(None, (1, 2)))
        self.assertEqual(leaf.type, 0)
        self.assertEqual(leaf.value, 'leaf')
        self.assertEqual(leaf.prefix, '')
        self.assertEqual(leaf.lineno, 1)
        self.assertEqual(leaf.col_offset, 2)
        self.assertEqual(leaf.context, (None, (1, 2)))
        self.assertEqual(leaf.children, [])
        self.assertEqual(leaf.parent, None)
        self.assertEqual(leaf.was_changed, False)

    def test_clone(self):
        leaf = Leaf(0, 'leaf', context=(None, (1, 2)))
        cloned_leaf = leaf.clone()
        self.assertEqual(cloned_leaf.type, 0)
        self.assertEqual(cloned_leaf.value, 'leaf')
        self.assertEqual(cloned_leaf.prefix, '')
        self.assertEqual(cloned_leaf.lineno, 1)
        self.assertEqual(cloned_leaf.col_offset, 2)
        self.assertEqual(cloned_leaf.context, (None, (1, 2)))
        self.assertEqual(cloned_leaf.children, [])
        self.assertEqual(cloned_leaf.parent, None)
        self.assertEqual(cloned_leaf.was_changed, False)

if __name__ == '__main__':
    unittest.main()