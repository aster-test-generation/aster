import unittest
from ansible.playbook.handler_task_include import HandlerTaskInclude
from ansible.playbook.handler import Handler
from ansible.playbook.task_include import TaskInclude


class TestHandlerTaskInclude(unittest.TestCase):
    def test_valid_include_keywords(self):
        self.assertIn('listen', HandlerTaskInclude.VALID_INCLUDE_KEYWORDS)

    def test_load(self):
        data = {'some': 'data'}
        block = 'block'
        role = 'role'
        task_include = 'task_include'
        variable_manager = 'variable_manager'
        loader = 'loader'
        
        result = HandlerTaskInclude.load(data, block=block, role=role, task_include=task_include, variable_manager=variable_manager, loader=loader, action_loader=action_loader)
        self.assertIsInstance(result, Handler)

    def test_load_data(self):
        instance = HandlerTaskInclude()
        data = {'some': 'data'}
        variable_manager = 'variable_manager'
        loader = 'loader'
        
        result = instance.load_data(data, variable_manager=variable_manager, loader=loader, action='some')
        self.assertIsInstance(result, dict)

    def test_check_options(self):
        instance = HandlerTaskInclude()
        data = {'some': 'data'}
        options = {'option': 'value'}
        
        result = instance.check_options(options, **data)
        self.assertIsInstance(result, dict)

    def test_init(self):
        instance = HandlerTaskInclude()
        self.assertIsInstance(instance, HandlerTaskInclude)

if __name__ == '__main__':
    unittest.main()