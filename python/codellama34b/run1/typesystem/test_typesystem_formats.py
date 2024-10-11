import unittest
from typesystem.formats import *



class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        result = instance.validation_error("format")
        self.assertEqual(result, ValidationError(text="Must be a valid date format.", code="format"))

    def test_is_native_type(self):
        instance = BaseFormat()
        result = instance.is_native_type(datetime.date)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = BaseFormat()
        result = instance.validate(datetime.date)
        self.assertEqual(result, NotImplementedError())

    def test_serialize(self):
        instance = BaseFormat()
        result = instance.serialize(datetime.date(2020, 1, 1))
        self.assertEqual(result, NotImplementedError())

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateFormat()
        result = instance.is_native_type(datetime.date)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateFormat()
        result = instance.validate("2022-01-01")
        self.assertEqual(result, datetime.date(2022, 1, 1))

    def test_serialize(self):
        instance = DateFormat()
        result = instance.serialize(datetime.date(2022, 1, 1))
        self.assertEqual(result, "2022-01-01")

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = TimeFormat()
        result = instance.is_native_type(datetime.time)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = TimeFormat()
        result = instance.validate("12:00:00")
        self.assertEqual(result, datetime.time(12, 0, 0))

    def test_serialize(self):
        instance = TimeFormat()
        result = instance.serialize(datetime.time(12, 0, 0))
        self.assertEqual(result, "12:00:00")

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateTimeFormat()
        result = instance.is_native_type(datetime.datetime)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateTimeFormat()
        result = instance.validate("2022-01-01T12:00:00")
        self.assertEqual(result, datetime.datetime(2022, 1, 1, 12, 0, 0))

    def test_serialize(self):
        instance = DateTimeFormat()
        result = instance.serialize(datetime.datetime(2022, 1, 1, 12, 0, 0))
        self.assertEqual(result, "2022-01-01T12:00:00")

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = UUIDFormat()
        result = instance.is_native_type(uuid.UUID)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = UUIDFormat()
        result = instance.validate("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        self.assertEqual(result, uuid.UUID(value="3fa85f64-5717-4562-b3fc-2c963f66afa6"))

class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be a valid date format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = BaseFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = BaseFormat()
        result = instance.validate("value")
        self.assertEqual(result, "value")

    def test_serialize(self):
        instance = BaseFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, "obj")

class TestDateFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = DateFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be a valid date format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = DateFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateFormat()
        result = instance.validate("value")
        self.assertEqual(result, "value")

    def test_serialize(self):
        instance = DateFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, "obj")

class TestTimeFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = TimeFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be a valid time format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = TimeFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = TimeFormat()
        result = instance.validate("value")
        self.assertEqual(result, "value")

    def test_serialize(self):
        instance = TimeFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, "obj")

class TestDateTimeFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = DateTimeFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be a valid datetime format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = DateTimeFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateTimeFormat()
        result = instance.validate("value")
        self.assertEqual(result, "value")

    def test_serialize(self):
        instance = DateTimeFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, "obj")

class TestUUIDFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = UUIDFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be valid UUID format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = UUIDFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = UUIDFormat()
        result = instance.validate("value")
        self.assertEqual(result, "value")

if __name__ == '__main__':
    unittest.main()