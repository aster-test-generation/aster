import unittest
from ansible.playbook.task_include import TaskInclude


class TestHandlerTaskInclude(unittest.TestCase):
    def test_load_data(self):
        data = {'name': 'test'}
        task_include = HandlerTaskInclude()
        result = task_include.load_data(data)
        self.assertEqual(result, data)

    def test_check_options(self):
        data = {'name': 'test'}
        task_include = HandlerTaskInclude()
        handler = task_include.check_options(data, data)
        self.assertEqual(handler.name, 'test')

    def test_load(self):
        data = {'name': 'test'}
        task_include = HandlerTaskInclude()
        handler = task_include.load(data)
        self.assertEqual(handler.name, 'test')

    def test_valid_include_keywords(self):
        self.assertEqual(HandlerTaskInclude.VALID_INCLUDE_KEYWORDS, {'listen'})

if __name__ == '__main__':
    unittest.main()