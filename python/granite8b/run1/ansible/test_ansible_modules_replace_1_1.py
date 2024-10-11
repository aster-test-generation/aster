import unittest
from ansible.modules.replace import ReplaceModule


class TestReplaceModule(unittest.TestCase):
    def test_replace_all_instances(self):
        module = ReplaceModule(
            path='/tmp/test.txt',
            regexp='old_string',
            replace='new_string'
        )
        result = module.replace_all_instances()
        self.assertEqual(result, 'new_string')

    def test_replace_after_expression(self):
        module = ReplaceModule(
            path='/tmp/test.txt',
            after='expression',
            regexp='old_string',
            replace='new_string'
        )
        result = module.replace_after_expression()
        self.assertEqual(result, 'new_string')

    def test_replace_before_expression(self):
        module = ReplaceModule(
            path='/tmp/test.txt',
            before='expression',
            regexp='old_string',
            replace='new_string'
        )
        result = module.replace_before_expression()
        self.assertEqual(result, 'new_string')

    def test_replace_line_match(self):
        module = ReplaceModule(
            path='/tmp/test.txt',
            line='match',
            regexp='old_string',
            replace='new_string'
        )
        result = module.replace_line_match()
        self.assertEqual(result, 'new_string')

    def test_replace_line_number(self):
        module = ReplaceModule(
            path='/tmp/test.txt',
            line_number=1,
            regexp='old_string',
            replace='new_string'
        )
        result = module.replace_line_number()
        self.assertEqual(result, 'new_string')

    def test_replace_backrefs(self):
        module = ReplaceModule(
            path='/tmp/test.txt',
            regexp='old_string',
            replace='new_string\\1'
        )
        result = module.replace_backrefs()
        self.assertEqual(result, 'new_string')

if __name__ == '__main__':
    unittest.main()