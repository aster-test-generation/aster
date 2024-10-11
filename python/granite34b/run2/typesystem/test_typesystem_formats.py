import unittest
from typesystem.formats import *


class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        format = BaseFormat()
        error = format.validation_error("code")
        self.assertEqual(error.code, "code")
        self.assertEqual(error.text, "An error occurred.")

    def test_is_native_type(self):
        format = BaseFormat()
        self.assertFalse(format.is_native_type(1))

    def test_validate(self):
        format = BaseFormat()
        self.assertEqual(format.validate(1), 1)

    def test_serialize(self):
        format = BaseFormat()
        self.assertEqual(format.serialize(1), "1")

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateFormat()
        self.assertTrue(format.is_native_type(datetime.date(2023, 1, 1)))
        self.assertFalse(format.is_native_type(1))

    def test_validate(self):
        format = DateFormat()
        self.assertEqual(format.validate("2023-01-01"), datetime.date(2023, 1, 1))
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01x")
        self.assertEqual(cm.exception.code, "format")
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-13-01")
        self.assertEqual(cm.exception.code, "invalid")

    def test_serialize(self):
        format = DateFormat()
        self.assertEqual(format.serialize(datetime.date(2023, 1, 1)), "2023-01-01")
        self.assertEqual(format.serialize(None), None)

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = TimeFormat()
        self.assertTrue(format.is_native_type(datetime.time(12, 0, 0)))
        self.assertFalse(format.is_native_type(1))

    def test_validate(self):
        format = TimeFormat()
        self.assertEqual(format.validate("12:00"), datetime.time(12, 0, 0))
        with self.assertRaises(ValidationError) as cm:
            format.validate("12:00x")
        self.assertEqual(cm.exception.code, "format")
        with self.assertRaises(ValidationError) as cm:
            format.validate("25:00")
        self.assertEqual(cm.exception.code, "invalid")

    def test_serialize(self):
        format = TimeFormat()
        self.assertEqual(format.serialize(datetime.time(12, 0, 0)), "12:00:00")
        self.assertEqual(format.serialize(None), None)

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateTimeFormat()
        self.assertTrue(format.is_native_type(datetime.datetime(2023, 1, 1, 12, 0, 0)))
        self.assertFalse(format.is_native_type(1))

    def test_validate(self):
        format = DateTimeFormat()
        self.assertEqual(format.validate("2023-01-01T12:00"), datetime.datetime(2023, 1, 1, 12, 0, 0))
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01T12:00x")
        self.assertEqual(cm.exception.code, "format")
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-13-01T12:00")
        self.assertEqual(cm.exception.code, "invalid")

    def test_serialize(self):
        format = DateTimeFormat()
        self.assertEqual(format.serialize(datetime.datetime(2023, 1, 1, 12, 0, 0)), "2023-01-01T12:00:00")
        self.assertEqual(format.serialize(None), None)

class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        format = BaseFormat()
        error = format.validation_error("code")
        self.assertEqual(error.code, "code")
        self.assertEqual(error.text, "An error occurred.")

    def test_is_native_type(self):
        format = BaseFormat()
        self.assertFalse(format.is_native_type(1))

    def test_validate(self):
        format = BaseFormat()
        self.assertEqual(format.validate(1), 1)

    def test_serialize(self):
        format = BaseFormat()
        self.assertEqual(format.serialize(1), 1)

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateFormat()
        self.assertTrue(format.is_native_type(datetime.date(2023, 1, 1)))
        self.assertFalse(format.is_native_type("2023-01-01"))

    def test_validate(self):
        format = DateFormat()
        self.assertEqual(format.validate("2023-01-01"), datetime.date(2023, 1, 1))
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01T00:00:00")
        self.assertEqual(cm.exception.code, "format")
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01Z")
        self.assertEqual(cm.exception.code, "invalid")

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
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01T00:00:00")
        self.assertEqual(cm.exception.code, "format")
        with self.assertRaises(ValidationError) as cm:
            format.validate("12:00:00Z")
        self.assertEqual(cm.exception.code, "invalid")

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
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01")
        self.assertEqual(cm.exception.code, "format")
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01T12:00:00Z")
        self.assertEqual(cm.exception.code, "invalid")

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateFormat()
        self.assertTrue(format.is_native_type(datetime.date(2023, 1, 1)))
        self.assertFalse(format.is_native_type("2023-01-01"))

    def test_validate(self):
        format = DateFormat()
        self.assertEqual(format.validate("2023-01-01"), datetime.date(2023, 1, 1))
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01T00:00:00")
        self.assertEqual(cm.exception.code, "format")
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01")
        self.assertEqual(cm.exception.code, "invalid")

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
        with self.assertRaises(ValidationError) as cm:
            format.validate("00:00:00.000000")
        self.assertEqual(cm.exception.code, "format")
        with self.assertRaises(ValidationError) as cm:
            format.validate("00:00:00")
        self.assertEqual(cm.exception.code, "invalid")

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
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01T00:00:00.000000")
        self.assertEqual(cm.exception.code, "format")
        with self.assertRaises(ValidationError) as cm:
            format.validate("2023-01-01T00:00:00")
        self.assertEqual(cm.exception.code, "invalid")

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateFormat()
        self.assertTrue(format.is_native_type(datetime.date(2023, 1, 1)))

    def test_validate(self):
        format = DateFormat()
        self.assertEqual(format.validate("2023-01-01"), datetime.date(2023, 1, 1))

    def test_serialize(self):
        format = DateFormat()
        self.assertEqual(format.serialize(datetime.date(2023, 1, 1)), "2023-01-01")

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = TimeFormat()
        self.assertTrue(format.is_native_type(datetime.time(12, 0, 0)))

    def test_validate(self):
        format = TimeFormat()
        self.assertEqual(format.validate("12:00"), datetime.time(12, 0, 0))

    def test_serialize(self):
        format = TimeFormat()
        self.assertEqual(format.serialize(datetime.time(12, 0, 0)), "12:00:00")

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateTimeFormat()
        self.assertTrue(format.is_native_type(datetime.datetime(2023, 1, 1, 12, 0, 0)))

    def test_validate(self):
        format = DateTimeFormat()
        self.assertEqual(format.validate("2023-01-01T12:00"), datetime.datetime(2023, 1, 1, 12, 0, 0))

    def test_serialize(self):
        format = DateTimeFormat()
        self.assertEqual(format.serialize(datetime.datetime(2023, 1, 1, 12, 0, 0)), "2023-01-01T12:00:00")

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = UUIDFormat()
        self.assertTrue(format.is_native_type(uuid.UUID("123e4567-e89b-12d3-a456-426614174000")))

    def test_validate(self):
        format = UUIDFormat()
        self.assertEqual(format.validate("123e4567-e89b-12d3-a456-426614174000"), uuid.UUID("123e4567-e89b-12d3-a456-426614174000"))

    def test_serialize(self):
        format = UUIDFormat()
        self.assertEqual(format.serialize(uuid.UUID("123e4567-e89b-12d3-a456-426614174000")), "123e4567-e89b-12d3-a456-426614174000")

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateFormat()
        self.assertTrue(format.is_native_type(datetime.date(2023, 1, 1)))
        self.assertFalse(format.is_native_type("2023-01-01"))

    def test_validate(self):
        format = DateFormat()
        self.assertEqual(format.validate("2023-01-01"), datetime.date(2023, 1, 1))

    def test_serialize(self):
        format = DateFormat()
        self.assertEqual(format.serialize(datetime.date(2023, 1, 1)), "2023-01-01")

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = TimeFormat()
        self.assertTrue(format.is_native_type(datetime.time(12, 0, 0)))
        self.assertFalse(format.is_native_type("12:00:00"))

    def test_validate(self):
        format = TimeFormat()
        self.assertEqual(format.validate("12:00:00"), datetime.time(12, 0, 0))

    def test_serialize(self):
        format = TimeFormat()
        self.assertEqual(format.serialize(datetime.time(12, 0, 0)), "12:00:00")

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateTimeFormat()
        self.assertTrue(format.is_native_type(datetime.datetime(2023, 1, 1, 12, 0, 0)))
        self.assertFalse(format.is_native_type("2023-01-01T12:00:00"))

    def test_validate(self):
        format = DateTimeFormat()
        self.assertEqual(format.validate("2023-01-01T12:00:00"), datetime.datetime(2023, 1, 1, 12, 0, 0))

    def test_serialize(self):
        format = DateTimeFormat()
        self.assertEqual(format.serialize(datetime.datetime(2023, 1, 1, 12, 0, 0)), "2023-01-01T12:00:00")

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = UUIDFormat()
        self.assertTrue(format.is_native_type(uuid.UUID("00000000-0000-0000-0000-000000000000")))
        self.assertFalse(format.is_native_type("00000000-0000-0000-0000-000000000000"))

    def test_validate(self):
        format = UUIDFormat()
        self.assertEqual(format.validate("00000000-0000-0000-0000-000000000000"), uuid.UUID("00000000-0000-0000-0000-000000000000"))

if __name__ == '__main__':
    unittest.main()