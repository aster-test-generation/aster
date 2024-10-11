import unittest
from typesystem.formats import DateFormat, TimeFormat, DateTimeFormat, UUIDFormat


class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateFormat()
        self.assertTrue(format.is_native_type(date.today()))
        self.assertFalse(format.is_native_type("2023-01-01"))

    def test_validate(self):
        format = DateFormat()
        self.assertEqual(format.validate("2023-01-01"), date(2023, 1, 1))
        with self.assertRaises(ValidationError):
            format.validate("2023-02-29")

    def test_serialize(self):
        format = DateFormat()
        self.assertEqual(format.serialize(date(2023, 1, 1)), "2023-01-01")
        self.assertIsNone(format.serialize(None))

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = TimeFormat()
        self.assertTrue(format.is_native_type(time.time()))
        self.assertFalse(format.is_native_type("12:00:00"))

    def test_validate(self):
        format = TimeFormat()
        self.assertEqual(format.validate("12:00:00"), time(12, 0, 0))
        with self.assertRaises(ValidationError):
            format.validate("25:00:00")

    def test_serialize(self):
        format = TimeFormat()
        self.assertEqual(format.serialize(datetime.time(12, 0, 0)), "12:00:00")
        self.assertIsNone(format.serialize(None))

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = DateTimeFormat()
        self.assertTrue(format.is_native_type(datetime.datetime.now()))
        self.assertFalse(format.is_native_type("2023-01-01T12:00:00"))

    def test_validate(self):
        format = DateTimeFormat()
        self.assertEqual(format.validate("2023-01-01T12:00:00"), datetime.datetime(2023, 1, 1, 12, 0, 0))
        with self.assertRaises(ValidationError):
            format.validate("2023-02-29T24:00:00")

    def test_serialize(self):
        format = DateTimeFormat()
        self.assertEqual(format.serialize(datetime.datetime(2023, 1, 1, 12, 0, 0)), "2023-01-01T12:00:00")
        self.assertIsNone(format.serialize(None))

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        format = UUIDFormat()
        self.assertTrue(format.is_native_type(uuid.uuid4()))
        self.assertFalse(format.is_native_type("123e456-e89b-12d3-a456-426614174000"))

    def test_validate(self):
        format = UUIDFormat()
        self.assertEqual(format.validate("123e456-e89b-12d3-a456-426614174000"), uuid.UUID("123e456-e89b-12d3-a456-426614174000"))
        with self.assertRaises(ValidationError):
            format.validate("123e456-e89b-12d3-a456-42661417400")

if __name__ == '__main__':
    unittest.main()