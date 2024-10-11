from typesystem.formats import ValidationError
import uuid
import datetime
import unittest
from typesystem.formats import BaseFormat, DateFormat, TimeFormat, DateTimeFormat, UUIDFormat


class TestBaseFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = BaseFormat()
        self.assertFalse(format.is_native_type(None))
        self.assertFalse(format.is_native_type(1))
        self.assertFalse(format.is_native_type("foo"))
        self.assertFalse(format.is_native_type([1, 2, 3]))
        self.assertFalse(format.is_native_type({"a": 1, "b": 2}))
        self.assertTrue(format.is_native_type(datetime.date.today()))
        self.assertTrue(format.is_native_type(datetime.time()))
        self.assertTrue(format.is_native_type(datetime.datetime.now()))
        self.assertTrue(format.is_native_type(uuid.uuid4()))

    def test_validate(self):
        format = BaseFormat()
        with self.assertRaises(ValidationError):
            format.validate(None)
        with self.assertRaises(ValidationError):
            format.validate(1)
        with self.assertRaises(ValidationError):
            format.validate("foo")
        with self.assertRaises(ValidationError):
            format.validate([1, 2, 3])
        with self.assertRaises(ValidationError):
            format.validate({"a": 1, "b": 2})

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateFormat()
        self.assertFalse(format.is_native_type(None))
        self.assertFalse(format.is_native_type(1))
        self.assertFalse(format.is_native_type("foo"))
        self.assertFalse(format.is_native_type([1, 2, 3]))
        self.assertFalse(format.is_native_type({"a": 1, "b": 2}))
        self.assertTrue(format.is_native_type(datetime.date.today()))
        self.assertFalse(format.is_native_type(datetime.time()))
        self.assertFalse(format.is_native_type(datetime.datetime.now()))
        self.assertFalse(format.is_native_type(uuid.uuid4()))

    def test_validate(self):
        format = DateFormat()
        with self.assertRaises(ValidationError):
            format.validate(None)
        with self.assertRaises(ValidationError):
            format.validate(1)
        with self.assertRaises(ValidationError):
            format.validate("foo")
        with self.assertRaises(ValidationError):
            format.validate([1, 2, 3])
        with self.assertRaises(ValidationError):
            format.validate({"a": 1, "b": 2})
        with self.assertRaises(ValidationError):
            format.validate(datetime.time())
        with self.assertRaises(ValidationError):
            format.validate(datetime.datetime.now())
        with self.assertRaises(ValidationError):
            format.validate(uuid.uuid4())
        self.assertEqual(format.validate("2023-01-01"), datetime.date(2023, 1, 1))

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = TimeFormat()
        self.assertFalse(format.is_native_type(None))
        self.assertFalse(format.is_native_type(1))
        self.assertFalse(format.is_native_type("foo"))
        self.assertFalse(format.is_native_type([1, 2, 3]))
        self.assertFalse(format.is_native_type({"a": 1, "b": 2}))
        self.assertFalse(format.is_native_type(datetime.date.today()))
        self.assertTrue(format.is_native_type(datetime.time()))
        self.assertFalse(format.is_native_type(datetime.datetime.now()))
        self.assertFalse(format.is_native_type(uuid.uuid4()))

if __name__ == '__main__':
    unittest.main()