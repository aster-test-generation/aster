import unittest
from ansible.parsing.mod_args import ModuleArgsParser


class TestModuleArgsParser(unittest.TestCase):
    def test_split_module_string(self):
        parser = ModuleArgsParser()
        self.assertEqual(parser._split_module_string("copy src=a dest=b"), ("copy", "src=a dest=b"))
        self.assertEqual(parser._split_module_string("copy"), ("copy", ""))

    def test_normalize_parameters(self):
        parser = ModuleArgsParser()
        self.assertEqual(parser._normalize_parameters("echo hi", "shell"), ("shell", {"_raw_params": "echo hi"}))
        self.assertEqual(parser._normalize_parameters({"region": "xyz"}, "ec2"), ("ec2", {"region": "xyz"}))
        self.assertEqual(parser._normalize_parameters(None, "ec2"), ("ec2", {}))

    def test_normalize_new_style_args(self):
        parser = ModuleArgsParser()
        self.assertEqual(parser._normalize_new_style_args("echo hi", "shell"), {"_raw_params": "echo hi"})
        self.assertEqual(parser._normalize_new_style_args({"region": "xyz"}, "ec2"), {"region": "xyz"})
        self.assertEqual(parser._normalize_new_style_args(None, "ec2"), None)

    def test_normalize_old_style_args(self):
        parser = ModuleArgsParser()
        self.assertEqual(parser._normalize_old_style_args({"shell": "echo hi"}), ("shell", {"_raw_params": "echo hi", "_uses_shell": True}))
        self.assertEqual(parser._normalize_old_style_args("shell echo hi"), ("shell", {"_raw_params": "echo hi", "_uses_shell": True}))
        self.assertEqual(parser._normalize_old_style_args({"module": "ec2", "x": 1}), ("ec2", {"x": 1}))

    def test_parse(self):
        parser = ModuleArgsParser()
        self.assertNotEqual(parser.parse(), ("", {}, None))
        self.assertEqual(parser.parse(skip_action_validation=True), ("", {}, None))

class TestModuleArgsParser(unittest.TestCase):
    def test_split_module_string(self):
        parser = ModuleArgsParser()
        result = parser._split_module_string("copy src=a dest=b")
        self.assertEqual(result, ("copy", "src=a dest=b"))

    def test_normalize_parameters(self):
        parser = ModuleArgsParser()
        result = parser._normalize_parameters("echo hi", "shell")
        self.assertEqual(result, ("shell", {"_raw_params": "echo hi", "_uses_shell": True}))

    def test_normalize_new_style_args(self):
        parser = ModuleArgsParser()
        result = parser._normalize_new_style_args("echo hi", "shell")
        self.assertEqual(result, {"_raw_params": "echo hi", "_uses_shell": True})

    def test_normalize_old_style_args(self):
        parser = ModuleArgsParser()
        result = parser._normalize_old_style_args("shell echo hi")
        self.assertEqual(result, ("shell", {"_raw_params": "echo hi", "_uses_shell": True}))

    def test_parse(self):
        parser = ModuleArgsParser()
        result = parser.parse()
        self.assertEqual(result, ("shell", {"_raw_params": "echo hi", "_uses_shell": True}, None))

if __name__ == '__main__':
    unittest.main()