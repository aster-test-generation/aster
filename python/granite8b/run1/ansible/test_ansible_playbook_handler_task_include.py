import unittest
from ansible.playbook.task_include import TaskInclude


class TestHandlerTaskInclude(unittest.TestCase):
    def test_load_data(self):
        data = {'name': 'test'}
        t = HandlerTaskInclude()
        result = t.load_data(data)
        self.assertEqual(result, data)

    def test_check_options(self):
        data = {'name': 'test', 'listen': 'foo'}
        t = HandlerTaskInclude()
        result = t.check_options(data, data)
        self.assertEqual(result['listen'], 'foo')

    def test_load(self):
        data = {'name': 'test', 'listen': 'foo'}
        t = HandlerTaskInclude()
        result = t.load(data)
        self.assertEqual(result.task_include['listen'], 'foo')

if __name__ == '__main__':
    unittest.main()