import unittest
from ansible.parsing.mod_args import ModuleArgsParser


class TestModuleArgsParser(unittest.TestCase):
    def test_normalize_parameters(self):
        parser = ModuleArgsParser()
        action, args = parser._normalize_parameters('shell echo hi')
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'_raw_params': 'echo hi'})
        action, args = parser._normalize_parameters({'module': 'ec2', 'x': 1})
        self.assertEqual(action, 'ec2')
        self.assertEqual(args, {'x': 1})
        action, args = parser._normalize_parameters({'module': 'shell', 'x': 1, '_raw_params': 'echo hi'})
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'x': 1, '_raw_params': 'echo hi'})

    def test_normalize_new_style_args(self):
        parser = ModuleArgsParser()
        args = parser._normalize_new_style_args('echo hi', 'shell')
        self.assertEqual(args, {'_raw_params': 'echo hi'})
        args = parser._normalize_new_style_args({'region': 'xyz'}, 'ec2')
        self.assertEqual(args, {'region': 'xyz'})
        args = parser._normalize_new_style_args(None, 'shell')
        self.assertEqual(args, None)

    def test_normalize_old_style_args(self):
        parser = ModuleArgsParser()
        action, args = parser._normalize_old_style_args({'shell' : 'echo hi'})
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'_raw_params': 'echo hi'})
        action, args = parser._normalize_old_style_args('shell echo hi')
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'_raw_params': 'echo hi'})
        action, args = parser._normalize_old_style_args({'module': 'ec2', 'x': 1})
        self.assertEqual(action, 'ec2')
        self.assertEqual(args, {'x': 1})

if __name__ == '__main__':
    unittest.main()