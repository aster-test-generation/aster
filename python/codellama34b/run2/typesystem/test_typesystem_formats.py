import unittest
from typesystem.formats import *



class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        result = instance.validation_error("format")
        self.assertEqual(result.text, "Must be a valid date format.")
        self.assertEqual(result.code, "format")

    def test_is_native_type(self):
        instance = BaseFormat()
        result = instance.is_native_type(datetime.datetime)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = BaseFormat()
        result = instance.validate(datetime.date)
        self.assertEqual(result, NotImplementedError)

    def test_serialize(self):
        instance = BaseFormat()
        result = instance.serialize(datetime.date(2019, 1, 1))
        self.assertEqual(result, NotImplementedError)

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateFormat()
        result = instance.is_native_type(datetime.date)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateFormat()
        result = instance.validate("2022-02-22")
        self.assertEqual(result, datetime.date(2022, 2, 22))

    def test_serialize(self):
        instance = DateFormat()
        result = instance.serialize(datetime.date(2022, 2, 22))
        self.assertEqual(result, "2022-02-22")

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = TimeFormat()
        result = instance.is_native_type(datetime.time)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = TimeFormat()
        result = instance.validate("12:34:56")
        self.assertEqual(result, datetime.time(12, 34, 56))

    def test_serialize(self):
        instance = TimeFormat()
        result = instance.serialize(datetime.time(12, 34, 56))
        self.assertEqual(result, "12:34:56")

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateTimeFormat()
        result = instance.is_native_type(datetime.datetime)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateTimeFormat()
        result = instance.validate("2022-02-22T12:34:56")
        self.assertEqual(result, datetime.datetime(2022, 2, 22, 12, 34, 56))

    def test_serialize(self):
        instance = DateTimeFormat()
        result = instance.serialize(datetime.datetime(2022, 2, 22, 12, 34, 56))
        self.assertEqual(result, "2022-02-22T12:34:56")

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = UUIDFormat()
        result = instance.is_native_type(uuid.UUID)
        self.assertEqual(result, False)

    def test_validate(self):
        instance = UUIDFormat()
        result = instance.validate("123e4567-e89b-12d3-a456-426655440000")
        self.assertEqual(result, uuid.UUID("123e4567-e89b-12d3-a456-426655440000"))


class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        result = instance.validation_error("code")
        self.assertEqual(result, ValidationError(text="", code="code"))

    def test_is_native_type(self):
        instance = BaseFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = BaseFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = BaseFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = DateFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = TimeFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = TimeFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = TimeFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateTimeFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateTimeFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = DateTimeFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = UUIDFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = UUIDFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = UUIDFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()