import unittest
from mimesis.schema import *


class TestAbstractField(unittest.TestCase):
    def test_abstract_field(self):
        instance = AbstractField()
        result = instance.__str__()
        self.assertEqual(result, "AbstractField <en>")

    def test_abstract_field_call(self):
        instance = AbstractField()
        result = instance.__call__(name="", key=None, **{})
        self.assertEqual(result, None)

    def test_abstract_field_call_with_name(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=None, **{})
        self.assertEqual(result, instance._gen.choice)

    def test_abstract_field_call_with_name_and_kwargs(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=None, **{"a": 1})
        self.assertEqual(result, instance._gen.choice(a=1))

    def test_abstract_field_call_with_name_and_key(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=lambda x: x + 1, **{})
        self.assertEqual(result, instance._gen.choice() + 1)

    def test_abstract_field_call_with_name_and_key_and_kwargs(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=lambda x: x + 1, **{"a": 1})
        self.assertEqual(result, instance._gen.choice(a=1) + 1)

    def test_abstract_field_call_with_name_and_kwargs_and_key(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=lambda x: x + 1, **{"a": 1})
        self.assertEqual(result, instance._gen.choice(a=1) + 1)

    def test_abstract_field_call_with_name_and_kwargs_and_key_and_kwargs(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=lambda x: x + 1, **{"a": 1})
        self.assertEqual(result, instance._gen.choice(a=1) + 1)

    def test_abstract_field_call_with_name_and_kwargs_and_key_and_kwargs_and_kwargs(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=lambda x: x + 1, **{"a": 1})
        self.assertEqual(result, instance._gen.choice(a=1) + 1)

    def test_abstract_field_call_with_name_and_kwargs_and_key_and_kwargs_and_kwargs_and_kwargs(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=lambda x: x + 1, **{"a": 1})
        self.assertEqual(result, instance._gen.choice(a=1) + 1)

    def test_abstract_field_call_with_name_and_kwargs_and_key_and_kwargs_and_kwargs_and_kwargs_and_kwargs(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=lambda x: x + 1, **{"a": 1})
        self.assertEqual(result, instance._gen.choice(a=1) + 1)

    def test_abstract_field_call_with_name_and_kwargs_and_key_and_kwargs_and_kwargs_and_kwargs_and_kwargs_and_kwargs(self):
        instance = AbstractField()
        result = instance.__call__(name="choice", key=lambda x: x + 1, **{"a": 1})
        self.assertEqual(result, instance._gen.choice(a=1) + 1)

if __name__ == '__main__':
    unittest.main()