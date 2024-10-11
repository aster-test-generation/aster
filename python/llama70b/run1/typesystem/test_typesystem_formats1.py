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

    def test_validate(self):
        instance = DateFormat()
        date = instance.validate("2022-01-01")
        self.assertIsInstance(date, datetime.date)

    def test_serialize(self):
        instance = DateFormat()
        date = datetime.date(2022, 1, 1)
        serialized = instance.serialize(date)
        self.assertEqual(serialized, "2022-01-01")

    def test_private_methods(self):
        instance = DateFormat()
        self.assertRaises(ValidationError, instance._DateFormat__validation_error, "format")

class TestTimeFormat(unittest.TestCase):
    def test_init(self):
        instance = TimeFormat()
        self.assertIsInstance(instance, TimeFormat)

    def test_is_native_type(self):
        instance = TimeFormat()
        self.assertTrue(instance.is_native_type(datetime.time(12, 30)))

    def test_validate(self):
        instance = TimeFormat()
        time = instance.validate("12:30")
        self.assertIsInstance(time, datetime.time)

    def test_serialize(self):
        instance = TimeFormat()
        time = datetime.time(12, 30)
        serialized = instance.serialize(time)
        self.assertEqual(serialized, "12:30:00")

    def test_private_methods(self):
        instance = TimeFormat()
        self.assertRaises(ValidationError, instance._TimeFormat__validation_error, "format")

class TestDateTimeFormat(unittest.TestCase):
    def test_init(self):
        instance = DateTimeFormat()
        self.assertIsInstance(instance, DateTimeFormat)

    def test_is_native_type(self):
        instance = DateTimeFormat()
        self.assertTrue(instance.is_native_type(datetime.datetime(2022, 1, 1, 12, 30)))

    def test_validate(self):
        instance = DateTimeFormat()
        dt = instance.validate("2022-01-01T12:30:00Z")
        self.assertIsInstance(dt, datetime.datetime)

    def test_serialize(self):
        instance = DateTimeFormat()
        dt = datetime.datetime(2022, 1, 1, 12, 30)
        serialized = instance.serialize(dt)
        self.assertEqual(serialized, "2022-01-01T12:30:00Z")

    def test_private_methods(self):
        instance = DateTimeFormat()
        self.assertRaises(ValidationError, instance._DateTimeFormat__validation_error, "format")

class TestUUIDFormat(unittest.TestCase):
    def test_init(self):
        instance = UUIDFormat()
        self.assertIsInstance(instance, UUIDFormat)

    def test_is_native_type(self):
        instance = UUIDFormat()
        self.assertTrue(instance.is_native_type(uuid.UUID("12345678-1234-1234-1234-123456789012")))

    def test_validate(self):
        instance = UUIDFormat()
        uuid_val = instance.validate("12345678-1234-1234-1234-123456789012")
        self.assertIsInstance(uuid_val, uuid.UUID)

    def test_serialize(self):
        instance = UUIDFormat()
        uuid_val = uuid.UUID("12345678-1234-1234-1234-123456789012")
        serialized = instance.serialize(uuid_val)
        self.assertEqual(serialized, "12345678-1234-1234-1234-123456789012")

    def test_private_methods(self):
        instance = UUIDFormat()
        self.assertRaises(ValidationError, instance._UUIDFormat__validation_error, "format")

if __name__ == '__main__':
    unittest.main()