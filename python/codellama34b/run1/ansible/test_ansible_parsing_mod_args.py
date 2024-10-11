import unittest
from ansible.parsing.mod_args import *



class TestModuleArgsParser(unittest.TestCase):
    def test_init(self):
        task_ds = {}
        collection_list = None
        instance = ModuleArgsParser(task_ds, collection_list)
        self.assertEqual(instance._task_ds, task_ds)
        self.assertEqual(instance._collection_list, collection_list)
        self.assertEqual(instance.resolved_action, None)

    def test_split_module_string(self):
        instance = ModuleArgsParser(None, None)
        result = instance._split_module_string("echo hi", "shell")
        self.assertEqual(result, ("echo", "hi"))

    def test_normalize_parameters(self):
        instance = ModuleArgsParser(None, None)
        thing = {}
        action = "copy"
        additional_args = {}
        result = instance._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, (action, {}))

    def test_normalize_parameters_2(self):
        instance = ModuleArgsParser(None, None)
        thing = "copy src=a dest=b"
        action = "copy"
        additional_args = {}
        result = instance._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, (action, {'src': 'a', 'dest': 'b'}))

    def test_normalize_parameters_3(self):
        instance = ModuleArgsParser(None, None)
        thing = "copy src=a dest=b"
        action = "copy"
        additional_args = "src=c dest=d"
        result = instance._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, (action, {'src': 'a', 'dest': 'b', 'src': 'c', 'dest': 'd'}))

    def test_normalize_parameters_4(self):
        instance = ModuleArgsParser(None, None)
        thing = "copy src=a dest=b"
        action = "copy"
        additional_args = "src=c dest=d"
        result = instance._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, (action, {'src': 'a', 'dest': 'b', 'src': 'c', 'dest': 'd'}))

    def test_normalize_parameters_5(self):
        instance = ModuleArgsParser(None, None)
        thing = "copy src=a dest=b"
        action = "copy"
        additional_args = "src=c dest=d"
        result = instance._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, (action, {'src': 'a', 'dest': 'b', 'src': 'c', 'dest': 'd'}))

    def test_normalize_parameters_6(self):
        instance = ModuleArgsParser(None, None)
        thing = "copy src=a dest=b"
        action = "copy"
        additional_args = "src=c dest=d"
        result = instance._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, (action, {'src': 'a', 'dest': 'b', 'src': 'c', 'dest': 'd'}))

    def test_normalize_parameters_7(self):
        instance = ModuleArgsParser(None, None)
        thing = "copy src=a dest=b"
        action = "copy"
        additional_args = "src=c dest=d"
        result = instance._normalize_parameters(thing, action, additional_args)
        self.assertEqual(result, (action, {'src': 'a', 'dest': 'b', 'src': 'c', 'dest': 'd'}))

if __name__ == '__main__':
    unittest.main()