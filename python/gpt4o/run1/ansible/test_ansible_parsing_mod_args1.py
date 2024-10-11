import unittest
from ansible.parsing.mod_args import ModuleArgsParser
from ansible.errors import AnsibleParserError, AnsibleError, AnsibleAssertionError
from ansible.utils.sentinel import Sentinel

class TestModuleArgsParser(unittest.TestCase):

    def test_init_with_valid_task_ds(self):
        instance = ModuleArgsParser(task_ds={'action': 'copy'})
        self.assertIsInstance(instance, ModuleArgsParser)

    def test_init_with_invalid_task_ds(self):
        with self.assertRaises(AnsibleAssertionError):
            ModuleArgsParser(task_ds='invalid')

    def test_split_module_string_with_multiple_tokens(self):
        instance = ModuleArgsParser()
        result = instance._split_module_string('copy src=a dest=b')
        self.assertEqual(result, ('copy', 'src=a dest=b'))

    def test_split_module_string_with_single_token(self):
        instance = ModuleArgsParser()
        result = instance._split_module_string('copy')
        self.assertEqual(result, ('copy', ''))

    def test_normalize_parameters_with_additional_args_as_string(self):
        instance = ModuleArgsParser()
        with self.assertRaises(AnsibleParserError):
            instance._normalize_parameters('thing', additional_args='{{var}}')

    def test_normalize_parameters_with_additional_args_as_dict(self):
        instance = ModuleArgsParser()
        result = instance._normalize_parameters('thing', additional_args={'key': 'value'})
        self.assertEqual(result, (None, {'key': 'value'}))

    def test_normalize_parameters_with_action(self):
        instance = ModuleArgsParser()
        result = instance._normalize_parameters('echo hi', action='shell')
        self.assertEqual(result, ('shell', {'_raw_params': 'echo hi', '_uses_shell': True}))

    def test_normalize_new_style_args_with_dict(self):
        instance = ModuleArgsParser()
        result = instance._normalize_new_style_args({'key': 'value'}, 'action')
        self.assertEqual(result, {'key': 'value'})

    def test_normalize_new_style_args_with_string(self):
        instance = ModuleArgsParser()
        result = instance._normalize_new_style_args('key=value', 'action')
        self.assertEqual(result, {'key': 'value'})

    def test_normalize_new_style_args_with_none(self):
        instance = ModuleArgsParser()
        result = instance._normalize_new_style_args(None, 'action')
        self.assertIsNone(result)

    def test_normalize_new_style_args_with_invalid_type(self):
        instance = ModuleArgsParser()
        with self.assertRaises(AnsibleParserError):
            instance._normalize_new_style_args(123, 'action')

    def test_normalize_old_style_args_with_dict(self):
        instance = ModuleArgsParser()
        result = instance._normalize_old_style_args({'module': 'shell echo hi'})
        self.assertEqual(result, ('shell', {'_raw_params': 'echo hi', '_uses_shell': True}))

    def test_normalize_old_style_args_with_string(self):
        instance = ModuleArgsParser()
        result = instance._normalize_old_style_args('shell echo hi')
        self.assertEqual(result, ('shell', {'_raw_params': 'echo hi', '_uses_shell': True}))

    def test_normalize_old_style_args_with_invalid_type(self):
        instance = ModuleArgsParser()
        with self.assertRaises(AnsibleParserError):
            instance._normalize_old_style_args(123)

    def test_parse_with_action(self):
        instance = ModuleArgsParser(task_ds={'action': 'copy src=a dest=b'})
        result = instance.parse()
        self.assertEqual(result, ('copy', {'src': 'a', 'dest': 'b'}, Sentinel))

    def test_parse_with_local_action(self):
        instance = ModuleArgsParser(task_ds={'local_action': 'copy src=a dest=b'})
        result = instance.parse()
        self.assertEqual(result, ('copy', {'src': 'a', 'dest': 'b'}, 'localhost'))

    def test_parse_with_conflicting_actions(self):
        instance = ModuleArgsParser(task_ds={'action': 'copy src=a dest=b', 'local_action': 'copy src=a dest=b'})
        with self.assertRaises(AnsibleParserError):
            instance.parse()

    def test_parse_with_non_task_ds(self):
        instance = ModuleArgsParser(task_ds={'invalid_action': 'value'})
        with self.assertRaises(AnsibleParserError):
            instance.parse()

    def test_parse_with_no_action(self):
        instance = ModuleArgsParser(task_ds={})
        with self.assertRaises(AnsibleParserError):
            instance.parse()

    def test_parse_with_raw_params(self):
        instance = ModuleArgsParser(task_ds={'action': 'shell echo hi'})
        result = instance.parse()
        self.assertEqual(result, ('shell', {'_raw_params': 'echo hi', '_uses_shell': True}, Sentinel))

if __name__ == '__main__':
    unittest.main()