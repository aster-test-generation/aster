import unittest
from typesystem.formats import *

class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        format = BaseFormat()
        error = format.validation_error("code")
        self.assertEqual(error.code, "code")
        self.assertTrue(error.text)

    def test_is_native_type(self):
        format = BaseFormat()
        self.assertFalse(format.is_native_type(1))

    def test_validate(self):
        format = BaseFormat()
        self.assertRaises(NotImplementedError, format.validate, 1)

    def test_serialize(self):
        format = BaseFormat()
        self.assertRaises(NotImplementedError, format.serialize, 1)

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateFormat()
        self.assertTrue(format.is_native_type(datetime.date(2023, 1, 1)))
        self.assertFalse(format.is_native_type("2023-01-01"))

    def test_validate(self):
        format = DateFormat()
        self.assertEqual(format.validate("2023-01-01"), datetime.date(2023, 1, 1))
        self.assertRaises(ValidationError, format.validate, "2023-01-01T00:00:00")

    def test_serialize(self):
        format = DateFormat()
        self.assertEqual(format.serialize(datetime.date(2023, 1, 1)), "2023-01-01")
        self.assertEqual(format.serialize(None), None)

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = TimeFormat()
        self.assertTrue(format.is_native_type(datetime.time(12, 0, 0)))
        self.assertFalse(format.is_native_type("12:00:00"))

    def test_validate(self):
        format = TimeFormat()
        self.assertEqual(format.validate("12:00:00"), datetime.time(12, 0, 0))
        self.assertRaises(ValidationError, format.validate, "2023-01-01")

    def test_serialize(self):
        format = TimeFormat()
        self.assertEqual(format.serialize(datetime.time(12, 0, 0)), "12:00:00")
        self.assertEqual(format.serialize(None), None)

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateTimeFormat()
        self.assertTrue(format.is_native_type(datetime.datetime(2023, 1, 1, 12, 0, 0)))
        self.assertFalse(format.is_native_type("2023-01-01T12:00:00"))

    def test_validate(self):
        format = DateTimeFormat()
        self.assertEqual(format.validate("2023-01-01T12:00:00"), datetime.datetime(2023, 1, 1, 12, 0, 0))
        self.assertRaises(ValidationError, format.validate, "2023-01-01")

    def test_serialize(self):
        format = DateTimeFormat()
        self.assertEqual(format.serialize(datetime.datetime(2023, 1, 1, 12, 0, 0)), "2023-01-01T12:00:00")
        self.assertEqual(format.serialize(None), None)

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = UUIDFormat()
        self.assertTrue(format.is_native_type(uuid.UUID("123e4567-e89b-12d3-a456-426614174000")))
        self.assertFalse(format.is_native_type("123e4567-e89b-12d3-a456-426614174000"))

if __name__ == '__main__':
    unittest.main()