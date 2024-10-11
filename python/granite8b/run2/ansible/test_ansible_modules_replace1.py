import unittest
from ansible.modules.replace import ReplaceModule

class TestReplaceModule(unittest.TestCase):
    def test_replace_all_instances_of_a_particular_string_in_a_file(self):
        module = ReplaceModule()
        module.params = {
            'path': '/path/to/file',
            'regexp': 'old_string',
            'replace': 'new_string',
        }
        result = module.run()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old_string')
        self.assertEqual(result['diff']['after'], 'new_string')

    def test_replace_after_the_expression_till_the_end_of_the_file(self):
        module = ReplaceModule()
        module.params = {
            'path': '/path/to/file',
            'after': 'expression',
            'regexp': 'old_string',
            'replace': 'new_string',
        }
        result = module.run()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old_string')
        self.assertEqual(result['diff']['after'], 'new_string')

    def test_replace_using_a_back_referenced_regular_expression(self):
        module = ReplaceModule()
        module.params = {
            'path': '/path/to/file',
            'regexp': 'old_(.*)',
            'replace': 'new_\\1',
        }
        result = module.run()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old_string')
        self.assertEqual(result['diff']['after'], 'new_string')

    def test_replace_using_a_back_referenced_regular_expression_and_a_custom_delimiter(self):
        module = ReplaceModule()
        module.params = {
            'path': '/path/to/file',
            'regexp': 'old_(.*)',
            'replace': 'new_\\1',
            'delimiter': ':',
        }
        result = module.run()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old_string')
        self.assertEqual(result['diff']['after'], 'new_string')

    def test_replace_using_a_back_referenced_regular_expression_and_a_custom_backup_file(self):
        module = ReplaceModule()
        module.params = {
            'path': '/path/to/file',
            'regexp': 'old_(.*)',
            'replace': 'new_\\1',
            'backup': True,
        }
        result = module.run()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old_string')
        self.assertEqual(result['diff']['after'], 'new_string')

    def test_replace_using_a_back_referenced_regular_expression_and_a_custom_backup_file_with_a_custom_suffix(self):
        module = ReplaceModule()
        module.params = {
            'path': '/path/to/file',
            'regexp': 'old_(.*)',
            'replace': 'new_\\1',
            'backup': True,
            'backup_suffix': '.bak',
        }
        result = module.run()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old_string')
        self.assertEqual(result['diff']['after'], 'new_string')

    def test_replace_using_a_back_referenced_regular_expression_and_a_custom_backup_file_with_a_custom_prefix(self):
        module = ReplaceModule()
        module.params = {
            'path': '/path/to/file',
            'regexp': 'old_(.*)',
            'replace': 'new_\\1',
            'backup': True,
            'backup_prefix': 'backup_',
        }
        result = module.run()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old_string')
        self.assertEqual(result['diff']['after'], 'new_string')

if __name__ == '__main__':
    unittest.main()