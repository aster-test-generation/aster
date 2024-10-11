import unittest
from docstring_parser.rest import *



class TestDocstringMeta(unittest.TestCase):
    def test_init(self):
        instance = DocstringMeta(args=["args"], description="description")
        self.assertEqual(instance.args, ["args"])
        self.assertEqual(instance.description, "description")

    def test_str(self):
        instance = DocstringMeta(args=["args"], description="description")
        result = instance.__str__()
        self.assertEqual(result, DocstringMeta(args=['args'], description='description'))

    def test_repr(self):
        instance = DocstringMeta(args=["args"], description="description")
        result = instance.__repr__()
        self.assertEqual(result, DocstringMeta(args=['args'], description='description'))

    def test_eq(self):
        instance = DocstringMeta(args=["args"], description="description")
        result = instance.__eq__(instance)
        self.assertEqual(result, True)

class TestDocstringParam(unittest.TestCase):
    def test_init(self):
        instance = DocstringParam(args=["args"], description="description", arg_name="arg_name", type_name="type_name", is_optional=True, default="default")
        self.assertEqual(instance.args, ["args"])
        self.assertEqual(instance.description, "description")
        self.assertEqual(instance.arg_name, "arg_name")
        self.assertEqual(instance.type_name, "type_name")
        self.assertEqual(instance.is_optional, True)
        self.assertEqual(instance.default, "default")

    def test_str(self):
        instance = DocstringParam(args=["args"], description="description", arg_name="arg_name", type_name="type_name", is_optional=True, default="default")
        result = instance.__str__()
        self.assertEqual(result, "<docstring_parser.common.DocstringParam object at 0x7fd29d323040>")

    def test_repr(self):
        instance = DocstringParam(args=["args"], description="description", arg_name="arg_name", type_name="type_name", is_optional=True, default="default")
        result = instance.__repr__()
        self.assertEqual(result, "<docstring_parser.common.DocstringParam object at 0x7fd29dd548b0>")

    def test_eq(self):
        instance = DocstringParam(args=["args"], description="description", arg_name="arg_name", type_name="type_name", is_optional=True, default="default")
        result = instance.__eq__(instance)
        self.assertEqual(result, True)

class TestDocstringReturns(unittest.TestCase):
    def test_init(self):
        instance = DocstringReturns(args=["args"], description="description", type_name="type_name", is_generator=True)
        self.assertEqual(instance.args, ["args"])
        self.assertEqual(instance.description, "description")
        self.assertEqual(instance.type_name, "type_name")
        self.assertEqual(instance.is_generator, True)

    def test_str(self):
        instance = DocstringReturns(args=["args"], description="description", type_name="type_name", is_generator=True)
        result = instance.__str__()
        self.assertEqual(result, DocstringReturns(args=['args'], description='description', type_name='type_name', is_generator=True))

    def test_repr(self):
        instance = DocstringReturns(args=["args"], description="description", type_name="type_name", is_generator=True)
        result = instance.__repr__()
        self.assertEqual(result, DocstringReturns(args=['args'], description='description', type_name='type_name', is_generator=True))

class TestParse(unittest.TestCase):
    def test_parse(self):
        result = parse("")
        self.assertEqual(result.short_description, None)
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_2(self):
        result = parse("test")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, False)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_3(self):
        result = parse("test\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_4(self):
        result = parse("test\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_5(self):
        result = parse("test\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_6(self):
        result = parse("test\n\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_7(self):
        result = parse("test\n\n\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_8(self):
        result = parse("test\n\n\n\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

    def test_parse_9(self):
        result = parse("test\n\n\n\n\n\n\n\n")
        self.assertEqual(result.short_description, "test")
        self.assertEqual(result.blank_after_short_description, False)
        self.assertEqual(result.blank_after_long_description, True)
        self.assertEqual(result.long_description, None)
        self.assertEqual(result.meta, [])

if __name__ == '__main__':
    unittest.main()