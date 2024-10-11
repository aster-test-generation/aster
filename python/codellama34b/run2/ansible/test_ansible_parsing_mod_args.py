import unittest
from ansible.parsing.mod_args import *



class TestModuleArgsParser(unittest.TestCase):
    def test_init(self):
        task_ds = {}
        collection_list = None
        instance = ModuleArgsParser(task_ds, collection_list)
        self.assertEqual(instance._task_ds, task_ds)
        self.assertEqual(instance._collection_list, collection_list)

    def test_split_module_string(self):
        module_string = "copy src=a dest=b"
        result = ModuleArgsParser._split_module_string(module_string)
        self.assertEqual(result, ("copy", "src=a dest=b"))

    def test_normalize_parameters(self):
        thing = "copy src=a dest=b"
        action = "copy"
        additional_args = {}
        result = ModuleArgsParser._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, (action, {"src": "a", "dest": "b"}))

    def test_normalize_parameters_2(self):
        thing = {"region": "xyz"}
        action = "ec2"
        additional_args = {}
        result = ModuleArgsParser._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, (action, {"region": "xyz"}))

    def test_normalize_parameters_3(self):
        thing = {"module": "ec2", "x": 1}
        action = None
        additional_args = {}
        result = ModuleArgsParser._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, ("ec2", {"x": 1}))

    def test_normalize_parameters_4(self):
        thing = "shell echo hi"
        action = None
        additional_args = {}
        result = ModuleArgsParser._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, ("shell", {"_raw_params": "echo hi", "_uses_shell": True}))

    def test_normalize_parameters_5(self):
        thing = "shell"
        action = "echo hi"
        additional_args = {}
        result = ModuleArgsParser._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, ("shell", {"_raw_params": "echo hi", "_uses_shell": True}))

    def test_normalize_parameters_6(self):
        thing = "shell"
        action = "echo hi"
        additional_args = "a=b"
        result = ModuleArgsParser._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, ("shell", {"_raw_params": "echo hi", "_uses_shell": True, "a": "b"}))

    def test_normalize_parameters_7(self):
        thing = "shell"
        action = "echo hi"
        additional_args = {"a": "b"}
        result = ModuleArgsParser._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, ("shell", {"_raw_params": "echo hi", "_uses_shell": True, "a": "b"}))

    def test_normalize_parameters_8(self):
        thing = "shell"
        action = "echo hi"
        additional_args = "{{a}}"
        result = ModuleArgsParser._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, ("shell", {"_raw_params": "echo hi", "_uses_shell": True, "_variable_params": "{{a}}"}))

    def test_normalize_parameters_9(self):
        thing = "shell"
        action = "echo hi"
        additional_args = {"a": "b"}
        result = ModuleArgsParser._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, ("shell", {"_raw_params": "echo hi", "_uses_shell": True, "a": "b"}))

if __name__ == '__main__':
    unittest.main()