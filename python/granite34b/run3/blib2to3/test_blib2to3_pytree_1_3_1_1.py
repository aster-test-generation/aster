import unittest
from blib2to3.pytree import Leaf


def test_leaf_init():
    leaf = Leaf(1, 'a')
    assert leaf.type == 1
    assert leaf.value == 'a'
    assert leaf.context is None
    assert leaf.prefix == ''
    assert leaf.fixers_applied == []
    assert leaf.children == []

def test_leaf_repr():
    leaf = Leaf(1, 'a')
    assert repr(leaf) == "Leaf(1, 'a')"

def test_leaf_str():
    leaf = Leaf(1, 'a')
    assert str(leaf) == 'a'

def test_leaf_eq():
    leaf1 = Leaf(1, 'a')
    leaf2 = Leaf(1, 'a')
    assert leaf1 == leaf2

def test_leaf_clone():
    leaf = Leaf(1, 'a')
    clone = leaf.clone()
    assert clone.type == 1
    assert clone.value == 'a'
    assert clone.context == ('', (1, 0))
    assert clone.prefix == ''
    assert clone.fixers_applied == []
    assert clone.children == []

def test_leaf_leaves():
    leaf = Leaf(1, 'a')
    leaves = list(leaf.leaves())
    assert len(leaves) == 1
    assert leaves[0] == leaf

def test_leaf_post_order():
    leaf = Leaf(1, 'a')
    post_order = list(leaf.post_order())
    assert len(post_order) == 1
    assert post_order[0] == leaf

def test_leaf_pre_order():
    leaf = Leaf(1, 'a')
    pre_order = list(leaf.pre_order())
    assert len(pre_order) == 1
    assert pre_order[0] == leaf

if __name__ == '__main__':
    unittest.main()