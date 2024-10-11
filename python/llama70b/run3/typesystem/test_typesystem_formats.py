import unittest
from typesystem.formats import BaseFormat, DateFormat, TimeFormat, DateTimeFormat, UUIDFormat


class TestBaseFormat(unittest.TestCase):
    def test_init(self):
        instance = BaseFormat()
        self.assertIsInstance(instance, BaseFormat)

    def test_validation_error(self):
        instance = BaseFormat()
        error = instance.validation_error("code")
        self.assertIsInstance(error, ValidationError)
        self.assertEqual(error.text, "code")
        self.assertEqual(error.code, "code")

    def test_is_native_type(self):
        instance = BaseFormat()
        with self.assertRaises(NotImplementedError):
            instance.is_native_type(None)

    def test_validate(self):
        instance = BaseFormat()
        with self.assertRaises(NotImplementedError):
            instance.validate(None)

    def test_serialize(self):
        instance = BaseFormat()
        with self.assertRaises(NotImplementedError):
            instance.serialize(None)

class TestDateFormat(unittest.TestCase):
    def test_init(self):
        instance = DateFormat()
        self.assertIsInstance(instance, DateFormat)

    def test_is_native_type(self):
        instance = DateFormat()
        self.assertTrue(instance.is_native_type(datetime.date(2022, 1, 1)))
        self.assertFalse(instance.is_native_type("not a date"))

    def test_validate(self):
        instance = DateFormat()
        with self.assertRaises(ValidationError):
            instance.validate("not a date")
        self.assertEqual(instance.validate("2022-01-01"), datetime.date(2022, 1, 1))

    def test_serialize(self):
        instance = DateFormat()
        self.assertEqual(instance.serialize(datetime.date(2022, 1, 1)), "2022-01-01")
        self.assertIsNone(instance.serialize(None))

class TestTimeFormat(unittest.TestCase):
    def test_init(self):
        instance = TimeFormat()
        self.assertIsInstance(instance, TimeFormat)

    def test_is_native_type(self):
        instance = TimeFormat()
        self.assertTrue(instance.is_native_type(datetime.time(12, 30)))
        self.assertFalse(instance.is_native_type("not a time"))

    def test_validate(self):
        instance = TimeFormat()
        with self.assertRaises(ValidationError):
            instance.validate("not a time")
        self.assertEqual(instance.validate("12:30"), datetime.time(12, 30))

    def test_serialize(self):
        instance = TimeFormat()
        self.assertEqual(instance.serialize(datetime.time(12, 30)), "12:30:00")
        self.assertIsNone(instance.serialize(None))

class TestDateTimeFormat(unittest.TestCase):
    def test_init(self):
        instance = DateTimeFormat()
        self.assertIsInstance(instance, DateTimeFormat)

    def test_is_native_type(self):
        instance = DateTimeFormat()
        self.assertTrue(instance.is_native_type(datetime.datetime(2022, 1, 1, 12, 30)))
        self.assertFalse(instance.is_native_type("not a datetime"))

    def test_validate(self):
        instance = DateTimeFormat()
        with self.assertRaises(ValidationError):
            instance.validate("not a datetime")
        self.assertEqual(instance.validate("2022-01-01T12:30:00"), datetime.datetime(2022, 1, 1, 12, 30))

    def test_serialize(self):
        instance = DateTimeFormat()
        self.assertEqual(instance.serialize(datetime.datetime(2022, 1, 1, 12, 30)), "2022-01-01T12:30:00")
        self.assertIsNone(instance.serialize(None))

class TestUUIDFormat(unittest.TestCase):
    def test_init(self):
        instance = UUIDFormat()
        self.assertIsInstance(instance, UUIDFormat)

    def test_is_native_type(self):
        instance = UUIDFormat()
        self.assertTrue(instance.is_native_type(uuid.UUID("12345678-1234-1234-1234-123456789012")))
        self.assertFalse(instance.is_native_type("not a uuid"))

    def test_validate(self):
        instance = UUIDFormat()
        with self.assertRaises(ValidationError):
            instance.validate("not a uuid")
        self.assertEqual(instance.validate("12345678-1234-1234-1234-123456789012"), uuid.UUID("12345678-1234-1234-1234-123456789012"))

    def test_serialize(self):
        instance = UUIDFormat()
        self.assertEqual(instance.serialize(uuid.UUID("12345678-1234-1234-1234-123456789012")), "12345678-1234-1234-1234-123456789012")

if __name__ == '__main__':
    unittest.main()