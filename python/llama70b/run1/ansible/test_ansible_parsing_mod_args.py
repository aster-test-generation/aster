import unittest
from ansible.parsing.mod_args import ModuleArgsParser, FREEFORM_ACTIONS, RAW_PARAM_MODULES, BUILTIN_TASKS


class TestModuleArgsParser(unittest.TestCase):
    def test_init(self):
        parser = ModuleArgsParser()
        self.assertIsInstance(parser, ModuleArgsParser)

    def test_split_module_string(self):
        parser = ModuleArgsParser()
        result = parser._split_module_string("action: copy src=a dest=b")
        self.assertEqual(result, ("action", "copy src=a dest=b"))

    def test_normalize_parameters(self):
        parser = ModuleArgsParser()
        result = parser._normalize_parameters({"region": "xyz"}, "ec2")
        self.assertEqual(result, ("ec2", {"region": "xyz"}))

    def test_normalize_new_style_args(self):
        parser = ModuleArgsParser()
        result = parser._normalize_new_style_args({"region": "xyz"}, "ec2")
        self.assertEqual(result, {"region": "xyz"})

    def test_normalize_old_style_args(self):
        parser = ModuleArgsParser()
        result = parser._normalize_old_style_args({"module": "ec2 x=1"})
        self.assertEqual(result, ("ec2", {"x": "1"}))

    def test_parse(self):
        parser = ModuleArgsParser({"action": "ec2", "args": {"x": 1}})
        result = parser.parse()
        self.assertEqual(result, ("ec2", {"x": "1"}, None))

    def test_private_method__split_module_string(self):
        parser = ModuleArgsParser()
        result = parser._ModuleArgsParser__split_module_string("action: copy src=a dest=b")
        self.assertEqual(result, ("action", "copy src=a dest=b"))

    def test_protected_method__normalize_parameters(self):
        parser = ModuleArgsParser()
        result = parser._normalize_parameters({"region": "xyz"}, "ec2")
        self.assertEqual(result, ("ec2", {"region": "xyz"}))

    def test_magic_method__init__(self):
        parser = ModuleArgsParser()
        self.assertIsInstance(parser, ModuleArgsParser)

    def test_magic_method__str__(self):
        parser = ModuleArgsParser()
        result = str(parser)
        self.assertIsInstance(result, str)

    def test_magic_method__repr__(self):
        parser = ModuleArgsParser()
        result = repr(parser)
        self.assertIsInstance(result, str)

    def test_magic_method__eq__(self):
        parser1 = ModuleArgsParser()
        parser2 = ModuleArgsParser()
        self.assertEqual(parser1, parser2)

class TestConstants(unittest.TestCase):
    def test_FREEFORM_ACTIONS(self):
        self.assertIsInstance(FREEFORM_ACTIONS, frozenset)

    def test_RAW_PARAM_MODULES(self):
        self.assertIsInstance(RAW_PARAM_MODULES, frozenset)

    def test_BUILTIN_TASKS(self):
        self.assertIsInstance(BUILTIN_TASKS, frozenset)

if __name__ == '__main__':
    unittest.main()