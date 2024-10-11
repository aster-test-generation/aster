import unittest
from ansible.playbook.handler_task_include import *



class TestHandlerTaskInclude(unittest.TestCase):
    def test_load(self):
        data = {}
        block = None
        role = None
        task_include = None
        variable_manager = None
        loader = None
        result = HandlerTaskInclude.load(data, block, role, task_include, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_check_options(self):
        data = {}
        block = None
        role = None
        task_include = None
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude(block, role, task_include)
        result = instance.check_options(data, data)
        self.assertIsNotNone(result)

    def test_load_data(self):
        data = {}
        variable_manager = None
        loader = None
        instance = HandlerTaskInclude()
        result = instance.load_data(data, variable_manager, loader)
        self.assertIsNotNone(result)

    def test_get_include_params(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_params(data)
        self.assertIsNotNone(result)

    def test_get_include_and_V2_include_params(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_and_V2_include_params(data)
        self.assertIsNotNone(result)

    def test_get_search_path(self):
        instance = HandlerTaskInclude()
        result = instance.get_search_path()
        self.assertIsNotNone(result)

    def test_get_include_path(self):
        instance = HandlerTaskInclude()
        result = instance.get_include_path()
        self.assertIsNotNone(result)

    def test_get_include_file_path(self):
        instance = HandlerTaskInclude()
        result = instance.get_include_file_path()
        self.assertIsNotNone(result)

    def test_get_parent_include_path(self):
        instance = HandlerTaskInclude()
        result = instance.get_parent_include_path()
        self.assertIsNotNone(result)

    def test_get_parent_include_file_path(self):
        instance = HandlerTaskInclude()
        result = instance.get_parent_include_file_path()
        self.assertIsNotNone(result)

    def test_get_parent_include_dirname(self):
        instance = HandlerTaskInclude()
        result = instance.get_parent_include_dirname()
        self.assertIsNotNone(result)

    def test_get_parent_include_filename(self):
        instance = HandlerTaskInclude()
        result = instance.get_parent_include_filename()
        self.assertIsNotNone(result)

    def test_get_parent_include_file_name(self):
        instance = HandlerTaskInclude()
        result = instance.get_parent_include_file_name()
        self.assertIsNotNone(result)

    def test_get_parent_include_file_ext(self):
        instance = HandlerTaskInclude()
        result = instance.get_parent_include_file_ext()
        self.assertIsNotNone(result)

    def test_get_parent_include_file_path_abs(self):
        instance = HandlerTaskInclude()
        result = instance.get_parent_include_file_path_abs()
        self.assertIsNotNone(result)

    def test_get_parent_include_file_name_abs(self):
        instance = HandlerTaskInclude()
        result = instance.get_parent_include_file_name_abs()
        self.assertIsNotNone(result)

    def test_get_parent_include_file_ext_abs(self):
        instance = HandlerTaskInclude()
        result = instance.get_parent_include_file_ext_abs()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()