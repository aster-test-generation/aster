import unittest
from ansible.playbook.task_include import TaskInclude


class TestHandlerTaskInclude(unittest.TestCase):
    def test_load(self):
        data = {}
        block = None
        role = None
        task_include = None
        variable_manager = None
        loader = None
        result = HandlerTaskInclude.load(data, block, role, task_include, variable_manager, loader)
        self.assertIsInstance(result, HandlerTaskInclude)

    def test_check_options(self):
        data = {}
        result = HandlerTaskInclude.check_options(data, data)
        self.assertIsInstance(result, HandlerTaskInclude)

    def test_load_data(self):
        data = {}
        variable_manager = None
        loader = None
        result = HandlerTaskInclude.load_data(data, variable_manager, loader)
        self.assertIsInstance(result, dict)

    def test_check_options_with_listen(self):
        data = {'listen': 'foo'}
        result = HandlerTaskInclude.check_options(data, data)
        self.assertIsInstance(result, HandlerTaskInclude)

    def test_check_options_with_invalid_keyword(self):
        data = {'invalid': 'foo'}
        with self.assertRaises(AnsibleError):
            HandlerTaskInclude.check_options(data, data)

if __name__ == '__main__':
    unittest.main()