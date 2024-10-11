import unittest
from ansible.modules.replace import ReplaceModule


class TestReplaceModule(unittest.TestCase):

    def test_replace_all_instances(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'regexp': 'old',
            'replace': 'new'
        }
        result = module.replace_all_instances()
        self.assertTrue(result)

    def test_replace_after_expression(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'after': 'old',
            'regexp': 'new',
            'replace': 'new'
        }
        result = module.replace_after_expression()
        self.assertTrue(result)

    def test_replace_before_expression(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'before': 'old',
            'regexp': 'new',
            'replace': 'new'
        }
        result = module.replace_before_expression()
        self.assertTrue(result)

    def test_replace_line_match(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'line': 'old',
            'regexp': 'new',
            'replace': 'new'
        }
        result = module.replace_line_match()
        self.assertTrue(result)

    def test_replace_line_match_and_insert(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'line': 'old',
            'regexp': 'new',
            'replace': 'new',
            'insert': 'before'
        }
        result = module.replace_line_match_and_insert()
        self.assertTrue(result)

    def test_replace_line_match_and_insert_after(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'line': 'old',
            'regexp': 'new',
            'replace': 'new',
            'insert': 'after'
        }
        result = module.replace_line_match_and_insert_after()
        self.assertTrue(result)

    def test_replace_line_match_and_insert_after_last(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'line': 'old',
            'regexp': 'new',
            'replace': 'new',
            'insert': 'after',
            'backup': True
        }
        result = module.replace_line_match_and_insert_after_last()
        self.assertTrue(result)

    def test_replace_line_match_and_insert_before_first(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'line': 'old',
            'regexp': 'new',
            'replace': 'new',
            'insert': 'before',
            'backup': True
        }
        result = module.replace_line_match_and_insert_before_first()
        self.assertTrue(result)

    def test_replace_line_match_and_insert_before_last(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'line': 'old',
            'regexp': 'new',
            'replace': 'new',
            'insert': 'before',
            'backup': True
        }
        result = module.replace_line_match_and_insert_before_last()
        self.assertTrue(result)

    def test_replace_line_match_and_insert_after_last_and_create(self):
        module = ReplaceModule()
        module.params = {
            'path': '/tmp/test.txt',
            'line': 'old',
            'regexp': 'new',
            'replace': 'new',
            'insert': 'after',
            'backup': True,
            'create': True
        }
        result = module.replace_line_match_and_insert_after_last_and_create()
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()