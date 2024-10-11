import unittest
from docstring_parser import DocstringParser, pars


class TestBuildMeta(unittest.TestCase):
    def test_build_meta_param(self):
        args = ['param', 'int', 'x']
        desc = 'Description of param'
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringParam)
        self.assertEqual(result.args, args)
        self.assertEqual(result.description, desc)
        self.assertEqual(result.arg_name, 'x')
        self.assertEqual(result.type_name, 'int')
        self.assertIsNone(result.is_optional)

    def test_build_meta_returns(self):
        args = ['returns', 'int']
        desc = 'Description of returns'
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringReturns)
        self.assertEqual(result.args, args)
        self.assertEqual(result.description, desc)
        self.assertEqual(result.type_name, 'int')
        self.assertFalse(result.is_generator)

    def test_build_meta_raises(self):
        args = ['raises', 'Exception']
        desc = 'Description of raises'
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringRaises)
        self.assertEqual(result.args, args)
        self.assertEqual(result.description, desc)
        self.assertEqual(result.type_name, 'Exception')

class TestParse(unittest.TestCase):
    def test_parse_empty(self):
        text = ''
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertIsNone(result.short_description)
        self.assertIsNone(result.long_description)
        self.assertEqual(len(result.meta), 0)

    def test_parse_short_description(self):
        text = 'Short description\n\nLong description'
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, 'Short description')
        self.assertEqual(result.long_description, 'Long description')
        self.assertEqual(len(result.meta), 0)

    def test_parse_long_description(self):
        text = 'Short description\n\nLong description with multiple lines'
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, 'Short description')
        self.assertEqual(result.long_description, 'Long description with multiple lines')
        self.assertEqual(len(result.meta), 0)

    def test_parse_meta(self):
        text = 'Short description\n\n:param x: int\n\nLong description'
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, 'Short description')
        self.assertEqual(result.long_description, 'Long description')
        self.assertEqual(len(result.meta), 1)
        self.assertIsInstance(result.meta[0], DocstringParam)
        self.assertEqual(result.meta[0].args, ['param', 'x'])
        self.assertEqual(result.meta[0].description, 'int')

    def test_parse_multiple_meta(self):
        text = 'Short description\n\n:param x: int\n:param y: str\n\nLong description'
        result = parse(text)
        self.assertIsInstance(result, Docstring)
        self.assertEqual(result.short_description, 'Short description')
        self.assertEqual(result.long_description, 'Long description')
        self.assertEqual(len(result.meta), 2)
        self.assertIsInstance(result.meta[0], DocstringParam)
        self.assertEqual(result.meta[0].args, ['param', 'x'])
        self.assertEqual(result.meta[0].description, 'int')
        self.assertIsInstance(result.meta[1], DocstringParam)
        self.assertEqual(result.meta[1].args, ['param', 'y'])
        self.assertEqual(result.meta[1].description, 'str')

if __name__ == '__main__':
    unittest.main()