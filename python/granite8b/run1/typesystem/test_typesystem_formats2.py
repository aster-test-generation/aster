import unittest
from typesystem.formats import *

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        self.assertTrue(DateFormat().is_native_type(datetime.date.today()))
        self.assertFalse(DateFormat().is_native_type("2023-01-01"))

    def test_validate(self):
        self.assertEqual(DateFormat().validate("2023-01-01"), datetime.date(2023, 1, 1))
        with self.assertRaises(ValidationError):
            DateFormat().validate("2023-01-01T00:00:00")

    def test_serialize(self):
        self.assertEqual(DateFormat().serialize(datetime.date(2023, 1, 1)), "2023-01-01")
        self.assertIsNone(DateFormat().serialize(None))

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        self.assertTrue(TimeFormat().is_native_type(datetime.time.min))
        self.assertFalse(TimeFormat().is_native_type("00:00:00"))

    def test_validate(self):
        self.assertEqual(TimeFormat().validate("00:00:00"), datetime.time(0, 0, 0))
        with self.assertRaises(ValidationError):
            TimeFormat().validate("2023-01-01T00:00:00")

    def test_serialize(self):
        self.assertEqual(TimeFormat().serialize(datetime.time(0, 0, 0)), "00:00:00")
        self.assertIsNone(TimeFormat().serialize(None))

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        self.assertTrue(DateTimeFormat().is_native_type(datetime.datetime.now()))
        self.assertFalse(DateTimeFormat().is_native_type("2023-01-01T00:00:00"))

    def test_validate(self):
        self.assertEqual(DateTimeFormat().validate("2023-01-01T00:00:00"), datetime.datetime(2023, 1, 1, 0, 0, 0))
        with self.assertRaises(ValidationError):
            DateTimeFormat().validate("2023-01-01T00:00:00Z")

    def test_serialize(self):
        self.assertEqual(DateTimeFormat().serialize(datetime.datetime(2023, 1, 1, 0, 0, 0)), "2023-01-01T00:00:00")
        self.assertIsNone(DateTimeFormat().serialize(None))

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        self.assertTrue(UUIDFormat().is_native_type(uuid.uuid4()))
        self.assertFalse(UUIDFormat().is_native_type("0000000-0000-0000-0000-000000000000"))

    def test_validate(self):
        self.assertEqual(UUIDFormat().validate("0000000-0000-0000-0000-000000000000"), uuid.UUID("0000000-0000-0000-0000-000000000000"))
        with self.assertRaises(ValidationError):
            UUIDFormat().validate("0000000-0000-0000-0000-00000000000")

    def test_serialize(self):
        self.assertEqual(UUIDFormat().serialize(uuid.UUID("0000000-0000-0000-0000-000000000000")), "0000000-0000-0000-0000-000000000000")
        self.assertIsNone(UUIDFormat().serialize(None))

if __name__ == '__main__':
    unittest.main()