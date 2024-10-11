import unittest
from ansible.playbook.handler_task_include import HandlerTaskInclude



class TestHandlerTaskInclude(unittest.TestCase):
    def test_load(self):
        data = {}
        block = {}
        role = {}
        task_include = {}
        variable_manager = {}
        loader = {}
        result = HandlerTaskInclude.load(data, block, role, task_include, variable_manager, loader)
        self.assertIsInstance(result, HandlerTaskInclude)

    def test_check_options(self):
        data = {}
        block = {}
        role = {}
        task_include = {}
        variable_manager = {}
        loader = {}
        instance = HandlerTaskInclude(block, role, task_include)
        result = instance.check_options(data, data)
        self.assertIsInstance(result, HandlerTaskInclude)

    def test_VALID_INCLUDE_KEYWORDS(self):
        result = HandlerTaskInclude.VALID_INCLUDE_KEYWORDS
        self.assertIsInstance(result, set)

    def test_load_data(self):
        data = {}
        variable_manager = {}
        loader = {}
        instance = HandlerTaskInclude()
        result = instance.load_data(data, variable_manager, loader)
        self.assertIsInstance(result, dict)

    def test_get_include_params(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_params(data)
        self.assertIsInstance(result, dict)

    def test_get_include_items(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_items(data)
        self.assertIsInstance(result, list)

    def test_get_include_file_path(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_file_path(data)
        self.assertIsInstance(result, str)

    def test_get_include_file_dirname(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_file_dirname(data)
        self.assertIsInstance(result, str)

    def test_get_include_file_ext(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_file_ext(data)
        self.assertIsInstance(result, str)

    def test_get_include_file_name(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_file_name(data)
        self.assertIsInstance(result, str)

    def test_get_include_file_path_abs(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_file_path_abs(data)
        self.assertIsInstance(result, str)

    def test_get_include_file_path_name(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_file_path_name(data)
        self.assertIsInstance(result, str)

    def test_get_include_file_path_name_ext(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_file_path_name_ext(data)
        self.assertIsInstance(result, str)

    def test_get_include_file_path_abs_name(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_file_path_abs_name(data)
        self.assertIsInstance(result, str)

    def test_get_include_file_path_abs_name_ext(self):
        data = {}
        instance = HandlerTaskInclude()
        result = instance.get_include_file_path_abs_name_ext(data)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()