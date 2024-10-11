import unittest
from typesystem.formats import *


class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        format = BaseFormat()
        error = format.validation_error("code", "message")
        self.assertEqual(error.code, "code")
        self.assertEqual(error.text, "An error occurred.")

    def test_is_native_type(self):
        format = BaseFormat()
        self.assertFalse(format.is_native_type(1))

    def test_validate(self):
        format = BaseFormat()
        self.assertEqual(format.validate(1), True)

    def test_serialize(self):
        format = BaseFormat()
        self.assertEqual(format.serialize(1), "1")

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateFormat()
        self.assertTrue(format.is_native_type(datetime.date(2023, 1, 1)))
        self.assertFalse(format.is_native_type("2023-01-01"))

    def test_validate(self):
        format = DateFormat()
        self.assertEqual(format.validate("2023-01-01"), datetime.date(2023, 1, 1))
        with self.assertRaises(ValidationError) as context:
            format.validate("2023-01-01T00:00:00")
        self.assertEqual(context.exception.code, "format")
        with self.assertRaises(ValidationError) as context:
            format.validate("2023-01-01Z")
        self.assertEqual(context.exception.code, "invalid")

    def test_serialize(self):
        format = DateFormat()
        self.assertEqual(format.serialize(datetime.date(2023, 1, 1)), "2023-01-01")
        self.assertEqual(format.serialize(None), None)

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = TimeFormat()
        self.assertTrue(format.is_native_type(datetime.time(0, 0, 0)))
        self.assertFalse(format.is_native_type("00:00:00"))

    def test_validate(self):
        format = TimeFormat()
        self.assertEqual(format.validate("00:00:00"), datetime.time(0, 0, 0))
        with self.assertRaises(ValidationError) as context:
            format.validate("00:00:00.000000")
        self.assertEqual(context.exception.code, "format")
        with self.assertRaises(ValidationError) as context:
            format.validate("00:00:00Z")
        self.assertEqual(context.exception.code, "invalid")

    def test_serialize(self):
        format = TimeFormat()
        self.assertEqual(format.serialize(datetime.time(0, 0, 0)), "00:00:00")
        self.assertEqual(format.serialize(None), None)

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateTimeFormat()
        self.assertTrue(format.is_native_type(datetime.datetime(2023, 1, 1, 0, 0, 0)))
        self.assertFalse(format.is_native_type("2023-01-01T00:00:00"))

    def test_validate(self):
        format = DateTimeFormat()
        self.assertEqual(format.validate("2023-01-01T00:00:00"), datetime.datetime(2023, 1, 1, 0, 0, 0))
        with self.assertRaises(ValidationError):
            format.validate("2023-01-01T00:00:00.000000")
        self.assertEqual(context.exception.code, "format")
        with self.assertRaises(ValidationError) as context:
            format.validate("2023-01-01T00:00:00Z")
        self.assertEqual(context.exception.code, "invalid")

if __name__ == '__main__':
    unittest.main()