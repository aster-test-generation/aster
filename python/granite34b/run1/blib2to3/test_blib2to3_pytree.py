from blib2to3.pytree import Node, Leaf


class TestPytree:
    def test_node_init(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        assert node.type == 1
        assert node.children == [Leaf(2, 'a'), Leaf(3, 'b')]

    def test_leaf_init(self):
        leaf = Leaf(1, 'a')
        assert leaf.type == 1
        assert leaf.value == 'a'

    def test_node_str(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        assert str(node) == '(1 (2 a) (3 b))'

    def test_leaf_str(self):
        leaf = Leaf(1, 'a')
        assert str(leaf) == '(1 a)'

    def test_node_repr(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        assert repr(node) == 'Node(1, [Leaf(2, "a"), Leaf(3, "b")])'

    def test_leaf_repr(self):
        leaf = Leaf(1, 'a')
        assert repr(leaf) == 'Leaf(1, "a")'

    def test_node_eq(self):
        node1 = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        node2 = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        assert node1 == node2

if __name__ == '__main__':
    unittest.main()