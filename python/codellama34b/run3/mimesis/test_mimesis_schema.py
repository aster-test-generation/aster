import unittest
from mimesis.schema import *


class TestAbstractField(unittest.TestCase):
    def test_abstract_field(self):
        instance = AbstractField()
        result = instance.__str__()
        self.assertEqual(result, "AbstractField <en>")

    def test_abstract_field_call(self):
        instance = AbstractField()
        result = instance.__call__(name="example_name", key=None, **{})
        self.assertEqual(result, "example_name")

class TestSchema(unittest.TestCase):
    def test_schema(self):
        instance = Schema()
        result = instance.create(iterations=1)
        self.assertEqual(result, [{}])

    def test_schema_call(self):
        instance = Schema()
        result = instance.__call__()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()