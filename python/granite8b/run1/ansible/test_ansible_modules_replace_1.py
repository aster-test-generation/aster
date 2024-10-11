import unittest
from ansible.modules.replace import ReplaceModule


class TestReplaceModule(unittest.TestCase):
    def test_replace_all_instances(self):
        module = ReplaceModule()
        result = module.replace_all_instances('test.txt', 'old', 'new')
        self.assertEqual(result, 'new new new')

    def test_replace_after_expression(self):
        module = ReplaceModule()
        result = module.replace_after_expression('test.txt', 'after', 'new')
        self.assertEqual(result, 'after new')

    def test_replace_before_expression(self):
        module = ReplaceModule()
        result = module.replace_before_expression('test.txt', 'before', 'new')
        self.assertEqual(result, 'new before')

    def test_replace_between_expressions(self):
        module = ReplaceModule()
        result = module.replace_between_expressions('test.txt', 'before', 'after', 'new')
        self.assertEqual(result, 'before new after')

if __name__ == '__main__':
    unittest.main()