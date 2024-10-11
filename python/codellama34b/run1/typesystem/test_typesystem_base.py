import unittest
from typesystem.base import *



class TestPosition(unittest.TestCase):
    def test_init(self):
        instance = Position(1, 2, 3)
        self.assertEqual(instance.line_no, 1)
        self.assertEqual(instance.column_no, 2)
        self.assertEqual(instance.char_index, 3)

    def test_eq(self):
        instance = Position(1, 2, 3)
        other = Position(1, 2, 3)
        result = instance.__eq__(other)
        self.assertTrue(result)

    def test_repr(self):
        instance = Position(1, 2, 3)
        result = instance.__repr__()
        self.assertEqual(result, "Position(line_no=1, column_no=2, char_index=3)")

class TestMessage(unittest.TestCase):
    def test_init(self):
        instance = Message(text="test", code="test", key="test", index=["test"], position=Position(1, 2, 3), start_position=Position(1, 2, 3), end_position=Position(1, 2, 3))
        self.assertEqual(instance.text, "test")
        self.assertEqual(instance.code, "test")
        self.assertEqual(instance.index, ["test"])
        self.assertEqual(instance.start_position, Position(1, 2, 3))
        self.assertEqual(instance.end_position, Position(1, 2, 3))

    def test_eq(self):
        instance = Message(text="test", code="test", key="test", index=["test"], position=Position(1, 2, 3), start_position=Position(1, 2, 3), end_position=Position(1, 2, 3))
        other = Message(text="test", code="test", key="test", index=["test"], position=Position(1, 2, 3), start_position=Position(1, 2, 3), end_position=Position(1, 2, 3))
        result = instance.__eq__(other)
        self.assertTrue(result)

    def test_hash(self):
        instance = Message(text="test", code="test", key="test", index=["test"], position=Position(1, 2, 3), start_position=Position(1, 2, 3), end_position=Position(1, 2, 3))
        result = instance.__hash__()
        self.assertEqual(result, hash(("test", ("test",))))

    def test_repr(self):
        instance = Message(text="test", code="test", key="test", index=["test"], position=Position(1, 2, 3), start_position=Position(1, 2, 3), end_position=Position(1, 2, 3))
        result = instance.__repr__()
        self.assertEqual(result, "Message(text='test', code='test', index=['test'], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3), messages=[Message(text="test", code="test", key="test", index=["test"], position=Position(1, 2, 3), start_position=Position(1, 2, 3), end_position=Position(1, 2, 3))])
        self.assertEqual(instance._messages, [Message(text="test", code="test", key="test", index=["test"], position=Position(1, 2, 3), start_position=Position(1, 2, 3), end_position=Position(1, 2, 3))])
        self.assertEqual(instance._message_dict, {})

class TestPosition(unittest.TestCase):
    def test_init(self):
        instance = Position(1, 2, 3)
        self.assertEqual(instance.line_no, 1)
        self.assertEqual(instance.column_no, 2)
        self.assertEqual(instance.char_index, 3)

    def test_eq(self):
        instance = Position(1, 2, 3)
        self.assertEqual(instance, Position(1, 2, 3))

    def test_repr(self):
        instance = Position(1, 2, 3)
        self.assertEqual(repr(instance), "Position(line_no=1, column_no=2, char_index=3)")

class TestMessage(unittest.TestCase):
    def test_init(self):
        instance = Message(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(instance.text, "test")
        self.assertEqual(instance.code, "test")
        self.assertEqual(instance.index, ["test"])
        self.assertEqual(instance.start_position, Position(1, 2, 3))
        self.assertEqual(instance.end_position, Position(1, 2, 3))

    def test_eq(self):
        instance = Message(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(instance, Message(text="test", code="test", key="test", position=Position(1, 2, 3)))

    def test_hash(self):
        instance = Message(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(hash(instance), hash(("test", ("test",))))

    def test_repr(self):
        instance = Message(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(repr(instance), "Message(text='test', code='test', index=['test'], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(instance._messages, [Message(text="test", code="test", key="test", position=Position(1, 2, 3))])

    def test_messages(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(instance.messages(), [Message(text="test", code="test", key="test", position=Position(1, 2, 3))])

    def test_iter(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(list(instance), [Message(text="test", code="test", key="test", position=Position(1, 2, 3))])

    def test_len(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(len(instance), 1)

    def test_getitem(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(instance[0], Message(text="test", code="test", key="test", position=Position(1, 2, 3)))

class TestPosition(unittest.TestCase):
    def test_init(self):
        instance = Position(line_no=1, column_no=2, char_index=3)
        self.assertEqual(instance.line_no, 1)
        self.assertEqual(instance.column_no, 2)
        self.assertEqual(instance.char_index, 3)

    def test_eq(self):
        instance = Position(line_no=1, column_no=2, char_index=3)
        self.assertEqual(instance, Position(line_no=1, column_no=2, char_index=3))

    def test_repr(self):
        instance = Position(line_no=1, column_no=2, char_index=3)
        self.assertEqual(repr(instance), "Position(line_no=1, column_no=2, char_index=3)")

class TestMessage(unittest.TestCase):
    def test_init(self):
        instance = Message(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(instance.text, "test")
        self.assertEqual(instance.code, "test")
        self.assertEqual(instance.index, ["test"])
        self.assertEqual(instance.start_position, Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(instance.end_position, Position(line_no=1, column_no=2, char_index=3))

    def test_eq(self):
        instance = Message(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(instance, Message(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3)))

    def test_hash(self):
        instance = Message(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(hash(instance), hash(("test", ("test",))))

    def test_repr(self):
        instance = Message(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(repr(instance), "Message(text='test', code='test', index=['test'], position=Position(line_no=1, column_no=2, char_index=3))")

class TestBaseError(unittest.TestCase):
    def test_init(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(instance._messages, [Message(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3))])

    def test_messages(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(instance.messages(), [Message(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3))])

    def test_eq(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3))
        self.assertEqual(instance, BaseError(text="test", code="test", key="test", position=Position(line_no=1, column_no=2, char_index=3)))

class TestBaseError(unittest.TestCase):
    def test_init(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(instance._messages, [Message(text="test", code="test", key="test", position=Position(1, 2, 3))])

    def test_messages(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(instance.messages(), [Message(text="test", code="test", key="test", position=Position(1, 2, 3))])

    def test_eq(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(instance, BaseError(text="test", code="test", key="test", position=Position(1, 2, 3)))

    def test_hash(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(hash(instance), hash((Message(text="test", code="test", key="test", position=Position(1, 2, 3)),)))

    def test_repr(self):
        instance = BaseError(text="test", code="test", key="test", position=Position(1, 2, 3))
        self.assertEqual(repr(instance), "BaseError(text='test', code='test', index=['test'], position=Position(line_no=1, column_no=2, char_index=3))")

if __name__ == '__main__':
    unittest.main()