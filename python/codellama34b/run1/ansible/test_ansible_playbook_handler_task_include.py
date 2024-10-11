
import unittest
from ansible.playbook.handler_task_include import HandlerTaskInclude

class TestHandlerTaskInclude(unittest.TestCase):
    def test_load(self):
        data = None
        block = None
        role = None
        task_include = None
        variable_manager = None
        loader = None
        result = HandlerTaskInclude.load(data, block, role, task_include, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_check_options(self):
        data = None
        block = None
        role = None
        task_include = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude(block, role, task_include)
        result = instance.check_options(data, data)
        self.assertIsNotNone(result)

    def test_load_data(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.load_data(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_data(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.get_include_data(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_data_from_file(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.get_include_data_from_file(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_data_from_string(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.get_include_data_from_string(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_data_from_list(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.get_include_data_from_list(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_data_from_dict(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.get_include_data_from_dict(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_data_from_task(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.get_include_data_from_task(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_data_from_handler(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.get_include_data_from_handler(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_data_from_role(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.get_include_data_from_role(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_data_from_play(self):
        data = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.get_include_data_from_play(data, variable_manager, loader)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()