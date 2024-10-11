import unittest
from ansible.playbook.handler_task_include import HandlerTaskInclude


class TestHandlerTaskInclude(unittest.TestCase):
    def test_load(self):
        data = {}
        block = None
        role = None
        task_include = None
        variable_manager = None
        loader = None
        handler = HandlerTaskInclude.load(data, block, role, task_include, variable_manager, loader, tags=None)
        self.assertIsInstance(handler, HandlerTaskInclude)

    def test_check_options(self):
        data = {}
        handler = HandlerTaskInclude()
        result = handler.check_options(data, data)
        self.assertEqual(result, handler)

    def test_load_data(self):
        data = {}
        variable_manager = None
        loader = None
        handler = HandlerTaskInclude()
        result = handler.load_data(data, variable_manager, loader)
        self.assertEqual(result, handler)

if __name__ == '__main__':
    unittest.main()