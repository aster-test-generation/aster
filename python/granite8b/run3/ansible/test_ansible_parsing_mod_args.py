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
        action, args = parser._normalize_parameters({'module': 'shell', 'x': 1, 'args': 'echo hi'})
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'x': 1, '_raw_params': 'echo hi'})
        action, args = parser._normalize_parameters({'module': 'shell', 'x': 1, 'args': {'a': 1}})
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'x': 1, 'a': 1})
        action, args = parser._normalize_parameters({'module': 'shell', 'x': 1, 'args': 'echo hi', 'y': 2})
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'x': 1, '_raw_params': 'echo hi', 'y': 2})
        action, args = parser._normalize_parameters({'module': 'shell', 'x': 1, 'args': {'a': 1, 'b': 2}})
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'x': 1, 'a': 1, 'b': 2})
        action, args = parser._normalize_parameters({'module': 'shell', 'x': 1, 'args': 'echo hi', 'y': 2, 'z': 3})
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'x': 1, '_raw_params': 'echo hi', 'y': 2, 'z': 3})
        action, args = parser._normalize_parameters({'module': 'shell', 'x': 1, 'args': {'a': 1, 'b': 2}, 'y': 2, 'z': 3})
        self.assertEqual(action, 'shell')
        self.assertEqual(args, {'x': 1, 'a': 1, 'b': 2, 'y': 2, 'z': 3})

if __name__ == '__main__':
    unittest.main()