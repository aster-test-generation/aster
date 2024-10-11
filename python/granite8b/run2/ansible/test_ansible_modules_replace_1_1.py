import unittest
from ansible.modules.replace import ReplaceModule


class TestReplaceModule(unittest.TestCase):

    def test_replace_all_instances(self):
        module = ReplaceModule(
            path='/path/to/file',
            regexp='old_string',
            replace='new_string'
        )
        result = module.replace_all_instances()
        self.assertEqual(result, 'new_string')

    def test_replace_after_expression(self):
        module = ReplaceModule(
            path='/path/to/file',
            after='expression',
            regexp='old_string',
            replace='new_string'
        )
        result = module.replace_after_expression()
        self.assertEqual(result, 'new_string')

    def test_replace_before_expression(self):
        module = ReplaceModule(
            path='/path/to/file',
            before='expression',
            regexp='old_string',
            replace='new_string'
        )
        result = module.replace_before_expression()
        self.assertEqual(result, 'new_string')

    def test_replace_with_backreferences(self):
        module = ReplaceModule(
            path='/path/to/file',
            regexp='old_string',
            replace='new_string\\1'
        )
        result = module.replace_with_backreferences()
        self.assertEqual(result, 'new_string')

    def test_replace_with_backreferences_and_groups(self):
        module = ReplaceModule(
            path='/path/to/file',
            regexp='old_string',
            replace='new_string\\1\\2'
        )
        result = module.replace_with_backreferences_and_groups()
        self.assertEqual(result, 'new_string')

    def test_replace_with_backreferences_and_flags(self):
        module = ReplaceModule(
            path='/path/to/file',
            regexp='old_string',
            replace='new_string\\1',
            flags='i'
        )
        result = module.replace_with_backreferences_and_flags()
        self.assertEqual(result, 'new_string')

    def test_replace_with_backreferences_and_multiline(self):
        module = ReplaceModule(
            path='/path/to/file',
            regexp='old_string',
            replace='new_string\\1',
            multiline=True
        )
        result = module.replace_with_backreferences_and_multiline()
        self.assertEqual(result, 'new_string')

    def test_replace_with_backreferences_and_limit(self):
        module = ReplaceModule(
            path='/path/to/file',
            regexp='old_string',
            replace='new_string\\1',
            limit=1
        )
        result = module.replace_with_backreferences_and_limit()
        self.assertEqual(result, 'new_string')

    def test_replace_with_backreferences_and_backup(self):
        module = ReplaceModule(
            path='/path/to/file',
            regexp='old_string',
            replace='new_string\\1',
            backup=True
        )
        result = module.replace_with_backreferences_and_backup()
        self.assertEqual(result, 'new_string')

    def test_replace_with_backreferences_and_unsafe_writes(self):
        module = ReplaceModule(
            path='/path/to/file',
            regexp='old_string',
            replace='new_string\\1',
            unsafe_writes=True
        )
        result = module.replace_with_backreferences_and_unsafe_writes()
        self.assertEqual(result, 'new_string')

    def test_replace_with_backreferences_and_diff(self):
        module = ReplaceModule(
            path='/path/to/file',
            regexp='old_string',
            replace='new_string\\1',
            diff=True
        )
        result = module.replace_with_backreferences_and_diff()
        self.assertEqual(result, 'new_string')

if __name__ == '__main__':
    unittest.main()